package case_study.models;

import case_study.controllers.main_menu.MainController;

public class House extends Services implements Comparable<House> {
    private String standardRoom;
    private String otherDescription;
    private int numberOfFloors;

    public House() {
    }

    public House(String standardRoom, String otherDescription, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.otherDescription = otherDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String id, String nameServices, double areaUse, double rentCost, int amountOfPeoples, String typeRent, String standardRoom, String otherDescription, int numberOfFloors) {
        super(id, nameServices, areaUse, rentCost, amountOfPeoples, typeRent);
        this.standardRoom = standardRoom;
        this.otherDescription = otherDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Service{" +
                "ID Service='" + getId() + '\'' +
                ", Name service='" + getNameServices() + '\'' +
                ", Area=" + getAreaUse() +
                ", Cost=" + getRentCost() +
                ", Amount of people=" + getAmountOfPeoples() +
                ", Rent type='" + getTypeRent() + '\'' +
                "Standard room='" + getStandardRoom() + '\'' +
                ", Description='" + getOtherDescription() + '\'' +
                ", Number of floor=" + getNumberOfFloors() +
                '}';
    }
    public String addFileCSV(){
        return getId()+ MainController.COMA+
                getNameServices()+MainController.COMA+
                getAreaUse()+MainController.COMA+
                getRentCost()+MainController.COMA+
                getAmountOfPeoples()+MainController.COMA+
                getTypeRent()+MainController.COMA+
                getStandardRoom()+MainController.COMA+
                getOtherDescription()+MainController.COMA+
                getNumberOfFloors();


    }
    @Override
    public String showInfor() {
        return "\nID Service: " + getId() +
                "\nName Service: " + getNameServices() +
                "\nArea Used: " + getAreaUse() + " m^2" +
                "\nRent Type: " + getTypeRent() +
                "\nDescription: " + getOtherDescription() +
                "\nStandard Room: " + getStandardRoom() +
                "\nCost: " + getRentCost() + " $" +
                "\nAmount Of People: " + getAmountOfPeoples() +
                "\nNumber Of Floor: " + getNumberOfFloors() + "\n";

    }

    @Override
    public int compareTo(House o) {
        return getNameServices().compareTo(o.getNameServices());
    }
}
