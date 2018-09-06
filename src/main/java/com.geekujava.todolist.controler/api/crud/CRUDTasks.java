package com.geekujava.todolist.controler.api.crud;

import com.geekujava.todolist.controler.repository.BaseUserRepository;
import com.geekujava.todolist.controler.repository.TaskListRepository;
import com.geekujava.todolist.controler.repository.TaskRepository;

public class CRUDTasks {
    private TaskListRepository taskLists;
    private BaseUserRepository users;
    private TaskRepository tasks;

    public CRUDTasks(BaseUserRepository users, TaskListRepository taskLists, TaskRepository tasks) {
        this.users = users;
        this.taskLists = taskLists;
        this.tasks = tasks;
    }

    // crud methods. See AppController how to insert\delete


}
