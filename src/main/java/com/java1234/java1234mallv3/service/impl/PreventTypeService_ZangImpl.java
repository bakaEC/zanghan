package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.PreventType;
import com.java1234.java1234mallv3.entity.PreventType_Zang;
import com.java1234.java1234mallv3.mapper.PreventTypeMapper;
import com.java1234.java1234mallv3.mapper.PreventType_ZangMapper;
import com.java1234.java1234mallv3.service.PreventTypeService;
import com.java1234.java1234mallv3.service.PreventType_ZangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PreventType_ZangService")
public class PreventTypeService_ZangImpl extends ServiceImpl<PreventType_ZangMapper, PreventType_Zang> implements PreventType_ZangService {

     @Autowired
    private PreventType_ZangMapper preventType_ZangMapper;
}
