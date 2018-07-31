package com.thoughtworks.training.tomwang.todoservice.service;

import com.thoughtworks.training.tomwang.todoservice.model.Person;
import com.thoughtworks.training.tomwang.todoservice.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelloService {
    @Autowired
    private PersonRepository personRepository;

    public Person find(String name){
        List<Person> persons = personRepository.list();
      return  persons.stream()
                .filter(person -> person.getName().equals(name))
                .findFirst()
                .get();
    }
}
