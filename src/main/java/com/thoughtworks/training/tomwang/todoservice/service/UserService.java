package com.thoughtworks.training.tomwang.todoservice.service;

import com.thoughtworks.training.tomwang.todoservice.model.User;
import com.thoughtworks.training.tomwang.todoservice.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UsersRepository usersRepository;

    public List<User> generateUsers() {
        List<User> users = usersRepository.findAll();
        return users;

    }
    public void createUser(User user) {
        usersRepository.save(user);
    }
    public void deleteUser(Integer id) {
        usersRepository.delete(id);
    }

    public boolean verify(String username,String password){
        Optional<User> optionalUser = usersRepository.findOneByNameAndPassword(username, password);
        return optionalUser.isPresent();
    }


}
