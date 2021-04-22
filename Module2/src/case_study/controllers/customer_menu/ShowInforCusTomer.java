package case_study.controllers.customer_menu;

import case_study.controllers.main_menu.MainController;
import case_study.models.Customer;

import java.util.Collections;

public class ShowInforCusTomer {
    public static void showInforCustomer() {
        MainController.readFileCustomer();
        if (MainController.customerList.isEmpty()) {
            System.err.println("Customer File Empty!!!");
            System.out.println();
        }

        int index = 1;
        Collections.sort(MainController.customerList);
        for (Customer customer : MainController.customerList) {
            System.out.println(index++ + " " + customer.showInfor());
        }
    }
}
