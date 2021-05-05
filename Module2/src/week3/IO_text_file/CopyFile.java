package week3.IO_text_file;

import java.io.*;

public class CopyFile {
    public static void writeFile(File file , String str) throws IOException {
        FileWriter fw =new FileWriter(file);
        try{
            fw.write(str);
            fw.close();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Thanh cong...");
    }
    public static String readFile(File file) throws IOException {
        FileReader fr=new FileReader(file);
        int i;
        String result="";
        while ((i=fr.read()) !=-1){
            result+=(char)i;
        }
        fr.close();
        return result;
    }

    public static void main(String[] args) throws IOException {
        File reaFile=new File("src\\week3\\IO_text_file\\read.txt");
        File wriFile=new File("src\\week3\\IO_text_file\\write.txt");
        String result=readFile(reaFile);
        writeFile(wriFile,result);

    }

}
