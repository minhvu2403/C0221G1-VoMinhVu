package bai_product_manager2.controller;

import java.util.Scanner;

public class TextProduct {
    static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
      boolean check=false;
        while (check){
            System.out.print("1.Add new product\n" +
                    "2.Delete product\n" +
                    "3.Display list product\n" +
                    "4.Search product\n" +
                    "5.Exit\n" +
                    "Enter input :");
            String input =scanner.nextLine();
            switch (input){
                case "1":
                    break;
            }
        }
    }
}
