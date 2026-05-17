package com.gcu.ecommerce.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gcu.ecommerce.models.LoginModel;
import com.gcu.ecommerce.models.UserModel;

@Repository
public class UserDataService implements UserDAO {

    private final JdbcTemplate jdbcTemplate;

    public UserDataService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean authenticate(LoginModel loginModel) {
        String sql = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";
        Integer count = jdbcTemplate.queryForObject(
            sql,
            Integer.class,
            loginModel.getUsername(),
            loginModel.getPassword()
        );
        return count != null && count > 0;
    }

    @Override
    public boolean usernameExists(String username) {
        String sql = "SELECT COUNT(*) FROM users WHERE username = ?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, username);
        return count != null && count > 0;
    }

    @Override
    public int create(UserModel userModel) {
        String sql = "INSERT INTO users (first_name, last_name, email, phone_number, username, password) VALUES (?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(
            sql,
            userModel.getFirstName(),
            userModel.getLastName(),
            userModel.getEmail(),
            userModel.getPhoneNumber(),
            userModel.getUsername(),
            userModel.getPassword()
        );
    }
}