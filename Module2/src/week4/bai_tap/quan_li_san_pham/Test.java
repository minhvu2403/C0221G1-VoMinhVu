package week4.bai_tap.quan_li_san_pham;


public class Test {
    static  Manager manager =new Manager();
    public static void main(String[] args) {
        IOFile.takeData(manager.URL_FILE,manager.products);
        manager.mainMenu();
    }
}
