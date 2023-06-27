package ss18_string.exercise.exercise1;

import ss18_string.exercise.exercise1.ClassNameExample;

public class Main {
    public static final String[] validClassName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean valid = classNameExample.validate(className);
            System.out.println("Class name is " + className + " is valid " + valid);
        }
        for (String className : invalidClassName) {
            boolean invalid = classNameExample.validate(className);
            System.out.println("Class name is " + className + " is invalid " + invalid);
        }
    }
}
