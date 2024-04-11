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

    @GetMapping("/signin")
    public String signinPage(){
        return "signin";
    }

    @GetMapping("/signup")
    public String signupPage(){
        return "signup";
    }


    @GetMapping("/forgotPW")
    public String forgotPasswordPage(){
        return "forgot-password";
    }

    @GetMapping("/account_address")
    public String addressPage(){
        return "user_view/account-address";
    }

    @GetMapping("/orderList")
    public String orderListPage(){
        return "user_view/account-orders";
    }

    @GetMapping("/payment_method")
    public String paymentMethodPage(){
        return "user_view/account-payment-method";
    }

    @GetMapping("/settting")
    public String settingPage(){
        return "user_view/account-setting";
    }

    @GetMapping("/shop_cart")
    public String shopcartPage(){
        return "user_view/shop-cart";
    }

    @GetMapping("/shop_checkout")
    public String shopcheckoutPage(){
        return "user_view/shop-checkout";
    }

    @GetMapping("/wishlist")
    public String wishlistPage(){
        return "user_view/shop-wishlist";
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
