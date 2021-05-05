package quan_li_sinh_vien.commons;

public class NotFound_Exception extends Exception {
    @Override
    public String getMessage(){
        return "Ma san pham khong ton tai";
    }
}
