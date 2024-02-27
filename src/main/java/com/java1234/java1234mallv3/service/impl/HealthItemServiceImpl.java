package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.HealthItem;
import com.java1234.java1234mallv3.mapper.HealthItemMapper;
import com.java1234.java1234mallv3.service.HealthItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("healthItemService")
public class HealthItemServiceImpl extends ServiceImpl<HealthItemMapper, HealthItem> implements HealthItemService {

     @Autowired
    private HealthItemMapper healthItemMapper;
}
