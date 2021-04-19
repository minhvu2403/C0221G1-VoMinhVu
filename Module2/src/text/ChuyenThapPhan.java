package text;

import java.util.Scanner;

public class ChuyenThapPhan {
    public static void thapPhan(int n){
        long j=1,result=0,temp;
        while (n!=0){
           temp=n%10;
            result=result+temp*j;
            j=j*2;
            n=n/10;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n =sc.nextInt();
        thapPhan(n);
    }
}
