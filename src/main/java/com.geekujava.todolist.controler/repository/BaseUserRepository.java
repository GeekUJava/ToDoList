package com.geekujava.todolist.controler.repository;

import com.geekujava.todolist.controler.domain.BaseUser;

import org.springframework.data.repository.CrudRepository;

public interface BaseUserRepository extends CrudRepository<BaseUser, Integer> {
}
