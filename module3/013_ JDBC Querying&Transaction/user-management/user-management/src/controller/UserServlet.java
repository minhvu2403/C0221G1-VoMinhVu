package controller;

import model.bean.User;
import model.service.IUserService;
import model.service.impl.UserServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "UserServlet",urlPatterns = {"","/user"})
public class UserServlet extends HttpServlet {
    IUserService userService =new UserServiceImp();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "add":
                try {
                    addUser(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "edit":
                update(request,response);
                break;
            case "delete":
                deleteUser(request, response);
                break;
            case "search":
                searchByCountry(request, response);
                break;

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "add":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            case "delete":
                deleteUser(request, response);
                break;
            case "view":
                showDetails(request, response);
                break;
            case "sort":
                sortByName(request, response);
                break;
            case "search":
                searchByCountry(request,response);
                break;
            case "permission":
                addUserPermission(request, response);
                break;
            case "test-use-tran":
                testUseTran(request, response);
                break;
            case "test-without-tran":
                testWithoutTran(request, response);
                break;
            default:
                showUserList(request,response);
                break;
        }
    }

    private void testWithoutTran(HttpServletRequest request, HttpServletResponse response) {
        userService.insertUpdateWithoutTransaction();
    }

    private void testUseTran(HttpServletRequest request, HttpServletResponse response) {
        userService.insertUpdateUseTransaction();
    }


    private void addUserPermission(HttpServletRequest request, HttpServletResponse response) {
        User user = new User("Kien", "kienhoang@gmail.com", "Viet Nam");
        int[] permissions = {1, 2, 4};
        userService.addUserTransaction(user, permissions);

    }

    private void showUserList(HttpServletRequest request, HttpServletResponse response) {
        List<User> user =userService.findByAll();
        request.setAttribute("user", user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }



    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user =userService.getUserById(id);
        request.setAttribute("user", user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/user/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void update(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String  email = request.getParameter("email");
        String country = request.getParameter("country");
        User user =new User(id,name,email,country);
         userService.update(id,user);
        showUserList(request,response);

    }
    private void showDetails(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user =userService.findById(id);
        request.setAttribute("user",user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/user/view.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.remove(id);
        showUserList(request, response);

    }
    private void addUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String name = request.getParameter("name");
        String  email = request.getParameter("email");
        String country = request.getParameter("country");
        User user =new User(name,email,country);
        userService.insertUser(user);
        showUserList(request, response);
    }

    private void  showFormCreate (HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("/view/user/create.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void searchByCountry(HttpServletRequest request, HttpServletResponse response) {
        String country = request.getParameter("name");
        List<User> user = userService.findByCountry(country);
            request.setAttribute("user", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/list.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
    }
    private void sortByName(HttpServletRequest request, HttpServletResponse response) {
        List<User> user= userService.findByAll();
        Collections.sort(user);
        request.setAttribute("user", user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
