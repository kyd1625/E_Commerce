package com.angdo.E_Commerce.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    @GetMapping("/homepage")
    public String mainPage(){
        return "index.html";
    }
}
