package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.PreventType;
import com.java1234.java1234mallv3.mapper.PreventTypeMapper;
import com.java1234.java1234mallv3.service.PreventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PreventTypeService")
public class PreventTypeServiceImpl extends ServiceImpl<PreventTypeMapper, PreventType> implements PreventTypeService {

     @Autowired
    private PreventTypeMapper preventTypeMapper;
}
