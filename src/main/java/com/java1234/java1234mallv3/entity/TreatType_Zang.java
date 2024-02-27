package com.java1234.java1234mallv3.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@TableName("TreatType_Zang")
@Data
public class TreatType_Zang {
    private Integer id;//  编号

    private String  Zang_title;     // 藏文title

    private String  Zang_descrip;    // 藏文描述

    @TableField(select = false)
    private List<STreatType_Zang> STreatTypeList_Zang; //二级分类集合
}
