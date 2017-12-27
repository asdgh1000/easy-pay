package com.easyPay.controller;


import com.easyPay.Bean.User;
import com.easyPay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {
    @Autowired
    UserService userService;

    /**
     * 将用户名和密码连接起来后 使用base64加密，将加密文放到http header中进行验证
     * eg:Authoriuzation : Basic YSFHSKFJDDdfss
     * @param loginedUser
     * @param logout
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public Object login(@AuthenticationPrincipal User loginedUser, @RequestParam(name = "logout", required = false) String logout) {
        if (logout != null) {
            return null;
        }
        if (loginedUser != null) {
            return userService.getById(loginedUser.getId());
        }
        return null;
    }
}
