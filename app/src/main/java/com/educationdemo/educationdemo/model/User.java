package com.educationdemo.educationdemo.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private int mobile;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public  Number setMobile(String trim){ return mobile ;}
    public void setMobile(Number mobile) {this.mobile = (int) mobile;}
}
