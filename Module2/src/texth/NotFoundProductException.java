package texth;


public class NotFoundProductException extends Exception {
    public NotFoundProductException(){
        super("sản phẩm không tồn tại");
    }
}
