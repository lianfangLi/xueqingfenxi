package com.example.lianfang.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Course {
    @ApiModelProperty(name = "课程编号", value = "courNo", example = "1")
    private String courNo;
    @ApiModelProperty(name = "课程名称", value = "courName", example =" 计算机网络")
    private String courName;
    @ApiModelProperty(name = "课程学分", value = "credit",example = "4")
    private Float credit;
    @ApiModelProperty(name = "课程时长", value = "period", example ="64")
    private Integer period;

    public String getCourNo() {
        return courNo;
    }

    public void setCourNo(String courNo) {
        this.courNo = courNo;
    }

    public String getCourName() {
        return courName;
    }

    public void setCourName(String courName) {
        this.courName = courName;
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }
}
