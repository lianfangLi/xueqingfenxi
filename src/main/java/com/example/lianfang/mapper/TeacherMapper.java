package com.example.lianfang.mapper;

import com.example.lianfang.entity.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(String teacherId);

    int insert(Teacher record);   // 教师信息插入

    int insertSelective(Teacher record);   // 教师信息修改

    Teacher selectByPrimaryKey(String teacherId);  // 查询教师信息

    int updateByPrimaryKeySelective(Teacher record);  // 教师信息修改

    int updateByPrimaryKey(Teacher record);
}