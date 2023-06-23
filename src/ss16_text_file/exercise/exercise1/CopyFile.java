package ss16_text_file.exercise.exercise1;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static List<String> copyFile(String filePath) {
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Tệp không tồn tại");
        }
        return stringList;
    }

    public static void writeFile(String filePath, List<String> text, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            int count = 0;
            for (String s : text) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                count++;

            }
            bufferedWriter.write("Tổng số kí tự là " + count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
