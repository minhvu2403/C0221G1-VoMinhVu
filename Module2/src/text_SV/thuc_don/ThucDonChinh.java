package text_SV.thuc_don;

import text_SV.lop.LopHoc;
import text_SV.lop.SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThucDonChinh {
    public static List<SinhVien> sinhVienList = new ArrayList<>();
    public static List<String> listLine = new ArrayList<>();
    public static List<LopHoc> lopHocList = new ArrayList<>();
    public static final String COMA = ",";
    public static final String FILE_SINHVIEN = "src\\text_SV\\du_lieu\\sinhvien.csv";
    public static final String FILE_BACTCHS = "src\\text_SV\\du_lieu\\bacths.csv";
    public static final String FILE_GIAOVIEN = "src\\text_SV\\du_lieu\\giaovien.csv";

    public static void thucDon() {
        String luaChon;
        do {
            System.out.println("1. Them moi sinh vien.");
            System.out.println("2. Xoa sinh vien.");
            System.out.println("3. Xem danh sach sinh vien.");
            System.out.println("4. Xem thong tin giao vien.");
            System.out.println("5. Tim kiem sinh vien.");
            System.out.println("6. Thoat.");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextLine();

            switch (luaChon) {
                case "1":
                    ThemSinhVien.themMoiSinhVien();
                    break;
                case "2":
                    XoaSinhVien.xoaSinhVien();
                    break;
                case "3":
                    HienThiDanhSachSinhVien.hienThi();
                    break;
                case "4":
                    DocFile.docFileGiaoVien();
                    break;
                case "5":
                    TimKiem.timKiem();
                    break;
                case "6":
                    return;
                default:
                    thucDon();
            }
        } while (Integer.parseInt(luaChon) > 0 && Integer.parseInt(luaChon) < 7);
    }

    public static void main(String[] args) {
        thucDon();
    }
}
