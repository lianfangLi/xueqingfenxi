package com.example.lianfang.mapper;

import com.example.lianfang.entity.WorkAttending;
import com.example.lianfang.entity.WorkAttendingKey;

public interface WorkAttendingMapper {
    int deleteByPrimaryKey(WorkAttendingKey key);

    int insert(WorkAttending record);

    int insertSelective(WorkAttending record);

    WorkAttending selectByPrimaryKey(WorkAttendingKey key);

    int updateByPrimaryKeySelective(WorkAttending record);

    int updateByPrimaryKey(WorkAttending record);
}