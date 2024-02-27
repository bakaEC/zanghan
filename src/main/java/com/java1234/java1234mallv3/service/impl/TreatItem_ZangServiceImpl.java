package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.TreatItem_Zang;
import com.java1234.java1234mallv3.mapper.TreatItemMapper;
import com.java1234.java1234mallv3.mapper.TreatItem_ZangMapper;
import com.java1234.java1234mallv3.service.TreatItem_ZangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TreatItem_ZangService")
public class TreatItem_ZangServiceImpl extends ServiceImpl<TreatItem_ZangMapper, TreatItem_Zang> implements TreatItem_ZangService {

     @Autowired
    private TreatItem_ZangMapper treatItem_ZangMapper;
}
