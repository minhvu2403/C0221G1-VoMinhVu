package texth;


public abstract class QuanLySanPham {
    public int id;
    public String maSanPham;
    public String tenSanPham;
    public String giaBan;
    public String SoLuong;
    public String nhaSanXuat;

    public QuanLySanPham(){}

    public QuanLySanPham(int id, String maSanPham, String tenSanPham, String giaBan, String soLuong, String nhaSanXuat) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        SoLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public void setSoLuong(String soLuong) {
        SoLuong = soLuong;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", SoLuong='" + SoLuong + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\'';
    }
    public abstract void hienThi();
}
