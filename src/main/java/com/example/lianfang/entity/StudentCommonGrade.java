package com.example.lianfang.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class StudentCommonGrade extends StudentCommonGradeKey {
    @ApiModelProperty(name = "成绩", value = "commonGrade", example = "95")
    private Float commonGrade;

    public Float getCommonGrade() {
        return commonGrade;
    }

    public void setCommonGrade(Float commonGrade) {
        this.commonGrade = commonGrade;
    }
}