package week3.sorting_algorithms.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlgorithms {
    static    Scanner sc =new Scanner(System.in);
    public static void bubbleSort(int[] a) {
        int i, j, temp;
        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }

    public static void bubbleSort2(int[] a) {
        int i, j, temp;
        for (i = 0; i < a.length - 1; i++) {
            for (j = a.length - 1; j > i; j--) {
                if (a[j] > a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] a){
        int i,j,temp,min;
        for ( i = 0; i < a.length; i++) {
            min=i;
            for ( j = i+1; j <a.length ; j++) {
                if (a[j]<a[min]){
                    min=j;
                }
            }
            if (min!=i){
                temp=a[min];
                a[min]=a[i];
                a[i]=temp;
                System.out.println(a[i]);
            }
        }
    }
    public static void insertSort(int[]a){
        int i,pos,x;
        for ( i = 1; i <a.length ; i++) {
            x=a[i];
           pos=i;
            while (pos>0 && a[pos-1]>x){
                a[pos]=a[pos-1];
                pos--;
            }
            a[pos]=x;
        }
    }

    public static void main(String[] args) {
        int size;
        System.out.println("Nhap so luong phan tu mang:");
        size =sc.nextInt();
        int[] a=new int[size];
        int i;
        for ( i = 0; i <size; i++) {
            System.out.print("A[  "+i+"]=");
            a[i]=sc.nextInt();
        }
        while (true){
            System.out.print("Moi ban chon chuc nang\n"+
                    "1.Sap xep noi bot\n"+
                    "2.Sap xep chon\n"+
                    "3.Sap xep chen\n"+
                    "4.Thoat\n"
                    );
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    bubbleSort2(a);
                    System.out.println(Arrays.toString(a));
                    break;
                case 2:
                    selectionSort(a);
                    System.out.println(Arrays.toString(a));
                    break;
                case 3:
                    insertSort(a);
                    System.out.println(Arrays.toString(a));
                    break;
                case 4:
                default:
                    System.out.println("Can on ban da su dung phan men");
                    System.exit(0);

            }
        }
    }
}
