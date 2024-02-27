package com.java1234.java1234mallv3.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java1234.java1234mallv3.entity.*;
import com.java1234.java1234mallv3.service.HealthItemService;
import com.java1234.java1234mallv3.service.HealthTypeService;
import com.java1234.java1234mallv3.service.PreventItemService;
import com.java1234.java1234mallv3.service.ShealthTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/HealthType")

public class HealthListController {


    @Autowired
    private HealthTypeService healthTypeService;

    @Autowired
    private ShealthTypeService shealthTypeService;

    @Autowired
    private HealthItemService healthItemService;

    // 查询商品大类
    @GetMapping("/findhealthList")
    public R findillList() {
        List<HealthType> healthTypesList = healthTypeService.list();
        Map<String, Object> map = new HashMap<>();
        map.put("message", healthTypesList);
        return R.ok(map);
    }

    // 获取所有菜单信息
    @GetMapping("/findCategories")
    public R findCategories() {
        List<HealthType> healthTypesList = healthTypeService.list();
        for (HealthType healthType : healthTypesList) {
            List<ShealthType> shealthTypeList = shealthTypeService.list(new QueryWrapper<ShealthType>().eq("bigTypeId ", healthType.getId()));
            healthType.setShealthTypeList(shealthTypeList);

            for (ShealthType shealthType : shealthTypeList) {
                List<HealthItem> healthItemList = healthItemService.list(new QueryWrapper<HealthItem>().eq("secondTypeId", shealthType.getId()));
                shealthType.setHealthItemList(healthItemList);
            }
        }
        Map<String, Object> map = new HashMap<>();
        map.put("message", healthTypesList);
        return R.ok(map);
    }

    //    根据id查询详情信息
    @GetMapping("/getDetail")
    public R detail(Integer id) {
        HealthItem healthItem = healthItemService.getById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("message", healthItem);
        return R.ok(map);
    }

    @GetMapping("/search")
    public R search(String q){
        List<HealthItem> healthItemList = healthItemService.list(new QueryWrapper<HealthItem>().like("title",q));
        Map<String, Object> map = new HashMap<>();
        map.put("message", healthItemList);
        return R.ok(map);
    }

}


