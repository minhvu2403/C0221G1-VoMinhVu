package week4.bai_tap;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phoneNumber;
        String regexp = "^\\([0-9]{2}\\)\\-\\([0-9]{10}\\)$";
        while (true) {
            System.out.println("Nhập số điện thoại:");
            phoneNumber = input.nextLine();
            if(phoneNumber.matches(regexp)){
                System.out.println("Hợp lệ");
                break;
            } else {
                System.out.println("Không hợp lệ");
            }
        }

    }
}