package controller;

import model.bean.contract.AttachService;
import model.bean.contract.Contract;
import model.bean.contract.ContractDetail;
import model.service.contract.ContractServiceImp;
import model.service.contract.IEContractService;
import model.service.contract_detail.ContractDetailServiceImp;
import model.service.contract_detail.IContractDetailService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractDetailServlet",urlPatterns = {"/contract_detail"})
public class ContractDetailServlet extends HttpServlet {
    IContractDetailService contractService=new ContractDetailServiceImp();
    IEContractService emcontractService=new ContractServiceImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "Add":
                addContractDetail(request, response);
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
        List<AttachService> attachServices=contractService.findAllAttachService();
         List<Contract> contracts=emcontractService.findByAll();
        request.setAttribute("attachServices",attachServices);
        request.setAttribute("contracts",contracts);
        RequestDispatcher dispatcher =request.getRequestDispatcher("view/contract_detail/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void addContractDetail(HttpServletRequest request, HttpServletResponse response) {
       int quantity =Integer.parseInt(request.getParameter("quantity"));
       int contractId =Integer.parseInt(request.getParameter("contract_id"));
       int attachServiceId =Integer.parseInt(request.getParameter("attach_service_id"));
        ContractDetail contractDetail =new ContractDetail(contractId,attachServiceId,quantity);
       boolean check=contractService.add(contractDetail);
        if (check){
            request.setAttribute("message","Them thanh cong");
        }else {
            request.setAttribute("message","Them that bai");

        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/contract_detail/create.jsp");

        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
