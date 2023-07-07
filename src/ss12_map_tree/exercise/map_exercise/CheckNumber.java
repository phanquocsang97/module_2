package ss12_map_tree.exercise.map_exercise;

import java.util.*;

public class CheckNumber {
    public static void main(String[] args) {
        int[] newarr = {8, 3, 6, 1, 5, 4};
//        String[] newarr = arr.split(",");
        System.out.println(Arrays.toString(newarr));
        Map<Integer, Integer> map = new TreeMap<>();
        Map<Integer, Integer> map1 = new TreeMap<>();
        for (int i = 0; i < newarr.length; i++) {
            if (map.containsKey(newarr[i])) {
                map.put(newarr[i], map.get(newarr[i]) + 1);
            } else {
                map.put(newarr[i], 1);
            }
        }

//        int max = newarr[0];
//        for (int i = 0; i < 2; i++) {
//            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//                if (max < entry.getKey()) {
//                    max = entry.getKey();
//                    if (map1.containsKey(map.get(newarr[0]),map1.values()+1) {
//                        map1.put(newarr[i], map1.get(newarr[i]) + 1);
//                    } else {
//                        map1.put(newarr[i], 1);
//                    }
//                }
//            }
//        }
//        System.out.println(map1);
    }
}
