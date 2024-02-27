package com.java1234.java1234mallv3.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("healthItem_Zang")
@Data
public class HealthItem_Zang {
    private Integer id;//  编号

    private Integer bigTypeId; //  所属大类标题id

    private String bigTypename;  // 所属大类标题

    private String  Zang_title;     // 藏文title

    private String  Zang_descrip;    // 藏文描述

    private String image;   //图片路径


}
