package com.java1234.java1234mallv3.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@TableName("shealthType")
@Data
public class ShealthType implements Serializable {

    private Integer id;//  编号

    private String title;// 名称

    private String descrip; // 描述

    private Integer bigTypeId; //  所属一级分类标题id

    private String bigTypename;  // 所属一级分类标题

    private String  Zang_title;     // 藏文title

    private String  Zang_descrip;    // 藏文描述

    private String image;   //图片路径

    @TableField(select = false)
    private List<HealthItem> healthItemList;// item集合

}
