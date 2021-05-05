package bai_tap_lam_them.service;

import bai_tap_lam_them.commons.FuncWriteAndRead;
import bai_tap_lam_them.commons.ValidateException;
import bai_tap_lam_them.model.HangSanXuat;
import bai_tap_lam_them.model.XeMay;
import bai_tap_lam_them.model.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyXeMay {
    static Scanner scanner = new Scanner(System.in);
    static FuncWriteAndRead<XeMay> funcWriteAndRead = new FuncWriteAndRead();
    static QuanLiHang quanLiHang = new QuanLiHang();

    public void themXeMay() {
        String bienKiemSoat;
        String tenHang;
        String namSanXuat;
        String chuSoHuu;
        int congSuat;
        List<XeMay> list = new ArrayList<>();
        while (true) {
            System.out.println("Nhap bien kiem soat:");
            bienKiemSoat = scanner.nextLine();
            if (ValidateException.kiemTraXeMay(bienKiemSoat)) {
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
        System.out.println("Nhap nam san xuat:");
        namSanXuat = scanner.nextLine();
        System.out.println("Nhap chu so huu:");
        chuSoHuu = scanner.nextLine();
        System.out.println("Nhap cong suat:");
        congSuat = Integer.parseInt(scanner.nextLine());
        XeMay xeMay = new XeMay(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, congSuat);
        list.add(xeMay);
        funcWriteAndRead.writeFile("XeMay.csv", list, true);

    }

    public List<XeMay> findAll() {
        List<String[]> list = funcWriteAndRead.readFile("XeMay.csv");
        List<XeMay> xeMayList = new ArrayList<>();
        for (String[] strings : list) {
            XeMay xeMay = new XeMay(strings);
            xeMayList.add(xeMay);
        }
        return xeMayList;

    }

    public void hienthiXeMay() {
        List<XeMay> list = findAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ". ");
            list.get(i).showInfor();
        }
    }

    public XeMay findById(String bienKiemSoat) {
        List<XeMay> list = findAll();
        for (XeMay xeMay : list) {
            if (xeMay.getBienKiemSoat().equals(bienKiemSoat)) {
                return xeMay;
            }
        }
        return null;
    }

    public void delete(String bienKiemSoat) {
        List<XeMay> list = findAll();
        for (XeMay xeMay : list) {
            if (xeMay.getBienKiemSoat().equals(bienKiemSoat)) {
                list.remove(xeMay);
                funcWriteAndRead.writeFile("XeMay.csv", list, false);
            }
        }
    }
    public void edit( String bienKiemSoat) {
        List<XeMay> list = findAll();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBienKiemSoat().equals(bienKiemSoat)) ;
            index = i;
            break;
        }

        System.out.println("Ban muon sua cai gi?\n" +
                "1. ten\n" +
                "2. nam san xuat\n" +
                "3. cong suat\n" +
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
                list.get(index).setcongSuat(Integer.parseInt(scanner.nextLine()));
                break;
        }
        funcWriteAndRead.writeFile("XeMay.csv", list, false);

    }

}
