package week2.Java_Collection_Framework.quan_li_san_pham.controller;

import week2.Java_Collection_Framework.quan_li_san_pham.service.ProductManager;

import java.util.Scanner;

public class Controller {
    static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn Chức năng\n" +
                    "1.Add\n" +
                    "2.Show list\n" +
                    "3.Edit\n" +
                    "4.Delete\n" +
                    "5.Search\n" +
                    "6.Exit\n");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.showProductList();
                    break;
                case 3:
                    productManager.editProduct();
                    break;
                case 4:
                    productManager.deleteProduct();
                    break;
                case 5:
                    productManager.searchByName();
                    break;
                case 6:
                    break;
            }
        }
    }
}
