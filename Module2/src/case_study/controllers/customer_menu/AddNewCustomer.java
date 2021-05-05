package case_study.controllers.customer_menu;

import case_study.Views.RegularException;
import case_study.commons.FuncWriteAndRead;
import case_study.controllers.main_menu.MainController;
import case_study.exceptions.*;
import case_study.models.Customer;

import java.util.Scanner;

public class AddNewCustomer {
    public static void addNewCustomer() {
        Scanner sc = new Scanner(System.in);
        boolean flag;

        String fullName = null;
        do {
            flag = true;
            try {
                System.out.print("Enter full name: ");
                fullName = sc.nextLine();
                RegularException.regexName(fullName);
            } catch (NameException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String dateOfBirth = null;
        do {
            flag = true;
            try {
                System.out.print("Enter date of birth: ");
                dateOfBirth = sc.nextLine();
                RegularException.regexDateOfBirth(dateOfBirth);
            } catch (DateOfBirthException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String sex = null;
        do {
            flag = true;
            try {
                System.out.print("Enter sex: ");
                sex = sc.nextLine();
                RegularException.regexSex(sex);
            } catch (SexException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String iDCard = null;
        do {
            flag = true;
            try {
                System.out.print("Enter ID card: ");
                iDCard = sc.nextLine();
                RegularException.regexIDCard(iDCard);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String numberPhone = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number phone: ");
                numberPhone = sc.nextLine();
                RegularException.regexNumberPhone(numberPhone);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String email = null;
        do {
            flag = true;
            try {
                System.out.print("Enter email: ");
                email = sc.nextLine();
                RegularException.regexEmail(email);
            } catch (EmailException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        String customerType = null;
        do {
            flag = true;
            try {
                System.out.print("Enter customer type: ");
                customerType = sc.nextLine();
                RegularException.regexCustomerType(customerType);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        Customer customer = new Customer(fullName, dateOfBirth, sex, iDCard, numberPhone,
                email, address, customerType);
        String line = customer.getFullName() + MainController.COMA + customer.getDateOfBirth() + MainController.COMA +
                customer.getSex() + MainController.COMA + customer.getIdCard() + MainController.COMA + customer.getNumberPhone()
                + MainController.COMA + customer.getEmail() + MainController.COMA + customer.getAddress() + MainController.COMA + customer.getCustomerTye();
        FuncWriteAndRead.writeFile(MainController.PATH_CUSTOMER_FILE, line);
    }
}
