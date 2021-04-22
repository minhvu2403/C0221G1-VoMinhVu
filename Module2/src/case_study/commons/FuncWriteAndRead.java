package case_study.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteAndRead {
    public static void writeFile(String pathFile, String line) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();

        } catch (IOException e) {
            System.err.println("Loi ghi file");
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readFile(String pathFile) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> list = new ArrayList<>();
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Loi doc file");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

}
