package bai_product_manager.product;

public class ImportProduct extends Product {
    String priceImport;
    String nameProvince;
    String tax;
    String idImport;

    public ImportProduct(String codeProduct, String nameProduct, String priceProduct, String numberProduct, String nameManufacture,
                         String priceImport, String nameProvince, String tax) {
        super(nameProduct, codeProduct, priceProduct, numberProduct, nameManufacture);
        this.priceImport = priceImport;
        this.nameProvince = nameProvince;
        this.tax = tax;
    }


    public ImportProduct(String idImport, String codeProduct, String nameProduct, String priceProduct, String numberProduct, String nameManufacture,
                         String priceImport, String nameProvince, String tax) {
        this( codeProduct,  nameProduct,  priceProduct,  numberProduct,  nameManufacture,
                priceImport,  nameProvince,  tax);
        this.idImport = idImport;

    }

    public String getIdImport() {
        return idImport;
    }

    public String getPriceImport() {
        return priceImport;
    }

    public String getNameProvince() {
        return nameProvince;
    }

    public String getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return "ImportProduct{" +
                " idProduct='" + idImport + '\'' +
                ", codeProduct='" + codeProduct + '\'' +
                ", nameProduct =" + nameProduct + '\t' +
                ", priceProduct=" + priceProduct +
                ", numberProduct='" + numberProduct + '\'' +
                ", nameManufacture='" + nameManufacture + '\'' +
                ", priceImport='" + priceImport + '\'' +
                ", nameProvince='" + nameProvince + '\'' +
                ", tax='" + tax + '\'' +
                '}';
    }

    public static void writeImport() {
        ReadAndWriteProduct.writeFile("import");
    }

}