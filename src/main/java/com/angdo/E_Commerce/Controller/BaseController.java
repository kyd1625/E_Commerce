package com.angdo.E_Commerce.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    @GetMapping("/home")
    public String mainPage(){
        return "index";
    }
    @GetMapping("/product")
    public String productDetailPage(){
        return "user_view/shop-single-2";
    }

    @GetMapping("/dashboard/home")
    public String dashboardHome(){ return "dashboard/dashboard-index";}

    @GetMapping("/dashboard/customer")
    public String dashboardCustomer(){ return "dashboard/customers";}

    @GetMapping("/dashboard/orderList")
    public String dashboardOrderList(){ return "dashboard/order-list";}

    @GetMapping("/dashboard/orderSingle")
    public String dashboardOrderSingle(){ return "dashboard/order-single";}

    @GetMapping("/dashboard/products")
    public String dashboardProducts(){ return "dashboard/products";}

    @GetMapping("/dashboard/reviews")
    public String dashboardReviews(){ return "dashboard/reviews";}

    @GetMapping("/dashboard/categories")
    public String dashboardCategories(){ return "dashboard/categories";}

}
