package com.gcu.ecommerce.controllers;
import com.gcu.ecommerce.models.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
/** Handles login form display and simulated authentication. */
@Controller
public class LoginController {
 @GetMapping("/login") public String show(Model model){ model.addAttribute("loginModel", new LoginModel()); return "login"; }
 @PostMapping("/login") public String login(@Valid LoginModel loginModel, BindingResult result, Model model, HttpSession session){
  if(result.hasErrors()) return "login";
  if(!"admin".equals(loginModel.getUsername()) || !"password".equals(loginModel.getPassword())){
   model.addAttribute("loginError","Invalid username or password. Try admin / password."); return "login";
  }
  session.setAttribute("loggedInUser", loginModel.getUsername());
  return "redirect:/products";
 }
 @GetMapping("/logout") public String logout(HttpSession session){ session.invalidate(); return "redirect:/"; }
}
