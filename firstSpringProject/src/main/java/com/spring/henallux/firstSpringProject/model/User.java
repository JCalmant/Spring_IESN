package com.spring.henallux.firstSpringProject.model;

import javax.validation.constraints.*;

public class User {

    @Size(min = 1, max = 20, message = "{name.valid}")
    private String name;

    @Min(value = 2)
    @Max(value = 15, message = "{age.valid}")
    private int age;
    private boolean male;
    private String hobby;

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getMale(){
        return male;
    }

    public String getHobby() {
        return hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public User() {}
}
