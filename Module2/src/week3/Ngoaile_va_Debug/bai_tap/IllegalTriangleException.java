package week3.Ngoaile_va_Debug.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(double side) {
        super(side + " is larger than other two combined");

    }
}