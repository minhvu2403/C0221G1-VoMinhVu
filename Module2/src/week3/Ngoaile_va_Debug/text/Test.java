package week3.Ngoaile_va_Debug.text;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = null;
        /*
        boolean check;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                triangle = new Triangle(side1, side2, side3);
                check = true;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Enter three side:");
                check = false;
            } catch (InputMismatchException e) {
                System.out.println("Ban phai nhap so");
                check = false;
            }
        }
        while (!check);
         */
        boolean check=false;
        while (!check) {
            try {
                Scanner scanner = new Scanner(System.in);
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                triangle = new Triangle(side1, side2, side3);
                 check = true;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Ban nhap lai canh tang giac");
                check = false;
            } catch (InputMismatchException e) {
                System.out.println("Ban phai nhap so");
                check = false;
            }
        }
        System.out.println();
        System.out.println(triangle.toString() +
                "\narea " + triangle.getArea() +
                "\nperimeter " + triangle.getPerimeter());

    }
}
