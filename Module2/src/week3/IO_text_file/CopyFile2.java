package week3.IO_text_file;

import java.io.*;

public class CopyFile2 {
    private final  static String FILE_URL="src\\week3\\IO_text_file\\read.txt";
    private final  static String FILE_URO="src\\week3\\IO_text_file\\text.txt";

    public static void main(String[] args)  {

        File file=new File(FILE_URL);
        File file2 =new File(FILE_URO);
        try {
           BufferedReader reader = new BufferedReader(new FileReader(file));
           BufferedWriter writer=new BufferedWriter(new FileWriter(file2));
            String line;
           while ((line= reader.readLine()) != null) {
               writer.write(line);
           }
           reader.close();
           writer.close();
       } catch (FileNotFoundException e) {
           System.out.println("Khong tim thay file");
       } catch (IOException e) {
           e.printStackTrace();
       }


    }
}




