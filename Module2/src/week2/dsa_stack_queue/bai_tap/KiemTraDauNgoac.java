package week2.dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static boolean kiemTra(String s) {
        Stack<Character> stack = new Stack<>();
        //    boolean check =true;
        for (int i = 0; i < s.length(); i++) {
            char c = (s.charAt(i));
            if ('(' == c) {
                stack.push(s.charAt(i));
            } else if (')' == c) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();

            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chuoi:");
        String s = input.nextLine();
        if (kiemTra(s)) {
            System.out.println("Hop le");
        } else {
            System.out.println("Khong hop le");
        }
    }
}
