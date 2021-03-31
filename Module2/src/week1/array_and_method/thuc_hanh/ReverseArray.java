package week1.array_and_method.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static Scanner input = new Scanner(System.in);

    public void InputArray(int array[]) {
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = input.nextInt();
            i++;
        }
    }

    public void OutArray(int array[]) {
        System.out.printf("%-20s%s", "Element in array:", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

    public void Reverse(int array[], int size) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        ReverseArray arr = new ReverseArray();
        int size;
        int array[];
        do {
            System.out.println("Enter a size:");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        arr.InputArray(array);
        arr.OutArray(array);
        arr.Reverse(array, size);
        System.out.println();
        System.out.println("Array after Reverse");
        arr.OutArray(array);

    }
}
