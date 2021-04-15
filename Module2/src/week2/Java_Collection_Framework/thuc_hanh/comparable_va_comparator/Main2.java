package week2.Java_Collection_Framework.thuc_hanh.comparable_va_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Student2 student = new Student2("Kien", 30, "HT");
        Student2 student1 = new Student2("Nam", 26, "HN");
        Student2 student2 = new Student2("Anh", 38, "HT");
        Student2 student3 = new Student2("Tung", 38, "HT");

        List<Student2> student2s = new ArrayList<Student2>();
        student2s.add(student);
        student2s.add(student1);
        student2s.add(student2);
        student2s.add(student3);
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(student2s,ageComparator);
        System.out.println("So sanh tuoi");
        for (Student2 st:student2s) {
            System.out.println(st.toString());
        }
    }
}
