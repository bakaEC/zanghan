package com.java1234.java1234mallv3.controller;


import com.java1234.java1234mallv3.entity.R;
import com.java1234.java1234mallv3.entity.illList;
import com.java1234.java1234mallv3.service.illListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/illList")

public class illListController {


    @Autowired
    private illListService illListService;

    // 查询疾病大类
    @GetMapping("/findillList")
    public R findillList() {
        List<illList> illListList = illListService.list();
        Map<String,Object> map = new HashMap<>();
        map.put("message",illListList);
        return R.ok(map);
    }


}


