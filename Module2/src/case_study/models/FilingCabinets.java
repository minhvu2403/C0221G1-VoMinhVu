package case_study.models;

import case_study.Views.RegularException;
import case_study.controllers.employee_menu.ShowInforEmployee;
import case_study.controllers.main_menu.MainController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    public static Stack<Employee> employeeStack =new Stack<>();
    public static List<Employee> employeeList=new ArrayList<>();

    static {
        MainController.readFileEmployee();
        for (String key : MainController.employeeMap.keySet()) {
            employeeStack.push(MainController.employeeMap.get(key));
            employeeList.add(MainController.employeeMap.get(key));
        }
    }

    public static void putProfileInTheCabinet() {
        boolean flag;
        String choice = null;
        Scanner scanner = new Scanner(System.in);
        ShowInforEmployee.showInforEmployee();
        do {
            flag = true;
            try {
                System.out.print("Enter choice: ");
                choice = scanner.nextLine();
                RegularException.exceptionIndexEmployee(choice);
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        employeeStack.push(employeeList.get(Integer.parseInt(choice) - 1));
    }

    public static void findProfileByName() {
        boolean flag = false;
        if (employeeStack.isEmpty()) {
            System.err.println("Empty");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name need find: ");
        String nameEmployee = scanner.nextLine();

        while (!employeeStack.isEmpty()) {
            if (employeeStack.peek().getFullName().equals(nameEmployee)) {
                System.out.println(employeeStack.pop().showInfor());
                flag = true;
                continue;
            }
            employeeStack.pop();
        }
        if (!flag) {
            System.out.println("Not find!!!");
        }
    }

    public static void findProfileByID() {
        boolean flag = false;
        if (employeeStack.isEmpty()) {
            System.err.println("Empty");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name need find: ");
        String nameEmployee = scanner.nextLine();

        while (!employeeStack.isEmpty()) {
            if (employeeStack.peek().getIdEmployee().equals(nameEmployee)) {
                System.out.println(employeeStack.pop().showInfor());
                flag = true;
                continue;
            }
            employeeStack.pop();
        }
        if (!flag) {
            System.err.println("Not find!!!");
        }
    }

}
