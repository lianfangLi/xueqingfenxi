package com.example.lianfang.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class StudentCommonGradeKey {
    @ApiModelProperty(name = "学生学号", value = "id", example = "17111")
    private String id;
    @ApiModelProperty(name = "课程名", value = "item", example = "计算机网络")
    private String item;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }
}