package com.java1234.java1234mallv3.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java1234.java1234mallv3.entity.*;
import com.java1234.java1234mallv3.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/PreventType_Zang")

public class PreventList_ZangController {


    @Autowired
    private PreventType_ZangService preventType_ZangService;

    @Autowired
    private SPreventType_ZangService spreventType_ZangService;

    @Autowired
    private PreventItem_ZangService preventItem_ZangService;

    // 查询商品大类
    @GetMapping("/findPreventList")
    public R findillList() {
        List<PreventType_Zang> preventTypes_ZangList = preventType_ZangService.list();
        Map<String, Object> map = new HashMap<>();
        map.put("message", preventTypes_ZangList);
        return R.ok(map);
    }

    // 获取所有菜单信息
    @GetMapping("/findCategories")
    public R findCategories() {
        List<PreventType_Zang> preventTypes_ZangList = preventType_ZangService.list();
        for (PreventType_Zang preventType_Zang : preventTypes_ZangList) {
            List<PreventItem_Zang> preventItem_ZangList = preventItem_ZangService.list(new QueryWrapper<PreventItem_Zang>().eq("bigTypeId",preventType_Zang.getId()));
//            List<SPreventType_Zang> spreventType_ZangList = spreventType_ZangService.list(new QueryWrapper<SPreventType_Zang>().eq("bigTypeId ", preventType_Zang.getId()));
            preventType_Zang.setPreventItem_ZangList(preventItem_ZangList);

//            for (SPreventType_Zang spreventType_Zang : spreventType_ZangList) {
//                List<PreventItem_Zang> preventItem_ZangList = preventItem_ZangService.list(new QueryWrapper<PreventItem_Zang>().eq("secondTypeId", spreventType_Zang.getId()));
//                spreventType_Zang.setPreventItem_ZangList(preventItem_ZangList);
//            }
        }
        Map<String, Object> map = new HashMap<>();
        map.put("message", preventTypes_ZangList);
        return R.ok(map);
    }

    //    根据id查询详情信息
    @GetMapping("/getDetail")
    public R detail(Integer id) {
        PreventItem_Zang preventItem_Zang = preventItem_ZangService.getById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("message", preventItem_Zang);
        return R.ok(map);
    }
    @GetMapping("/search")
    public R search(String q){
        List<PreventItem_Zang> preventItem_ZangList = preventItem_ZangService.list(new QueryWrapper<PreventItem_Zang>().like("Zang_title",q));
        Map<String,Object> map = new HashMap<>();
        map.put("message",preventItem_ZangList);
        return R.ok(map);
    }

}


