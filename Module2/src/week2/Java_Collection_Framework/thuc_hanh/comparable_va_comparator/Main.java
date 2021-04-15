package week2.Java_Collection_Framework.thuc_hanh.comparable_va_comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT");
        Student student3 = new Student("Tung", 38, "HT");

        List<Student> lists =new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);

        for (Student lx: lists) {
            System.out.println(lx.toString());
        }
        System.out.println("sau khi sap  xep");
        Collections.sort(lists, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
              if (o1.getAge()<o2.getAge()){
                  return 1;
              }
              else if(o1.getAge()==o2.getAge()){
                  return 0;
              }
              else {
                  return -1;
              }
            }
        });

        for (Student st:lists) {
            System.out.println(st.toString());
        }
    }

}
