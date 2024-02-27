package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.HealthItem_Zang;
import com.java1234.java1234mallv3.mapper.HealthItem_ZangMapper;
import com.java1234.java1234mallv3.service.HealthItem_ZangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("healthItem_ZangService")
public class HealthItem_ZangServiceImpl extends ServiceImpl<HealthItem_ZangMapper, HealthItem_Zang> implements HealthItem_ZangService {

     @Autowired
    private HealthItem_ZangMapper healthItem_ZangMapper;
}
