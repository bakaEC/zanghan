package com.java1234.java1234mallv3.controller;


import com.java1234.java1234mallv3.entity.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/java1234")
public class TestController {
    @GetMapping("/test")
    public R test(){
        return R.ok("输出信息············");
    }

}
