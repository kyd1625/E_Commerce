package com.angdo.E_Commerce.Controller;

import com.angdo.E_Commerce.Dto.UserDTO;
import jakarta.servlet.http.HttpSession;
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

    @PostMapping("signin")
    public String userLogin(@ModelAttribute UserDTO userDTO, HttpSession session){
        UserDTO loginResult = userService.login(userDTO);
        if(loginResult != null){
            // 로그인 성공
            session.setAttribute("loginId",loginResult.getUser_id());
            session.setMaxInactiveInterval(600); // 세션 시간 600초 = 10분
            return "index";
        } else {
            // 로그인 실패
            return "signin";
        }
    }

}
