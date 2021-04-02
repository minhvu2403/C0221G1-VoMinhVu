package week1.array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumn {
    public static Scanner input = new Scanner(System.in);

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

    public void sumArray2D(int row, int[][] array) {
        int num;
        int sum = 0;
        System.out.println("Enter n:");
        num = input.nextInt();
        for (int i = 0; i < row; i++) {
            sum += array[i][num];
        }


        System.out.println("Sum of array 2D: " + sum);
    }


    public static void main(String[] args) {
        SumColumn sumcolumn = new SumColumn();
        int row;
        int col;
        System.out.print("Enter input row:");
        row = input.nextInt();

        System.out.print("Enter input col:");
        col = input.nextInt();
        int[][] array = new int[row][col];
        sumcolumn.inputArray2D(row, col, array);
        // array2D.outputArray2D(n, n, array);
        System.out.println("Property list 2D:" + Arrays.deepToString(array));
        sumcolumn.sumArray2D(row, array);

    }

}
