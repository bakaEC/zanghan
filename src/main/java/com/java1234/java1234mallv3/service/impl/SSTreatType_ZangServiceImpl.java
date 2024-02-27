package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.SSTreatType_Zang;
import com.java1234.java1234mallv3.mapper.SSTreatTypeMapper;
import com.java1234.java1234mallv3.mapper.SSTreatType_ZangMapper;
import com.java1234.java1234mallv3.service.SSTreatType_ZangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SSTreatType_ZangService")
public class SSTreatType_ZangServiceImpl extends ServiceImpl<SSTreatType_ZangMapper, SSTreatType_Zang> implements SSTreatType_ZangService {

     @Autowired
    private SSTreatType_ZangMapper ssTreatType_ZangMapper;
}
