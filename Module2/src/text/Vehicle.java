package text;

public class Vehicle {
    private String seaOfControl;
    private String nameManufacturer;
    private int year;
    private String Owner;

    public Vehicle() {
    }

    public Vehicle(String seaOfControl, String nameManufacturer, int year, String owner) {
        this.seaOfControl = seaOfControl;
        this.nameManufacturer = nameManufacturer;
        this.year = year;
        Owner = owner;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }
}
