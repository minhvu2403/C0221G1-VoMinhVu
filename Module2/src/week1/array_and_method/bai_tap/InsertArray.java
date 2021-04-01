package week1.array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArray {
    public static Scanner input = new Scanner(System.in);

    public void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("a[" + i + "]=");
            array[i] = input.nextInt();
        }
    }

    public void insertArray(int[] array) {
        int number;
        int index;
        int[] newArray;
        newArray = new int[array.length + 1];
        System.out.println("Enter number:");
        number = input.nextInt();
        System.out.println("Input index:");
        index = input.nextInt();
        if (index < 0 || index > array.length) {
            System.out.println("Not insert");
        } else {
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = number;
            for (int i = index + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
            System.out.println("New list array:" + Arrays.toString(newArray));
        }

    }

    public static void main(String[] args) {
        InsertArray insertarray = new InsertArray();
        int[] array;
        int size;
        System.out.println("Enter element number of list:");
        size = input.nextInt();
        array = new int[size];
        insertarray.inputArray(array);
        System.out.println("Property list:" + Arrays.toString(array));
        insertarray.insertArray(array);
    }
}
