package ss11_dsa_stack_queue.exercise.exercise_optional_3;

import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String str1 = "s * (s – a) * (s – b) * (s – c)";
        String str2 = "s * (s – a) * (s – b * (s – c)";
        String str3 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(checkBracket(str1));
        System.out.println(checkBracket(str2));
        System.out.println(checkBracket(str3));
    }

    public static boolean checkBracket(String str1) {
        Stack<Character> strCheck = new Stack<>();
        for (int i = 0; i < str1.length(); i++) {
            char x = str1.charAt(i);
            if (x == '(' || x == ')') {
                if (strCheck.isEmpty()) {
                    strCheck.push(x);
                } else if (strCheck.get(0) == '(' && x == ')') {
                    strCheck.pop();
                } else {
                    strCheck.push(x);
                }
            }
        }
        return strCheck.isEmpty();
    }
}
