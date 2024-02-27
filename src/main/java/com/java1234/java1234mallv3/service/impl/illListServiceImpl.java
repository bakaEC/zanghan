package com.java1234.java1234mallv3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java1234.java1234mallv3.entity.illList;
import com.java1234.java1234mallv3.mapper.illListMapper;
import com.java1234.java1234mallv3.service.illListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("illListService")
public class illListServiceImpl extends ServiceImpl<illListMapper, illList> implements illListService {

     @Autowired
    private illListMapper illListtMapper;
}
