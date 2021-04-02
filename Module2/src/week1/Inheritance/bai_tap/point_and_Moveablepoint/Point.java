package week1.Inheritance.bai_tap.point_and_Moveablepoint;

public class Point {
    private  float x=0.0f;
    private float y=0.0f;

    public Point() {
    }

    public Point(float x, float y) {
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
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[]getXY(){
        float[]array=new float[2];
        array[0]=this.x;
        array[1]=this.y;
        return array;
    }
    public String toString(){
        return this.x+","+this.y;
    }
}
