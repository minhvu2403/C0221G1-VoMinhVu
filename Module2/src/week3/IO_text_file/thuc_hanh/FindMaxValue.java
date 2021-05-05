package week3.IO_text_file.thuc_hanh;

import java.util.List;

public class FindMaxValue {
    public static  int findMax(List<Integer> number){
        int max =number.get(0);
        for (int i = 0; i <number.size() ; i++) {
            if(max<number.get(i)){
                max=number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile =new ReadAndWriteFile();
       List<Integer> numbers =readAndWriteFile.readFile("src\\week3\\IO_text_file\\thuc_hanh\\numbers.txt");
        int maxValue=findMax(numbers);
        readAndWriteFile.writeFile("src\\week3\\IO_text_file\\thuc_hanh\\result.txt",maxValue);
    }
}
