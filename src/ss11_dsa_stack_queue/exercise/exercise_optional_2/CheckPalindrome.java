package ss11_dsa_stack_queue.exercise.exercise_optional_2;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "able was i ere i saw elba";
        String[] newStr = str.split("");
        boolean flag = true;
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < newStr.length; i++) {
            stack.push(newStr[i]);
            queue.add(newStr[i]);
        }
        System.out.println(stack);
        System.out.println(queue);

        while (!stack.isEmpty()) {
            if (Objects.equals(stack.pop(), queue.remove())) {
                flag = true;
            } else {
                flag = false;
                System.out.println("Đây không phải là chuỗi Palindmore");
                break;
            }
        }
        if (flag) {
            System.out.println("Đây là chuỗi Palindmore");
        }
        System.out.println(queue);
        System.out.println(stack);
    }
}
