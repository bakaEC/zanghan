package com.java1234.java1234mallv3.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("TreatItem_Zang")
@Data
public class TreatItem_Zang {

    private Integer id;//  编号

    private Integer thirdTypeId; //  所属三级分类标题id

    private String thirdTypename;  // 所属三级分类标题

    private String  Zang_title;    // 藏文标题

    private String  Zang_descrip;    // 藏文描述

    private String Zang_etiology; //病因

    private String Zang_feature; //临床表现

    private String Zang_treat; //治疗

    private String Zang_prevent; //预防

    private String Zang_control; //防治

    private String Zang_cate; //种类

    private String image;   //图片路径


}
