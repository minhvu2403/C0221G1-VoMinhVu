package case_study.controllers.employee_menu;

import case_study.Views.RegularException;
import case_study.commons.FuncWriteAndRead;
import case_study.controllers.main_menu.MainController;
import case_study.exceptions.*;
import case_study.models.Employee;

import java.util.Scanner;

public class AddNewEmployee {
    public static void addNewEmployee() {
        MainController.readFileEmployee();
        Scanner sc =new Scanner(System.in);
        boolean flag;

        String idEmployee = null;
        do {
            flag = true;
            try {
                System.out.print("Enter ID Employee: ");
                idEmployee = sc.nextLine();
                RegularException.regexIdEmployee(idEmployee);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (String key : MainController.employeeMap.keySet()) {
                if (key.equals(idEmployee)) {
                    System.err.println("ID have exist!!!");
                    flag = false;
                }
            }
        } while (!flag);

        String fullName = null;
        do {
            flag = true;
            try {
                System.out.print("Enter full name: ");
                fullName = sc.nextLine();
                RegularException.regexName(fullName);
            } catch (NameException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String dateOfBirth =null;
        do {
            flag = true;
            try {
                System.out.print("Enter date of birth: ");
                dateOfBirth = sc.nextLine();
                RegularException.regexDateOfBirth(dateOfBirth);
            } catch (DateOfBirthException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String sex = null;
        do {
            flag = true;
            try {
                System.out.print("Enter sex: ");
                sex = sc.nextLine();
                RegularException.regexSex(sex);
            } catch (SexException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String iDCard = null;
        do {
            flag = true;
            try {
                System.out.print("Enter ID card: ");
                iDCard = sc.nextLine();
                RegularException.regexIDCard(iDCard);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String numberPhone = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number phone: ");
                numberPhone = sc.nextLine();
                RegularException.regexNumberPhone(numberPhone);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String email = null;
        do {
            flag = true;
            try {
                System.out.print("Enter email: ");
                email = sc.nextLine();
                RegularException.regexEmail(email);
            } catch (EmailException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        String level = null;
        do {
            flag = true;
            try {
                System.out.print("Enter level: ");
                level = sc.nextLine();
                RegularException.regexLevel(level);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String position = null;
        do {
            flag = true;
            try {
                System.out.print("Enter position: ");
                position = sc.nextLine();
                RegularException.regexPosition(position);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String department = null;
        do {
            flag = true;
            try {
                System.out.print("Enter department: ");
                department = sc.nextLine();
                RegularException.regexDepartment(department);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String salary = null;
        do {
            flag = true;
            try {
                System.out.print("Enter salary: ");
                salary = sc.nextLine();
                RegularException.regexCost(salary);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        Employee employee = new Employee(idEmployee, fullName, dateOfBirth, sex, iDCard,
                numberPhone, email, address, level, position, department, Double.parseDouble(salary));
        FuncWriteAndRead.writeFile(MainController.PATH_EMPLOYEE_FILE,  employee.toString());
    }

}
