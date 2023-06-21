package ss14_sort_algothism.exercise.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values ");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Your input list Before Sort : ");
        System.out.println(Arrays.toString(list));
        insertionSortUp(list);
        System.out.print("\nYour input list After Sort : ");
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSortUp(int[] list) {
        int index;
        int pos;
        for (int i = 1; i < list.length; i++) {
            index = list[i];
            pos = i;
            while (pos > 0 && index < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = index;
        }
    }
}
