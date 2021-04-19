package case_study.models;

public class Room extends Services implements Comparable<Room> {
    private String extraService;

    public Room() {
    }

    public Room(String extraService) {
        this.extraService = extraService;
    }

    public Room(String id, String nameServices, double areaUse, double rentCost, int amountOfPeoples, String typeRent, String extraService) {
        super(id, nameServices, areaUse, rentCost, amountOfPeoples, typeRent);
        this.extraService = extraService;
    }

    public String getExtraService() {
        return extraService;
    }

    public void setExtraService(String extraService) {
        this.extraService = extraService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "extraService='" + extraService + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Room o) {
        return getNameServices().compareTo(o.getNameServices());
    }
}
