package com.gcu.ecommerce.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gcu.ecommerce.business.RegistrationBusinessService;
import com.gcu.ecommerce.models.LoginModel;
import com.gcu.ecommerce.models.UserModel;

/**
 * RegistrationController handles registration page requests.
 * Registration logic is handled by RegistrationBusinessService.
 */
@Controller
public class RegistrationController {

    private final RegistrationBusinessService registrationBusinessService;

    /**
     * Constructor injection for RegistrationBusinessService.
     *
     * @param registrationBusinessService injected registration service bean
     */
    public RegistrationController(RegistrationBusinessService registrationBusinessService) {
        this.registrationBusinessService = registrationBusinessService;
    }

    @GetMapping("/register")
    public String show(Model model) {
        model.addAttribute("userModel", new UserModel());
        return "register";
    }

    @PostMapping("/register")
    public String submit(@Valid UserModel userModel, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "register";
        }

        registrationBusinessService.registerUser(userModel);

        model.addAttribute("successMessage", "Registration successful. You can now log in with admin / password.");
        model.addAttribute("loginModel", new LoginModel());

        return "login";
    }
}