package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.SPreventType;
import com.java1234.java1234mallv3.mapper.SPreventTypeMapper;
import com.java1234.java1234mallv3.service.SPreventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sPreventTypeService")
public class SPreventTypeServiceImpl extends ServiceImpl<SPreventTypeMapper, SPreventType> implements SPreventTypeService {

     @Autowired
    private SPreventTypeMapper sPreventTypeMapper;
}
