package bai_tap_lam_them.model;

public class HangSanXuat {
    private String maSanPham;
    private String tenSanPham;
    private String noiSanXuat;

    public HangSanXuat() {
    }

    public HangSanXuat(String maSanPham, String tenSanPham, String noiSanXuat) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.noiSanXuat = noiSanXuat;
    }

    public HangSanXuat(String[] hangSanXuat) {
        this.maSanPham=hangSanXuat[0];
        this.tenSanPham=hangSanXuat[1];
        this.noiSanXuat=hangSanXuat[2];
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    @Override
    public String toString() {
        return  maSanPham+","+tenSanPham+","+noiSanXuat;
    }
}
