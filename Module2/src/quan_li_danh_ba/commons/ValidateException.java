package quan_li_danh_ba.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateException {
    private static final String PHONE_REGEX = "^\\([0-9]{2}\\)-\\([0-9]{10}\\)$";
    private static final String GMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String NAME_REGEX="^([A-Z][a-z]*\\s)+[A-Z][a-z]*$";

    public static boolean kiemtraPhone(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        boolean check = matcher.matches();
        if (!check) {
            System.out.println("Dau vao phone khong phu hop (xx)-(xxxxxxxxx)");
        }
        return check;
    }
    public static boolean kiemtraGmail(String regex){
        Pattern pattern=Pattern.compile(GMAIL_REGEX);
        Matcher matcher=pattern.matcher(regex);
        boolean check = matcher.matches();
        if (!check){
            System.out.println("Gmail khong hop le abc@gmail.com");
        }
        return check;
    }
    public static boolean kiemtraName(String regex){
        Pattern pattern=Pattern.compile(NAME_REGEX);
        Matcher matcher=pattern.matcher(regex);
        boolean flag= matcher.matches();
        if (!flag){
            System.out.println("Dau vao khong phu hop:(Nguyen Van A");
        }
        return flag;

    }

}
