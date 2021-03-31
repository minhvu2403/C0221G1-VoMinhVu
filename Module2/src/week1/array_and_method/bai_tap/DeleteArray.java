package week1.array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {
    public static Scanner input = new Scanner(System.in);
    public static void inputArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("a[" + i + "]=");
            array[i] = input.nextInt();
        }
    }

    public static void outputArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

   public static void deleteArray(int array[],int n){
        int newArray[];
        newArray=new int[array.length-1];
       int index =0;
       for (int i = 0; i <array.length ; i++) {
          if (array[i]==n){
              index=i;
          }
       }
      if ( index!=0){
          for (int i = index; i <array.length-1 ; i++) {
              array[i]=array[i+1];
          }
          for (int i = 0,k=0; i <array.length-1; i++) {
              newArray[k++]=array[i];
          }
          System.out.println("Array Delete:"+ Arrays.toString(newArray));

      }else {
          System.out.println("Not find number need delete");
      }
   }

    public static void main(String[] args) {
        int array[];
        int size;
        int n;
        System.out.println("Enter input size:");
        size = input.nextInt();
        array = new int[size];
        inputArray(array);
        System.out.println("Property list:"+Arrays.toString(array));
      //  outputArray(array);
        System.out.println("");
        System.out.println("Enter input number delete:");
        n=input.nextInt();
        deleteArray(array,n);

    }
}
