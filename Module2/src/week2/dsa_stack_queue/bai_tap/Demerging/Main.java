package week2.dsa_stack_queue.bai_tap.Demerging;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so luong nhan vien:");
        int number = Integer.parseInt(input.nextLine());
        LinkedList<Employee> listEmployees = new LinkedList<Employee>();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap ten nhan vien thu:" + (i + 1));
            String name = input.nextLine();
            System.out.println("Nhap tuoi sinh nhan vien thu:" + (i + 1));
            int age = Integer.parseInt(input.nextLine());
            System.out.println("Nhap gioi tinh nhan vien thu" + (i + 1));
            String gender = input.nextLine();
            System.out.println("Nhap ngay thang nam sinh cua nhan vien thu(dd/mm/yyyy) :" + (i + 1));
            String birthday = input.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date birthdays = format.parse(birthday);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
           formatter.format(birthdays);
            Employee employee = new Employee(name, age, birthdays, gender);
            listEmployees.add(employee);
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Thong tin nhan vien thu " + (i + 1));
            listEmployees.get(i).disPlay();
        }
        sortList(listEmployees);
        System.out.println("THONG TIN NHAN VIEN SAU KHI SAP XEP");
        for (int i = 0; i < listEmployees.size(); i++) {
            System.out.println("thong tin nhan vien thu" + (i + 1));
            listEmployees.get(i).disPlay();
        }
        Queue<Employee> nu = new LinkedList<Employee>();
        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getGender().equals("nu")) {
                nu.add(listEmployees.get(i));
            }
        }
        Queue<Employee> nam = new LinkedList<Employee>();
        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getGender().equals("nam")) {
                nam.add(listEmployees.get(i));
            }
        }
        LinkedList<Employee> result = new LinkedList<Employee>();
        while (!nu.isEmpty()) {
            result.add(nu.poll());
        }
        while (!nam.isEmpty()) {
            result.add(nam.poll());
        }
        System.out.println("sau khi tach nam va nu:");
        for (Employee person:result) {
            person.disPlay();
        }


    }

    private static void sortList(LinkedList<Employee> listEmployees) {
        Collections.sort(listEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o2.getBirthDay().compareTo(o1.getBirthDay()) > 0) {
                    return 1;
                } else if (o2.getBirthDay().compareTo(o1.getBirthDay()) < 0) {
                    return -1;
                } else {
                    return (o2.getName().compareTo(o1.getName()));
                }
            }
        });
    }
}
