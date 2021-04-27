package week4.bai_tap.quan_li_san_pham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    static Scanner scanner = new Scanner(System.in);
    public static final String URL_FILE = "src\\week4\\bai_tap\\quan_li_san_pham\\Product.DAT";
    static List<Product> products = new ArrayList<>();

    public static void addProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        String maSP = scanner.nextLine();
        System.out.print("Tên sản phẩm: ");
        String tenSP = scanner.nextLine();
        System.out.print("Hãng sản phẩm: ");
        String hangSP = scanner.nextLine();
        System.out.print("Giá sản phẩm: ");
        float giaSP = Float.parseFloat(scanner.nextLine());
        System.out.print("Mô tả sản phẩm: ");
        String moTa = scanner.nextLine();
        Product product = new Product(maSP, tenSP, hangSP, giaSP, moTa);
        IOFile.writeInFile(URL_FILE, products, product);
    }

    public static void findProduct() {
        System.out.println("**Moi ban chon chuc nang**\n" +
                "1.Tim kiem san phan theo ten\n" +
                "2.Tim kiem san pham theo id\n" +
                "3.Xoa san pham theo id\n"+
                "4.Back\n" +
                "5.Exit");
        System.out.println("Nhap lua chon:");
        int choice = Integer.parseInt(scanner.nextLine());
        boolean check;
        switch (choice) {
            case 1:
                check = false;
                System.out.println("nhap ten san pham ban muon tim:");
                String name = scanner.nextLine();
                for (Product product : products) {
                    if (product.getTenSP().equals(name)) {
                        System.out.println(product);
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.println("Khong tim thay san pham co ten la" + name + ":");
                }
                findProduct();
                break;
            case 2:
                check = false;
                System.out.println("nhap id san pham ban muon tim:");
                String id = scanner.nextLine();
                for (Product product : products) {
                    if (product.getMaSP().equals(id)) {
                        System.out.println(product);
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.println("Khong tim thay san pham co id la" + id + ":");
                }
                findProduct();
                break;
            case 3:
                check =false;
                List<Product>product=IOFile.takeData(URL_FILE,products);
                System.out.println("Nhap id san pham can xoa:");
                String newId=scanner.nextLine();
                for (Product pr:product) {
                    if (pr.getMaSP().equals(newId)){
                        product.remove(pr);
                        check=true;
                        break;

                    }
                }
                if (!check){
                    System.out.println("Khong tim thay san pham co id la" + newId + ":");

                }
                IOFile.writeInFile(URL_FILE,product, (Product) products);
                findProduct();
                break;
            case 4:
                mainMenu();
                break;
            case 5:
                System.exit(0);

        }
    }

    public static void mainMenu() {
        System.out.println("**Moi ban chon chuc nang**\n"+
                "1.Them san pham moi \n"+
                "2.Hien thi danh sach san pham\n"+
                "3.Tim kiem san pham.");
        System.out.println("Moi ban chon chuc nang");
        int choice =Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                addProduct();
                mainMenu();
                break;
            case 2:
                IOFile.printFromFile(URL_FILE);
                mainMenu();
                break;
            case 3:
                findProduct();
                break;
            case 4:
                System.exit(0);
        }
    }

}
