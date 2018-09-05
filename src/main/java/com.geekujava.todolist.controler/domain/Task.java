package com.geekujava.todolist.controler.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer task_id;

    private Integer tasklist_id;
    private String name;
    private String description;
    private Date date;
    private Integer priority;
    private Date created;

    public Task() {

    }

    public Task(Integer tasklist_id, String name, String description, Integer priority) {
        this.tasklist_id = tasklist_id;
        this.name = name;
        this.description = description;
        this.date = new Date(System.currentTimeMillis()); // temp
        this.priority = priority;
        this.created = new Date(System.currentTimeMillis());
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
