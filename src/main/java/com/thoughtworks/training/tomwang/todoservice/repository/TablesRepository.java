package com.thoughtworks.training.tomwang.todoservice.repository;

import com.thoughtworks.training.tomwang.todoservice.model.Tables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TablesRepository extends JpaRepository<Tables,Integer> {

}
