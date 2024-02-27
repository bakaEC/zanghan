package com.java1234.java1234mallv3.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@TableName("TreatType")
@Data
public class TreatType {
    private Integer id;//  编号

    private String title;// 名称

    private String descrip; // 描述

//    private String  Zang_title;     // 藏文title

//    private String  Zang_descrip;    // 藏文描述

    @TableField(select = false)
    private List<STreatType> STreatTypeList; //二级分类集合
}
