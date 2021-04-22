package case_study.controllers.cinema_menu;

import case_study.Views.RegularException;
import case_study.controllers.customer_menu.ShowInforCusTomer;
import case_study.controllers.main_menu.MainController;
import case_study.models.Customer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cinema {
    private static Queue<Customer> customerQueue = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void cinemaMenu() {
        String choice;
        do {
            System.out.println("***Moi ban chon chu nang***");
            System.out.println("1. Buy movie tickets.");
            System.out.println("2. Print list of buy tickets.");
            System.out.println("3. Back.");
            System.out.println("4. Exit.");


            System.out.print("Enter choice your: ");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    buyTickets();
                    break;
                case "2":
                    printList();
                    break;
                case "3":
                    MainController.displayMainController();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    cinemaMenu();
            }
        } while (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 5);
    }

    public static void buyTickets() {
        boolean flag;
        String choiceCustomer = null;
        ShowInforCusTomer.showInforCustomer();
        do {
            flag = true;
            try {
                System.out.print("Enter customer: ");
                choiceCustomer = sc.nextLine();
                RegularException.exceptionIndexCustomer(choiceCustomer);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        customerQueue.add(MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1));
    }

    public static void printList() {
        if (customerQueue.isEmpty()) {
            System.err.println("Empty!!!");
        }

        while (!customerQueue.isEmpty()) {
            System.out.println(customerQueue.poll().getFullName());
        }
    }


}
