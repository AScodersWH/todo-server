package com.thoughtworks.training.tomwang.todoservice.controller;

import com.thoughtworks.training.tomwang.todoservice.model.Tables;
import com.thoughtworks.training.tomwang.todoservice.model.User;
import com.thoughtworks.training.tomwang.todoservice.repository.UsersRepository;
import com.thoughtworks.training.tomwang.todoservice.service.TablesService;
import com.thoughtworks.training.tomwang.todoservice.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {
    public String session = "";
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

    @PostMapping("/login")
    public String login(@RequestBody User user) throws ChangeSetPersister.NotFoundException {
        HashMap<String, Object> claims = new HashMap<>();
        claims.put(user.getName(), user.getPassword());


        if (userService.verify(user.getName(), user.getPassword())) {
            String token = Jwts.builder()
                    .addClaims(claims)
                    .signWith(SignatureAlgorithm.HS512, "kitty".getBytes())
                    .compact();
            return token;
        }
       else throw new ChangeSetPersister.NotFoundException();
    }
}
