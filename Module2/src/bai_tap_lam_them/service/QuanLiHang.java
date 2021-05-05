package bai_tap_lam_them.service;


import bai_tap_lam_them.commons.FuncWriteAndRead;
import bai_tap_lam_them.model.HangSanXuat;

import java.util.ArrayList;
import java.util.List;

public class QuanLiHang {
    static FuncWriteAndRead<HangSanXuat> functionReadAndWrite = new FuncWriteAndRead<>();
    public List<HangSanXuat> findAll(){
        List<String[]> list = functionReadAndWrite.readFile("hangSanXuat.csv");
        List<HangSanXuat>hangSanXuatList=new ArrayList<>();
        for (String[]strings :list) {
            HangSanXuat hangSanXuat=new HangSanXuat(strings);
            hangSanXuatList.add(hangSanXuat);
        }
        return hangSanXuatList;
    }
}