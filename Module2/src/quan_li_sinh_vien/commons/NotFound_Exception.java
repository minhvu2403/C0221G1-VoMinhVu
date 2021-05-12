package quan_li_sinh_vien.commons;

public class NotFound_Exception extends Exception {
    @Override
    public String getMessage(){
        return "Ma sinh vien khong ton tai";
    }
}