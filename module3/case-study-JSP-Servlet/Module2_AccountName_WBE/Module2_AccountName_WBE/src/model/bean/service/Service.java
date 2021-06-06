package model.bean.service;

public class Service {
    private int id;
    private String name;
    private double area;
    private double cost;
    private int serviceMaxPeople;
    private String standardRoom;
    private String description;
    private double poolArea;
    private int numberOfFloor;
    private int serviceType;
    private int rentType;

    public Service() {
    }

    public Service(int id, String name, double area, double cost, int serviceMaxPeople, String standardRoom, String description, double poolArea, int numberOfFloor, int serviceType, int rentType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.serviceType = serviceType;
        this.rentType = rentType;
    }

    public Service(String name, double area, double cost, int serviceMaxPeople, String standardRoom, String description, double poolArea, int numberOfFloor, int serviceType, int rentType) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.serviceType = serviceType;
        this.rentType = rentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    public int getRentType() {
        return rentType;
    }

    public void setRentType(int rentType) {
        this.rentType = rentType;
    }
}
