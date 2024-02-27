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
@RequestMapping("/TreatType_Zang")
public class TreatList_ZangController {

    @Autowired
    private TreatType_ZangService treatType_ZangService;

    @Autowired
    private STreatType_ZangService streatType_ZangService;

    @Autowired
    private SSTreatType_ZangService sstreatType_ZangService;

    @Autowired
    private TreatItem_ZangService treatItem_ZangService;

    // 查询商品大类
    @GetMapping("/findTreatList")
    public R findillList() {
        List<TreatType_Zang> treatTypes_ZangList = treatType_ZangService.list();
        Map<String, Object> map = new HashMap<>();
        map.put("message", treatTypes_ZangList);
        return R.ok(map);
    }

    // 获取所有菜单信息
    @GetMapping("/findCategories")
    public R findCategories() {
//        List<TreatType> treatTypesList = treatTypeService.list();
//        for (TreatType treatType:treatTypesList){
//            List<STreatType> streatTypeList = streatTypeService.list(new QueryWrapper<STreatType>().eq("bigTypeId ",treatType.getId()));
//            treatType.setSTreatTypeList(streatTypeList);
//
//            for (STreatType streatType:streatTypeList){
//                List<SSTreatType> sstreatTypeList = sstreatTypeService.list(new QueryWrapper<SSTreatType>().eq("secondTypeId",streatType.getId()));
//                streatType.setSSTreatTypeList(sstreatTypeList);
//
//                for (SSTreatType ssTreatType:sstreatTypeList){
//                    List<TreatItem> treatItemList = treatItemService.list(new QueryWrapper<TreatItem>().eq("thirdTypeId",ssTreatType.getId()));
//                    ssTreatType.setTreatItemList(treatItemList);
//                }
//
//            }
//        }
        List<STreatType_Zang> streatType_ZangList = streatType_ZangService.list();
        for (STreatType_Zang streatType_Zang : streatType_ZangList) {
            List<SSTreatType_Zang> sstreatType_ZangList = sstreatType_ZangService.list(new QueryWrapper<SSTreatType_Zang>().eq("secondTypeId", streatType_Zang.getId()));
            streatType_Zang.setSSTreatType_ZangList(sstreatType_ZangList);
//            for (SSTreatType ssTreatType : sstreatTypeList) {
//                List<TreatItem> treatItemList = treatItemService.list(new QueryWrapper<TreatItem>().eq("thirdTypeId", ssTreatType.getId()));
//                ssTreatType.setTreatItemList(treatItemList);
//            }

        }
        Map<String, Object> map = new HashMap<>();
        map.put("message", streatType_ZangList);
        return R.ok(map);

    }

    //    根据id查询详情信息
    @GetMapping("/getDetail")
    public R detail(Integer id) {
        TreatItem_Zang treatItem_Zang = treatItem_ZangService.getById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("message", treatItem_Zang);
        return R.ok(map);
    }

    @GetMapping("/search")
    public R search(String q){
        List<TreatItem_Zang> treatItem_ZangList = treatItem_ZangService.list(new QueryWrapper<TreatItem_Zang>().like("Zang_title",q));
        Map<String,Object> map =new HashMap<>();
        map.put("message",treatItem_ZangList);
        return R.ok(map);
    }

}
