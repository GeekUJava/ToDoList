package com.geekujava.todolist.controler.domain;

import org.springframework.util.DigestUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BaseUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer user_id;


    private String username;
    private String email;
    private boolean isActivated;
    private Date created;
    private String md5_password_hash;

    public BaseUser() {

    }

    public BaseUser(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.md5_password_hash = DigestUtils.md5DigestAsHex(password.getBytes());
        this.isActivated = false;
        this.created = new Date(System.currentTimeMillis());
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getMd5_password_hash() {
        return md5_password_hash;
    }

    public void setMd5_password_hash(String md5_password_hash) {
        this.md5_password_hash = md5_password_hash;
    }
}
