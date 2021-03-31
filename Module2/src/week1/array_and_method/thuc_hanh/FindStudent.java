package week1.array_and_method.thuc_hanh;

import java.util.Scanner;

public class FindStudent {
    public void findIndex(String students[], String name) {
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the students int the list " + name + "  is: " + (i + 1));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found" + name + "in the list");
        }

    }

    public static void main(String[] args) {
        FindStudent findstudent = new FindStudent();
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter input name:");
        name = input.nextLine();
        findstudent.findIndex(students, name);

    }
}
