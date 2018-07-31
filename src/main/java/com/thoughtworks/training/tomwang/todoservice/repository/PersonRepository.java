package com.thoughtworks.training.tomwang.todoservice.repository;

import com.google.common.collect.ImmutableList;
import com.sun.javafx.collections.ImmutableObservableList;
import com.thoughtworks.training.tomwang.todoservice.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PersonRepository {
    public List<Person> list(){
        return ImmutableList.of(
             new Person("TomWang","708"),
             new Person("ellen","708")
        );
    }
}
