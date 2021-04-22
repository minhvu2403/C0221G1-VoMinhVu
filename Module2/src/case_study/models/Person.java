package case_study.models;

import java.io.Serializable;

public abstract class Person implements Serializable {
     private String fullName;
     private String dateOfBirth;
     private String Sex;
     private String idCard;
     private String numberPhone;
     private String email;
     private String address;

    public Person(String fullName, String dateOfBirth, String sex, String idCard, String numberPhone, String email, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        Sex = sex;
        this.idCard = idCard.replaceFirst("(\\d{3})(\\d{3})(\\d{3})", "$1-$2-$3");
        this.numberPhone = numberPhone.replaceFirst("(\\d{4})(\\d{3})(\\d{3})","$1-$2-$3");
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract String showInfor();
}
