package quan_li_san_pham_update.commons;


import quan_li_san_pham_update.model.QuanLiSanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncReadAndWrite {
    private static final String PATH = "src\\Quan_li_san_pham_update\\data\\filequanlisanpham.csv";

    public static void writeFile(List<QuanLiSanPham> list, boolean writeMode) {
        File file = new File(PATH);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file, writeMode));
            for (QuanLiSanPham quanLiSanPham : list) {
                bufferedWriter.write(quanLiSanPham.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Loi ghi file");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<QuanLiSanPham> readFile() {
        List<QuanLiSanPham> list = new ArrayList<>();
        File file = new File(PATH);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] tempArr;
            while ((line = bufferedReader.readLine()) != null) {
                tempArr = line.split(",");
                QuanLiSanPham quanLiSanPham;
                if (tempArr.length == 8) {
                    //    benhAn = new BenhAnThuong(tempArr);
                } else {
                    //   benhAn = new BenhAnVip(tempArr);
                }
               //  list.add(quanLiSanPham);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Loi doc file");
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