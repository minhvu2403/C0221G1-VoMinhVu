package quan_li_danh_ba.commons;


public class NotFound_Exception extends Exception {
    public NotFound_Exception() {
    }

    @Override
    public String getMessage() {
        return " So dien thoai khong ton tai";
    }
}
