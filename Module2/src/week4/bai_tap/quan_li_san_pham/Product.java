package week4.bai_tap.quan_li_san_pham;

import java.io.Serializable;

public class Product implements Serializable {
    private String maSP;
    private String tenSP;
    private String hangSP;
    private float giaSP;
    private String moTa;

    public Product() {
    }

    public Product(String maSP, String tenSP, String hangSP, float giaSP, String moTa) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.hangSP = hangSP;
        this.giaSP = giaSP;
        this.moTa = moTa;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSP() {
        return hangSP;
    }

    public void setHangSP(String hangSP) {
        this.hangSP = hangSP;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", hangSP='" + hangSP + '\'' +
                ", giaSP=" + giaSP +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
