package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.STreatType_Zang;
import com.java1234.java1234mallv3.mapper.STreatTypeMapper;
import com.java1234.java1234mallv3.mapper.STreatType_ZangMapper;
import com.java1234.java1234mallv3.service.STreatType_ZangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sTreatType_ZangService")
public class STreatType_ZangServiceImpl extends ServiceImpl<STreatType_ZangMapper, STreatType_Zang> implements STreatType_ZangService {

     @Autowired
    private STreatType_ZangMapper sTreatType_ZangMapper;
}
