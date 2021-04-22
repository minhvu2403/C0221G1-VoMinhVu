package week3.Ngoaile_va_Debug.bai_tap;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // create triangle
        Triangle triangle = new Triangle();
        boolean done = false;
        double side1;
        double side2;
        double side3;

        System.out.println("Enter three sides: ");

        while (!done) {
            try {
                side1 = input.nextDouble();
                side2 = input.nextDouble();
                side3 = input.nextDouble();
                triangle = new Triangle(side1, side2, side3);
                done = true;
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
                System.out.print("Enter three sides:  ");
                input.nextLine();
            }
        }


        System.out.println();

        System.out.println(triangle.toString() +
                "\narea: " + triangle.getArea() +
                "\nperimeter " + triangle.getPerimeter());
    }

}