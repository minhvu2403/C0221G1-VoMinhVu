package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DemSoLuongTu {
    public static void countTu2(String s1, String s2){
        ArrayList<Integer> strings3 = new ArrayList<>();
        int count=0;
        for (int i = 0; i <s2.length() ; i++) {
            for (int j = 0; j <s1.length() ; j++) {
                if (String.valueOf(s2.charAt(i)).contains(String.valueOf(s1.charAt(j)))){
                    count++;
                }
            }
            strings3.add(count);
            count=0;
        }
        System.out.println(strings3);
    }
    public static void countTu(String s1, String s2) {
        int count=0;
        ArrayList<String> strings1 = new ArrayList<>();
        ArrayList<String> strings2 = new ArrayList<>();
        ArrayList<Integer> strings3 = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            strings1.add(String.valueOf(s1.charAt(i)));//valueOf chuyen doi kieu du lieu
        }
        for (int i = 0; i < s2.length(); i++) {
            strings2.add(String.valueOf(s2.charAt(i)));
        }
        for (int i = 0; i <strings2.size() ; i++) {
            for (int j = 0; j <strings1.size() ; j++) {
                if (strings2.get(i).contains(strings1.get(j))){
                   count++;
                }
            }
            strings3.add(count);
            count=0;
        }
        System.out.println(strings3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi:");
        String s1 = input.nextLine();
        System.out.println("Nhap vao chuoi thu 2:");
        String s2 = input.nextLine();
//         countTu(s1,s2);
        countTu2(s1,s2);

    }
}
