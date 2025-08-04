package com.carbontracker.service;

import com.carbontracker.entity.User;
import java.util.List;

public interface UserService {
    User createUser(User user);

    void deleteUser(Long id);

    User updateUser(Long id, User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}
