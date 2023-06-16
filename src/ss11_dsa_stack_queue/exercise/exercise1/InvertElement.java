package ss11_dsa_stack_queue.exercise.exercise1;

import java.util.Arrays;
import java.util.Stack;

public class InvertElement {
    public static void main(String[] args) {
        Stack<String> stackStr = new Stack<>();
        String str1 = "GNAS";
        String str[] = str1.split("");
        System.out.println("Before Invert : " + (Arrays.toString(str)));
        for (int i = 0; i < str.length; i++) {
            stackStr.push(str[i]);
        }
        Stack<String> newStackStr = new Stack<>();
        while (!stackStr.isEmpty()) {
            newStackStr.push(stackStr.pop());
        }
        System.out.println("After Invert : " + newStackStr);


        Stack<Integer> stack1 = new Stack<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        System.out.println("Before Invert : " + stack1);
        Stack<Integer> stack2 = new Stack<>();
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        System.out.println("After Invert : " + stack2);
    }
}

