package com.example.shoppingcart.controller;

import com.example.shoppingcart.model.Cart;
import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    ProductService productService;

    @GetMapping
    public ModelAndView showPage(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("cart/payment");
        Map<Long, Cart> cartMap = (HashMap<Long, Cart>) session.getAttribute("myCart");
        if (cartMap == null) {
            cartMap = new HashMap<>();
        }
        session.setAttribute("myCart", cartMap);
        session.setAttribute("totalMyCart", totalCart(cartMap));
        return modelAndView;
    }

    public double totalCart(Map<Long, Cart> cart) {
          long totalPrice =0;
          for (Map.Entry<Long,Cart>list:cart.entrySet()){
              totalPrice +=list.getValue().getProduct().getPrice()*(100-list.getValue().getProduct().getDiscount())/100*list.getValue().getQuantity();
          }
          return totalPrice;
    }

    @PostMapping("add")
    public String getCartPage(@RequestParam("id") long id, HttpSession session, Model model){
        Map<Long ,Cart> cartItems=(HashMap<Long, Cart>)session.getAttribute("myCart");
        if (cartItems==null){
            cartItems=new HashMap<>();
        }
        Product product=productService.findById(id);
        if (product !=null){
            if (cartItems.containsKey(id)){
                Cart cart=cartItems.get(id);
                cart.setQuantity(cart.getQuantity()+1);
                cart.setProduct(product);
                cartItems.put(id,cart);
            }
            else {
                Cart cart=new Cart();
                cart.setQuantity(1);
                cart.setProduct(product);
                cartItems.put(id,cart);
            }
        }
        model.addAttribute("cart",new Cart());
        session.setAttribute("myCart",cartItems);
        session.setAttribute(("myCartTotal"),totalCart(cartItems));
        return "cart/payment";

    }
    @GetMapping("update/")
    public String getUpdateCart(@RequestParam("id") long id, HttpSession session, Cart cart, Model model) {
        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCart");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        Product product=this.productService.findById(id);
        if (product != null) {
            if (cartItems.containsKey(id)) {
                cart.setQuantity(cart.getQuantity());
                cart.setProduct(product);
                cartItems.put(id, cart);

            }
        }
        model.addAttribute("cart", new Cart());
        session.setAttribute("myCart", cartItems);
        session.setAttribute("myCartTotal", totalCart(cartItems));
        return "cart/payment";
    }
    @GetMapping(value = "remove/{id}")
    public String viewRemove(HttpSession session, @PathVariable("id") long productId) {
        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCart");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        if (cartItems.containsKey(productId)) {
            cartItems.remove(productId);
        }
        session.setAttribute("myCart", cartItems);
        session.setAttribute("myCartTotal", totalCart(cartItems));
        return "cart/payment";
    }


    @GetMapping("updateSelect")
    public String deleteSelect(@RequestParam("quantity") int[] quantity, Long[] id, HttpSession session, Model model) {

        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCart");
        List<Integer> listQuantity = new ArrayList<>();
        for (Integer quantityEach : quantity) {
            listQuantity.add(quantityEach);
        }

        List<Long> listId = new ArrayList<>();
        for (Long longs : id) {
            listId.add(longs);
        }

        if (cartItems == null) {
            cartItems = new HashMap<>();
        }

        for (int i = 0; i < listId.size(); i++) {
            Product product = productService.findById(listId.get(i));
            if (product != null) {
                if (cartItems.containsKey(listId.get(i))) {
                    Cart cart = cartItems.get(listId.get(i));
                    cart.setQuantity(listQuantity.get(i));
                    cart.setProduct(product);
                    cartItems.put(listId.get(i), cart);
                }
            }
        }
        model.addAttribute("cart", new Cart());
        session.setAttribute("myCart", cartItems);
        session.setAttribute("myCartTotal", totalCart(cartItems));
        return "cart/payment";


    }
}
