package case_study.controllers.service_menu;

import case_study.commons.FuncWriteAndRead;
import case_study.controllers.main_menu.MainController;
import case_study.Views.RegularException;
import case_study.exceptions.*;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.ServiceGoWithFree;
import case_study.models.Villa;

import java.util.Scanner;

public class AddNewService {
    private static Scanner sc = new Scanner(System.in);
    private static String nameService;
    private static String area;
    private static String cost;
    private static String amountOfPeople;
    private static String rentType;


    public static void ServiceMainMenu() {
        int choose;
        System.out.println("***Moi ban chon chuc nang***\n" +
                "1.Add new Villa\n" +
                "2.Add new House\n" +
                "3.Add new Room\n" +
                "4.Back\n" +
                "5.Exit"
        );
        System.out.print("Enter choose:");
        choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                addNewVilla();
                ServiceMainMenu();
                break;
            case 2:
                addNewHouse();
                ServiceMainMenu();
                break;
            case 3:
                addNewRoom();
                ServiceMainMenu();
                break;
            case 4:
                MainController.displayMainController();
                break;
            case 5:
                System.exit(0);
            default:
                ServiceMainMenu();

        }
    }

    public static void addNewService() {
        boolean flag;
        do {
            flag = true;
            try {
                System.out.print("Enter name Service:");
                nameService = sc.nextLine();
                RegularException.regexName(nameService);
            } catch (NameException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        do {
            flag = true;
            try {
                System.out.print("Enter area Villa: ");
                area = sc.nextLine();
                RegularException.regexArea(area);
            } catch (AreaException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        do {
            flag = true;
            try {
                System.out.print("Enter cost Villa: ");
                cost = sc.nextLine();
                RegularException.regexCost(cost);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        do {
            flag = true;
            try {
                System.out.print("Enter a mount of people: ");
                amountOfPeople = sc.nextLine();
                RegularException.regexAmountOfPeople(amountOfPeople);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        do {
            flag = true;
            try {
                System.out.print("Enter rent type: ");
                rentType = sc.nextLine();
                RegularException.regexRentType(rentType);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
    }


    private static void addNewRoom() {
        MainController.readFileRoom();
        boolean flag;

        String idRoom = null;
        do {
            flag = true;
            try {
                System.out.print("Enter ID House: ");
                idRoom = sc.nextLine();
                RegularException.regexIdRoom(idRoom);
            } catch (IDServiceException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (Room room : MainController.roomList) {
                if (room.getId().equals(idRoom)) {
                    System.err.print("ID have exists.");
                    flag = false;
                }
            }
        } while (!flag);

        addNewService();
        String serviceGoWith = null;

        do {
            flag = true;
            try {
                System.out.print("Enter Service Go With: ");
                serviceGoWith = sc.nextLine();
                RegularException.regexService(serviceGoWith);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        Room room = new Room(idRoom, nameService, Double.parseDouble(area),
                Double.parseDouble(cost), Integer.parseInt(amountOfPeople), rentType, new ServiceGoWithFree(serviceGoWith));
//        MainMenu.readFileRoom();
        String line = room.addFileCSV();
        FuncWriteAndRead.writeFile(MainController.PATH_FILE_ROOM, line);

    }



    private static void addNewHouse() {
        MainController.readFileHouse();
        boolean flag;
        String idHouse=null;
        do {
            flag = true;
            try {
                System.out.print("Enter Id House:");
                idHouse = sc.nextLine();
                RegularException.regexIdHouse(idHouse);
            } catch (IDServiceException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (House house : MainController.houseList) {
                if (house.getId().equals(idHouse)) {
                    System.err.println("ID  have exits");
                    flag = false;
                }
            }
        } while (!flag);
        addNewService();

        System.out.print("Enter standard room: ");
        String standardRoom = sc.nextLine();

        System.out.print("Enter description: ");
        String description = sc.nextLine();

        String numberOfFloor = null;

        do {
            flag = true;
            try {
                System.out.print("Enter number of floor: ");
                numberOfFloor = sc.nextLine();
                RegularException.regexNumberOfFloor(numberOfFloor);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        House house = new House(idHouse, nameService, Double.parseDouble(area), Double.parseDouble(cost),
                Integer.parseInt(amountOfPeople), rentType, standardRoom, description,
                Integer.parseInt(numberOfFloor));
        
        String line = house.addFileCSV();
        FuncWriteAndRead.writeFile(MainController.PATH_FILE_HOUSE, line);
        
    }

    private static void addNewVilla() {
        MainController.readFileVilla();
        boolean flag;
        String idVilla = null;
        do {
            flag = true;
            try {
                System.out.print("Enter Id Villa:");
                idVilla = sc.nextLine();
                RegularException.regexIdVilla(idVilla);
            } catch (IDServiceException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (Villa villa : MainController.villaList) {
                if (villa.getId().equals(idVilla)) {
                    System.err.println("ID  have exits");
                    flag = false;
                }
            }
        } while (!flag);
        addNewService();
        System.out.print("Enter standard room: ");
        String standardRoom = sc.nextLine();

        System.out.print("Enter description: ");
        String description = sc.nextLine();
        String poolArea = null;
        do {
            flag = true;
            try {
                System.out.print("Enter pool area: ");
                poolArea = sc.nextLine();
                RegularException.regexArea(poolArea);
            } catch (AreaException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        String numberOfFloor = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number of floor: ");
                numberOfFloor = sc.nextLine();
                RegularException.regexNumberOfFloor(numberOfFloor);
            } catch (NumberException e) {
                System.out.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        Villa villa = new Villa(idVilla, nameService, Double.parseDouble(area), Double.parseDouble(cost),
                Integer.parseInt(amountOfPeople), rentType, standardRoom,
                description, Double.parseDouble(poolArea), Integer.parseInt(numberOfFloor));

        String line = villa.addFileCSV();
        FuncWriteAndRead.writeFile(MainController.PATH_FILE_VILLA, line);

    }
}
