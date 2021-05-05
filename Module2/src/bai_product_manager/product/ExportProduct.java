package bai_product_manager.product;

import bai_product_manager.commons.ReadAndWriteProduct;

public class ExportProduct extends Product {
    String idExport;
    String priceExport;
    String nameNation;


    public ExportProduct(String codeProduct, String nameProduct, String priceProduct,
                         String numberProduct, String nameManufacture, String priceExport,
                         String nameNation) {
        super(nameProduct, codeProduct, priceProduct, numberProduct, nameManufacture);
        this.priceExport = priceExport;
        this.nameNation = nameNation;
    }

    public ExportProduct(String idExport, String codeProduct, String nameProduct, String priceProduct,
                         String numberProduct, String nameManufacture, String priceExport,
                         String nameNation) {
        this(nameProduct, codeProduct, priceProduct, numberProduct, nameManufacture, priceExport, nameNation);
        this.idExport = idExport;
    }

    public String getPriceExport() {
        return priceExport;
    }

    public String getNameNation() {
        return nameNation;
    }

    public String getIdExport() {
        return idExport;
    }

    @Override
    public String toString() {
        return "ExportProduct{" +
                "idProduct='" + idExport + '\'' +
                ", codeProduct='" + codeProduct + '\'' +
                ", nameProduct =" + nameProduct + '\t' +
                ", priceProduct='" + priceProduct + '\'' +
                ", numberProduct='" + numberProduct + '\'' +
                ", nameManufacture='" + nameManufacture + '\'' +
                "priceExport='" + priceExport + '\'' +
                ", nameNation='" + nameNation + '\'' +
                '}';
    }


    public static void writeExport() {
        ReadAndWriteProduct.writeFile("export");
    }
}
