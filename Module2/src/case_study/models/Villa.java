package case_study.models;

import case_study.controllers.main_menu.MainController;

public class Villa extends Services  implements Comparable<Villa>{
    private String standardRoom;
    private String otherDescription;
    private double areaPool;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String standardRoom, String otherDescription, double areaPool, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.otherDescription = otherDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String id, String nameServices, double areaUse, double rentCost, int amountOfPeoples, String typeRent, String standardRoom, String otherDescription, double areaPool, int numberOfFloors) {
        super(id, nameServices, areaUse, rentCost, amountOfPeoples, typeRent);
        this.standardRoom = standardRoom;
        this.otherDescription = otherDescription;
        this.areaPool = areaPool;
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
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
                ", Pool area=" + getAreaPool() +
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
                getAreaPool()+MainController.COMA+
                getOtherDescription()+MainController.COMA+
                getNumberOfFloors();


    }


    @Override
    public String showInfor() {
//        System.out.printf("%-10s %-20s %-20s %-20s %-20s \n", "", "", "", "", "");
        return  "\nID Service: " + getId() +
                "\nName Service: " + getNameServices() +
                "\nArea Used: " + getAreaUse() + " m^2" +
                "\nRent Type: " + getTypeRent() +
                "\nDescription: " + getOtherDescription() +
                "\nStandard Room: " + getStandardRoom() +
                "\nCost: " + getRentCost() + " $" +
                "\nAmount Of People: " + getAmountOfPeoples() +
                "\nPool Area: " + getAreaPool() + " m^2" +
                "\nNumber Of Floor: " + getNumberOfFloors() + "\n";
    }

    @Override
    public int compareTo(Villa o) {
        return getNameServices().compareTo(o.getNameServices());
    }
}
