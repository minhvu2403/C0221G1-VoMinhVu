package week3.sorting_algorithms.thuc_hanh;

import java.util.Arrays;

public class CaiDatSapXepChon {
    static int[] array = {1, 3, 6, 2, 4, 5};

    public static void selectionSort(int[] array) {
        int min, i, j, temp;
        for (i = 0; i < array.length - 1; i++) {
            min = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }if (min != i) {
                temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void selectionSort1(int[] array) {
        int min, i, j, temp;
        for (i = 0; i < array.length - 1; i++) {
            min = i;
            for (j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j;

                if (min != i) {
                    temp = array[min];
                    array[min] = array[i];
                    array[i] = temp;
                }

        }
    }
    public static void main(String[] args) {
        selectionSort1(array);
        System.out.println(Arrays.toString(array));
    }
}
