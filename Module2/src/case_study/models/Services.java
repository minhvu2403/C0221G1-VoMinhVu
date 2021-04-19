package case_study.models;

import java.io.Serializable;

public abstract class Services implements Serializable {
    private String id;
    private String nameServices;
    private double areaUse;
    private double rentCost;
    private int amountOfPeoples;
    private String typeRent;

    public Services() {
    }

    public Services(String id, String nameServices, double areaUse, double rentCost, int amountOfPeoples, String typeRent) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUse = areaUse;
        this.rentCost = rentCost;
        this.amountOfPeoples = amountOfPeoples;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getAmountOfPeoples() {
        return amountOfPeoples;
    }

    public void setAmountOfPeoples(int amountOfPeoples) {
        this.amountOfPeoples = amountOfPeoples;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", areaUse=" + areaUse +
                ", rentCost=" + rentCost +
                ", amountOfPeoples=" + amountOfPeoples +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }

    public abstract void showInfor();

}
