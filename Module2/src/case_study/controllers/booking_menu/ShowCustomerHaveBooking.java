package case_study.controllers.booking_menu;

import case_study.controllers.main_menu.MainController;
import case_study.models.Customer;

public class ShowCustomerHaveBooking {
    public static void showCustomerHaveBooking() {
        MainController.readFileBooking();
        if (MainController.customerBooking.isEmpty()) {
            System.err.println("Empty!!!");
        }
        int index = 1;
        for (Customer customer : MainController.customerBooking) {
            System.out.println(index++ + " " + customer.showInfor());
        }
    }

}
