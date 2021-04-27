package texth;


public class XuatKhau extends QuanLySanPham{
    String giaXuatKhau;
    String quocGiaNhap;

    public XuatKhau(){}

    public XuatKhau(String giaXuatKhau, String quocGiaNhap) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhap = quocGiaNhap;
    }

    public XuatKhau(int id, String maSanPham, String tenSanPham, String giaBan, String soLuong, String nhaSanXuat, String giaXuatKhau, String quocGiaNhap) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhap = quocGiaNhap;
    }

    public String getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(String giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhap() {
        return quocGiaNhap;
    }

    public void setQuocGiaNhap(String quocGiaNhap) {
        this.quocGiaNhap = quocGiaNhap;
    }

    @Override
    public String toString() {
        return "XuatKhau{" + super.toString() +
                "giaXuatKhau='" + giaXuatKhau + '\'' +
                ", quocGiaNhap='" + quocGiaNhap + '\'' +
                '}';
    }

    @Override
    public void hienThi() {
        System.out.println(this.toString());
    }


}
