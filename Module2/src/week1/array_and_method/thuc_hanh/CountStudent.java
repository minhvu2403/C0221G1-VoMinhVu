package week1.array_and_method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class CountStudent {
    public static Scanner input = new Scanner(System.in);

    public void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("a[" + i + "]=");
            array[i] = input.nextInt();
        }
    }

    public void countStudent(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.print("The number of student passing the exam is:" + count);
    }

    public static void main(String[] args) {
        CountStudent countstudent = new CountStudent();
        int[] array;
        int size;
        do {
            System.out.print("Enter the nummber of array element:");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Size  should not  exceed 30");
            }
        } while (size > 30);
        array = new int[size];
        countstudent.inputArray(array);
        System.out.println("Property list:" + Arrays.toString(array));
        countstudent.countStudent(array);
    }
}
