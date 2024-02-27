package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.PreventItem;
import com.java1234.java1234mallv3.mapper.PreventItemMapper;
import com.java1234.java1234mallv3.service.PreventItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PreventItemService")
public class PreventItemServiceImpl extends ServiceImpl<PreventItemMapper, PreventItem> implements PreventItemService {

     @Autowired
    private PreventItemMapper preventItemMapper;
}
