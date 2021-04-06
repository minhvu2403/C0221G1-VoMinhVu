package week2.abstract_class_and_interface.bai_tap.Colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Square square =new Square(30,"red",true);
        System.out.println(square.toString());
        square.howToColor();
        
    }
}
