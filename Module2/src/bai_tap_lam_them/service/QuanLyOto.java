package bai_tap_lam_them.service;

import bai_tap_lam_them.commons.FuncWriteAndRead;
import bai_tap_lam_them.commons.ValidateException;
import bai_tap_lam_them.model.HangSanXuat;
import bai_tap_lam_them.model.OTo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyOto {
    static Scanner scanner = new Scanner(System.in);
    static FuncWriteAndRead<OTo> funcWriteAndRead = new FuncWriteAndRead();
    static QuanLiHang quanLiHang = new QuanLiHang();

    public void themOto() {
        String bienKiemSoat;
        String tenHang;
        String namSanXuat;
        String chuSoHuu;
        int soChoNgoi;
        String kieuXe;
        List<OTo> list = new ArrayList<>();

        while (true) {
            System.out.print("Nhập biển kiểm soát:");
            bienKiemSoat = scanner.nextLine();
            if (ValidateException.kiemTraOTo(bienKiemSoat)) {
                break;
            }
        }
        List<HangSanXuat> hangSanXuatList = quanLiHang.findAll();
        int count = 1;
        System.out.println("Chon noi san xuat:");
        for (HangSanXuat hangSanXuat : hangSanXuatList) {
            System.out.println((count++) + ". " + hangSanXuat.getTenSanPham());
        }
        int choice = Integer.parseInt(scanner.nextLine());
        tenHang = hangSanXuatList.get(choice - 1).getTenSanPham();
        System.out.print("Nhập năm sản xuất: ");
        namSanXuat = scanner.nextLine();
        System.out.print("Nhập chủ sở hữu: ");
        chuSoHuu = scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi :  ");
        soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu xe  :  ");
        kieuXe = scanner.nextLine();

        OTo oto = new OTo(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        list.add(oto);
        funcWriteAndRead.writeFile("Oto.csv", list, true);

    }

    public List<OTo> findAll() {
        List<String[]> list = funcWriteAndRead.readFile("Oto.csv");
        List<OTo> otoList = new ArrayList<>();
        for (String[] strings : list) {
            OTo oto = new OTo(strings);
            otoList.add(oto);
        }
        return otoList;
    }

    public void hienThiOto() {
        List<OTo> list = findAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ". ");
            list.get(i).showInfor();
        }
    }

    public OTo findById(String bienKiemSoat) {
        List<OTo> list = findAll();
        for (OTo oto : list) {
            if (oto.getBienKiemSoat().equals(bienKiemSoat)) {
                return oto;
            }
        }
        return null;
    }

    public void delete(String bienKiemSoat) {
        List<OTo> list = findAll();
        for (OTo oto : list) {
            if (oto.getBienKiemSoat().equals(bienKiemSoat)) {
                list.remove(oto);
                funcWriteAndRead.writeFile("Oto.csv", list, false);
                return;
            }
        }
    }

    public void edit( String bienKiemSoat) {
        List<OTo> list = findAll();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBienKiemSoat().equals(bienKiemSoat)) ;
            index = i;
            break;
        }

        System.out.println("Ban muon sua cai gi?\n" +
                "1. ten\n" +
                "2. nam san xuat\n" +
                "3. so Cho ngoi\n" +
                "Moi ban chon chuc nang");
        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                System.out.println("Nhap ten muon sua");
                list.get(index).setChuSoHuu(scanner.nextLine());
                break;
            case "2":
                System.out.println("Nhap nam san xuat muon sua:");
                list.get(index).setNamSanXuat(scanner.nextLine());
                break;
            case "3":

                System.out.println("Nhap tai trong muon sua");
                list.get(index).setSoChoNgoi(Integer.parseInt(scanner.nextLine()));
                break;
        }
        funcWriteAndRead.writeFile("Oto.csv", list, false);
    }

}
