package com.thoughtworks.training.tomwang.todoservice.repository;

import com.google.common.collect.ImmutableList;
import com.thoughtworks.training.tomwang.todoservice.model.Tables;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TablesRepository {
    public List<Tables> list() {
        return ImmutableList.of(
                new Tables("0001", "特工1"),
                new Tables("0002", "特工2"),
                new Tables("0003", "特工3"),
                new Tables("0004", "特工4"),
                new Tables("0005", "特工5"),
                new Tables("0006", "特工6"),
                new Tables("0007","特工7")
        );
    }
}
