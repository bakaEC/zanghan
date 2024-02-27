package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.ShealthType;
import com.java1234.java1234mallv3.mapper.ShealthTypeMapper;
import com.java1234.java1234mallv3.service.ShealthTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("shealthTypeService")
public class ShealthTypeServiceImpl extends ServiceImpl<ShealthTypeMapper, ShealthType> implements ShealthTypeService {

     @Autowired
    private ShealthTypeMapper shealthTypeMapper;
}
