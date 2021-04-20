package week3.sorting_algorithms.bai_tap;

import java.util.Arrays;

public class CaiDatThuatToanSapXepChen {
    static int[]array ={6,3,5,4,2,1};
    public static void insertionSort(int[]array){
        int pos,x,i;
        for ( i = 0; i <array.length ; i++) {
            x=array[i];
            pos=i;
            while (pos>0&&x<array[pos-1]){
                array[pos]=array[pos-1];
                pos--;
            }
            array[pos]=x;
        }

    }

    public static void main(String[] args) {
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

}
