package texth;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validata {

    private static final String REGEX_CHUNG= "^[A-Za-z]{4,50}$";

    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean kiemTraSoDuong (String string) throws ChungException {
        boolean check = Integer.parseInt(string) > 0;
        if (!check) {
            throw new ChungException();
        }
        return check;
    }
    public static boolean kiemTraChung(String regex) {
        pattern = Pattern.compile(REGEX_CHUNG);
        matcher = pattern.matcher(regex);
        boolean check = matcher.matches();
        if (!check) {
            System.out.println("nhập sai nhập lại: ");
        }
        return check;
    }

}
