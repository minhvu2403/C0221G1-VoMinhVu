package week2.dsa_stack_queue.bai_tap;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static Stack<String> addSTack(String s){
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(String.valueOf(s.charAt(i)));
        }
      return stack;
    }
    public static Queue<String>addQueue(String s){
        Queue<String> queue =new LinkedList<>();
        for (int i = 0; i <s.length() ; i++) {
            queue.add(String.valueOf(s.charAt(i)));
        }
        return queue;
    }
    public static boolean compare(Stack<String> stack,Queue<String> queue){
        while (!stack.empty()){
            if (!stack.pop().equals(queue.remove())){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string:");
        String str = input.nextLine();
        String str1=str.toLowerCase();
        boolean isPalindrome =compare(addSTack(str1),addQueue(str1));
        if (isPalindrome){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Not is Palindrome");
        }
    }
}
