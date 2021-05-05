package quan_li_ngan_hang.commons;

public class NotFound_Exception extends Exception {
    @Override
    public String getMessage(){
        return "Ma san pham khong ton tai";
    }
}
