package com.example.lianfang.service.serviceImpl;

import com.example.lianfang.entity.Sys_class;
import com.example.lianfang.mapper.Sys_classMapper;
import com.example.lianfang.service.Sys_classService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Sys_classServiceImpl implements Sys_classService {
    @Autowired
    Sys_classMapper sys_classMapper;

    @Override
    public List<Sys_class> getAllClass() {
        return sys_classMapper.getAllClass();
    }
}
