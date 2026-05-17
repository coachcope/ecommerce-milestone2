package com.gcu.ecommerce.data;

import com.gcu.ecommerce.models.LoginModel;
import com.gcu.ecommerce.models.UserModel;

public interface UserDAO {

    boolean authenticate(LoginModel loginModel);

    boolean usernameExists(String username);

    int create(UserModel userModel);
}