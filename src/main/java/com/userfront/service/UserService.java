package com.userfront.service;

import com.userfront.domain.User;

public interface UserService {
    User findUserByUsername(String username);
    User findUserByEmail(String email);
    boolean checkUserExists(String username, String email);
    boolean checkUsernameExists(String username);
    boolean checkEmailExists(String email);
    void save(User user);
}
