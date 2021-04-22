package case_study.controllers.main_menu;

import case_study.commons.FuncWriteAndRead;
import case_study.controllers.booking_menu.AddNewBooking;
import case_study.controllers.booking_menu.ShowCustomerHaveBooking;
import case_study.controllers.cinema_menu.Cinema;
import case_study.controllers.customer_menu.AddNewCustomer;
import case_study.controllers.customer_menu.ShowInforCusTomer;
import case_study.controllers.employee_menu.AddNewEmployee;
import case_study.controllers.employee_menu.ShowInforEmployee;
import case_study.controllers.service_menu.AddNewService;
import case_study.controllers.service_menu.ShowService;
import case_study.models.*;

import java.util.*;

public class MainController {
    public static Scanner sc = new Scanner(System.in);
    public static final String COMA = ",";
    public static final String PATH_FILE_VILLA = "src/case_study/data/Villa.csv";
    public static final String PATH_FILE_HOUSE = "src/case_study/data/House.csv";
    public static final String PATH_FILE_ROOM = "src/case_study/data/Room.csv";
    public static final String PATH_CUSTOMER_FILE = "src/case_study/data/Customer.csv";
    public static final String PATH_FILE_BOOKING = "src/case_study/data/Booking.csv";
    public static final String PATH_EMPLOYEE_FILE = "src/case_study/data/Employee.csv";
    public static final String PATH_CONTRACT_FILE = "src/case_study/data/Contract.csv";
    public static List<Contract> contractList;
    public static List<Villa> villaList;
    public static List<Room> roomList;
    public static List<House> houseList;
    public static List<Customer> customerList;
    public static List<Customer> customerBooking;
    public static Map<String, Employee> employeeMap;

    public static void displayMainController() {
        int choose;
        while (true) {
            System.out.println("***Moi chon chuc nang***\n" +
                    "1.Add new service\n" +
                    "2.Show service\n" +
                    "3.Add new Customer\n" +
                    "4.Show Customer\n" +
                    "5.Add new booking\n" +
                    "6.Show Customer have booking\n" +
                    "7.Add new Employee\n" +
                    "8.Show Employee\n" +
                    "9.Cinema\n" +
                    "10.Find Profile Employee\n" +
                    "11.Exit");
            System.out.print("Enter choose your:");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    AddNewService.ServiceMainMenu();
                    break;
                case 2:
                    ShowService.ShowServiceMainMenu();
                    break;
                case 3:
                    AddNewCustomer.addNewCustomer();
                break;
                case 4:
                    ShowInforCusTomer.showInforCustomer();
                    break;
                case 5:
                    AddNewBooking.bookingSevervice();
                    break;
                case 6:
                    ShowCustomerHaveBooking.showCustomerHaveBooking();
                    break;
                case 7:
                    AddNewEmployee.addNewEmployee();
                    break;
                case 8:
                    ShowInforEmployee.showInforEmployee();
                    break;
                case 9:
                    Cinema.cinemaMenu();
                    break;
                case 11:
                    System.exit(0);
                default:
                    displayMainController();

            }

        }
    }

   public static void readFileVilla() {
        villaList = new ArrayList<>();
        List<String> stringList = FuncWriteAndRead.readFile(MainController.PATH_FILE_VILLA);
        for (String str : stringList) {
            String[] split = str.split(",");
            Villa villa = new Villa(split[0], split[1], Double.parseDouble(split[2]),
                    Double.parseDouble(split[3]), Integer.parseInt(split[4]), split[5],
                    split[6], split[8], Double.parseDouble(split[7]), Integer.parseInt(split[9]));
            villaList.add(villa);
        }
    }
    public static void readFileHouse() {
       houseList = new ArrayList<>();
        List<String> stringList = FuncWriteAndRead.readFile(MainController.PATH_FILE_HOUSE);
        for (String str : stringList) {
            String[] split = str.split(",");
            House house = new House(split[0], split[1], Double.parseDouble(split[2]),
                    Double.parseDouble(split[3]), Integer.parseInt(split[4]), split[5],
                    split[6], split[7], Integer.parseInt(split[8]));
            houseList.add(house);
        }
    }
    public static void readFileRoom() {
        roomList = new ArrayList<>();
        List<String> stringList = FuncWriteAndRead.readFile(MainController.PATH_FILE_ROOM);
        for (String s : stringList) {
            String[] split = s.split(",");
            Room room = new Room(split[0], split[1], Double.parseDouble(split[2]),
                    Double.parseDouble(split[3]), Integer.parseInt(split[4]), split[5],
                    new ServiceGoWithFree(split[6]));
            roomList.add(room);
        }
    }
    public static void readFileCustomer() {
        customerList = new ArrayList<>();
        List<String> stringList = FuncWriteAndRead.readFile(MainController.PATH_CUSTOMER_FILE);
        for (String s : stringList) {
            String[] split = s.split(",");
            Customer customer = new Customer(split[0], split[1], split[2], split[3], split[4], split[5], split[6], split[7]);
            customerList.add(customer);
        }
    }
    public static void readFileContract() {
        contractList = new ArrayList<>();
        List<String> stringList = FuncWriteAndRead.readFile(MainController.PATH_CONTRACT_FILE);
        for (String s : stringList) {
            String[] split = s.split(",");
            Contract contract = new Contract(split[0], split[1], split[2], Double.parseDouble(split[3]), Double.parseDouble(split[4]));
            contractList.add(contract);
        }
    }
    public static void readFileBooking() {
        MainController.readFileContract();
        MainController.readFileVilla();
        MainController.readFileHouse();
        MainController.readFileRoom();
        customerBooking = new ArrayList<>();
        List<String> stringList = FuncWriteAndRead.readFile(MainController.PATH_FILE_BOOKING);
         Services book = null;
        Contract contractbook = null;
        for (String s : stringList) {
            String[] split = s.split(",");
            for (Villa villa : villaList) {
                if (villa.getId().equals(split[8])) {
                    book = villa;
                }
            }
            for (House house : houseList) {
                if (house.getId().equals(split[8])) {
                    book = house;
                }
            }
            for (Room room : roomList) {
                if (room.getId().equals(split[8])) {
                    book = room;
                }
            }

            for (Contract contract : contractList) {
                if (contract.getNumberContract().equals(split[10])) {
                    contractbook = contract;
                }
            }
            Customer customerBooking = new Customer(split[0], split[1], split[2], split[3], split[4],
                    split[5], split[6], split[7], book,new ServiceGoWith(split[9]),contractbook);
            MainController.customerBooking.add(customerBooking);
        }
    }
    public static void readFileEmployee() {
        employeeMap = new TreeMap<>();
        List<String> stringList = FuncWriteAndRead.readFile(PATH_EMPLOYEE_FILE);
        for (String s : stringList) {
            String[] split = s.split(",");
            Employee employee = new Employee(split[0], split[1], split[2], split[3], split[4], split[5],
                    split[6], split[7], split[8], split[9], split[10], Double.parseDouble(split[11]));
            employeeMap.put(split[0],employee);
        }
    }
}
