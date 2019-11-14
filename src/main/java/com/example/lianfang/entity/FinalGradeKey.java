package com.example.lianfang.entity;

public class FinalGradeKey {
    private String id;

    private String courNo;

    private String teacherId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCourNo() {
        return courNo;
    }

    public void setCourNo(String courNo) {
        this.courNo = courNo == null ? null : courNo.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }
}