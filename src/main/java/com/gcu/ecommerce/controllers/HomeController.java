package com.gcu.ecommerce.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/** Handles the main application page. */
@Controller
public class HomeController { @GetMapping("/") public String home(){ return "index"; } }
