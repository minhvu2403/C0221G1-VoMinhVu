package week1.introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter width:");
        width = input.nextFloat();
        System.out.print("Enter height:");
        height = input.nextFloat();
        float area = width * height;
        System.out.print("Area  is= " + area);

    }


}
