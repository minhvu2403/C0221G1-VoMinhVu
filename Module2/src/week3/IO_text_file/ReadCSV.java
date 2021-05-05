package week3.IO_text_file;

import java.io.*;

public class ReadCSV {

    public static void writeFile(File file, String str) throws IOException {
        FileWriter fw = new FileWriter(file);
        try {
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("thanh cong");
    }

    public static String readFile(File file) throws FileNotFoundException {
        FileReader fr = new FileReader(file);
        String line;
        String result = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                String[] country = line.split(",");
                String l = "Country [code= " + country[4] + " , name=" + country[5] + "]\n";
                result += l;

            }
        } catch (FileNotFoundException e) {
            System.out.println("khong tim thay file");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        File reaFile = new File("src\\week3\\IO_text_file\\input.csv");
        File wriFile = new File("src\\week3\\IO_text_file\\ouput.csv");
        String result = readFile(reaFile);
        writeFile(wriFile, result);
    }

}


