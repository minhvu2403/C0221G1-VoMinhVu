package quan_li_san_pham_update.commons;

public class NotFound_Exception extends Exception {
    @Override
    public String getMessage(){
        return "Ma san pham khong ton tai";
    }
}
