package com.angdo.E_Commerce.Controller;

import com.angdo.E_Commerce.Dto.UserDTO;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.angdo.E_Commerce.Service.userService;

@Controller
@RequiredArgsConstructor
public class UserController {

    // 생성자 주입 (객체 주입)
    private final userService userService;

    /*
     * 로그인 페이지
     * @param :
     * @return : signin.html
     * @throws :
     * @author : JH
     * */
    @GetMapping("/signin")
    public String signinPage(){
        return "signin";
    }

    /*
     * 회원가입 페이지
     * @param :
     * @return : signup.html
     * @throws :
     * @author : JH
     * */
    @GetMapping("/signup")
    public String signupPage(){
        return "signup";
    }

    @PostMapping("signup")
    public String userSignUp(@ModelAttribute UserDTO userDTO){
        userService.save(userDTO);
        return "index"; // 프론트 작업시 회원가입 완료 alert창 띄우기 필요
    }

    @PostMapping("signin")
    public String userLogin(@ModelAttribute UserDTO userDTO, HttpSession session){
        UserDTO loginResult = userService.login(userDTO);
        if(loginResult != null){
            // 로그인 성공
            session.setAttribute("loginId",loginResult.getUser_id());
            System.out.println(session.getAttribute("loginId"));
            return "index";
        } else {
            // 로그인 실패
            return "signin";
        }
    }

}
