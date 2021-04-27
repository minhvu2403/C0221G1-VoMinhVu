package bai_product_manager2.model;

import bai_product_manager.commons.ReadAndWriteProduct;

public abstract class QuanLiSanPham {
    private int id;
    private String maSanPham;
    private String tenSanPham;
    private String giaBan;
    private String SoLuong;
    private String nhaSanXuat;

    public QuanLiSanPham() {
    }

    public QuanLiSanPham(int id, String maSanPham, String tenSanPham, String giaBan, String soLuong, String nhaSanXuat) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        SoLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String soLuong) {
        SoLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", SoLuong='" + SoLuong + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }

    public abstract void showInformation();
}
