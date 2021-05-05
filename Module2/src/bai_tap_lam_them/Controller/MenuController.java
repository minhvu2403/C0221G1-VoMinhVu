package bai_tap_lam_them.Controller;

import bai_tap_lam_them.commons.NotFound_Exception;
import bai_tap_lam_them.model.XeTai;
import bai_tap_lam_them.service.QuanLiXeTai;
import bai_tap_lam_them.service.QuanLyOto;
import bai_tap_lam_them.service.QuanLyXeMay;

import java.util.Scanner;

public class MenuController{
  static Scanner scanner=new Scanner(System.in);
  static QuanLiXeTai quanLiXeTai=new QuanLiXeTai();
  static QuanLyOto quanLyOto=new QuanLyOto();
  static QuanLyXeMay quanLyXeMay =new QuanLyXeMay();

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        while (true){
            System.out.println("\nCHUONG TRINH QUAN LI PHUONG TIEN GIAO THONG\n"
                    + "1. Thêm mới phương tiện\n"
                    + "2. Hiển thị phương tiện\n"
                    + "3. Chỉnh sửa phương tiện\n"
                    + "4. Xóa phương tiện\n"
                    + "5. Thoát\n"
                    + "Chọn chức năng:\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    themMoiPhuongTien();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 3:
                    chinhSuaPhuongTien();
                    break;
                case 4:
                    xoaPhuongTien();
                    break;
                case 5:
                    System.exit(0);
                    break;
                
            }
        }
    }

    private static void chinhSuaPhuongTien() {
        while (true){

            System.out.println("Nhap bien kiem soat muon sua:");
            String bienKiemSoat=scanner.nextLine();
            int kieuPhuongTien=0;
            if (quanLiXeTai.findById(bienKiemSoat) != null) {
                kieuPhuongTien = 1;
            } else if (quanLyOto.findById(bienKiemSoat) != null) {
                kieuPhuongTien = 2;
            } else if (quanLyXeMay.findById(bienKiemSoat) != null) {
                kieuPhuongTien = 3;
            }
            try{
                if (kieuPhuongTien==0){
                    throw new NotFound_Exception();

                }
                while (true){
                    System.out.println("Xác nhận sửa phương tiện với biển kiểm soát " + bienKiemSoat);
                    System.out.println("1. Đồng ý sửa \n"
                            + "2. Không đồng ý sửa \n");
                    String choice = scanner.nextLine();
                    if (choice.equals("1")){
                        switch (kieuPhuongTien){
                            case 1:
                                quanLiXeTai.edit(bienKiemSoat);
                                break;
                            case 2:
                                quanLyOto.edit(bienKiemSoat);
                                break;
                            case 3:
                                quanLyXeMay.edit(bienKiemSoat);
                                break;
                        }
                        System.out.println("Da sua thanh cong");
                        return;
                    }
                    else if(choice.equals("2")){
                        return;
                    }
                }
            } catch (NotFound_Exception e) {
                System.out.println(e.getMessage());
            }
        }


    }

    private static void xoaPhuongTien() {
        while (true){
            System.out.println("Nhập biển Kiểm soát phuong tiện muốn xóa:  ");
            String bienKiemSoat = scanner.nextLine();
            int kieuPhuongTien = 0;
            if (quanLiXeTai.findById(bienKiemSoat) != null) {
                kieuPhuongTien = 1;
            } else if (quanLyOto.findById(bienKiemSoat) != null) {
                kieuPhuongTien = 2;
            } else if (quanLyXeMay.findById(bienKiemSoat) != null) {
                kieuPhuongTien = 3;
            }
            try{
                if (kieuPhuongTien==0){
                    throw new NotFound_Exception();
                }
                while (true){
                    System.out.println("Xác nhận xóa phương tiện với biển kiểm soát " + bienKiemSoat);
                    System.out.println("1. Đồng ý xóa \n"
                            + "2. Không đồng ý xóa \n");
                    String choice = scanner.nextLine();
                    if (choice.equals("1")){
                        switch (kieuPhuongTien){
                            case 1:
                                quanLiXeTai.delete(bienKiemSoat);
                                break;
                            case 2:
                                quanLyOto.delete(bienKiemSoat);
                                break;
                            case 3:
                                quanLyXeMay.delete(bienKiemSoat);
                                break;
                        }
                        System.out.println("Da xoa thanh cong");
                        return;
                    }
                    else if(choice.equals("2")){
                        return;
                    }
                }

            } catch (NotFound_Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void hienThiPhuongTien() {
        System.out.println("\nChọn chức năng hiển thi:\n"
                + "1. Hiển thị xe tải\n"
                + "2. Hiển thị ô tô\n"
                + "3. Hiển thị xe máy\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                quanLiXeTai.hienThiXeTai();
                break;
            case 2:
                quanLyOto.hienThiOto();
                break;
            case 3:
                quanLyXeMay.hienthiXeMay();
                break;
        }
    }

    private static void themMoiPhuongTien() {
        System.out.println("\nChọn chức năng:\n"
                + "1. Thêm xe tải\n"
                + "2. Thêm ô tô\n"
                + "3. Thêm xe máy\n"
                + "4. Trở về menu trước\n"
                + "5. Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                quanLiXeTai.themXetai();
                break;
            case 2:
                quanLyOto.themOto();
                break;
            case 3:
                quanLyXeMay.themXeMay();
                break;
            case 4:
                displayMenu();
                break;
            case 5:
                System.exit(0);
                break;
                
        }
    }
}