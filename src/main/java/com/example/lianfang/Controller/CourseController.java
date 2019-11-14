package com.example.lianfang.Controller;

import com.example.lianfang.entity.Course;
import com.example.lianfang.generalUtils.SqlUtils;
import com.example.lianfang.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api( description = "课程操作相关接口  未做完")
@RestController("/course")
@ResponseBody
public class CourseController {
    @Autowired
    CourseService courseService;

    @ApiOperation(value = "添加课程信息",notes ="教师调用" )
    @PostMapping("/addcourse")
    public String add(@RequestBody @ApiParam Course course){
        if(courseService.addCourse(course) != 0)
            return SqlUtils.success;
        return SqlUtils.wrong;

    }

    @PostMapping("/modifycourse")
    public String modify(@RequestBody Course course){
        return null;
    }
    @PostMapping("/deletecourse")
    public String delete(@RequestBody Course course){
        return null;
    }

    @PostMapping("/selectcourse")
    public String selectCourse(@RequestBody Course course){
        return null;
    }


}
