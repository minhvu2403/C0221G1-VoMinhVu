package week1.array_and_method.thuc_hanh;

import java.util.Scanner;

public class MaxArray {
    public void inputArray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("a["+i+"]=");
            arr[i]=input.nextInt();
        }
    }
    public void outputArray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public void findMax(int arr[]){
        int max =arr[0];
        int index = 0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
    public  static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
        MaxArray maxarray=new MaxArray();
        int array [];
        int size;
        do {
            System.out.println("Enter input size:");
            size=input.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);
        array =new int[size];
        maxarray.inputArray(array);
        System.out.println("Property list: ");
        maxarray.outputArray(array);
        System.out.println("");
        maxarray.findMax(array);

    }
}
