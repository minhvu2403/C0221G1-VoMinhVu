package week3.Ngoaile_va_Debug.text;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(double side){
        super(side + " lon hon hai canh con lai");
    }
}
