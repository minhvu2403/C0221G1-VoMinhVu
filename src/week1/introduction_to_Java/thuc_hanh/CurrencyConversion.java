package week1.introduction_to_Java.thuchanh;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        int usd;
        int rate=23000;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number money USD:");
        usd =input.nextInt();
        int quyDoi=usd*rate;
        System.out.println(usd+" USD = "+quyDoi+" VND");
    }
}
