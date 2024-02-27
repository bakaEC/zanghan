package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.SSTreatType;
import com.java1234.java1234mallv3.mapper.SSTreatTypeMapper;
import com.java1234.java1234mallv3.service.SSTreatTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SSTreatTypeService")
public class SSTreatTypeServiceImpl extends ServiceImpl<SSTreatTypeMapper, SSTreatType> implements SSTreatTypeService {

     @Autowired
    private SSTreatTypeMapper ssTreatTypeMapper;
}
