package com.example.lianfang.service.serviceImpl;

import com.example.lianfang.entity.Course;
import com.example.lianfang.mapper.CourseMapper;
import com.example.lianfang.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl  implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public Integer addCourse(Course course) {
        return courseMapper.addCourse(course);
    }
}
