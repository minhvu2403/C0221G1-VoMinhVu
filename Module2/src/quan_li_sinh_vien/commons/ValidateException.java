package quan_li_sinh_vien.commons;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateException {
    private static final String NAME_REGEX="^([A-Z][a-z]*\\s)+[A-Z][a-z]*$";
    private static final String SEX_REGEX="^(nam|nu|Nam|Nu)$";
    private static final String DATE_REGEX="\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
    private static final String PHONE_REGEX = "^\\([0-9]{2}\\)-\\([0-9]{10}\\)$";


    public static boolean kiemtraName(String regex){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(regex);
        boolean flag= matcher.matches();
        if (!flag){
            System.out.println("Dau vao khong phu hop:(Nguyen Van A");
        }
        return flag;

    }
    public static boolean kiemtraGioiTinh(String regex){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(regex);
        boolean flag= matcher.matches();
        if (!flag){
            System.out.println("Dau vao khong phu hop:(nam or nu ||Nam or Nu");
        }
        return flag;
    }
    public static boolean kiemtraDate(String regex){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(regex);
        boolean flag= matcher.matches();
        if (!flag){
            System.out.println("Dau vao khong phu hop:(xx/xx/xxx ||xx-xx-xxxx");
        }
        return flag;
    }
    public static boolean kiemtraPhone(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        boolean check = matcher.matches();
        if (!check) {
            System.out.println("Dau vao phone khong phu hop (xx)-(xxxxxxxxx)");
        }
        return check;
    }


}