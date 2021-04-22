package week3.Ngoaile_va_Debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random=new Random();
        Integer[] arr=new Integer[100];
        System.out.println("Danh sach phan tu cua mang:");
        for (int i = 0; i <100 ; i++) {
            arr[i]=random.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[]arr =arrayExample.createRandom();
        Scanner scanner =new Scanner(System.in);
        System.out.println();
        System.out.println("Nhap so phan tu mang:");
        int number =scanner.nextInt();
        try{
            System.out.println("gia tri cua phan tu co chi so la "+number+"la"+arr[number]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han.");
        }
    }
}
