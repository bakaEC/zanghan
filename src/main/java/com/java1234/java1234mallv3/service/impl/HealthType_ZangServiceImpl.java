package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.HealthType_Zang;
import com.java1234.java1234mallv3.mapper.HealthType_ZangMapper;
import com.java1234.java1234mallv3.service.HealthType_ZangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("HealthType_ZangService")
public class HealthType_ZangServiceImpl extends ServiceImpl<HealthType_ZangMapper, HealthType_Zang> implements HealthType_ZangService {
    @Autowired
    private HealthType_ZangMapper healthType_ZangMapper;

}
