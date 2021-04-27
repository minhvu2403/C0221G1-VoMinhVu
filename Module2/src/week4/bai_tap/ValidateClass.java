package week4.bai_tap;


import java.util.Scanner;

public class ValidateClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String className;
        String regexp = "^[CAP][0-9]{4}[GLMNOP][0-9]$";
        while (true) {
            System.out.println("Nhập tên lơp:");
            className = input.nextLine();
            if(className.matches(regexp)){
                System.out.println("Hợp lệ");
                break;
            } else {
                System.out.println("Không hợp lệ");
            }
        }

    }
}