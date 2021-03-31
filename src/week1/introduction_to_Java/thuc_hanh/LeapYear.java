package week1.introduction_to_Java.thuchanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int years;
        boolean isLeapYear = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year:");
        years = input.nextInt();
        if (years % 4 == 0) {
            if (years % 100 == 0) {
                if (years % 400 == 0) {
                    isLeapYear = true;
                }

            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d is a leap year", years);
        } else {
            System.out.printf("%d is NOT a leap year",years);
        }
    }
}
