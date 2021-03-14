package com.devrob.servicesNotesApp.user.service;

import com.devrob.servicesNotesApp.user.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    public User saveUser(User user);
    public User getUserById(int user_id);
}
