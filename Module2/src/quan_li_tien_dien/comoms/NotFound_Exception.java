package quan_li_tien_dien.comoms;

public class NotFound_Exception extends Exception {
    @Override
    public String getMessage(){
        return "Ma san pham khong ton tai";
    }
}
