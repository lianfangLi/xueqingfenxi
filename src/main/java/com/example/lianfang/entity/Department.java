package com.example.lianfang.entity;

public class Department {
    private String dpId;

    private String dpName;

    private String dpHead;

    public String getDpId() {
        return dpId;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId == null ? null : dpId.trim();
    }

    public String getDpName() {
        return dpName;
    }

    public void setDpName(String dpName) {
        this.dpName = dpName == null ? null : dpName.trim();
    }

    public String getDpHead() {
        return dpHead;
    }

    public void setDpHead(String dpHead) {
        this.dpHead = dpHead == null ? null : dpHead.trim();
    }
}