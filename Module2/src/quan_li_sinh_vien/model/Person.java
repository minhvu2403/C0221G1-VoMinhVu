package quan_li_sinh_vien.model;

public abstract class Person {
    private String id;
    private String name;
    private String sex;
    private String date;
    private String numberPhone;


    public Person() {
    }

    public Person(String id, String name, String sex, String date, String numberPhone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.numberPhone = numberPhone;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return id+","+name +"," + sex + "," + date+","+numberPhone;
    }
    public abstract void showInfor();
}
