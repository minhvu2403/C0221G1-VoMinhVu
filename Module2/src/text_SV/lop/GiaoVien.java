package text_SV.lop;

public class GiaoVien extends ConNguoi {

    public GiaoVien(int id, String hoVaTen, String ngaySinh, String gioiTinh, String soDienThoai) {
        super(id, hoVaTen, ngaySinh, gioiTinh, soDienThoai);
    }

    public GiaoVien() {
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                " id=" + id +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    @Override
    public void hienThiThongTin() {
        this.toString();
    }
}