package com.example.lianfang.entity;

public class WorkAttending extends WorkAttendingKey {
    private String isAttend;

    public String getIsAttend() {
        return isAttend;
    }

    public void setIsAttend(String isAttend) {
        this.isAttend = isAttend == null ? null : isAttend.trim();
    }
}