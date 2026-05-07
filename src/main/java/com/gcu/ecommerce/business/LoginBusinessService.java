package com.gcu.ecommerce.business;

import org.springframework.stereotype.Service;

import com.gcu.ecommerce.models.LoginModel;

/**
 * LoginBusinessService handles login business logic.
 * For Milestone 3, without a database.
 */
@Service
public class LoginBusinessService {

    /**
     * Simulates user authentication using hardcoded credentials.
     *
     * @param loginModel login form data
     * @return true if username and password match the demo login
     */
    public boolean authenticate(LoginModel loginModel) {
        return "admin".equals(loginModel.getUsername())
                && "password".equals(loginModel.getPassword());
    }
}