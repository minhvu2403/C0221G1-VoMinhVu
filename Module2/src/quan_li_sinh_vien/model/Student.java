package quan_li_sinh_vien.model;

public class Student extends Person {
    private String idClass;

    public Student() {
    }

    public Student(String idClass) {
        this.idClass = idClass;
    }

    public Student(String id, String name, String sex, String date, String numberPhone, String idClass) {
        super(id, name, sex, date, numberPhone);
        this.idClass = idClass;
    }

    public Student(String[] student) {
        super(student[1],student[2],student[3],student[5],student[4]);
        this.idClass=student[0];
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    @Override
    public String toString() {
        return idClass + "," + super.toString();

    }

    @Override
    public void showInfor() {
        System.out.println("SinhVien{"
                + "MaLop=" + idClass + '\''
                + "MaSV=" + getId() + '\''
                + "HoVaTen=" + getName() + '\''
                + "GioiTinh=" + getSex() + '\''
                + "NgaySinh=" + getDate() + '\''
                + "SoDT=" + getNumberPhone() + '\''
        );
    }
}
