package case_study.controllers.service_menu;

import case_study.controllers.main_menu.MainController;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

import java.util.Scanner;

public class AddNewService {
    private static Scanner input = new Scanner(System.in);
    private static String nameService;
    private static String area;
    private static String cost;
    private static String amountOfPeople;

    public static void ServiceMainMenu() {
        System.out.println("*********************\n" +
                "1.Add new Villa\n" +
                "2.Add new House\n" +
                "3.Add new Room\n" +
                "4.Back\n" +
                "5.Exit"
        );
        System.out.print("Enter choose:");
        int choose = Integer.parseInt(input.nextLine());
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
                MainController.displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                ServiceMainMenu();

        }
    }

    public static void addNewService(){
        boolean flag;
//        do {
//            flag=true;
//            try {
//                System.out.print("Enter name Service:");
//                nameService=input.nextLine();
//            }
//        }while (!flag);
    }


    private static void addNewRoom() {

    }

    private static void addNewHouse() {
    }

    private static void addNewVilla() {
    }
}
