package week1.array_and_method.thuc_hanh;

import java.util.Scanner;

public class TemperatureSwitch {
    public static Scanner input = new Scanner(System.in);

    public static double fahrenheitToCelsius(double fahrenheit) {
        return Math.round(5.0 / 9) * (fahrenheit - 32);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return Math.round (9.0 / 5) * celsius + 32;
    }

    public static void main(String[] args) {
        int choice = -1;
        double fahrenheit;
        double celsius;
        while (choice != 0) {
            System.out.println("--Menu--");
            System.out.println("1.Fahrenheit to Celsius.");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("0.Exit");
            System.out.println("Enter your Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius." + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit" + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Not Choice.");
            }
        }
    }


}
