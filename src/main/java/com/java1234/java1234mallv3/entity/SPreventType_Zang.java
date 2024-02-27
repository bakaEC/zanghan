package com.java1234.java1234mallv3.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@TableName("SPreventType_Zang")
@Data
public class SPreventType_Zang implements Serializable {

    private Integer id;//  编号

    private Integer bigTypeId; //  所属一级分类标题id

    private String bigTypename;  // 所属一级分类标题

    private String  Zang_title;     // 藏文title

    private String  Zang_descrip;    // 藏文描述

    private String image;   //图片路径

    @TableField(select = false)
    private List<PreventItem_Zang> PreventItem_ZangList;// item集合

}
