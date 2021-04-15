package week2.Java_Collection_Framework.thuc_hanh.comparable_va_comparator;

public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;
    private String address;

    public Student2() {
    }

    public Student2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student2 o) {
        return  this.getName().compareTo(o.getName());
    }
}
