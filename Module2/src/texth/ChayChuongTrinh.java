package texth;



import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChayChuongTrinh {
    public static final String COMNA = ",";
    public static final String FILE_XUATKHAU = "src\\texth\\xuatkhau.csv";
    public static final String FILE_NHAPKHAU = "src\\texth\\nhapkhau.csv";

    public static void chucNang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.thêm mới" + "\n" + "2.xóa" + "\n" + "3.Xem danh sách sản phẩm" + "\n" + "4.tìm kiếm" + "\n" + "5.thoát");
        System.out.println("nhập sự lựa chọn của bạn: ");
        int d = Integer.parseInt(scanner.nextLine());

        switch (d) {
            case 1: {
                System.out.println("1.thêm sản phẩm xuất khẩu" + "\n" + "2.thêm sản phẩm nhập khẩu" + "\n" + "3.quay lại menu");
                System.out.print("nhập sự lựa chọn: ");
                int x = Integer.parseInt(scanner.nextLine());
                switch (x) {
                    case 1: {
                        themSPXuatKhau();
                        break;
                    }
                    case 2: {
                        themSPNhapKhau();
                        break;
                    }
                    case 3: {
                        chucNang();
                        break;
                    }

                }
                break;
            }
            case 2: {
                System.out.println("1.xóa sản phẩm xuất khẩu" + "\n" + "2.xóa sản phẩm nhập khẩu" + "\n" + "3.quay lại menu");
                System.out.print("nhập sự lựa chọn: ");
                int x = Integer.parseInt(scanner.nextLine());
                switch (x) {
                    case 1: {
                        xoaXuatKhau();
                        break;
                    }
                    case 2: {
                        xoaNhapKhau();
                        break;
                    }
                    case 3:
                        chucNang();
                        break;
                }
            }
            case 3: {
                System.out.println("1.danh sách sản phẩm xuất khẩu" + "\n" + "2.danh sách sản phẩm nhập khẩu" + "\n" + "3.quay lại menu");
                System.out.print("nhập sự lựa chọn: ");
                int x = Integer.parseInt(scanner.nextLine());
                switch (x) {
                    case 1: {
                        hienThiDanhSachXuatKhau();
                        break;
                    }
                    case 2: {
                        hienThiDanhSachNhapKhau();
                        break;
                    }
                    case 3:
                        chucNang();
                        break;
                }

            }
            case 4: {
                System.out.println("1.tim kiếm sản phẩm xuất khẩu" + "\n" + "2.tìm kiếm sản phẩm nhập khẩu" + "\n" + "3.quay lại menu");
                System.out.print("nhập sự lựa chọn: ");
                int x = Integer.parseInt(scanner.nextLine());
                switch (x) {
                    case 1: {
                        tiemKiemXuatKhau();
                        break;
                    }
                    case 2: {
                        tiemKiemNhapKhau();
                        break;
                    }
                    case 3: {
                        chucNang();
                        break;
                    }
                }
                break;
            }
            case 5: {
                System.exit(0);
            }
        }
    }


    public static void themSPNhapKhau() {
        int id;
        String maSanPham;
        String tenSanPham;
        String giaBan;
        String SoLuong;
        String nhaSanXuat;
        String giaNhapKhau;
        String tinhThanhNhap;
        String thueNhapKhau;


        Validata validata = new Validata();
        Scanner scanner = new Scanner(System.in);
        docFileNhapKhau(FILE_NHAPKHAU);
        id = nhapKhauList.get(nhapKhauList.size() - 1).id + 1;
        nhapKhauList.clear();
        while (true) {
            System.out.print("nhập mã sản phẩm: ");
            maSanPham = scanner.nextLine();
            if (validata.kiemTraChung(maSanPham)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập tên sản phẩm: ");
            tenSanPham = scanner.nextLine();
            if (validata.kiemTraChung(tenSanPham)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập giá bán: ");
            giaBan = scanner.nextLine();
            try {
                if (validata.kiemTraSoDuong(giaBan)) {
                    break;
                }
            } catch (ChungException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.print("nhập số lương: ");
            SoLuong = scanner.nextLine();
            try {
                if (validata.kiemTraSoDuong(SoLuong)) {
                    break;
                }
            } catch (ChungException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.print("nhập nhà sản xuất: ");
            nhaSanXuat = scanner.nextLine();
            if (validata.kiemTraChung(nhaSanXuat)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập giá nhập khẩu: ");
            giaNhapKhau = scanner.nextLine();
            try {
                if (validata.kiemTraSoDuong(giaNhapKhau)) {
                    break;
                }
            } catch (ChungException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.print("nhập tỉnh thành nhập: ");
            tinhThanhNhap = scanner.nextLine();
            if (validata.kiemTraChung(tinhThanhNhap)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập thuê nhập khẩu: ");
            thueNhapKhau = scanner.nextLine();
            try {
                if (validata.kiemTraSoDuong(thueNhapKhau)) {
                    break;
                }
            } catch (ChungException e) {
                e.printStackTrace();
            }
        }

        NhapKhau nhapKhau = new NhapKhau(id, maSanPham, tenSanPham, giaBan, SoLuong, nhaSanXuat, giaNhapKhau, tinhThanhNhap, thueNhapKhau);
        String line = nhapKhau.id + COMNA + nhapKhau.maSanPham + COMNA + nhapKhau.tenSanPham + COMNA +
                nhapKhau.giaBan + COMNA + nhapKhau.SoLuong + COMNA + nhapKhau.nhaSanXuat + COMNA +
                nhapKhau.getGiaNhapKhau() + COMNA + nhapKhau.getTinhThanhNhap() + COMNA + nhapKhau.getThueNhapKhau();

        try {
            FileWriter fileWriter = new FileWriter(FILE_NHAPKHAU, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void themSPXuatKhau() {
        int id;
        String maSanPham;
        String tenSanPham;
        String giaBan;
        String SoLuong;
        String nhaSanXuat;
        String giaXuatKhau;
        String quocGiaNhap;
        Validata validata = new Validata();
        Scanner scanner = new Scanner(System.in);
        docFileXuatKhau(FILE_XUATKHAU);
        id = xuatKhauList.get(xuatKhauList.size()-1).id + 1;
        xuatKhauList.clear();
        while (true) {
            System.out.print("nhập mã sản phẩm: ");
            maSanPham = scanner.nextLine();
            if (validata.kiemTraChung(maSanPham)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập tên sản phẩm: ");
            tenSanPham = scanner.nextLine();
            if (validata.kiemTraChung(tenSanPham)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập giá bán: ");
            giaBan = scanner.nextLine();
            try {
                if (validata.kiemTraSoDuong(giaBan)) {
                    break;
                }
            } catch (ChungException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.print("nhập số lương: ");
            SoLuong = scanner.nextLine();
            if (validata.kiemTraChung(SoLuong)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập nhà sản xuất: ");
            nhaSanXuat = scanner.nextLine();
            if (validata.kiemTraChung(nhaSanXuat)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập giá xuất khẩu: ");
            giaXuatKhau = scanner.nextLine();
            try {
                if (validata.kiemTraSoDuong(giaXuatKhau)) {
                    break;
                }
            } catch (ChungException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.print("nhập quốc gia nhập sản phẩm: ");
            quocGiaNhap = scanner.nextLine();
            if (validata.kiemTraChung(quocGiaNhap)) {
                break;
            }
        }
        XuatKhau xuatKhau = new XuatKhau(id, maSanPham, tenSanPham, giaBan, SoLuong, nhaSanXuat, giaXuatKhau, quocGiaNhap);
        String line = xuatKhau.id + COMNA + xuatKhau.maSanPham + COMNA + xuatKhau.tenSanPham + COMNA +
                xuatKhau.giaBan + COMNA + xuatKhau.SoLuong + COMNA + xuatKhau.nhaSanXuat + COMNA +
                xuatKhau.getGiaXuatKhau() + COMNA + xuatKhau.getQuocGiaNhap();

        try {
            FileWriter fileWriter = new FileWriter(FILE_XUATKHAU, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void xoaXuatKhau() {
        docFileNhapKhau(FILE_XUATKHAU);
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập mã sản phẩm cần xóa: ");
        String maSP = scanner.nextLine();
        boolean check = false;
        int d = -1;
        for (int i = 0; i < xuatKhauList.size(); i++) {
            if (maSP.equals(xuatKhauList.get(i).maSanPham)) {
                check = true;
                d = i;
                break;
            }
        }
        if (!check) {
            try {
                throw new NotFoundProductException();
            } catch (NotFoundProductException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("1.yes" + "\t" + "2.no");
            System.out.print("nhấp sự lựa chọn");
            int x = Integer.parseInt(scanner.nextLine());
            switch (x) {
                case 1: {
                    xuatKhauList.remove(d);
                    for (XuatKhau xuatKhau : xuatKhauList) {
                        xuatKhau.hienThi();
                    }
                    vietFileIndexXuatKhau(FILE_XUATKHAU);
                    for (int i = 1; i < xuatKhauList.size(); i++) {
                        vietFileNhapKhau(i, FILE_XUATKHAU);
                    }
                    xuatKhauList.clear();

                }
                case 2: {
                    chucNang();
                    break;
                }
            }
        }
    }

    public static void vietFileIndexXuatKhau(String file) {
        String line = xuatKhauList.get(0).id + COMNA + xuatKhauList.get(0).maSanPham + COMNA + xuatKhauList.get(0).tenSanPham + COMNA
                + xuatKhauList.get(0).giaBan + COMNA + xuatKhauList.get(0).SoLuong + COMNA + xuatKhauList.get(0).nhaSanXuat + COMNA
                + xuatKhauList.get(0).getGiaXuatKhau() + COMNA + xuatKhauList.get(0).getQuocGiaNhap();
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void vietFileXuatKhau(int i, String file) {
        String line = xuatKhauList.get(i).id + COMNA + xuatKhauList.get(i).maSanPham + COMNA + xuatKhauList.get(i).tenSanPham + COMNA
                + xuatKhauList.get(i).giaBan + COMNA + xuatKhauList.get(i).SoLuong + COMNA + xuatKhauList.get(i).nhaSanXuat + COMNA
                + xuatKhauList.get(i).getGiaXuatKhau() + COMNA + xuatKhauList.get(i).getQuocGiaNhap();
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void vietFileIndexNhapKhau(String file) {
        String line = nhapKhauList.get(0).id + COMNA + nhapKhauList.get(0).maSanPham + COMNA + nhapKhauList.get(0).tenSanPham + COMNA
                + nhapKhauList.get(0).giaBan + COMNA + nhapKhauList.get(0).SoLuong + COMNA + nhapKhauList.get(0).nhaSanXuat + COMNA
                + nhapKhauList.get(0).getGiaNhapKhau() + COMNA + nhapKhauList.get(0).getTinhThanhNhap() + COMNA + nhapKhauList.get(0).getThueNhapKhau();
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void vietFileNhapKhau(int i, String file) {
        String line = nhapKhauList.get(i).id + COMNA + nhapKhauList.get(i).maSanPham + COMNA + nhapKhauList.get(i).tenSanPham + COMNA
                + nhapKhauList.get(i).giaBan + COMNA + nhapKhauList.get(i).SoLuong + COMNA + nhapKhauList.get(i).nhaSanXuat + COMNA
                + nhapKhauList.get(i).getGiaNhapKhau() + COMNA + nhapKhauList.get(i).getTinhThanhNhap() + COMNA + nhapKhauList.get(i).getThueNhapKhau();
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void xoaNhapKhau() {
        docFileNhapKhau(FILE_NHAPKHAU);
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập mã sản phẩm cần xóa: ");
        String maSP = scanner.nextLine();
        boolean check = false;
        int d = -1;
        for (int i = 0; i < nhapKhauList.size(); i++) {
            if (maSP.equals(nhapKhauList.get(i).maSanPham)) {
                check = true;
                d = i;
                break;
            }
        }
        if (!check) {
            try {
                throw new NotFoundProductException();
            } catch (NotFoundProductException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("1.yes" + "\t" + "2.no");
            System.out.print("nhấp sự lựa chọn");
            int x = Integer.parseInt(scanner.nextLine());
            switch (x) {
                case 1: {
                    nhapKhauList.remove(d);
                    for (NhapKhau nhapKhau : nhapKhauList) {
                        nhapKhau.hienThi();
                    }
                    vietFileIndexNhapKhau(FILE_NHAPKHAU);
                    for (int i = 1; i < nhapKhauList.size(); i++) {
                        vietFileNhapKhau(i, FILE_NHAPKHAU);
                    }
                    nhapKhauList.clear();

                }
                case 2: {
                    chucNang();
                    break;
                }
            }
        }
    }


    public static List<NhapKhau> nhapKhauList = new ArrayList<>();

    public static void docFileNhapKhau(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            NhapKhau nhapKhau;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                nhapKhau = new NhapKhau(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                nhapKhauList.add(nhapKhau);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void hienThiDanhSachNhapKhau() {
        docFileNhapKhau(FILE_NHAPKHAU);
        for (NhapKhau nhapKhau : nhapKhauList) {
            nhapKhau.hienThi();
        }
        nhapKhauList.clear();
    }

    public static List<XuatKhau> xuatKhauList = new ArrayList<>();

    public static void docFileXuatKhau(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            XuatKhau xuatKhau;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                xuatKhau = new XuatKhau(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);
                xuatKhauList.add(xuatKhau);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void hienThiDanhSachXuatKhau() {
        docFileXuatKhau(FILE_XUATKHAU);
        for (XuatKhau xuatKhau : xuatKhauList) {
            xuatKhau.hienThi();
        }
        xuatKhauList.clear();
    }

    public static void tiemKiemXuatKhau() {
        docFileXuatKhau(FILE_XUATKHAU);
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tên sản phẩm cần tìm kiếm: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < xuatKhauList.size(); i++) {
            if (name.contains(xuatKhauList.get(i).tenSanPham)) {
                System.out.println(xuatKhauList.get(i).tenSanPham);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("không có tên tìm thấy ");
        }
        xuatKhauList.clear();
    }

    public static void tiemKiemNhapKhau() {
        docFileXuatKhau(FILE_NHAPKHAU);
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tên sản phẩm cần tìm kiếm: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < nhapKhauList.size(); i++) {
            if (name.equals(nhapKhauList.get(i).tenSanPham)) {
                System.out.println(nhapKhauList.get(i).tenSanPham);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("không có tên tìm thấy ");
        }
        nhapKhauList.clear();
    }

    public static void main(String[] args) {
        while (true) {
            chucNang();
        }
    }

}
