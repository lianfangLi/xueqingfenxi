package com.example.lianfang.mapper;
import com.example.lianfang.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.*;

@Mapper
public interface UserMapper {

    List<User> getAll();
    User getById(String id);
    Integer insertRecord(User user);
    Integer updateRecord(User user);
    Integer deleteRecord(String id);
    User login(User user);

}
