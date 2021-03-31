package week1.introduction_to_Java.bai_tap;

import java.util.Scanner;

public class LoiChao {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = input.nextLine();
        System.out.print("Hello : " + name);

    }
}
