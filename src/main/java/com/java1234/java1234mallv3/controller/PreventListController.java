package com.java1234.java1234mallv3.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java1234.java1234mallv3.entity.*;
import com.java1234.java1234mallv3.service.PreventItemService;
import com.java1234.java1234mallv3.service.PreventTypeService;
import com.java1234.java1234mallv3.service.SPreventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/PreventType")

public class PreventListController {


    @Autowired
    private PreventTypeService preventTypeService;

    @Autowired
    private SPreventTypeService spreventTypeService;

    @Autowired
    private PreventItemService preventItemService;

    // 查询商品大类
    @GetMapping("/findPreventList")
    public R findillList() {
        List<PreventType> preventTypesList = preventTypeService.list();
        Map<String, Object> map = new HashMap<>();
        map.put("message", preventTypesList);
        return R.ok(map);
    }

    // 获取所有菜单信息
    @GetMapping("/findCategories")
    public R findCategories() {
        List<PreventType> preventTypesList = preventTypeService.list();
        for (PreventType preventType : preventTypesList) {
            List<SPreventType> spreventTypeList = spreventTypeService.list(new QueryWrapper<SPreventType>().eq("bigTypeId ", preventType.getId()));
            preventType.setSPreventTypeList(spreventTypeList);

            for (SPreventType spreventType : spreventTypeList) {
                List<PreventItem> preventItemList = preventItemService.list(new QueryWrapper<PreventItem>().eq("secondTypeId", spreventType.getId()));
                spreventType.setPreventItemList(preventItemList);
            }
        }
        Map<String, Object> map = new HashMap<>();
        map.put("message", preventTypesList);
        return R.ok(map);
    }

    //    根据id查询详情信息
    @GetMapping("/getDetail")
    public R detail(Integer id) {
        PreventItem preventItem = preventItemService.getById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("message", preventItem);
        return R.ok(map);
    }
    @GetMapping("/search")
    public R search(String q){
        List<PreventItem> preventItemList = preventItemService.list(new QueryWrapper<PreventItem>().like("title",q));
        Map<String,Object> map = new HashMap<>();
        map.put("message",preventItemList);
        return R.ok(map);
    }

}


