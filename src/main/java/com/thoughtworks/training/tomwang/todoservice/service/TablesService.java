package com.thoughtworks.training.tomwang.todoservice.service;

import com.thoughtworks.training.tomwang.todoservice.model.Tables;
import com.thoughtworks.training.tomwang.todoservice.repository.TablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TablesService {
    @Autowired
    private TablesRepository tablesRepository;

    public List<Tables> generateTable() {
        List<Tables> tables = tablesRepository.findAll();
        return tables;
    }
//    public Tables find(Integer id){
//        Tables tables = tablesRepository.findOne(id);
//        return tables;
//    }


    public void createTable(Tables tables) {
        tablesRepository.save(tables);
    }
    public void deleteTable(Integer id) {
        tablesRepository.delete(id);
    }

}
