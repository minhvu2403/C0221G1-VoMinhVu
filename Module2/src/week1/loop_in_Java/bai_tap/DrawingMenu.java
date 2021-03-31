package week1.loop_in_Java.bai_tap;

import java.util.Scanner;

public class DrawingMenu {
    public static Scanner input = new Scanner(System.in);

    public void Rectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void Triangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void TriangleInversion(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void IsoscelesTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        int choice = -1;
        int width, height;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.DrawRectangle");
            System.out.println("2.DrawTriangle");
            System.out.println("3.DrawTriangleInversion");
            System.out.println("4.DrawIsoscelesTriangle");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    DrawingMenu rectangle = new DrawingMenu();
                    System.out.println("Enter width:");
                    width = input.nextInt();

                    System.out.println("Enter height:");
                    height = input.nextInt();

                    rectangle.Rectangle(width, height);
                    break;
                case 2:
                    System.out.println("Enter heigth:");
                    height = input.nextInt();
                    DrawingMenu triangle = new DrawingMenu();
                    triangle.Triangle(height);
                    break;
                case 3:
                    System.out.println("Enter heigth:");
                    height = input.nextInt();
                    DrawingMenu triangleinversion = new DrawingMenu();
                    triangleinversion.TriangleInversion(height);
                    break;
                case 4:
                    System.out.println("Enter heigth:");
                    height = input.nextInt();
                    DrawingMenu isoscelestriangle = new DrawingMenu();
                    isoscelestriangle.IsoscelesTriangle(height);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
