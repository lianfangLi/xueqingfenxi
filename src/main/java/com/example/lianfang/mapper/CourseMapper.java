package com.example.lianfang.mapper;

import com.example.lianfang.entity.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper {
    Integer addCourse(Course course);

}
