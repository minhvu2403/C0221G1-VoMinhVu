package case_study.controllers.cabinets_menu;

import case_study.controllers.main_menu.MainController;
import case_study.models.FilingCabinets;

import java.util.Scanner;

public class CabinetMenu {
    public static Scanner sc =new Scanner(System.in);
    public static void menu(){
        int choice;
        boolean check=true;
        do {
            System.out.println("***Moi ban chon chuc nang***\n"+
                    "1.Put profile in the cabinet.\n"+
                    "2.Employee profile search by name.\n"+
                    "3.Employee profile search by id.\n"+
                    "4.Back\n"+
                    "5.Exit");
            System.out.print("Enter choice your: ");
            choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    FilingCabinets.putProfileInTheCabinet();
                    break;
                case 2:
                    FilingCabinets.findProfileByName();
                case 3:
                    FilingCabinets.findProfileByID();
                    break;
                case 4:
                    MainController.displayMainController();
                    break;
                case 5:
                    System.exit(0);
                     check=false;
                default:
                    menu();


            }
        }while (check);
    }
}
