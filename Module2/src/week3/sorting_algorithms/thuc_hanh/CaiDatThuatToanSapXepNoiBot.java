package week3.sorting_algorithms.thuc_hanh;

import java.util.Arrays;

public class CaiDatThuatToanSapXepNoiBot {
    static int[]array={1,2,3,4,5,6};
    public static void bubbleSort(int[] array){
        int i,j,temp;
        for ( i = 0; i <array.length-1 ; i++) {
            for ( j = array.length-1; j >i ; j--) {
                if (array[j]<array[j-1]){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
