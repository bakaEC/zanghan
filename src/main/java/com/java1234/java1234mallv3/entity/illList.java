package com.java1234.java1234mallv3.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 *
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-11-22 22:13
 */
@TableName("illList")
@Data
public class illList {

    private Integer id; // 编号

    private String name; // 名称

    private String remark; // 描述

    private String Zang_title; //藏文名称

//    @TableField(exist = false)
    private String image ; // 图片


}
