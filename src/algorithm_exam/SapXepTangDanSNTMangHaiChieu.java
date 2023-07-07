package algorithm_exam;

import java.util.*;

public class SapXepTangDanSNTMangHaiChieu {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 8, 43},
                {9, 4, 11, 7},
                {11, 6, 4, 0},
                {1, 2, 6, 52},
        };
        System.out.println(Arrays.toString(check(array)));
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static int[] check(int[][] arr) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isPrime(arr[i][j])) {
                    set.add(arr[i][j]);
                }
            }
        }
        System.out.println(set.size());
        int[] newArr = new int[set.size()];
        List<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }
}
