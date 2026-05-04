package com.gcu.ecommerce.models;
import javax.validation.constraints.*;
/** Represents a login form model. */
public class LoginModel {
 @NotBlank(message="Username is required.") @Size(min=4,max=20,message="Username must be between 4 and 20 characters.")
 private String username;
 @NotBlank(message="Password is required.") @Size(min=6,max=30,message="Password must be at least 6 characters.")
 private String password;
 public String getUsername(){return username;} public void setUsername(String v){username=v;}
 public String getPassword(){return password;} public void setPassword(String v){password=v;}
}
