package week4.bai_tap.quan_li_san_pham;

import java.io.*;
import java.util.List;

public class IOFile {
    public static void writeInFile(String filePath, List<Product> products, Product product) {
        try {
            takeData(filePath, products);
            OutputStream outputStream = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
            products.add(product);
            oos.writeObject(products);
            oos.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Product> takeData(String filePath, List<Product> products) {
        try {
            InputStream inputStream = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            List<Product> product = (List<Product>) ois.readObject();
            if (product.size() > 0) {
                for (Object obj : product) {
                    products.add((Product) obj);
                }
            }

            ois.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (EOFException e) {
            System.out.println("hien tai file khong co du lieu");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void printFromFile(String filePath) {
        try {
            InputStream inputStream = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            List<Product> product = (List<Product>) ois.readObject();
            for (Object obj : product
            ) {
                System.out.println(obj);

            }
            ois.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File bi loi");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
