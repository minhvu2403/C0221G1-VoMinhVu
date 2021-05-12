package quan_li_sinh_vien.service;

import quan_li_sinh_vien.commons.FuncWriteAndRead;
import quan_li_sinh_vien.model.ClassRoom;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomManager {
    static FuncWriteAndRead<ClassRoom> funcWriteAndRead= new FuncWriteAndRead();
    public List<ClassRoom> findClassRoom(){
        List<String[]> list=funcWriteAndRead.readWrite("classroom.csv");
        List<ClassRoom> classRoomList=new ArrayList<>();
        for (String[] strings:list) {
            ClassRoom classRoom=new ClassRoom(strings);
            classRoomList.add(classRoom);
        }
        return classRoomList;
    }
}
