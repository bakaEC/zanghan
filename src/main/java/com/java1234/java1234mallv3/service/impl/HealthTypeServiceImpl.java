package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.HealthType;
import com.java1234.java1234mallv3.mapper.HealthTypeMapper;
import com.java1234.java1234mallv3.service.HealthTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("HealthTypeService")
public class HealthTypeServiceImpl extends ServiceImpl<HealthTypeMapper, HealthType> implements HealthTypeService {

     @Autowired
    private HealthTypeMapper healthTypeMapper;
}
