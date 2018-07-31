package com.thoughtworks.training.tomwang.todoservice.controller;

import com.thoughtworks.training.tomwang.todoservice.service.HelloService;
import com.thoughtworks.training.tomwang.todoservice.service.TablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class TablesController {
    @Autowired
    private TablesService tablesService;

    @RequestMapping(method = RequestMethod.GET, path = "/tables")
    public String tables(Model model) {
        model.addAttribute("table", tablesService.add());
        return "tables";
    }
}
