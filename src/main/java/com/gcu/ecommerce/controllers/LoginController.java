package com.gcu.ecommerce.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gcu.ecommerce.business.LoginBusinessService;
import com.gcu.ecommerce.models.LoginModel;

/**
 * LoginController handles login page requests.
 * The login logic is handled by LoginBusinessService.
 */
@Controller
public class LoginController {

    private final LoginBusinessService loginBusinessService;

    /**
     * Constructor injection for LoginBusinessService.
     *
     * @param loginBusinessService injected login service bean
     */
    public LoginController(LoginBusinessService loginBusinessService) {
        this.loginBusinessService = loginBusinessService;
    }

    @GetMapping("/login")
    public String show(Model model) {
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }

    @PostMapping("/login")
    public String login(@Valid LoginModel loginModel, BindingResult result, Model model, HttpSession session) {

        if (result.hasErrors()) {
            return "login";
        }

        if (!loginBusinessService.authenticate(loginModel)) {
            model.addAttribute("loginError", "Invalid username or password. Try admin / password.");
            return "login";
        }

        session.setAttribute("loggedInUser", loginModel.getUsername());
        return "redirect:/products";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}