package week1.loop_in_Java.thuchanh;

import java.util.Scanner;

public class CommonDivisor {
    public static  int comDiv(int a,int b){
        return (b==0)?a:comDiv(b,a%b);
    }
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a:");
        a=input.nextInt();

        System.out.print("Enter b:");
        b = input.nextInt();

        System.out.println("USCLN cua "+a+" va "+b+" la "+comDiv(a,b));

    }
}
