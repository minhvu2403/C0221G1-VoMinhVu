package week1.array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumMainDiagonal {
    public void inputArray2D(int n, int[][] array) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "]=");
                array[i][j] = input.nextInt();
            }
        }
    }

    public void outputArray2D(int n, int[][] array) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(+array[i][j] + "\t");
            }
            System.out.println("\r\n");
        }
    }

    public void sumMainDiagonal(int n, int[][] array) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i][i];

        }
        System.out.println("sum main diagonal array : " + sum);
    }

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        SumMainDiagonal summaindiagonal = new SumMainDiagonal();
        int n;
        System.out.print("Enter input n:");
        n = input.nextInt();
        int[][] array = new int[n][n];
        summaindiagonal.inputArray2D(n, array);
        // array2D.outputArray2D(n, n, array);
        System.out.println("Property list 2D:" + Arrays.deepToString(array));
        summaindiagonal.sumMainDiagonal(n, array);

    }
}
