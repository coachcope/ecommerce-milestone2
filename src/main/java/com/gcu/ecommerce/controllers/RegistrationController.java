package com.gcu.ecommerce.controllers;
import com.gcu.ecommerce.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
/** Handles registration form display and validation. */
@Controller
public class RegistrationController {
 @GetMapping("/register") public String show(Model model){ model.addAttribute("userModel", new UserModel()); return "register"; }
 @PostMapping("/register") public String submit(@Valid UserModel userModel, BindingResult result, Model model){
  if(result.hasErrors()) return "register";
  model.addAttribute("successMessage","Registration successful. You can now log in.");
  model.addAttribute("loginModel",new LoginModel());
  return "login";
 }
}
