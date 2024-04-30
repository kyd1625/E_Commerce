package com.angdo.E_Commerce.Controller;

import com.angdo.E_Commerce.Dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.angdo.E_Commerce.Service.userService;

@Controller
@RequiredArgsConstructor
public class UserController {

    // 생성자 주입 (객체 주입)
    private final userService userService;

    @PostMapping("signup")
    public String userSignUp(@ModelAttribute UserDTO userDTO){
        userService.save(userDTO);
        return "index";
    }

}
