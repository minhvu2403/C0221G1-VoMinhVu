package week1.introduction_to_Java.bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public void oneNumber(int n) {
        switch (n) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 10:
                System.out.print("Ten");
                break;
        }

    }

    public void TwoNumber(int n) {
        int one;
        one = n % 10;
        switch (one) {
            case 1:
                System.out.print("Eleven");
                break;
            case 2:
                System.out.print("Twelve");
                break;
            case 3:
                System.out.print("Thirteen");
                break;
            case 4:
                System.out.print("Fourteen");
                break;
            case 5:
                System.out.print("Fifteen");
                break;
            case 6:
                System.out.print("Sixteen");
                break;
            case 7:
                System.out.print("Seventeen");
                break;
            case 8:
                System.out.print("Eighteen");
                break;
            case 9:
                System.out.print("Nineteen");
                break;
            case 10:
                System.out.print("Twenty");
                break;
        }
    }

    public void tow(int one, int two) {
        switch (two) {
            case 2:
                System.out.print("Twenty");
                break;
            case 3:
                System.out.print("Thirty");
                break;
            case 4:
                System.out.print("Fourty");
                break;
            case 5:
                System.out.print("Fifty");
                break;
            case 6:
                System.out.print("Sixty");
                break;
            case 7:
                System.out.print("Seventy");
                break;
            case 8:
                System.out.print("Eighty");
                break;
            case 9:
                System.out.print("Ninety");
                break;
            case 10:
                System.out.print("One hundred");
                break;
        }
        oneNumber(one);
    }

    public void twonumbers(int n) {
        int one;
        int two;
        one = n % 10;
        two = n / 10;
        tow(one, two);
    }

    public void threenumber(int n) {
        int one;
        int two;
        int three;
        one = n % 10;
        n = n / 10;
        two = n % 10;
        three = n / 10;
        switch (three) {
            case 1:
                System.out.print("One hundred and ");
                break;
            case 2:
                System.out.print("Two hundred and ");
                break;
            case 3:
                System.out.print("Three hundred and ");
                break;
            case 4:
                System.out.print("Four hundred and ");
                break;
            case 5:
                System.out.print("Five hundred and ");
                break;
            case 6:
                System.out.print("Six hundred and ");
                break;
            case 7:
                System.out.print("Seven hundred and ");
                break;
            case 8:
                System.out.print("Eight hundred and ");
                break;
            case 9:
                System.out.print("Nine hundred and ");
                break;
        }
        if (two==0){
            oneNumber(one);
        }else if (two==1){
            TwoNumber(one);
        }else {
            tow(one,two);
        }

    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        ReadNumber read = new ReadNumber();
        System.out.print("Enter Number:");
        number = input.nextInt();
        if (number <= 10) {
            read.oneNumber(number);
        } else if (number <= 20) {
            read.TwoNumber(number);
        } else if (number <= 100) {
            read.twonumbers(number);
        }else {
            read.threenumber(number);
        }
    }
}
