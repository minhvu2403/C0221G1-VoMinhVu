package week2.Java_Collection_Framework.quan_li_san_pham.service;

import week2.Java_Collection_Framework.quan_li_san_pham.common.FuncWriteAndRead;
import week2.Java_Collection_Framework.quan_li_san_pham.model.Product;

import java.util.*;

public class ProductManager {
    Scanner input = new Scanner(System.in);

    public void addProduct() {
        List<Product> list = new ArrayList<>();
        System.out.println("Enter the number of products: ");
        int number =Integer.parseInt(input.nextLine());

        for (int i = 0; i <number ; i++) {
            Product product = new Product();
            product.Nhap();
            boolean check=true;
            while (check){
                List<Product> lists = FuncWriteAndRead.readProducts();
                if (lists.stream().noneMatch(std -> std.getId().contains(product.getId()))){
                    list.add(product);
                    if (check){
                        break;
                    }
                  }
                else {
                    System.err.println("Ban da nhap trung id!!!");
                    System.out.println("Nhap lai id");
                    String id =input.nextLine();
                     product.setId(id);
                }
            }
        }
//        System.out.println("Enter id:");
//        String id = input.nextLine();
//        System.out.println("Enter name sp:");
//        String name = input.nextLine();
//        System.out.println("Enter price:");
//        float price = Float.parseFloat(input.nextLine());
//        Product product = new Product(id,name,price);
//        list.add(product);
       FuncWriteAndRead.writeProduct(list, true);
    }

    public void showProductList() {
        List<Product> list = FuncWriteAndRead.readProducts();
        for (int i = 0; i < list.size(); i++) {
            System.out.println((1 + i) + ". " + list.get(i));
        }
    }

    public void editProduct() {
        List<Product> list = FuncWriteAndRead.readProducts();
        showProductList();
        boolean flag = true;
        System.out.println("Chon san pham muon sua:");
        int choice = Integer.parseInt(input.nextLine());
        while (flag) {
            System.out.println("Chọn thông tin cần sửa\n" +
                    "1.Name\n" +
                    "2.Price\n" +
                    "3.Thoát");
            int choice1 = Integer.parseInt(input.nextLine());
            switch (choice1) {
                case 1:
                    System.out.println("Nhập tên cần sửa");
                    String name = input.nextLine();
                    list.get(choice - 1).setName(name);
                    break;
                case 2:
                    System.out.println("Nhập giá cần sửa");
                    float price = Float.parseFloat(input.nextLine());
                    list.get(choice - 1).setPrice(price);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn đã chọn sai.Hãy chọn lại");
                    break;
            }
        }
        FuncWriteAndRead.writeProduct(list, false);
    }

    public void deleteProduct() {
        List<Product> list = FuncWriteAndRead.readProducts();
        showProductList();
        System.out.println("Chọn sản phẩm cần xóa:");
        int choose = Integer.parseInt(input.nextLine());
        list.remove(choose - 1);
        FuncWriteAndRead.writeProduct(list, false);
    }

    public void searchByName() {
        List<Product> list = FuncWriteAndRead.readProducts();
        System.out.println("Nhập tên sản phẩm cần tìm.");
        String nameSearch = input.nextLine();
        for (Product product : list) {
            if (product.getName().contains(nameSearch)) {
                System.out.println(product);
            }

        }
    }
    public void sortList(){
        List<Product> list =FuncWriteAndRead.readProducts();
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
               if (o1.getPrice()<o2.getPrice()){
                   return 1;
               }
               else if (o1.getPrice()==o2.getPrice()){
                   return 0;
               }else{
                   return -1;
               }
            }
        });
        System.out.println("Sap xep giam dan");
        for (Product px:list) {
            System.out.println(px.toString());
        }
        FuncWriteAndRead.writeProduct(list, false);

    }


}
