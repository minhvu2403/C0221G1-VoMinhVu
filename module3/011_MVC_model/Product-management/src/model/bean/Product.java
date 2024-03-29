package model.bean;

public class Product {
    private int id;
    private String name;
    private double price;
    private int amount;
    private String productStatus;
    public Product() {
    }

    public Product(int id, String name, double price, int amount, String productStatus) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.productStatus = productStatus;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }
}
