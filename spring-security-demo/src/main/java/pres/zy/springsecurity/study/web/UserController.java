package pres.zy.springsecurity.study.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public String login() {
        return null;
    }

    @PostMapping("/token")
    public String getToken() {
        return null;
    }

    @PostMapping("/logout")
    public String logout() {
        return null;
    }
}
