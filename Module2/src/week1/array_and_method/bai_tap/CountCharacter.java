package week1.array_and_method.bai_tap;

import java.util.Scanner;

public class CountCharacter {
    public static Scanner input =new Scanner(System.in);
    public void countCharacter(String str){
        char character;
        int count =0;
        System.out.println("Enter character:");
        character=input.nextLine().charAt(0);
        for (int i = 0; i <str.length() ; i++) {
            if (character==str.charAt(i)){
                count++;
            }
        }
        System.out.println("Number of "+count);

    }
    public static void main(String[] args) {
        CountCharacter countcharacter=new CountCharacter();
        String str;
        System.out.println("Enter string: ");
        str=input.nextLine();
        countcharacter.countCharacter(str);

    }
}
