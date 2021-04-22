package case_study.models;

import case_study.controllers.main_menu.MainController;

public class Customer extends Person implements Comparable<Customer> {
    private String customerTye;
    private Services services;
    private ServiceGoWith serviceGoWith;
    private Contract contract;


    public Customer(String fullName, String dateOfBirth, String sex, String idCard, String numberPhone, String email, String address, String customerTye) {
        super(fullName, dateOfBirth, sex, idCard, numberPhone, email, address);
        this.customerTye = customerTye;
        this.services =null;
        this.serviceGoWith=null;
        this.contract=null;
    }

    public Customer(String fullName, String dateOfBirth, String sex, String idCard, String numberPhone, String email, String address, String customerTye, Services services, ServiceGoWith serviceGoWith, Contract contract) {
        super(fullName, dateOfBirth, sex, idCard, numberPhone, email, address);
        this.customerTye = customerTye;
        this.services = services;
        this.serviceGoWith = serviceGoWith;
        this.contract = contract;
    }

    public String getCustomerTye() {
        return customerTye;
    }

    public void setCustomerTye(String customerTye) {
        this.customerTye = customerTye;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public ServiceGoWith getServiceGoWith() {
        return serviceGoWith;
    }

    public void setServiceGoWith(ServiceGoWith serviceGoWith) {
        this.serviceGoWith = serviceGoWith;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return getFullName() + MainController.COMA +
                getDateOfBirth() + MainController.COMA +
                getSex() + MainController.COMA +
                getIdCard() + MainController.COMA +
                getNumberPhone() + MainController.COMA +
                getEmail() + MainController.COMA +
                getAddress() + MainController.COMA +
                getCustomerTye() + MainController.COMA +
                getServices().getId() + MainController.COMA +
                getServiceGoWith().getName() + MainController.COMA +
                getContract().getNumberContract();
    }

    @Override
    public String showInfor() {
        return "\nFull name: " + getFullName() +
                "\nDate of birth: " + getDateOfBirth() +
                "\nRent type: " + getSex() +
                "\nID card: " + getIdCard() +
                "\nNumber phone: " + getNumberPhone() +
                "\nEmail: " + getEmail() +
                "\nAddress: " + getAddress() +
                "\nCustomer type: " + getCustomerTye() +
                "\nUse service: " + getServices() +
                "\nService go with: " + getServiceGoWith() +
                "\nContract: " + getContract() + " $\n";
    }

    @Override
    public int compareTo(Customer o) {
        int result = getFullName().substring(getFullName().lastIndexOf(" ") + 1).compareTo(o.getFullName().substring(o.getFullName().lastIndexOf(" ") + 1));
        if (result == 0) {
            result = getDateOfBirth().substring(6, 10).compareTo(o.getDateOfBirth().substring(6, 10));
        }
        return result;    }
}
