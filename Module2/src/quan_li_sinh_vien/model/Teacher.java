package quan_li_sinh_vien.model;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String id, String name, String sex, String date, String numberPhone) {
        super(id, name, sex, date, numberPhone);
    }

    public Teacher(String[] teacher) {
        super(teacher[0],teacher[1],teacher[2],teacher[3],teacher[4]);
    }

    @Override
    public void showInfor() {
        System.out.println("GiaoVien{"
                + "MaGV="+getId()+'\''
                + "HovaTen="+getName()+'\''
                + "NgaySinh="+getDate()+'\''
                + "SoDT="+getNumberPhone()+'\''
        );
    }
}
