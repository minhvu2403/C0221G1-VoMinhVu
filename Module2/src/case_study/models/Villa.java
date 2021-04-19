package case_study.models;

public class Villa extends Services  implements Comparable<Villa>{
    private String standardRoom;
    private String otherDescription;
    private String areaPool;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String standardRoom, String otherDescription, String areaPool, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.otherDescription = otherDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String id, String nameServices, double areaUse, double rentCost, int amountOfPeoples, String typeRent, String standardRoom, String otherDescription, String areaPool, int numberOfFloors) {
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

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
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
        return "Villa{" + super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", otherDescription='" + otherDescription + '\'' +
                ", areaPool='" + areaPool + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Villa o) {
        return getNameServices().compareTo(o.getNameServices());
    }
}
