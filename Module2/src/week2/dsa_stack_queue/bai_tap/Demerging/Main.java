package week2.dsa_stack_queue.bai_tap.Demerging;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    static  EmployeeManager employeeManager =new EmployeeManager();
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        boolean check =true;
        while (check){
            System.out.println("Chon chuc nang\n"+
                    "1. addEmployee\n"+
                    "2. showEmployee\n"+
                    "3. sortEmployee\n"+
                    "4. tachNamNu\n"+
                    "5.deleteEmployee\n"+
                    "6.Thoat"
            );
            int choose =input.nextInt();
            switch (choose){
                case 1:
                    employeeManager.addEmployee();
                    break;
                case 2:
                    employeeManager.listShow();
                    break;
                case 3:
                    employeeManager.sortList();
                    break;
                case 4:
                    employeeManager.tachNamNu();
                    break;
                case 5:
                    employeeManager.deleteList();
                    break;
                case 6:
                      check=false;
                    break;
            }
        }
    }
}
