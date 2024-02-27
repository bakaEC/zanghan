package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.PreventItem_Zang;
import com.java1234.java1234mallv3.mapper.PreventItemMapper;
import com.java1234.java1234mallv3.mapper.PreventItem_ZangMapper;
import com.java1234.java1234mallv3.service.PreventItem_ZangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PreventItem_ZangService")
public class PreventItem_ZangServiceImpl extends ServiceImpl<PreventItem_ZangMapper, PreventItem_Zang> implements PreventItem_ZangService {

     @Autowired
    private PreventItem_ZangMapper preventItem_ZangMapper;
}
