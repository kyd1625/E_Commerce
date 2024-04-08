package com.angdo.E_Commerce.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    @GetMapping("/home")
    public String mainPage(){
        return "index.html";
    }
<<<<<<< Updated upstream
=======

    @GetMapping("/product")
    public String productDetailPage(){
        return "user_view/shop-single-2";
    }

    @GetMapping("/dashboard/home") // 테스트용 변경 예정 kyd 20240407
    public String dashboardHome(){ return "dashboard/dashboard-index";}


>>>>>>> Stashed changes
}
