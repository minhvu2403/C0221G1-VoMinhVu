package week1.class_and_Object.bai_tap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = ((b * b) - 4 * (this.a * this.c));
        return delta;
    }

    public double getRoot1() {
        double x1 = (-b + Math.sqrt((b * b - 4 * (this.a * this.c)))) / 2 * a;
        return x1;
    }

    public double getRoot2() {
        double x2 = (-b - Math.sqrt((b * b - 4 * (this.a * this.c)))) / 2 * a;
        return x2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter number a:");
        a = input.nextDouble();
        System.out.print("Enter number b:");
        b = input.nextDouble();
        System.out.print("Enter number a:");
        c = input.nextDouble();
        DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double Delta = quadraticEquation.getDiscriminant();

        double X1 = quadraticEquation.getRoot1();
        double X2 = quadraticEquation.getRoot2();
        if (Delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem:" + decimalFormat.format(X1) + " and " + decimalFormat.format(X2));
        } else if (Delta == 0) {
            System.out.println("Phuong trinh co 1 nghiem: " + decimalFormat.format(X1));
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
