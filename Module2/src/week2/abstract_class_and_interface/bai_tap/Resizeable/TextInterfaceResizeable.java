package week2.abstract_class_and_interface.bai_tap.Resizeable;

import week2.abstract_class_and_interface.bai_tap.Resizeable.Shape;
import week2.abstract_class_and_interface.bai_tap.Resizeable.Square;

import java.util.Arrays;

public class TextInterfaceResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(5, "indigo", false);
        Rectangle rectangle = new Rectangle(8, 12, "yellow", true);
        Square square = new Square(30, "red", false);
        circle.resize(Math.random());
        rectangle.resize(Math.random());
        square.resize((Math.random()));
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        System.out.println(Arrays.toString(shapes));

    }
}
