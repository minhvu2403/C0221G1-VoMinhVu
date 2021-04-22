package case_study.controllers.employee_menu;

import case_study.controllers.main_menu.MainController;

public class ShowInforEmployee {
    public static void showInforEmployee() {
        int index = 1;
        MainController.readFileEmployee();

        for (String key : MainController.employeeMap.keySet()) {
            System.out.println(index++ + ": " + key + " " + MainController.employeeMap.get(key).showInfor());
        }

    }

}
