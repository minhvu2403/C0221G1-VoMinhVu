package servlet;

import controller.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletProduct", value = "/product")
public class ProductServlet extends HttpServlet {
    ArrayList<Product> productList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        super.init();
        productList.add(new Product("Mai Van Hoan", "01/12/2005", "Da nang", "image/anh1.jpg"));
        productList.add(new Product("Mai A", "01/12/2005", "Da nang", "image/anh2.jpg"));
        productList.add(new Product("Mai Van C", "01/12/2005", "Da nang", "image/anh3.jpg"));
        productList.add(new Product("Mai Van B", "01/12/2005", "Da nang", "image/anh4.jpg"));
        productList.add(new Product("Mai Van D", "01/12/2005", "Da nang", "image/anh5.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("products", productList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product/ListProduct.jsp");
        requestDispatcher.forward(request, response);
    }
}
