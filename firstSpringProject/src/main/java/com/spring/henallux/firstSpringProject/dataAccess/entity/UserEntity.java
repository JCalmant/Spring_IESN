package com.spring.henallux.firstSpringProject.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "male")
    private boolean male;

    @Column(name = "hobby")
    private String hobby;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getMale() {
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

    public UserEntity() {}
}
