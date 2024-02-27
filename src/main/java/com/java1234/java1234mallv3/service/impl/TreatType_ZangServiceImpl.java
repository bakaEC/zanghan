package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.TreatType;
import com.java1234.java1234mallv3.entity.TreatType_Zang;
import com.java1234.java1234mallv3.mapper.TreatTypeMapper;
import com.java1234.java1234mallv3.mapper.TreatType_ZangMapper;
import com.java1234.java1234mallv3.service.TreatTypeService;
import com.java1234.java1234mallv3.service.TreatType_ZangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TreatType_ZangService")
public class TreatType_ZangServiceImpl extends ServiceImpl<TreatType_ZangMapper, TreatType_Zang> implements TreatType_ZangService {

     @Autowired
    private TreatType_ZangMapper treatType_ZangMapper;
}
