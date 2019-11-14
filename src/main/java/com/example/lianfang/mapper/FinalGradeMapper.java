package com.example.lianfang.mapper;

import com.example.lianfang.entity.FinalGrade;
import com.example.lianfang.entity.FinalGradeKey;

public interface FinalGradeMapper {
    int deleteByPrimaryKey(FinalGradeKey key);

    int insert(FinalGrade record);

    int insertSelective(FinalGrade record);

    FinalGrade selectByPrimaryKey(FinalGradeKey key);

    int updateByPrimaryKeySelective(FinalGrade record);

    int updateByPrimaryKey(FinalGrade record);
}