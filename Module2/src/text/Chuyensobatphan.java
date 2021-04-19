package text;

import java.util.Scanner;

public class Chuyensobatphan {
    public static void batPhan(int n){
        int[]num=new int[100];
        int i=1,j,temp;
        while (n!=0){
            num[i++]=n%8;
            n=n/8;
        }
        for (j = i-1; j>0 ; j--) {
            System.out.print(num[j]);
        }

    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number:");
        int n =input.nextInt();
        batPhan(n);
    }
}
