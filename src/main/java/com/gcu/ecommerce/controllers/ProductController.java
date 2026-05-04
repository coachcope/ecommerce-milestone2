package com.gcu.ecommerce.controllers;
import com.gcu.ecommerce.models.ProductModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;
import java.util.*;
/** Handles display of sample product data after login. */
@Controller
public class ProductController {
 @GetMapping("/products") public String products(Model model, HttpSession session){
  if(session.getAttribute("loggedInUser")==null) return "redirect:/login";
  List<ProductModel> products=Arrays.asList(
   new ProductModel(1,"Smartphone","Electronics",699.99,12,"Modern smartphone with large display."),
   new ProductModel(2,"Hoodie","Clothing",49.99,25,"Comfortable everyday hoodie."),
   new ProductModel(3,"Dumbbell Set","Fitness Gear",89.99,8,"Adjustable dumbbell set for home workouts.")
  );
  model.addAttribute("products",products); return "products";
 }
}
