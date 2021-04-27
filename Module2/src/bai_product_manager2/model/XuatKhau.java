package bai_product_manager2.model;

public class XuatKhau extends QuanLiSanPham {
   private String giaXuatKhau;
   private String quocGiaNhap;

    public XuatKhau() {
    }

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
        return "XuatKhau{" +super.toString()+
                "giaXuatKhau='" + giaXuatKhau + '\'' +
                ", quocGiaNhap='" + quocGiaNhap + '\'' +
                '}';
    }

    public void showInformation(){
        System.out.println(this.toString());
    }
}
