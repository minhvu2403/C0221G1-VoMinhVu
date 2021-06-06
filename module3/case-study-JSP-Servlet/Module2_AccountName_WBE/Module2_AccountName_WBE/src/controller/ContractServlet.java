package controller;

import model.bean.contract.Contract;
import model.bean.customer.Customer;
import model.bean.employee.Employee;
import model.bean.service.Service;
import model.service.contract.ContractServiceImp;
import model.service.contract.IEContractService;
import model.service.customer.CustomerServiceImp;
import model.service.customer.IEmCustomerService;
import model.service.employee.EmployeeServiceImp;
import model.service.employee.IEmployeeService;
import model.service.service.IEService;
import model.service.service.ServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = {"/contract"})
public class ContractServlet extends HttpServlet {
    IEContractService contractService = new ContractServiceImp();
    IEmCustomerService customerService = new CustomerServiceImp();
    IEmployeeService employeeService = new EmployeeServiceImp();
    IEService service = new ServiceImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "Add":
                addContract(request, response);
                break;
            default:
                break;
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            showFormContract(request, response);
        }
    }

    private void showFormContract(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employee = employeeService.findByAll();
        List<Customer> customer = customerService.findByAll();
        List<Service> services = service.findByAll();
        request.setAttribute("employee", employee);
        request.setAttribute("customer", customer);
        request.setAttribute("services", services);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contract/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addContract(HttpServletRequest request, HttpServletResponse response) {
        String contractStartDate =request.getParameter("contractStartDate");
        String contractEndDate =request.getParameter("contractEndDate");
        Double contractDeposit = Double.parseDouble(request.getParameter("contractDeposit"));
        Double contractTotalMoney = Double.parseDouble(request.getParameter("contractTotalMoney"));
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int serviceId = Integer.parseInt(request.getParameter("serviceId"));
        Contract contract =new Contract(contractStartDate,contractEndDate,contractDeposit,contractTotalMoney,employeeId,customerId,serviceId);
         boolean check =contractService.add(contract);
         if (check){
             request.setAttribute("message","Thêm thành Công");
         }else{
             request.setAttribute("message","Thêm Thất bại");
         }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/contract/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
