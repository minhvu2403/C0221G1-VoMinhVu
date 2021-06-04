package controller;

import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Employee;
import model.bean.employee.Position;
import model.service.employee.IEmployeeService;
import model.service.employee.EmployeeServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = {"/employee"})
public class EmployeeServlet extends HttpServlet {
    IEmployeeService employeeService = new EmployeeServiceImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                addEmployee(request, response);
                break;
            case "edit":
                update(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
            case "search":
                searchByEmployee(request, response);
                break;

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
            case "view":
                showDetails(request, response);
                break;
            case "sort":
                sortByName(request, response);
                break;
            case "search":
                searchByEmployee(request, response);
            default:
                showUserList(request, response);
                break;
        }
    }

    private void showUserList(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employee = employeeService.findByAll();
        request.setAttribute("employee", employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        List<Position> positions = employeeService.findAllPosition();
        List<EducationDegree> educationDegrees = employeeService.findAllEducationDegree();
        List<Division> divisions = employeeService.findAllDivision();
        request.setAttribute("positions", positions);
        request.setAttribute("educationDegrees", educationDegrees);
        request.setAttribute("divisions", divisions);
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.findById(id);
        request.setAttribute("employee", employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void update(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String position = request.getParameter("position_id");
        String educationDegree = request.getParameter("education_degree_id");
        String division = request.getParameter("division_id");
        String username = request.getParameter("username");
        Employee employee = new Employee(id, name, birthday, idCard, phone, email, address, salary, position, educationDegree, division, username);
        employeeService.update(id, employee);
        showUserList(request, response);

    }

    private void showDetails(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.findById(id);
        request.setAttribute("employee", employee);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/employee/view.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        employeeService.remove(id);
        showUserList(request, response);

    }

    private void addEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String position = request.getParameter("position_id");
        String educationDegree = request.getParameter("education_degree_id");
        String division = request.getParameter("division_id");
        String username = request.getParameter("username");
        Employee employee = new Employee(name, birthday, idCard, phone, email, address, salary, position, educationDegree, division, username);
        employeeService.add(employee);

        showUserList(request, response);
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Position> positions = employeeService.findAllPosition();
        List<EducationDegree> educationDegrees = employeeService.findAllEducationDegree();
        List<Division> divisions = employeeService.findAllDivision();
        request.setAttribute("positions", positions);
        request.setAttribute("educationDegrees", educationDegrees);
        request.setAttribute("divisions", divisions);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchByEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<Employee> employee = employeeService.findByName(name);
        request.setAttribute("employee", employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void sortByName(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employee = employeeService.findByAll();
        Collections.sort(employee);
        request.setAttribute("employee", employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
