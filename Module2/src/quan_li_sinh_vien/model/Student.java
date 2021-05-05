package quan_li_sinh_vien.model;

public class SinhVien extends Person {
    private String idClass;


    public SinhVien(String idClass) {
        this.idClass = idClass;
    }

    public SinhVien(String id, String name, String sex, String date, String numberPhone, String idClass) {
        super(id, name, sex, date, numberPhone);
        this.idClass = idClass;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    @Override
    public String toString() {
        return super.toString()+","+idClass;
    }

    @Override
    public void showInfor() {

    }
}
