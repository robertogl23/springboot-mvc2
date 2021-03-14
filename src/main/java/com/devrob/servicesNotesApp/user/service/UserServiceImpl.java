package com.devrob.servicesNotesApp.user.service;

import com.devrob.servicesNotesApp.user.entity.User;
import com.devrob.servicesNotesApp.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    //@Autowired
    //private BCryptPasswordEncoder encoder;
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        //user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User getUserById(int user_id) {
        return userRepository.getOne(user_id);
    }
}
