package text_SV.lop;

public class LopHoc {
    int idLopHoc;
    String tenLopHoc;
    String idGiaoVien;

    public LopHoc(int idLopHoc, String tenLopHoc, String idGiaoVien) {
        this.idLopHoc = idLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.idGiaoVien = idGiaoVien;
    }

    public LopHoc() {
    }

    public int getIdLopHoc() {
        return idLopHoc;
    }

    public void setIdLopHoc(int idLopHoc) {
        this.idLopHoc = idLopHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public String getIdGiaoVien() {
        return idGiaoVien;
    }

    public void setIdGiaoVien(String idGiaoVien) {
        this.idGiaoVien = idGiaoVien;
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "idLopHoc=" + idLopHoc +
                ", tenLopHoc='" + tenLopHoc + '\'' +
                ", idGiaoVien='" + idGiaoVien + '\'' +
                '}';
    }
}
