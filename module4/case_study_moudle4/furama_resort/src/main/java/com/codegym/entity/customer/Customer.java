package com.codegym.entity.customer;

import com.codegym.entity.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer id;
    @Pattern(regexp = "^(KH-)\\d{4}$", message = "Code must be KH-XXXX")
    private String codeCustomer;
    @Column(name = "customer_name")
    private String name;

    @Column(name = "customer_birthday")
    private String birthday;

    @Column(name = "customer_gender")
    private String gender;

    @Column(name = "customer_id_card")
    @Pattern(regexp = "[0-9]{9}", message = "Wrong Format - XXXXXXXXX")
    private String idCard;

    @Column(name = "customer_phone")
    @Pattern(regexp = "(090|091)[0-9]{7}", message = "Wrong Format - (090|091))XXXXXX")
    private String phone;

    @Column(name = "customer_email")
    @Email(message = "email is not in the correct format")
    private String email;

    @Column(name = "customer_address")
    @NotBlank(message = "Address is not empty")
    private String address;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Contract> contracts;

    @ManyToOne
    @JoinColumn(name = "customer_type_id",referencedColumnName = "customer_type_id")
    private CustomerType customerType;

    public Customer() {
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }
}
