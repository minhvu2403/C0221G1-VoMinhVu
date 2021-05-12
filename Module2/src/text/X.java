package text;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class X {
    public static void main(String [] args) {
        try         {
            badMethod();
            System.out.print("A");
        }  catch (Exception ex)  {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }
    public static void badMethod(){
        throw new Error();
    }
}