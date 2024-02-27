package com.java1234.java1234mallv3.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java1234.java1234mallv3.entity.R;
import com.java1234.java1234mallv3.entity.SSTreatType;
import com.java1234.java1234mallv3.entity.STreatType;
import com.java1234.java1234mallv3.entity.TreatItem;
import com.java1234.java1234mallv3.service.SSTreatTypeService;
import com.java1234.java1234mallv3.service.STreatTypeService;
import com.java1234.java1234mallv3.service.TreatItemService;
import com.java1234.java1234mallv3.service.illListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
@Component
public class ToJson {
    private static STreatTypeService sTreatTypeService;
    private static SSTreatTypeService ssTreatTypeService;

    private static TreatItemService treatItemService;

    @Autowired
    public ToJson(STreatTypeService sTreatTypeService, SSTreatTypeService ssTreatTypeService, TreatItemService treatItemService){
        ToJson.sTreatTypeService = sTreatTypeService;
        ToJson.ssTreatTypeService = ssTreatTypeService;
        ToJson.treatItemService = treatItemService;
    }

    public static R findillList(){
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
        HashMap<String, Object> map = new HashMap<>();
        map.put("message",sTreatTypeList);
        return R.ok(map);
    }

    @PostConstruct
    public static void setToJson(){
        //toJsonController controller = new toJsonController();
        R result = findillList();

        List<STreatType> sTreatTypeList = (List<STreatType>) result.get("message");
        ObjectMapper objectMapper = new ObjectMapper();
        String json;
        try {
            json = objectMapper.writeValueAsString(sTreatTypeList);
        } catch (
                JsonProcessingException e) {
            System.out.println("Error converting to JSON");
            return;
        }
        try{
            FileWriter fileWriter = new FileWriter("/Users/lan/Java/java1234-mall-v3/src/main/java/com/java1234/java1234mallv3/JsonData/1.txt");
            fileWriter.write(json);
            fileWriter.close();
            System.out.println("JSON saved to file successfully");
        } catch (IOException e){
            System.out.println("Error saving JSON to file");
        };
    }

}
