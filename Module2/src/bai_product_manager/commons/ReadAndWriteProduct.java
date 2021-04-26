package bai_product_manager.commons;


import bai_product_manager.product.ExportProduct;
import bai_product_manager.product.ImportProduct;
import bai_product_manager.product.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteProduct {
    public static final String File_BATH = "src/finalCourse/data/product.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";
    static Scanner scanner = new Scanner(System.in);

    public static void writeFile(String typeProduct) {

        List<Product> listProduct = new ArrayList<>();

        File file = new File(File_BATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        System.out.print("Enter code product : ");
        String codeProduct = CheckValueDateProduct.checkNumber();

        System.out.print("Enter name product : ");
        String nameProduct = CheckValueDateProduct.checkEmpty();

        System.out.print("Enter cost product($) : ");
        String priceProduct = CheckValueDateProduct.checkNumber();

        System.out.print("Enter number product: ");
        String numberProduct = CheckValueDateProduct.checkNumber();

        System.out.print("Enter manufacture : ");
        String manufacture = CheckValueDateProduct.checkEmpty();

        if (typeProduct.equals("import")) {
            System.out.print("Price import :");
            String price = CheckValueDateProduct.checkNumber();
            System.out.print("Name province : ");
            String nameProvince = CheckValueDateProduct.checkEmpty();
            System.out.print("Tax import : ");
            String taxImport = CheckValueDateProduct.checkEmpty();
            listProduct.add(new ImportProduct(codeProduct, nameProduct, priceProduct, numberProduct,
                    manufacture, price, nameProvince, taxImport));
        } else {
            System.out.print("Enter price export : ");
            String priceExport = CheckValueDateProduct.checkNumber();

            System.out.print("Enter nation export : ");
            String nation = CheckValueDateProduct.checkEmpty();
            listProduct.add(new ExportProduct(codeProduct, nameProduct, priceProduct, numberProduct, manufacture, priceExport, nation));
        }

        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            for (Product product : listProduct) {
                if (product instanceof ImportProduct) {
                    ImportProduct importProduct = (ImportProduct) product;
                    stringBuilder.append(importProduct.getIdProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getCodeProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNameProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getPriceProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNumberProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNameManufacture());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getPriceImport());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNameProvince());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getTax());
                } else {
                    ExportProduct exportProduct = (ExportProduct) product;
                    stringBuilder.append(exportProduct.getIdProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getCodeProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNameProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getPriceProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNumberProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNameManufacture());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getPriceExport());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNameNation());
                }
                stringBuilder.append(NEW_LINE_SEPARATOR);

            }

            bufferedWriter.append(stringBuilder);
            System.out.println("CSV file was created successfully !!!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while flushing/closing fileWriter !!!");
            e.printStackTrace();
        }

    }

    public static void updateFile(List<Product> products) {
        File file = new File(File_BATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {

            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            for (Product product : products) {
                if (product instanceof ImportProduct) {
                    ImportProduct importProduct = (ImportProduct) product;
                    stringBuilder.append(importProduct.getIdImport());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getCodeProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNameProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getPriceProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNumberProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNameManufacture());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getPriceImport());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getNameProvince());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(importProduct.getTax());
                } else {
                    ExportProduct exportProduct = (ExportProduct) product;
                    stringBuilder.append(exportProduct.getIdExport());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getCodeProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNameProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getPriceProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNumberProduct());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNameManufacture());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getPriceExport());
                    stringBuilder.append(COMMA_DELIMITER);
                    stringBuilder.append(exportProduct.getNameNation());
                }
                stringBuilder.append(NEW_LINE_SEPARATOR);

            }

            bufferedWriter.append(stringBuilder);
            System.out.println("CSV file was created successfully !!!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while flushing/closing fileWriter !!!");
            e.printStackTrace();
        }

    }


    public static List<Product> readFile() {
        List<Product> list = new ArrayList<>();

        File fileRoom = new File(File_BATH);
        String[] arrayTemp;

        try {
            if
            (!fileRoom.exists()) {
                throw new FileNotFoundException("File not exists");
            }
            FileReader fileReader = new FileReader(fileRoom);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayTemp = line.split(",");
                if (arrayTemp.length == 9) {
                    ImportProduct importProduct = new ImportProduct(arrayTemp[0],arrayTemp[1], arrayTemp[2], arrayTemp[3], arrayTemp[4],
                            arrayTemp[5], arrayTemp[6], arrayTemp[7],arrayTemp[8]);
                    list.add(importProduct);
                } else if (arrayTemp.length == 8) {
                    ExportProduct exportProduct = new ExportProduct(arrayTemp[0],arrayTemp[1], arrayTemp[2], arrayTemp[3], arrayTemp[4],
                            arrayTemp[5], arrayTemp[6],arrayTemp[7]);
                    list.add(exportProduct);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (
                FileNotFoundException e) {
            System.out.println(e);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}