package week1.array_and_method.thuc_hanh;

public class MinArray {
    public static int minValue(int array[]){
        int minArray =array[0];
        for (int i = 0; i <array.length ; i++) {
           if (minArray>array[i]){
               minArray=array[i];
           }
        }
        return minArray;
    }
    public static void main(String[] args) {
        int array []={4,12,7,8,1,6,9};
        System.out.println("The smallest element in the array is:"+minValue(array));
    }
}
