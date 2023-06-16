package ss11_dsa_stack_queue.exercise.exercise_optional_1;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi");
        int number = scanner.nextInt();
        System.out.println(checkNumber(number));
    }

    public static Stack<Integer> checkNumber(int numberCheck) {
        Stack<Integer> stack = new Stack<>();
        while (numberCheck != 0) {
            stack.push(numberCheck % 2);
            numberCheck = numberCheck / 2;
        }
        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty()) {
            newStack.push(stack.pop());
        }
        return newStack;
    }

}

