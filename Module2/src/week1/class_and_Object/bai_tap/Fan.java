package week1.class_and_Object.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    @Override
    public String toString() {
        if (this.on) {
            return ("Speed is: " + this.speed + ", Radius: " + this.radius + ", Color: " + this.color + ", fan is on");

        } else {
            return ("Speed is: " + this.speed + ", Radius: " + this.radius + ", Color: " + this.color + ", fan is of");

        }

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.speed = fan1.FAST ;
        fan1.radius = 10;
        fan1.color = "yellow";
        fan1.on = true;
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.speed =fan2.MEDIUM;
        fan2.radius = 5;
        fan2.color = "blue";
        fan2.on = false;
        System.out.println(fan2.toString());
    }
}
