package ss17_binary_file.exercise.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String SOURCE_PATH = "D:\\CodeGym\\Module 2\\src\\ss17_binary_file\\exercise\\exercise2\\source.dat";
    public static final String TARGET_PATH = "D:\\CodeGym\\Module 2\\src\\ss17_binary_file\\exercise\\exercise2\\target.dat";

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Phan Quốc Sang");
        WriteAndReader.writeFileBinary(SOURCE_PATH, stringList);
        List<String> stringList1 = WriteAndReader.readFileBinary(SOURCE_PATH);
        WriteAndReader.writeFileBinary(TARGET_PATH, stringList);
        for (String str : stringList1) {
            System.out.println(str);
        }
    }
}
