package week1.array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class PoolingArray {
    public static Scanner input = new Scanner(System.in);

    public void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("a[" + i + "]=");
            array[i] = input.nextInt();
        }
    }

    public void poolingArray(int[] a, int[] b) {
        int[] newArray;
        newArray = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        for (int i = 0, k = b.length; i < b.length; i++) {
            newArray[k++] = b[i];
        }
        System.out.println("Pooling Array list:" + Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        PoolingArray poolingarray = new PoolingArray();
        int[] arrayA;
        int[] arrayB;
        int size;
        System.out.print("Enter element number of list:");
        size = input.nextInt();

        arrayA = new int[size];
        arrayB = new int[size];

        System.out.println("Input Array A:");
        poolingarray.inputArray(arrayA);

        System.out.println("Input Array B:");
        poolingarray.inputArray(arrayB);

        System.out.println("");
        poolingarray.poolingArray(arrayA, arrayB);
    }
}
