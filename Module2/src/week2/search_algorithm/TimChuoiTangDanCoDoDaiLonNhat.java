package week2.search_algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiTangDanCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String strings = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < strings.length(); i++) {
            list.add(strings.charAt(i));
            for (int j = i + 1; j < strings.length(); j++) {
                if (strings.charAt(j) > list.getLast()) {
                    list.add(strings.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max
        ) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
