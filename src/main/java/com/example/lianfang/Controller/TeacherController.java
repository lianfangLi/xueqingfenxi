package com.example.lianfang.Controller;

import com.example.lianfang.entity.Teacher;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Api(description = "教师信息操作相关接口")
@RestController
@ResponseBody
public class TeacherController {
    @ApiOperation(value = "教师注册接口",notes = "返回教师的JSON串")
    @PostMapping("/teacherRegister")
    public String registe(@RequestBody  @ApiParam Teacher teacher){
            return null;
    }
    @ApiOperation(value = "教师信息修改接口",notes = "返回教师的JSON串")
    @PostMapping("/teacherDelete")
    public String Delete(@RequestBody  @ApiParam Teacher teacher){
        return null;
    }
    @ApiOperation(value = "教师信息更改接口",notes = "返回教师的JSON串")
    @PostMapping("/teacherUpdate")
    public String update(@RequestBody  @ApiParam Teacher teacher){
        return null;
    }
    @ApiOperation(value = "单个教师信息查询接口",notes = "返回教师的JSON串")
    @PostMapping("/teacherSelect")
    public String selectOne(@RequestBody  @ApiParam Teacher teacher){
        return null;
    }

    @ApiOperation(value = "所有教师查询信息接口",notes = "返回教师的JSON串")
    @PostMapping("/teacherSelectAll")
    public String selectAll(@RequestBody  @ApiParam Teacher teacher){
        return null;
    }



}
