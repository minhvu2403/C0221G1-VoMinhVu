package case_study.controllers.service_menu;

import case_study.controllers.main_menu.MainController;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ShowService {
    public static Scanner sc = new Scanner(System.in);

    public static void ShowServiceMainMenu() {
        int choice;
        do {
            System.out.println("***Moi ban chon chuc nang***\n" +
                    "1.Show all Villa.\n" +
                    "2.Show all House.\n" +
                    "3.Show all Room.\n" +
                    "4.Show all name Villa not duplicate.\n" +
                    "5.Show all name House not duplicate.\n" +
                    "6. Show all name Room not duplicate.\n" +
                    "7.Back\n" +
                    "8.Exit\n");
            System.out.print("Enter choice your:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    showAllVilla();
                    ShowServiceMainMenu();
                    break;
                case 2:
                    showAllHouse();
                    ShowServiceMainMenu();
                    break;
                case 3:
                    showAllRoom();
                    ShowServiceMainMenu();
                    break;
                case 4:
                    showVillaNotDuplicate();
                    ShowServiceMainMenu();
                    break;
                case 5:
                    showHouseNotDuplicate();
                    ShowServiceMainMenu();
                    break;
                case 6:
                    showRoomNotDuplicate();
                    ShowServiceMainMenu();
                    break;
                case 7:
                    MainController.displayMainController();
                    break;
                case 8:
                    System.exit(0);
                default:
                    ShowServiceMainMenu();
            }
        }while (true);
    }

    public static void showRoomNotDuplicate() {
        MainController.readFileRoom();
        int index =1;
        if (MainController.roomList.isEmpty()){
            System.err.println("Room File Emty!!!");
        }
        Set<Room> roomSet =new TreeSet<>(MainController.roomList);
        for (Room room:roomSet) {
            System.out.println(index++ +" "+room.showInfor());
        }
    }

    public static void showHouseNotDuplicate() {
        MainController.readFileHouse();
        int index =1;
        if (MainController.houseList.isEmpty()){
            System.err.println("House File Emty!!!");
        }
        Set<House> houseSet = new TreeSet<>(MainController.houseList);
        for (House house:houseSet) {
            System.out.println(index++ +" "+house.showInfor());
        }
    }

    public static void showVillaNotDuplicate() {
        MainController.readFileVilla();
        int index =1;
        if (MainController.villaList.isEmpty()){
            System.err.println("Villa File Emty!!!");
        }
        Set<Villa> villaSet =new TreeSet<>(MainController.villaList);
        for (Villa villa:villaSet) {
            System.out.println(index++ +" "+villa.showInfor());
        }
    }

    public static void showAllRoom() {
        MainController.readFileRoom();
        int index =1;
        if (MainController.roomList.isEmpty()){
            System.err.println("Room File Emty!!!");
        }
        for (Room room:MainController.roomList) {
            System.out.println(index++ +" "+room.showInfor());
        }
    }

    public static void showAllHouse() {
        MainController.readFileHouse();
        int index =1;
        if (MainController.houseList.isEmpty()){
            System.err.println("House File Emty!!!");
        }
        for (House house:MainController.houseList) {
            System.out.println(index++ +" "+house.showInfor());
        }
    }

    public static void showAllVilla() {
        MainController.readFileVilla();
        int index =1;
        if (MainController.villaList.isEmpty()){
            System.err.println("Villa File Emty!!!");
        }
        for (Villa villa:MainController.villaList) {
            System.out.println(index++ +" "+villa.showInfor());
        }
    }
}
