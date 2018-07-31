package com.thoughtworks.training.tomwang.todoservice.service;

import com.thoughtworks.training.tomwang.todoservice.model.Tables;
import com.thoughtworks.training.tomwang.todoservice.repository.TablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TablesService {
    @Autowired
    private TablesRepository tablesRepository;

    public List<Tables> add() {
        List<Tables> tables = tablesRepository.list();
        return tables;
    }
}
