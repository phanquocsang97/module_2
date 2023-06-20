package ss12_map_tree.exercise.exercise2;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class countWord {
    public static void main(String[] args) {
        Map<String,Integer> countWord = new TreeMap<>();
        String string = "you only live once, but if you do it right, once is enough";
        String value = string.toLowerCase();
        String[] newString =string.split(" ");
        System.out.println(Arrays.toString(newString));
        for (String s : newString) {
            if (countWord.containsKey(s)){
                countWord.put(s, countWord.get(s) + 1);
            }else {
                countWord.put(s,1);
            }
        }
        for (Map.Entry<String,Integer> stringIntegerEntry:countWord.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " 'appearance' " + stringIntegerEntry.getValue() + " times ");
        }
    }
}
