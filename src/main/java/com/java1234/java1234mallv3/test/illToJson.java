package com.java1234.java1234mallv3.test;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java1234.java1234mallv3.entity.SSTreatType;
import com.java1234.java1234mallv3.entity.STreatType;
import com.java1234.java1234mallv3.entity.TreatItem;
import com.java1234.java1234mallv3.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class illToJson {

    @Autowired
    private STreatTypeService sTreatTypeService;

    @Autowired
    private SSTreatTypeService ssTreatTypeService;


    @Autowired
    private TreatItemService treatItemService;

    public void getTreatItem(String filePath){
        // 声明一个列表用于存放第二级目录
        List<STreatType> sTreatTypeList = sTreatTypeService.list();
        // 遍历二级目录中每一个项，根据大类id查询出该类id下的子类
        for(STreatType sTreatType:sTreatTypeList){
            List<SSTreatType> ssTreatTypeList = ssTreatTypeService.list(new QueryWrapper<SSTreatType>().eq("secondTypeId",sTreatType.getId()));
            sTreatType.setSSTreatTypeList(ssTreatTypeList);
            for (SSTreatType ssTreatType:ssTreatTypeList){
                List<TreatItem> treatItemList = treatItemService.list(new QueryWrapper<TreatItem>().eq("thirdTypeId",ssTreatType.getId()));
                ssTreatType.setTreatItemList(treatItemList);
            }
        }

        ObjectMapper objectMapper = new ObjectMapper();
        String json;
        try {
            json = objectMapper.writeValueAsString(sTreatTypeList);
        } catch (JsonProcessingException e) {
            System.out.println("Error converting to JSON");
            return;
        }
        try(FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(json);
        } catch (IOException e){
            System.out.println("Error saving JSON to file");
        };
    }

}
