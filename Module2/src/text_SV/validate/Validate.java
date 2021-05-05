package text_SV.validate;

import text_SV.lop.SinhVien;
import text_SV.thuc_don.DocFile;
import text_SV.thuc_don.ThucDonChinh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String REGEX_TEN = "^[A-Za-z]{4,50}$";
    private static final String REGEX_NGAYSINH = "^\\d{2}/\\d{2}/\\d{4}$";
    private static final String REGEX_SODIENTHOAI = "^(090)|(091)\\d{7}$";

    public static void kiemTraTen(String ten) throws TenException {
        pattern = Pattern.compile(REGEX_TEN);
        matcher = pattern.matcher(ten);
        if (!matcher.find()) throw new TenException("Ten khong hop le !!!");
    }

    public static void kiemTraNgaySinh(String ngaySinh) throws NgaySinhException {
        pattern = Pattern.compile(REGEX_NGAYSINH);
        matcher = pattern.matcher(ngaySinh);
        if (!matcher.find()) throw new NgaySinhException("Ngay sinh khong hop le !!!");
    }

    public static void kiemTraSoDienThoai(String soDienThoai) throws SoDienThoaiException {
        pattern = Pattern.compile(REGEX_SODIENTHOAI);
        matcher = pattern.matcher(soDienThoai);
        if (!matcher.find()) throw new SoDienThoaiException("Ngay sinh khong hop le !!!");
    }

    public static void kiemTraID(int id) throws NotFoundStudentException {
        DocFile.docFileSinhVien();
        boolean flag = false;
        for (SinhVien sinhVien: ThucDonChinh.sinhVienList) {
            if (sinhVien.getId() == id) {
                flag = true;
                break;
            }
        }

        if (!flag) throw new NotFoundStudentException("Sinh vien khong ton tai");
    }
}
