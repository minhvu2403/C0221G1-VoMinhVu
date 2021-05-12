package quan_li_danh_ba.model;

public class GioiTinh {
    private String gioiTinh;

    public GioiTinh() {
    }

    public GioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public GioiTinh(String[] gioiTinh) {
        this.gioiTinh=gioiTinh[0];
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return gioiTinh ;
    }
}