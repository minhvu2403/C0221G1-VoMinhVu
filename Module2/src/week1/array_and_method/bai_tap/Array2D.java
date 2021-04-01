package week1.array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public void inputArray2D(int row, int col, int[][] array) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "]=");
                array[i][j] = input.nextInt();
            }
        }
    }

    public void outputArray2D(int row, int col, int[][] array) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(+array[i][j] + "\t");
            }
            System.out.println("\r\n");
        }
    }

    public void maxArray2D(int row, int col, int[][] array) {
        int max = array[0][0];
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max of array 2D: " + max);
    }

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Array2D array2D = new Array2D();
        int row;
        int col;
        System.out.print("Enter input row:");
        row = input.nextInt();

        System.out.print("Enter input col:");
        col = input.nextInt();
        int[][] array = new int[row][col];
        array2D.inputArray2D(row, col, array);
        // array2D.outputArray2D(n, n, array);
        System.out.println("Property list 2D:" + Arrays.deepToString(array));
        array2D.maxArray2D(row, col, array);

    }
}
