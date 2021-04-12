package text;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Daonguoc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.println("Nhap vao 1 so:");
//        int number =input.nextInt();
//        int tmp;
//        int res =0;
//        while (number>0){
//            tmp=number%10;
//            res =res*10+tmp;
//            number=number/10;
//        }
//        System.out.println(res);
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);

        int[]arr =new int[5];
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("A["+i+"]=");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length/2 ; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
