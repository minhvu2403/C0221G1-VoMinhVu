package quan_li_danh_ba.model;

public class DanhBa {
    private String soDienThoai;
    private String hoTen;
    private String nhom;
    private String gioitinh;
    private String diaChi;
    private String ngaySinh;
    private String email;

    public DanhBa(String soDienThoai, String hoTen, String nhom, String gioitinh, String diaChi, String ngaySinh, String email) {
        this.soDienThoai = soDienThoai;
        this.hoTen = hoTen;
        this.nhom = nhom;
        this.gioitinh = gioitinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public DanhBa(String[] danhba) {
        this.soDienThoai=danhba[0];
        this.hoTen=danhba[1];
        this.nhom=danhba[2];
        this.gioitinh=danhba[3];
        this.diaChi=danhba[4];
        this.ngaySinh=danhba[5];
        this.email=danhba[6];
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void showInfor() {
        System.out.println(
                "DanhBa{" +
                        "soDienThoai=" + soDienThoai +
                        ",hoVaTen=" + hoTen +'\'' +
                        ", nhom='" + nhom + '\'' +
                        ", gioitinh='" + gioitinh + '\'' +
                        ", diaChi='" + diaChi + '\'' +
                        ", ngaySinh='" + ngaySinh + '\'' +
                        ", email='" + email + '\'' +
                        '}');
    }

    @Override
    public String toString() {
        return soDienThoai+","+hoTen+","+nhom+","+gioitinh+","+diaChi+","+ngaySinh+","+email;
    }
}
