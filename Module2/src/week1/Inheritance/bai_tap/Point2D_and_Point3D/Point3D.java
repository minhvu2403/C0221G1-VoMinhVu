package week1.Inheritance.bai_tap.Point2D_and_Point3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = this.getX();
        array[1] = this.getY();
        array[2] = this.z;
        return array;
    }

    @Override
    public String toString() {
        return ("( " + getX() + " , " + getY() + " , " + this.z + " )");
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D = new Point3D(3, 4, 5);
        System.out.println(point3D);
    }
}
