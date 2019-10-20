package com.example.springboot.pojo;

import java.util.Date;

public class User {
    private String username;
    private String password;
    private Integer id;
    private String phone;
    private Date birthday;

    public User() {
    }

    public User(String username, String password, String phone, Date birthday) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
