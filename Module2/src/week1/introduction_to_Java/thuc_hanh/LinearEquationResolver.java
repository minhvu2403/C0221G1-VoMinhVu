package week1.introduction_to_Java.thuc_hanh;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        int a;
        int b;
        double answer;
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        Scanner input = new Scanner(System.in);
        System.out.print("enter a:");
        a = input.nextInt();
        System.out.print("enter b:");
        b = input.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.print("Phuong trinh co vo so ngiem");
            } else {
                System.out.print("Phuong trinh vo nghiem");
            }
        } else {
            answer = (double) -b / a;
            System.out.print("Phuong trinh co nghiem x=" + decimalFormat.format(answer) + ".");
        }
    }
}
