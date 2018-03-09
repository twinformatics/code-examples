package at.twinformatics.example.security.dbexample.controller;

import at.twinformatics.example.security.dbexample.forms.LoginForm;
import at.twinformatics.example.security.dbexample.service.UserLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.UUID;


@Controller
public class IndexController {

    private final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private UserLoginService userLoginService;

    @GetMapping({"/", "/login"})
    public String getIndex(Model model) {
        LoginForm a = new LoginForm();
        a.setUserName("test");
        model.addAttribute("loginForm", a);
        return "index";
    }

    @PostMapping("/login")
    public String checkLogin(Model model, @ModelAttribute LoginForm loginForm) {
        LOGGER.info(loginForm.toString());

        if (userLoginService.isValidLogin(loginForm)) {
            SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(loginForm.getUserName(), null, Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"))));
            return "redirect:/welcome";
        } else {
            model.addAttribute("error", true);
            return "index";
        }

    }

    @GetMapping("/welcome")
    public String getWelcome(Model model) {

        String code = UUID.randomUUID().toString();
        LOGGER.info("Code: " + code);
        model.addAttribute("code", code);

        return "welcome";
    }
}
