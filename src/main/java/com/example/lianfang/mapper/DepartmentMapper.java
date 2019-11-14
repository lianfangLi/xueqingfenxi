package com.example.lianfang.mapper;

import com.example.lianfang.entity.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(String dpId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(String dpId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}