package week1.introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height, weight, bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height (in meter):");
        height = input.nextDouble();

        System.out.print("Enter weight(in kilogram):");
        weight = input.nextDouble();

        bmi = Math.round(weight / Math.pow(height, 2));
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18) {
            System.out.printf("%-20s%s", bmi, "Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20s%s", bmi, "Normal");
        } else if (bmi < 30) {
            System.out.printf("%-20s%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20s%s", bmi, "Obese");
        }
    }
}
