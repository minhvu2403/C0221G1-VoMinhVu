package bai_tap_lam_them.model;

public class OTo extends PhuongTien {
    private int SoChoNgoi;
    private String kieuXe;

    public OTo() {
    }


    public OTo(String bienKiemSoat, String tenHang, String namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.SoChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }
    public OTo(String[]oto){
        super(oto[0],oto[1],oto[2],oto[3]);
        this.SoChoNgoi=Integer.parseInt(oto[4]);
        this.kieuXe=oto[5];
    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        SoChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }


    @Override
    public void showInfor() {
        System.out.println("Oto{"
                + "bienKiemSoat=" + getBienKiemSoat()+ '\''
                + ", tenHang=" + getTenHang()+ '\''
                + ", namSanXuat=" + getNamSanXuat()+ '\''
                + ", chuSoHuu=" + getChuSoHuu()+ '\''
                +", soChoNgoi=" + getSoChoNgoi()+ '\''
                +", kieuXe='" + kieuXe+ '\''
                +"} ");
    }

    @Override
    public String toString() {
        return super.toString()+","+getSoChoNgoi()+","+kieuXe;
    }
}
