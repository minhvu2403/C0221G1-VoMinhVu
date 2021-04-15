package week2.dsa_stack_queue.bai_tap.Demerging;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

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
  public void Nhap() throws ParseException {
      Scanner scanner =new Scanner(System.in);
      System.out.println("Nhap vao ten:");
      name =scanner.nextLine();
      System.out.println("Nhap vao tuoi");
      age =scanner.nextInt();
      scanner.skip("\\R");
      System.out.println("Nhap vao ngay sinh:");
      String birthday =scanner.nextLine();
      SimpleDateFormat format =new SimpleDateFormat("dd/MM/yyyy");
      birthDay =format.parse(birthday);
      System.out.println("Nhap vao gioi tinh :");
      gender =scanner.nextLine();
  }

    public String disPlay() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = dateFormat.format(this.birthDay);
        return ("Name: "+name+",Age"+age+",birthday:"+strDate+"Gender:"+gender);
    }
}
