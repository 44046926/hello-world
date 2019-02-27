package com.market.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class BusinessException implements Serializable {

    private static final long serialVersionUID = -5304607958080834690L;

    private long id = 1L;
    private int age;
    private String name = "zhangsan";

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Student student;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> addressList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> courseList = new ArrayList<>();

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, Object> map;

    @JsonProperty("properties")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, Object> propertiesMap = new HashMap<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Map<String, Object> getPropertiesMap() {
        return propertiesMap;
    }

    public void setPropertiesMap(Map<String, Object> propertiesMap) {
        this.propertiesMap = propertiesMap;
    }
}
