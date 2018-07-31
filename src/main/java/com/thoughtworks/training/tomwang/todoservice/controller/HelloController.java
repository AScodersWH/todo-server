package com.thoughtworks.training.tomwang.todoservice.controller;

import com.thoughtworks.training.tomwang.todoservice.model.Person;
import com.thoughtworks.training.tomwang.todoservice.service.HelloService;
import jdk.nashorn.internal.runtime.PropertyHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(method = RequestMethod.GET, path = "/hello/{name}")
    public String hello(@PathVariable String name, Model model) {
        model.addAttribute("per", helloService.find(name));
        return "hello";
    }
}
