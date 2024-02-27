package com.java1234.java1234mallv3.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("PreventItem")
@Data
public class PreventItem {

    private Integer id;//  编号

    private String title;// 名称

    private String descrip; // 描述

    private Integer secondTypeId; //  所属二级分类标题id

    private String secondTypename;  // 所属二级分类标题

    private String  Zang_title;     // 藏文title

    private String  Zang_descrip;    // 藏文描述

    private String  Zang_secondTypename;    // 二级分类标题-藏文

    private String image;   //图片路径


}
