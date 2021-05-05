package text_SV.thuc_don;

import text_SV.lop.LopHoc;
import text_SV.lop.SinhVien;

public class HienThiDanhSachSinhVien {
    public static void hienThi() {
        DocFile.docFileSinhVien();
        DocFile.docFileBatch();
        if (ThucDonChinh.sinhVienList.isEmpty()) {
            System.out.println("Khong co sinh vien nao");
            return;
        }
        for (SinhVien sinhVien : ThucDonChinh.sinhVienList) {
            for (LopHoc lopHoc : ThucDonChinh.lopHocList) {
                if (sinhVien.getIdLopHoc() == lopHoc.getIdLopHoc()) {
                    System.out.println( "Lop" + lopHoc.getTenLopHoc() + " " + sinhVien);
                }
            }
//            System.out.println(sinhVien);
        }
    }
}
