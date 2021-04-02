package week1.Inheritance.bai_tap.Point2D_and_Point3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = new float[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public String toString() {
        return this.x + "," + this.y;
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D = new Point2D(3, 4);
        System.out.println(point2D);
        point2D = new Point2D(4, 6);
        System.out.println(point2D);
    }
}
