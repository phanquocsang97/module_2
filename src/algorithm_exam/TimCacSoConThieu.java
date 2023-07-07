package algorithm_exam;

import java.util.*;

public class TimCacSoConThieu {
    public static void main(String[] args) {
        String num = "6,2,3,8,10";
        System.out.println(Arrays.toString(checkMax(num)));
    }

    public static int[] checkMax(String str) {
        String[] arr = str.split(",");
        List<Integer> newArr = new ArrayList<>();
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            newArr.add(num);
        }
        int[] numArr = new int[max - min + 1 - arr.length];
        int index = 0;
        for (int i = min; i <= max; i++) {
            if (!newArr.contains(i)) {
                numArr[index] = i;
                index++;
            }
        }
        return numArr;
    }

}
