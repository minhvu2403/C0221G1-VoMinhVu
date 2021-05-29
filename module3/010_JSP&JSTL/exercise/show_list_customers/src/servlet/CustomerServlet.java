package servlet;

import bean.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletProduct", value = "/customer")
public class CustomerServlet extends HttpServlet {
    ArrayList<Customer> customerList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        super.init();
        customerList.add(new Customer("Mai Van Hoan", "01/12/2005", "Da nang", "image/anh1.jpg"));
        customerList.add(new Customer("Mai A", "01/12/2005", "Da nang", "image/anh2.jpg"));
        customerList.add(new Customer("Mai Van C", "01/12/2005", "Da nang", "image/anh3.jpg"));
        customerList.add(new Customer("Mai Van B", "01/12/2005", "Da nang", "image/anh4.jpg"));
        customerList.add(new Customer("Mai Van D", "01/12/2005", "Da nang", "image/anh5.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customers", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/customer/ListCustomer.jsp");
        requestDispatcher.forward(request, response);
    }
}
