package com.thoughtworks.training.tomwang.todoservice.controller;

import com.thoughtworks.training.tomwang.todoservice.model.Tables;
import com.thoughtworks.training.tomwang.todoservice.service.TablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TablesController {
    @Autowired
    private TablesService tablesService;

    @PostMapping("/tables")
    public  void create(@RequestBody Tables tables )
    {
        tablesService.createTable(tables);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tables")
    public List<Tables> generateTables() {

        return tablesService.generateTable();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/tables/{id}")
    public void deleteTables(@PathVariable int id) {
        tablesService.deleteTable(id);
    }
}
