package controller;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;
import model.service.contract.ContractServiceImp;
import model.service.contract.IEContractService;
import model.service.service.IEService;
import model.service.service.ServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet" ,urlPatterns = {"/service"})
public class ServiceServlet extends HttpServlet {
        IEService emService =new ServiceImp();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "Add":
                addService(request, response);
                break;
            default:
                break;
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            showFormCreate(request,response);
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<RentType> rentTypes=emService.findAllRentType();
        List<ServiceType> serviceTypes=emService.findAllServiceType();
        request.setAttribute("rentTypes",rentTypes);
        request.setAttribute("serviceTypes",serviceTypes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/service/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void addService(HttpServletRequest request, HttpServletResponse response) {
        String serviceName = request.getParameter("serviceName");
        double serviceArea = Double.parseDouble(request.getParameter("serviceArea"));
        double serviceCost = Double.parseDouble( request.getParameter("serviceCost"));
        int serviceMaxPeople =Integer.parseInt( request.getParameter("serviceMaxPeople"));
        String standardRoom = request.getParameter("standardRoom");
        String description = request.getParameter("description");
        double poolArea  =Double.parseDouble( request.getParameter("poolArea"));
        int numberOfFloor =Integer.parseInt(request.getParameter("numberOfFloor"));
        int serviceTypeId = Integer.parseInt(request.getParameter("serviceTypeId"));
        int rentTypeId =Integer.parseInt(request.getParameter("rentTypeId"));

        Service service =new Service(serviceName,serviceArea,serviceCost,serviceMaxPeople,standardRoom,description,poolArea,numberOfFloor,serviceTypeId,rentTypeId);
         boolean check=emService.add(service);
         if (check){
             request.setAttribute("message","Them thanh cong");
         }else {
             request.setAttribute("message","Them that bai");

         }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/service/create.jsp");

        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
