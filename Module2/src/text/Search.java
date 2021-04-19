package text;

import java.util.ArrayList;
import java.util.HashSet;

public class Search {
    public static ArrayList<Integer> trungLap(int[] C){
        ArrayList<Integer> tem=new ArrayList<Integer>();
        for (int i = 0; i <C.length ; i++) {
            for (int j = i+1; j <C.length ; j++) {
                if (C[i]!=C[j]){
                    tem.add(C[i]);
                }
            }
        }

      return tem;
    }
    public static void main(String[] args) {
        int[] A = {4, 6, 7, 5, 9};
        int[] B = {1, 2, 3, 4, 5,4};
        int[]C={1,2,3,4,5,4,6};
        HashSet<Integer>set =new HashSet<Integer>();
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j <B.length ; j++) {
                if (A[i]==B[j]){
                    set.add(A[i]);
                }
            }
        }
        System.out.println(set);

    }
}
