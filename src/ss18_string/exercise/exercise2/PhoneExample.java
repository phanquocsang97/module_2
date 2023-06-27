package ss18_string.exercise.exercise2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String PHONE_REGEX = "^[(][8][4][)][-][(][0]\\d{9}[)]$";

    public PhoneExample() {
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regexPhone) {
        matcher = pattern.matcher(regexPhone);
        return matcher.matches();
    }
}
