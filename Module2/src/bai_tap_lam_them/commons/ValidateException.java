package bai_tap_lam_them.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateException {
    private static final String REQUIRED_STRING_REGEX = "^\\w+$";
    private static final String XETAI_REGEX = "^\\d{2}C-\\d{2}\\.\\d{3}$";
    private static final String OTO_REGEX = "^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$";
    private static final String XEMMAY_REGEX = "^\\d{2}-[A-Z]\\d-\\d{3}\\.\\d{2}$";
 public static boolean isValidateStandard(String string,String regex){
     Pattern pattern=Pattern.compile(regex);
     Matcher matcher=pattern.matcher(string);
     boolean flag=matcher.matches();
     if (!flag){
         System.out.println("Dau vao khong phu hop"+regex);
     }
     return flag;
 }
 public static boolean kiemTraXeTai(String regex){
     Pattern pattern=Pattern.compile(XETAI_REGEX);
     Matcher matcher=pattern.matcher(regex);
     boolean flag=matcher.matches();
     if (!flag){
         System.out.println("Dau vao khong phu hop "+regex);
     }
     return flag;
 }

    public static boolean kiemTraXeMay(String regex){
        Pattern pattern=Pattern.compile(XEMMAY_REGEX);
        Matcher matcher=pattern.matcher(regex);
        boolean flag=matcher.matches();
        if (!flag){
            System.out.println("Dau vao khong phu hop "+regex);
        }
        return flag;
    }
    public static boolean kiemTraOTo(String regex){
        Pattern pattern=Pattern.compile(OTO_REGEX);
        Matcher matcher=pattern.matcher(regex);
        boolean flag=matcher.matches();
        if (!flag){
            System.out.println("Dau vao khong phu hop "+regex);
        }
        return flag;
    }
}
