package ss13_searching_algothism.exercise.exercise2;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 3, 4, 8, 6, 9};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Vị trí số cần tìm trong mảng : " + binarySearch(array, 0, array.length - 1, 5));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int middle = left + (right - left) / 2;

            if (array[middle] == value)
                return middle;

            if (array[middle] > value)
                return binarySearch(array, left, middle - 1, value);

            return binarySearch(array, middle + 1, right, value);

        }
        return -1;
    }
}


