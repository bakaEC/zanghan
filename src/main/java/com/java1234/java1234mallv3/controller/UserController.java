package com.java1234.java1234mallv3.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.java1234.java1234mallv3.constant.SystemConstant;
import com.java1234.java1234mallv3.entity.R;
import com.java1234.java1234mallv3.entity.WxUserInfo;
import com.java1234.java1234mallv3.properties.WeixinProperties;
import com.java1234.java1234mallv3.service.IWxUserInfoService;
import com.java1234.java1234mallv3.util.HttpClientUtil;
import com.java1234.java1234mallv3.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private WeixinProperties weixinProperties;

    @Autowired
    private HttpClientUtil httpClientUtil;

    @Autowired
    private IWxUserInfoService wxUserInfoService;

    @Value("${jscode2sessionUrl}")
    private String jscode2sessionUrl2;

    @Value("${appid}")
    private String appid;

    @Value("${secret}")
    private String secret;


    /**
     * 微信用户登录
     * @return
     */
    @RequestMapping("/wxlogin")
    public R wxLogin(@RequestBody HashMap wxUserInfoMap){
        WxUserInfo wxUserInfo = new WxUserInfo();
        wxUserInfo.setCode((String) wxUserInfoMap.get("code"));
        wxUserInfo.setAvatarUrl((String)wxUserInfoMap.get("avatarUrl"));
//        wxUserInfo.setCode((String) );

        System.out.println(wxUserInfo.getCode());
        String jscode2sessionUrl= jscode2sessionUrl2 +"?appid="+appid+"&secret="+secret+"&js_code="+wxUserInfo.getCode()+"&grant_type=authorization_code";
        System.out.println(jscode2sessionUrl);
        String result = httpClientUtil.sendHttpGet(jscode2sessionUrl);
        System.out.println(result);
        JSONObject jsonObject= JSON.parseObject(result);
        String openid = jsonObject.get("openid").toString();
        System.out.println(openid);
        // 插入用户到数据库  假如说 用户不存在 我们插入用户  如果用户存在 我们更新用户
        WxUserInfo resultWxUserInfo = wxUserInfoService.getOne(new QueryWrapper<WxUserInfo>().eq("openid", openid));
        if(resultWxUserInfo==null){
            System.out.println("不存在 插入用户");
            wxUserInfo.setOpenid(openid);
            wxUserInfo.setRegisterDate(new Date());
            wxUserInfo.setLastLoginDate(new Date());
            wxUserInfoService.save(wxUserInfo);
        }else{
            System.out.println("存在 更新用户");
//            resultWxUserInfo.setNickName(wxUserInfo.getNickName());
            resultWxUserInfo.setAvatarUrl(wxUserInfo.getAvatarUrl());
            resultWxUserInfo.setLastLoginDate(new Date());
            wxUserInfoService.updateById(resultWxUserInfo);
        }
        // 利用jwt生成token返回到前端
        String token = JwtUtils.createJWT(openid, (String)wxUserInfoMap.get("nickName"), SystemConstant.JWT_TTL);
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("token",token);
        return R.ok(resultMap);
    }
}



