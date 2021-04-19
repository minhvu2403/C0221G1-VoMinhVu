package week2.search_algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiLienTiepCoDoDaiLonNhat {
     public static void chuoi(String s){
         LinkedList<Character> max=new LinkedList<>();
         LinkedList<Character> list=new LinkedList<>();
         for (int i = 0; i <s.length() ; i++) {
             if (list.size() > 1 & list.contains(s.charAt(i))) {
                 list.clear();
             }
             list.add(s.charAt(i));

             if (list.size() > max.size()) {
                 max.clear();
                 max.addAll(list);
             }
         }
         for (Character ch:max) {
             System.out.print(ch);
         }
     }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String string = input.nextLine();
        chuoi(string);
    }
}