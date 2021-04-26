package bai_product_manager.product;

public abstract class Product {
    static int idProduct = 0;
    String codeProduct;
    String nameProduct;
    String priceProduct;
    String numberProduct;
    String nameManufacture;

    public Product(String codeProduct, String nameProduct, String priceProduct, String numberProduct, String nameManufacture) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.numberProduct = numberProduct;
        this.nameManufacture = nameManufacture;
        idProduct++;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        Product.idProduct = idProduct;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(String numberProduct) {
        this.numberProduct = numberProduct;
    }

    public String getNameManufacture() {
        return nameManufacture;
    }

    public void setNameManufacture(String nameManufacture) {
        this.nameManufacture = nameManufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", codeProduct='" + codeProduct + '\'' +
                ", nameProduct =" + nameProduct + '\t' +
                ", priceProduct=" + priceProduct +
                ", numberProduct='" + numberProduct + '\'' +
                ", nameManufacture='" + nameManufacture + '\'' +
                '}';
    }
}