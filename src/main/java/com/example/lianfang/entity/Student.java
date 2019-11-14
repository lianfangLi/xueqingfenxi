package com.example.lianfang.entity;

import java.util.Date;

public class Student {
    private String id;

    private String sdName;

    private String sex;

    private Date birth;

    private Integer age;

    private String contact;

    private String email;

    private String mood;

    private String classNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSdName() {
        return sdName;
    }

    public void setSdName(String sdName) {
        this.sdName = sdName == null ? null : sdName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood == null ? null : mood.trim();
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo == null ? null : classNo.trim();
    }
}