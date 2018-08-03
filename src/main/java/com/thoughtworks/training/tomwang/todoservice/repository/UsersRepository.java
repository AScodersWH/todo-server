package com.thoughtworks.training.tomwang.todoservice.repository;

import com.thoughtworks.training.tomwang.todoservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<User,Integer> {

   Optional<User> findOneByNameAndPassword(String username, String password);
}
