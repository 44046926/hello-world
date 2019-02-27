package com.market.config;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -1373466854963598163L;

    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructing Student...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
