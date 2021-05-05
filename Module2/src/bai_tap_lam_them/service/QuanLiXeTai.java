package bai_tap_lam_them.service;

import bai_tap_lam_them.commons.FuncWriteAndRead;
import bai_tap_lam_them.commons.ValidateException;
import bai_tap_lam_them.model.HangSanXuat;
import bai_tap_lam_them.model.XeTai;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiXeTai {
    static Scanner scanner = new Scanner(System.in);
    static FuncWriteAndRead<XeTai> funcWriteAndRead = new FuncWriteAndRead();
    static QuanLiHang quanLiHang = new QuanLiHang();

    public void themXetai() {
        String bienKiemSoat;
        String tenHang;
        String namSanXuat;
        String chuSoHuu;
        int trongTai;
        List<XeTai> list = new ArrayList<>();

        while (true) {
            System.out.println("Nhap bien kiem soat:");
            bienKiemSoat = scanner.nextLine();
            if (ValidateException.kiemTraXeTai(bienKiemSoat)) {
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
        System.out.println("Nhap trong tai:");
        trongTai = Integer.parseInt(scanner.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, trongTai);
        list.add(xeTai);
        funcWriteAndRead.writeFile("XeTai.csv", list, true);

    }

    public List<XeTai> findAll() {
        List<String[]> list = funcWriteAndRead.readFile("XeTai.csv");
        List<XeTai> xeTaiList = new ArrayList<>();
        for (String[] strings : list) {
            XeTai xeTai = new XeTai(strings);
            xeTaiList.add(xeTai);
        }
        return xeTaiList;
    }

    public void hienThiXeTai() {
        int i;
        List<XeTai> list = findAll();
        for (i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ". ");
            list.get(i).showInfor();
        }
    }

    public XeTai findById(String bienKiemSoat) {
        List<XeTai> list = findAll();
        for (XeTai xeTai : list) {
            if (xeTai.getBienKiemSoat().equals(bienKiemSoat)) {
                return xeTai;
            }
        }
        return null;
    }

    public void delete(String bienKiemSoat) {
        List<XeTai> list = findAll();
        for (XeTai xeTai : list) {
            if (xeTai.getBienKiemSoat().equals(bienKiemSoat)) {
                list.remove(xeTai);
                funcWriteAndRead.writeFile("XeTai.csv", list, false);
                return;
            }
        }
    }

    public void edit(String bienKiemSoat) {
        List<XeTai> list = findAll();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBienKiemSoat().equals(bienKiemSoat)) ;
            index = i;
            break;
        }
        System.out.println("Ban muon sua cai gi?\n" +
                "1. ten\n" +
                "2. nam san xuat\n" +
                "3. trong tai\n" +
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
                list.get(index).setTrongTai(Integer.parseInt(scanner.nextLine()));
                break;
        }
        funcWriteAndRead.writeFile("XeTai.csv", list, false);

    }
}