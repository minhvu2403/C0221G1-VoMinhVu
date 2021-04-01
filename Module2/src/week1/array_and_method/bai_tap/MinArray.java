package week1.array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray {
    public static Scanner input = new Scanner(System.in);

    public void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("a[" + i + "]=");
            array[i] = input.nextInt();
        }
    }

    public void minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min of array:" + min);
    }

    public static void main(String[] args) {
        MinArray minarray = new MinArray();
        int[] array;
        int size;
        System.out.println("Enter the number of array element:");
        size = input.nextInt();
        array = new int[size];
        minarray.inputArray(array);
        System.out.println("Property list:" + Arrays.toString(array));
        minarray.minArray(array);
    }
}
