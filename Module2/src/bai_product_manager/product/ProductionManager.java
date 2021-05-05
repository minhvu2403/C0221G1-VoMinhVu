package bai_product_manager.product;

import bai_product_manager.commons.CheckCodeExist;
import bai_product_manager.commons.ReadAndWriteProduct;

import java.util.List;
import java.util.Scanner;

public class ProductionManager {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        displayMainMenu();
    }


    public static void displayMainMenu() {
        String input;
        do {
            System.out.print("1.\tAdd new product\n" +
                    "2.\tDelete product\n" +
                    "3.\tDisplay list product\n" +
                    "4.\tSearch product\n" +
                    "5.\tExit\n" +
                    "Enter input :");
            input = scn.nextLine();
            switch (input) {
                case "1":
                    addNewProduct();
                    break;
                case "2":
                    deleteProduct();
                    break;
                case "3":
                    showProduct();
                    break;
                case "4":
                    searchProduct();
                    break;
                case "5":
                    input = "-1";
                    break;
                default:
                    System.out.println("Wrong input");
            }

        }
        while (!input.equals("-1"));
    }


    public static void addNewProduct() {
        String choice;
        do {
            System.out.print("1.\tAdd product import\n" +
                    "2.\tAdd product export\n" +
                    "Enter choice : ");
            choice = scn.nextLine();
            switch (choice) {
                case "1":
                    ImportProduct.writeImport();
                    break;
                case "2":
                    ExportProduct.writeExport();
                    break;
                default:
                    System.out.println("Wrong input : ");
            }

        }
        while (choice.equals("-1"));
        displayMainMenu();
    }

    public static void deleteProduct() {
        System.out.print("Enter Code Product : ");
        String codeProduct = scn.nextLine();
        String str = "";
        List<Product> list = ReadAndWriteProduct.readFile();
        boolean check = false;
        try {
            for (Product product : list) {
                if (codeProduct.equals(product.getCodeProduct())) {
                    list.remove(product);
                    ReadAndWriteProduct.updateFile(list);
                    check = true;
                    break;
                }
            }
            if(!check) throw new CheckCodeExist("Code Product is not exist");

        } catch (CheckCodeExist e) {
            System.out.println(e);
        }


    }

    public static void searchProduct() {
        System.out.print("Enter Name Product : ");
        String nameProduct = scn.nextLine();
        String str = "";
        for (Product product : ReadAndWriteProduct.readFile()) {
            if (nameProduct.equals(product.getNameProduct())) {
                str += product.toString() + "\n";
            } else {
                str = "Product not exist";
            }
        }
        System.out.println(str);
    }

    public static void showProduct() {

        System.out.println("----------Show all --------");
        String str = "";
        for (Product product : ReadAndWriteProduct.readFile()) {
            str += product.toString();
            str += System.lineSeparator();
        }
        System.out.println(str);
    }
}