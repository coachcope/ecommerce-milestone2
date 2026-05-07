package com.gcu.ecommerce.business;

import org.springframework.stereotype.Service;

import com.gcu.ecommerce.models.UserModel;

/**
 * RegistrationBusinessService handles registration business logic.
 * registration is validated but not saved to a database.
 */
@Service
public class RegistrationBusinessService {

    /**
     * Simulates user registration.
     *
     * @param userModel registration form data
     * @return true if the user data is accepted
     */
    public boolean registerUser(UserModel userModel) {
        return userModel != null;
    }
}