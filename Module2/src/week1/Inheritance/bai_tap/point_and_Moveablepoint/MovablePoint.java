package week1.Inheritance.bai_tap.point_and_Moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] array() {
        float[] array = new float[2];
        array[0] = this.xSpeed;
        array[1] = this.ySpeed;
        return array;
    }

    public String toString() {
        return (super.toString() + ",speed=" + "(" + this.xSpeed + "," + this.ySpeed + ")");
    }

    public MovablePoint move() {
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint = new MovablePoint(3, 4, 5, 6);
        System.out.println(movablePoint);
    }

}
