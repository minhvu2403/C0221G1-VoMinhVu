package bai_product_manager2.model;

import bai_product_manager.commons.ReadAndWriteProduct;

public class NhapKhau extends QuanLiSanPham {
    private String giaNhapKhau;
    private String tinhThanhNhap;
    private String thueNhapKhau;


    @Override
    public void showInformation() {
        System.out.println(toString());
    }
}
