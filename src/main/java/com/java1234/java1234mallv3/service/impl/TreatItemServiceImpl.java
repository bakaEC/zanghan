package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.TreatItem;
import com.java1234.java1234mallv3.mapper.TreatItemMapper;
import com.java1234.java1234mallv3.service.TreatItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TreatItemService")
public class TreatItemServiceImpl extends ServiceImpl<TreatItemMapper, TreatItem> implements TreatItemService {

     @Autowired
    private TreatItemMapper treatItemMapper;
}
