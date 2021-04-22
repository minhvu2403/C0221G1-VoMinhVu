package case_study.models;

import case_study.controllers.main_menu.MainController;

public class Room extends Services implements Comparable<Room> {
    private ServiceGoWithFree freeServiceGoWith;

    public Room() {
    }

    public Room(String id, String nameServices, double areaUse, double rentCost, int amountOfPeoples, String typeRent, ServiceGoWithFree freeServiceGoWith) {
        super(id, nameServices, areaUse, rentCost, amountOfPeoples, typeRent);
        this.freeServiceGoWith = freeServiceGoWith;
    }

    public ServiceGoWithFree getFreeServiceGoWith() {
        return freeServiceGoWith;
    }

    public void setFreeServiceGoWith(ServiceGoWithFree freeServiceGoWith) {
        this.freeServiceGoWith = freeServiceGoWith;
    }

    @Override
    public String toString() {
        return "Service{" +
                "ID Service='" + getId() + '\'' +
                ", Name Service='" + getNameServices() + '\'' +
                ", Area=" + getAreaUse() +
                ", Cost=" + getRentCost() +
                ", Amount of people=" + getAmountOfPeoples() +
                ", Rent type='" + getTypeRent() + '\'' +
                "Service free go with='" + getFreeServiceGoWith() + '\'' +
                '}';
    }

    public String addFileCSV()
    {
        return getId() + MainController.COMA +
                getNameServices() + MainController.COMA +
                getAreaUse() + MainController.COMA +
                getRentCost() + MainController.COMA +
                getAmountOfPeoples() + MainController.COMA +
                getTypeRent() + MainController.COMA +
                getFreeServiceGoWith().getNameServiceGoWith();

    }


    @Override
    public String showInfor() {
        return  "\nID Service: " + getId() +
                "\nName Service: " + getNameServices() +
                "\nArea Used: " + getAreaUse() + " m^2" +
                "\nRent Type: " + getTypeRent() +
                "\nCost: " + getRentCost() + " $" +
                "\nAmount Of People: " + getAmountOfPeoples() +
                "\nFree Service Go With: " + getFreeServiceGoWith() + "\n";
    }

    @Override
    public int compareTo(Room o) {
        return getNameServices().compareTo(o.getNameServices());
    }
}
