package text;

import java.util.Arrays;
import java.util.Scanner;

public class Mang1Chieu {
    public static void ChenMang(int[]a){
        int x,index,i;
        System.out.print("Nhap phan tu can chen:");
        x=sc.nextInt();
        System.out.println("Nhap vi tri can chen:");
        index=sc.nextInt();
        for (i = a.length-1; i >index ; i--) {
            a[i]=a[i-1];
        }
        a[index]=x;
        System.out.println("New:"+ Arrays.toString(a));
    }
    public  static  void DaoNguocMang(int[]a){
        int i,temp;
        for ( i = 0; i <a.length/2 ; i++) {
            temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        System.out.println("New:"+ Arrays.toString(a));
    }
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu mang.");
        int size;
        size =sc.nextInt();
        int[]a=new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.print("A["+i+"]=");
            a[i]=sc.nextInt();
        }
     //   ChenMang(a);
        DaoNguocMang(a);


    }
}
