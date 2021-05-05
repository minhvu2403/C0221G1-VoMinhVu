package bai_tap_lam_them.model;

public class XeMay extends PhuongTien {
    private int congSuat;


    public XeMay() {
    }

    public XeMay(int congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String tenHang, String namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay(String[] xeMay) {
        super(xeMay[0], xeMay[1], xeMay[2], xeMay[3]);
        this.congSuat = Integer.parseInt(xeMay[4]);
    }

    public int getcongSuat() {
        return congSuat;
    }

    public void setcongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString()+","+congSuat;
    }

    @Override
    public void showInfor() {
        System.out.println("XeMay{"
                + "bienKiemSoat=" + getBienKiemSoat()+ '\''
                + ", tenHang=" + getTenHang()+ '\''
                + ", namSanXuat=" + getNamSanXuat()+ '\''
                + ", chuSoHuu=" + getChuSoHuu()+ '\''
                + ", congSuat=" + congSuat+ '\''
                + "} ");
    }
}
