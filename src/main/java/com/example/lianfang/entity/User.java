package com.example.lianfang.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.junit.experimental.theories.DataPoint;
import org.springframework.stereotype.Component;

@Component
@ApiModel(value = "user实体",description = "用于用户操作相关")
public class User {

    @ApiModelProperty(value="用户id",name="id",example="jack")
    private String id;
    @ApiModelProperty(value="用户密码",name="pass",example="123")
    private String pass;
    @ApiModelProperty(value="用户姓名",name="identity",example="张三")
    private String identity;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
