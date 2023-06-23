package ss16_text_file.practice.practice2;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max <  numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\CodeGym\\Module 2\\src\\ss16_text_file\\practice\\practice2\\number");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\CodeGym\\Module 2\\src\\ss16_text_file\\practice\\practice2\\result",maxValue);
    }
}
