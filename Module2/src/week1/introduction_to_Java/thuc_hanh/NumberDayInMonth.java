package week1.introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class NumberDayInMonth {
    public static void main(String[] args) {
        int month;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao 1 thang:");
        month = input.nextInt();
        switch (month) {
            case 2:
                System.out.print("Thang Co 28 ngay hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Thang co 30 ngay");
                break;
            default:
                System.err.print("Ban da nhap sai");
                break;

        }
    }
}
