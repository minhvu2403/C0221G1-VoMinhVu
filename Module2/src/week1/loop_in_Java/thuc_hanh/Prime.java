package week1.loop_in_Java.thuc_hanh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int number;
        boolean check =true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        number = input.nextInt();
        if (number < 2) {
            System.out.println(" is Not a Prime");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                   check =false;
                }
            }
            if (check){
                System.out.println("is a prime");
            }else {
                System.out.println("is Not a Prime");
            }
        }

    }
}
