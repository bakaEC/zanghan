package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.TreatType;
import com.java1234.java1234mallv3.mapper.TreatTypeMapper;
import com.java1234.java1234mallv3.service.TreatTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TreatTypeService")
public class TreatTypeServiceImpl extends ServiceImpl<TreatTypeMapper, TreatType> implements TreatTypeService {

     @Autowired
    private TreatTypeMapper treatTypeMapper;
}
