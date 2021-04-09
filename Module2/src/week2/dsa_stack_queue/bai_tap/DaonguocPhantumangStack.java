package week2.dsa_stack_queue.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DaonguocPhantumangStack {
    static Scanner input = new Scanner(System.in);

    public static void reverseArray() {
        System.out.println("Enter input length:");
        int length = input.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            System.out.print("A[" + i + "]= ");
            array.add(input.nextInt());
        }
        Stack<Integer> stack = new Stack<>();
        for (Integer element : array) {
            stack.push(element);
        }
        List<Integer> arrayReverse = new ArrayList<>();
        while (!stack.isEmpty()) {
            arrayReverse.add(stack.pop());
        }
        System.out.println("Mang ban dau" + array);
        System.out.println("Ket qua sau khi dao:" + arrayReverse);
    }
    public static void reverseString(){
        System.out.println("Enter input String:");
        String str=input.nextLine();
        Stack<String> strings=new Stack<>();
        for (int i=0;i<str.length();i++) {
            strings.push(String.valueOf(str.charAt(i)));
        }
        String result="";
        while (!strings.isEmpty()){
            result+=strings.pop();
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
//        reverseArray();
        System.out.println("");
        reverseString();
    }
}
