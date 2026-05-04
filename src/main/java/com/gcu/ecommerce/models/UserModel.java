package com.gcu.ecommerce.models;
import javax.validation.constraints.*;
/** Represents a user registration form model. */
public class UserModel {
 @NotBlank(message="First name is required.") @Size(min=2,max=30,message="First name must be between 2 and 30 characters.")
 private String firstName;
 @NotBlank(message="Last name is required.") @Size(min=2,max=30,message="Last name must be between 2 and 30 characters.")
 private String lastName;
 @NotBlank(message="Email is required.") @Email(message="Enter a valid email address.")
 private String email;
 @NotBlank(message="Phone number is required.") @Pattern(regexp="^[0-9]{10}$",message="Phone number must be 10 digits.")
 private String phoneNumber;
 @NotBlank(message="Username is required.") @Size(min=4,max=20,message="Username must be between 4 and 20 characters.")
 private String username;
 @NotBlank(message="Password is required.") @Size(min=6,max=30,message="Password must be at least 6 characters.")
 private String password;
 public String getFirstName(){return firstName;} public void setFirstName(String v){firstName=v;}
 public String getLastName(){return lastName;} public void setLastName(String v){lastName=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
 public String getPhoneNumber(){return phoneNumber;} public void setPhoneNumber(String v){phoneNumber=v;}
 public String getUsername(){return username;} public void setUsername(String v){username=v;}
 public String getPassword(){return password;} public void setPassword(String v){password=v;}
}
