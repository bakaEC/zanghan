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
@RequestMapping("/HealthType_Zang")
public class HealthList_ZangController {
    @Autowired
    private HealthType_ZangService healthType_ZangService;
    @Autowired
    private HealthItem_ZangService healthItem_ZangService;


    // 查询健康大类
    @GetMapping("/findhealthList")
    public R findillList() {

        List<HealthType_Zang> healthTypes_ZangList = healthType_ZangService.list();
        Map<String, Object> map = new HashMap<>();
        map.put("message", healthTypes_ZangList);
        return R.ok(map);
    }

    // 获取所有菜单信息
    @GetMapping("/findCategories")
    public R findCategories() {
        List<HealthType_Zang> healthTypes_ZangList = healthType_ZangService.list();
        for (HealthType_Zang healthType_Zang : healthTypes_ZangList) {
            List<HealthItem_Zang> healthItem_ZangList = healthItem_ZangService.list(new QueryWrapper<HealthItem_Zang>().eq("bigTypeId",healthType_Zang.getId()));
            healthType_Zang.setHealthItem_ZangList(healthItem_ZangList);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("message", healthTypes_ZangList);
        return R.ok(map);
    }


    //    根据id查询详情信息
    @GetMapping("/getDetail")
    public R detail(Integer id) {
        HealthItem_Zang healthItem_Zang = healthItem_ZangService.getById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("message", healthItem_Zang);
        return R.ok(map);
    }


    @GetMapping("/search")
    public R search(String q){
        List<HealthItem_Zang> healthItem_ZangList = healthItem_ZangService.list(new QueryWrapper<HealthItem_Zang>().like("Zang_title",q));
        Map<String, Object> map = new HashMap<>();
        map.put("message", healthItem_ZangList);
        return R.ok(map);
    }

}
