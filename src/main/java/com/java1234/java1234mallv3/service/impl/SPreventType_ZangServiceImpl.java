package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.SPreventType;
import com.java1234.java1234mallv3.entity.SPreventType_Zang;
import com.java1234.java1234mallv3.mapper.SPreventTypeMapper;
import com.java1234.java1234mallv3.mapper.SPreventType_ZangMapper;
import com.java1234.java1234mallv3.service.SPreventTypeService;
import com.java1234.java1234mallv3.service.SPreventType_ZangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sPreventType_ZangService")
public class SPreventType_ZangServiceImpl extends ServiceImpl<SPreventType_ZangMapper, SPreventType_Zang> implements SPreventType_ZangService {

     @Autowired
    private SPreventType_ZangMapper sPreventType_ZangMapper;
}
