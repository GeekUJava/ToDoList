package com.geekujava.todolist.controler.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TaskList {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer tasklist_id;

    private String name;
    private String description;
    private Integer user_id;
    private Date created;

    public TaskList() {

    }

    public TaskList(Integer user_id, String name, String description) {
        this.name = name;
        this.description = description;
        this.user_id = user_id;
        this.created = new Date(System.currentTimeMillis());
    }

    public Integer getTasklist_id() {
        return tasklist_id;
    }

    public void setTasklist_id(Integer tasklist_id) {
        this.tasklist_id = tasklist_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
