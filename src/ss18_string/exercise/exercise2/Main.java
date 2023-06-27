package ss18_string.exercise.exercise2;

import ss18_string.exercise.exercise1.ClassNameExample;

public class Main {
    public static final String[] validPhone = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        PhoneExample phoneExample = new PhoneExample();
        for (String phone : validPhone) {
            boolean valid = phoneExample.validate(phone);
            System.out.println("Phone is " + phone + " is valid " + valid);
        }
        for (String phone : invalidPhone) {
            boolean invalid = phoneExample.validate(phone);
            System.out.println("Phone is " + phone + " is invalid " + invalid);
        }
    }
}
