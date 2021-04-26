package bai_product_manager.commons;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValueDateProduct {
    private static final String PRICE = "^\\d+$";
    private static final String FIELS = "^\\.+$";
    static Scanner scanner = new Scanner(System.in);

    public static String checkNumber() {

        String number = scanner.nextLine();
        if (Pattern.compile(PRICE).matcher(number).matches()) {
            return number;
        } else {
            System.out.print("Wrong number\n" +
                    "Enter again : ");
            return checkNumber();
        }

    }

    public static String checkEmpty() {

        String empty = scanner.nextLine();
        if (!empty.equals("")) {
            return empty;
        } else {
            System.out.print("Wrong\n " +
                    "Enter again : ");
            return checkEmpty();
        }
    }

    public static String checkNull() {

        String empty = scanner.nextLine();
        if (!empty.equals("")) {
            return empty;
        } else {
            System.out.print("Wrong\n " +
                    "Enter again : ");
            return checkEmpty();
        }
    }
}