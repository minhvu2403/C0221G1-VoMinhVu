package week2.dsa_stack_queue.bai_tap.Demerging;

import java.text.ParseException;
import java.util.*;

public class EmployeeManager {
    static Scanner input = new Scanner(System.in);
    LinkedList<Employee> list = new LinkedList<>();

    public void addEmployee() throws ParseException {
        System.out.println("Nhap vao so luong nhan vien:");
        int number = input.nextInt();
        for (int i = 0; i < number; i++) {
            Employee employees = new Employee();
            employees.Nhap();
            list.add(employees);
        }
    }

    public void listShow() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).disPlay());
        }
    }
    public void  deleteList(){
        System.out.println("Nhap vao ten nhan can xoa");
        input.nextLine();
        String name=input.nextLine();
         boolean check=false;
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                list.remove(i);
                check=true;
                break;
            }
        }
        if (check=true){
            System.out.println("Ban da xoa thanh cong");
        }else {
            System.out.println("Khong co ten nhan vien can xoa");
        }
    }

    public  void sortList() {
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o2.getBirthDay().compareTo(o1.getBirthDay()) > 0){
                    return 1;
                }else if (o2.getBirthDay().compareTo(o1.getBirthDay()) < 0) {
                    return -1;
                }
                else {
                    return (o2.getName().compareTo(o1.getName()));
                }

            }
        });
        listShow();
    }
    public void tachNamNu(){
        Queue<Employee> nu = new LinkedList<>();
        Queue<Employee> nam =new LinkedList<>();
        Queue<Employee> result =new LinkedList<>();
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getGender().equals("nu")){
                nu.add(list.get(i));
            }
            else if(list.get(i).getGender().equals("nam")){
                nam.add(list.get(i));
            }
        }
        while (!nu.isEmpty()){
            result.add(nu.poll());
        }
        while (!nam.isEmpty()){
            result.add(nam.poll());
        }
        System.out.println("Sau khi tach nam va nu:");
        for (Employee person :result) {
            System.out.println(person.disPlay());;
        }
    }

}
