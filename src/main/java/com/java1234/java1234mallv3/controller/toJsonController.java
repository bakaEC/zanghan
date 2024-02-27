package com.java1234.java1234mallv3.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java1234.java1234mallv3.entity.R;
import com.java1234.java1234mallv3.entity.SSTreatType;
import com.java1234.java1234mallv3.entity.STreatType;
import com.java1234.java1234mallv3.entity.TreatItem;
import com.java1234.java1234mallv3.service.*;
import com.java1234.java1234mallv3.util.ToJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ToJson")
public class toJsonController {

    @Autowired
    private TreatTypeService treatTypeService;

    @Autowired
    private STreatTypeService sTreatTypeService;

    @Autowired
    private SSTreatTypeService ssTreatTypeService;

    @Autowired
    private illListService illListService;

    @Autowired
    private TreatItemService treatItemService;

    // 获取所有疾病信息

    @GetMapping("/findillList")
    public void findillList(){
        ToJson.setToJson();
    }
}
