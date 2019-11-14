package com.example.lianfang.service;

import com.example.lianfang.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(String id);
    Integer insertRecord(User user);
    Integer updateRecord(User user);
    Integer deleteRecord(String id);
    User login(User user);
}
