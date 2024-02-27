package com.java1234.java1234mallv3.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@TableName("healthType_Zang")
@Data
public class HealthType_Zang {
    private Integer id;//  编号

    private String Zang_title;// 名称

    private String Zang_descrip; // 描述

    @TableField(select = false)
    private List<HealthItem_Zang> healthItem_ZangList; //二级分类集合
}
