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
@RequestMapping("/TreatType")

public class TreatListController {


    @Autowired
    private TreatTypeService treatTypeService;

    @Autowired
    private STreatTypeService streatTypeService;

    @Autowired
    private SSTreatTypeService sstreatTypeService;

    @Autowired
    private TreatItemService treatItemService;

    @Autowired
    private illListService illListService;

    // 查询商品大类
//    @GetMapping("/findTreatList")
//    public R findillList() {
//        List<TreatType> treatTypesList = treatTypeService.list();
//        Map<String, Object> map = new HashMap<>();
//        map.put("message", treatTypesList);
//        return R.ok(map);
//    }

    // 查询疾病大类
    @GetMapping("/findillList")
    public R findillList() {
        List<STreatType> sTreatTypesList = streatTypeService.list();
        Map<String,Object> map = new HashMap<>();
        map.put("message",sTreatTypesList);
        return R.ok(map);
    }


    // 获取所有菜单信息
    @GetMapping("/findCategories")
    public R findCategories() {

        List<STreatType> streatTypeList = streatTypeService.list();
        for (STreatType streatType : streatTypeList) {
            List<SSTreatType> sstreatTypeList = sstreatTypeService.list(new QueryWrapper<SSTreatType>().eq("secondTypeId", streatType.getId()));
            streatType.setSSTreatTypeList(sstreatTypeList);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("message", streatTypeList);
        return R.ok(map);

    }

    //    根据id查询详情信息
    @GetMapping("/getDetail")
    public R detail(Integer id) {
        TreatItem treatItem = treatItemService.getById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("message", treatItem);
        return R.ok(map);
    }

    @GetMapping("/search")
    public R search(String q){
        List<TreatItem> treatItemList = treatItemService.list(new QueryWrapper<TreatItem>().like("thirdTypename",q));
        Map<String,Object> map =new HashMap<>();
        map.put("message",treatItemList);
        return R.ok(map);
    }

}


