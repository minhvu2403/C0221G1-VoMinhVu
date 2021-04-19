package case_study.models;

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
        return "House{" + super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", otherDescription='" + otherDescription + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(House o) {
        return getNameServices().compareTo(o.getNameServices());
    }
}
