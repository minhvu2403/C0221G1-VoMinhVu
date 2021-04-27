package texth;

package thi_modul2_lan2;

public class NhapKhau extends QuanLySanPham {
    String giaNhapKhau;
    String tinhThanhNhap;
    String thueNhapKhau;

    public NhapKhau(){}

    public NhapKhau(String giaXuatKhau, String tinhThanhNhap, String thueNhapKhau) {
        this.giaNhapKhau = giaXuatKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public NhapKhau(int id, String maSanPham, String tenSanPham, String giaBan, String soLuong, String nhaSanXuat, String giaXuatKhau, String tinhThanhNhap, String thueNhapKhau) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaXuatKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public String getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(String giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public String getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(String thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "NhapKhau{" + super.toString() +
                "giaXuatKhau='" + giaNhapKhau + '\'' +
                ", tinhThanhNhap='" + tinhThanhNhap + '\'' +
                ", thueNhapKhau='" + thueNhapKhau + '\'' +
                '}';
    }

    @Override
    public void hienThi() {
        System.out.println(this.toString());
    }
}
