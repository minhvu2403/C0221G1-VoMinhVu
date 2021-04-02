package week1.Inheritance.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder( double radius, String color,double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * this.Acreage();
    }

    @Override
    public String toString() {
        return super.toString()+"Height " + this.height + " and Volume is"+this.getVolume();
    }

    public static void main(String[] args) {
         Cylinder cylinder =new Cylinder();
         cylinder =new Cylinder(6,"black",7);
        System.out.println(cylinder);

    }
}
