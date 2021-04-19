package text;

import java.util.Scanner;

public class TestHinh {
    public static void testTamGiacCan(int height){
        for (int i = 0; i <height ; i++) {
            for (int j = i; j <height ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    public static void hinh(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if ( j==1||j==i||i==5){
                System.out.print("*");
            }else {
                    System.out.print(" ");
                }

        }System.out.println("");
    }
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int height=input.nextInt();
        testTamGiacCan(height);
        hinh();
    }
}
