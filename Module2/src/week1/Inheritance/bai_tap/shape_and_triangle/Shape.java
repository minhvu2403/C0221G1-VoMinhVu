package week1.Inheritance.bai_tap.shape_and_triangle;

public class Shape {
    private String color;


    public Shape() {
    }

    public Shape(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public String toString(){
        return " A Shape with color of " + getColor();
    }
}
