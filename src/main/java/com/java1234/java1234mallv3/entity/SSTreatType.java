package com.java1234.java1234mallv3.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@TableName("SSTreatType")
@Data
public class SSTreatType implements Serializable {

    private Integer id;//  编号

    private String title;// 名称

    private Integer secondTypeId; //  所属二级分类标题id

    private String secondTypename;  // 所属二级分类标题

//    private String  Zang_title;     // 藏文title

    private String image;   //图片路径

    @TableField(select = false)
    private List<TreatItem> TreatItemList;// item集合

}
