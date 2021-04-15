package week2.dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiHeThapPhanSangNhiPhan {
    public static String coverDecimaltoBinary(int n) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        String str = "";
        while (n != 0) {
            result = n % 2;
            n = n / 2;
            stack.push(result);
        }
        while (!stack.empty()) {
            str += stack.pop();
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = input.nextInt();
        coverDecimaltoBinary(n);
        System.out.println("Result:"+coverDecimaltoBinary(n));
    }
}
