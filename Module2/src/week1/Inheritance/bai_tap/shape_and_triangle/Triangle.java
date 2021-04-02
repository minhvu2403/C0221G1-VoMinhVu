package week1.Inheritance.bai_tap.shape_and_triangle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle extends Shape {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        double s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return s;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public String toString() {
        return ("A Triangle  with " + "side1: " + this.side1 + " side2 " + this.side2 +
                " side3 " + this.side3 + " " + super.toString() + " Area is " + decimalFormat.format(getArea()) + " Perimeter is " + getPerimeter());
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        double side1, side2, side3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter color:");
        String color = input.nextLine();

        System.out.print("Enter side1:");
        side1 = input.nextDouble();

        System.out.print("Enter side2:");
        side2 = input.nextDouble();

        System.out.print("Enter side3:");
        side3 = input.nextDouble();

        triangle = new Triangle(color, side1, side2, side3);
        System.out.println(triangle);
    }
}
