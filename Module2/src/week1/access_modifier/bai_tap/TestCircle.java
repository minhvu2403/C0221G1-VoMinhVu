package week1.access_modifier.bai_tap;

import java.text.DecimalFormat;

public class TestCircle {
    public static void main(String[] args) {
        DecimalFormat decimalFormat =new DecimalFormat("#.##");
        Circle circle = new Circle(2);
        System.out.println("The circle has radius of " + decimalFormat.format(circle.getRadius()) +
                " and area of " +decimalFormat.format(circle.getArea()) );
    }


}
