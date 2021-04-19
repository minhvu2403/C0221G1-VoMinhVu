package week3.sorting_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        int i, j, temp;
        for (i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang:");
        int size, i;
        size = sc.nextInt();
        int[] list = new int[size];
        for (i = 0; i < list.length; i++) {
            System.out.print("A[" + i + "]=");
            list[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(list));
         bubbleSortByStep(list);
        System.out.println(Arrays.toString(list));

    }
}
