package week2.dsa_stack_queue.bai_tap.Demerging;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee {
    private String name;
    private int age;
    private Date birthDay;
    private String gender;

    public Employee() {
    }

    public Employee(String name, int age, Date birthDay, String gender) {
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
        this.gender = gender;
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

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void disPlay() {
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Name: "+name+",Birthday: "+birthDay+",Gender: "+gender);
    }
}
