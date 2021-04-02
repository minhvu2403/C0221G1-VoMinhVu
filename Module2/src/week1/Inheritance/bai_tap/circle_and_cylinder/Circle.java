package week1.Inheritance.bai_tap.circle_and_cylinder;

import java.text.DecimalFormat;

public class Circle {
    private double radius;
    private String color;
    DecimalFormat decimalFormat =new DecimalFormat("#.##");
    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double Acreage() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Radius is " + this.radius + " Color is " + this.color + " and  Acreage is " +decimalFormat.format(this.Acreage()) ;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(5, "yellow");
        System.out.println(circle);
    }
}