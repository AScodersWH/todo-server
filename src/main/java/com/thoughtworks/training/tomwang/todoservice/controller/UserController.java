package com.thoughtworks.training.tomwang.todoservice.controller;

import com.thoughtworks.training.tomwang.todoservice.model.Tables;
import com.thoughtworks.training.tomwang.todoservice.model.User;
import com.thoughtworks.training.tomwang.todoservice.repository.UsersRepository;
import com.thoughtworks.training.tomwang.todoservice.service.TablesService;
import com.thoughtworks.training.tomwang.todoservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public  void create(@RequestBody User user ) {

        userService.createUser(user);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user")
    public List<User> generateUsers() {

        return userService.generateUsers();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/user/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
