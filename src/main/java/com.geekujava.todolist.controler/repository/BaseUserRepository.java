package com.geekujava.todolist.controler.repository;

import geek.project.tasks.domain.BaseUser;
import org.springframework.data.repository.CrudRepository;

public interface BaseUserRepository extends CrudRepository<BaseUser, Integer> {
}
