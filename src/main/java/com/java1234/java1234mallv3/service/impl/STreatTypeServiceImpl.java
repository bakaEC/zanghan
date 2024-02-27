package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.STreatType;
import com.java1234.java1234mallv3.mapper.STreatTypeMapper;
import com.java1234.java1234mallv3.service.STreatTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sTreatTypeService")
public class STreatTypeServiceImpl extends ServiceImpl<STreatTypeMapper, STreatType> implements STreatTypeService {

     @Autowired
    private STreatTypeMapper sTreatTypeMapper;
}
