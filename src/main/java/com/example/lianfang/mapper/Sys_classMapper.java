package com.example.lianfang.mapper;

import com.example.lianfang.entity.Sys_class;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Sys_classMapper {
    List<Sys_class> getAllClass();

}
