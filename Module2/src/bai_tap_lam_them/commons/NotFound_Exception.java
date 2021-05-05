package bai_tap_lam_them.commons;

public class NotFound_Exception extends Exception {
    public NotFound_Exception(){
    }
   @Override
    public String getMessage(){
        return "Bien kiem soat khong ton tai";
   }
}
