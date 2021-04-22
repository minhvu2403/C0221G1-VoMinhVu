package case_study.controllers.booking_menu;

import case_study.Views.RegularException;
import case_study.commons.FuncWriteAndRead;
import case_study.controllers.customer_menu.ShowInforCusTomer;
import case_study.controllers.main_menu.MainController;
import case_study.controllers.service_menu.ShowService;
import case_study.exceptions.NumberException;
import case_study.exceptions.TypeException;
import case_study.models.Contract;
import case_study.models.ServiceGoWith;

import java.util.Scanner;

public class AddNewBooking {
    public static Scanner sc = new Scanner(System.in);
    public static String choiceCustomer = null;

    public static void bookingSevervice() {
        MainController.readFileContract();
        getChoiceCustomer();
        int choice;
        System.out.println("***Moi ban chon chuc nang***\n" +
                "1.Booking Villa.\n" +
                "2.Booking House.\n" +
                "3.Booking Room.\n" +
                "4.Back.\n" +
                "5.Exit.");
        System.out.print("Enter choice your:");
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                getChoiceVilla();
                writeServiceGoWith();
                writeContractVilla();
                FuncWriteAndRead.writeFile(MainController.PATH_FILE_VILLA, MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).toString());
                break;
            case 2:
                getChoiceHouse();
                writeServiceGoWith();
                writeContractHouse();
                FuncWriteAndRead.writeFile(MainController.PATH_FILE_HOUSE, MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).toString());
                break;
            case 3:
                getChoiceRoom();
                writeServiceGoWith();
                writeContractRoom();
                FuncWriteAndRead.writeFile(MainController.PATH_FILE_ROOM, MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).toString());
                break;
            case 4:
                MainController.displayMainController();
                break;
            case 5:
                System.exit(0);
                break;
        }

    }

    public static void getChoiceVilla() {
        boolean flag;
        ShowService.showAllVilla();
        String choiceVilla = null;
        do {
            flag = true;
            try {
                System.out.print("Enter choice Villa: ");
                choiceVilla = sc.nextLine();
                RegularException.exceptionIndexVilla(choiceVilla);
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).setServices(MainController.villaList.get(Integer.parseInt(choiceVilla) - 1));
    }

    public static void getChoiceCustomer() {
        ShowInforCusTomer.showInforCustomer();
        boolean flag;
        do {
            flag = true;
            try {
                System.out.print("Enter choice the Customer: ");
                choiceCustomer = sc.nextLine();
                RegularException.exceptionIndexCustomer(choiceCustomer);
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
    }

    public static void getChoiceHouse() {
        boolean flag;
        ShowService.showAllHouse();
        String choiceHouse = null;
        do {
            flag = true;
            try {
                System.out.print("Enter choice House: ");
                choiceHouse = sc.nextLine();
                RegularException.exceptionIndexHouse(choiceHouse);
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).setServices(MainController.houseList.get(Integer.parseInt(choiceHouse) - 1));
    }

    public static void getChoiceRoom() {
        boolean flag;
        ShowService.showAllRoom();
        String choiceRoom = null;
        do {
            flag = true;
            try {
                System.out.print("Enter choice Room: ");
                choiceRoom = sc.nextLine();
                RegularException.exceptionIndexRoom(choiceRoom);
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).setServices(MainController.roomList.get(Integer.parseInt(choiceRoom) - 1));
    }

    public static void writeServiceGoWith() {
        boolean flag;
        System.out.println("Do you want used Service go with ?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter choice your: ");
        String number = sc.nextLine();
        while (Integer.parseInt(number) != 1 && Integer.parseInt(number) != 2) {
            System.out.println("Failed!!!--- Again");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter choice your: ");
            number = sc.nextLine();
        }
        String serviceGoWith = null;
        if (number.equals("1")) {
            do {
                flag = true;
                try {
                    System.out.print("Enter service go with you want: ");
                    serviceGoWith = sc.nextLine();
                    RegularException.regexService(serviceGoWith);
                } catch (TypeException e) {
                    System.err.println(e.getMessage());
                    System.out.println();
                    flag = false;
                }
            } while (!flag);
            MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).setServiceGoWith(new ServiceGoWith(serviceGoWith));
        } else {
            MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).setServiceGoWith(new ServiceGoWith("No used"));
        }
    }

    public static void writeContractVilla() {
        boolean flag;
        System.out.println("Enter Contract.");
        String numberContractVilla = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number contract: ");
                numberContractVilla = sc.nextLine();
                RegularException.regexContractVilla(numberContractVilla);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (Contract contract : MainController.contractList) {
                if (contract.getNumberContract().equals(numberContractVilla)) {
                    System.err.println("Number contract have exists.");
                    flag = false;
                }
            }
        } while (!flag);

        String startDay = enterStartDay();

        String endDate = enterEndDate();

        String deposit = enterDeposit();

        double totalMoney = getTotalMoney();

        Contract contract = new Contract(numberContractVilla, startDay, endDate, Double.parseDouble(deposit), totalMoney);

        String line = contract.getNumberContract() + MainController.COMA + contract.getDayStart() + MainController.COMA + contract.getDayEnd() + MainController.COMA + contract.getDeposit() + MainController.COMA + contract.getTotalMoney();
        FuncWriteAndRead.writeFile(MainController.PATH_CONTRACT_FILE, line);
        MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).setContract(contract);


    }

    public static double getTotalMoney() {
        double totalMoney;
        if (MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).getServiceGoWith() == null) {
            totalMoney = MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).getServices().getRentCost();
        } else {
            totalMoney = MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).getServices().getRentCost() +
                    MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).getServiceGoWith().getCost();
        }
        return totalMoney;
    }

    public static String enterDeposit() {
        boolean flag;
        String deposit = null;
        do {
            flag = true;
            try {
                System.out.print("Enter deposit: ");
                deposit = sc.nextLine();
                RegularException.regexCost(deposit);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        return deposit;
    }

    public static String enterStartDay() {
        boolean flag;
        String startDay = null;
        do {
            flag = true;
            try {
                System.out.print("Enter start day: ");
                startDay = sc.nextLine();
                RegularException.regexDayContract(startDay);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        return startDay;
    }

    public static String enterEndDate() {
        boolean flag;
        String endDate = null;
        do {
            flag = true;
            try {
                System.out.print("Enter end date: ");
                endDate = sc.nextLine();
                RegularException.regexDayContract(endDate);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        return endDate;
    }

    public static void writeContractRoom() {
        boolean flag;
        System.out.println("Enter Contract.");
        String numberContractRoom = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number contract: ");
                numberContractRoom = sc.nextLine();
                RegularException.regexContractRoom(numberContractRoom);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (Contract contract : MainController.contractList) {
                if (contract.getNumberContract().equals(numberContractRoom)) {
                    System.err.println("Number contract have exists.");
                    flag = false;
                }
            }
        } while (!flag);

        String startDay = enterStartDay();

        String endDate = enterEndDate();

        String deposit = enterDeposit();

        double totalMoney;
        totalMoney = getTotalMoney();
        Contract contract = new Contract(numberContractRoom, startDay, endDate, Double.parseDouble(deposit), totalMoney);

        String line = contract.getNumberContract() + MainController.COMA + contract.getDayStart() + MainController.COMA + contract.getDayEnd() + MainController.COMA + contract.getDeposit() + MainController.COMA + contract.getTotalMoney();
        FuncWriteAndRead.writeFile(MainController.PATH_CONTRACT_FILE, line);
        MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).setContract(contract);
    }
    public static void writeContractHouse() {
        boolean flag;
        System.out.println("Enter Contract.");
        String numberContractHouse = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number contract: ");
                numberContractHouse = sc.nextLine();
                RegularException.regexContractHouse(numberContractHouse);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (Contract contract : MainController.contractList) {
                if (contract.getNumberContract().equals(numberContractHouse)) {
                    System.err.println("Number contract have exists.");
                    flag = false;
                }
            }
        } while (!flag);

        String startDay = enterStartDay();

        String endDate = enterEndDate();

        String deposit = enterDeposit();

        double totalMoney = getTotalMoney();
        Contract contract = new Contract(numberContractHouse, startDay, endDate, Double.parseDouble(deposit), totalMoney);

        String line = contract.getNumberContract() + MainController.COMA + contract.getDayStart() + MainController.COMA + contract.getDayEnd() + MainController.COMA + contract.getDeposit() + MainController.COMA + contract.getTotalMoney();
        FuncWriteAndRead.writeFile(MainController.PATH_CONTRACT_FILE, line);
        MainController.customerList.get(Integer.parseInt(choiceCustomer) - 1).setContract(contract);
    }


}


