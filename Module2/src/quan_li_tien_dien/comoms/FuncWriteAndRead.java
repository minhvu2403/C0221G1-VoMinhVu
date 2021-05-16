package quan_li_tien_dien.comoms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteAndRead<T> {
    private static final String PATH = "src\\quan_li_tien_dien\\data\\";

    public void writeFile(String fileName, List<T> list, boolean writeMode) {
        File file = new File(PATH + fileName);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file, writeMode));
            for (T t : list) {
                bufferedWriter.write(t.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Loi ghi file");
        } finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String[]> readWrite(String fileName) {
        List<String[]> list = new ArrayList<>();
        File file = new File(PATH + fileName);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                list.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}