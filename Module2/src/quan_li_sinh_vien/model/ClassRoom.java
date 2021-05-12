package quan_li_sinh_vien.model;

public class ClassRoom {
    private String idClassRoom;
    private String nameClassRoom;
    private String idTeacher;

    public ClassRoom(String idClassRoom, String nameClassRoom, String idTeacher) {
        this.idClassRoom = idClassRoom;
        this.nameClassRoom = nameClassRoom;
        this.idTeacher = idTeacher;
    }

    public ClassRoom() {
    }

    public ClassRoom(String[] classroom) {
        this.idClassRoom=classroom[0];
        this.nameClassRoom=classroom[1];
        this.idTeacher=classroom[2];

    }

    public String getIdClassRoom() {
        return idClassRoom;
    }

    public String getNameClassRoom() {
        return nameClassRoom;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    @Override
    public String toString() {
        return idClassRoom +"," + nameClassRoom + "," + idTeacher + ",";
    }
}
