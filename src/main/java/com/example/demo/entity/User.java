package com.example.demo.entity;

public class User {
    private long user_id;
    private String user_name;
    private int user_age;
    private int user_male;

    public User() {
    }

    public User(long user_id, String user_name, int user_age, int user_male) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_age = user_age;
        this.user_male = user_male;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public int getUser_male() {
        return user_male;
    }

    public void setUser_male(int user_male) {
        this.user_male = user_male;
    }
}
