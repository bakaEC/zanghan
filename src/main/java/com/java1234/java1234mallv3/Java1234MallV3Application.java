package com.java1234.java1234mallv3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java1234.java1234mallv3.entity.R;
import com.java1234.java1234mallv3.entity.STreatType;
import com.java1234.java1234mallv3.test.illToJson;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.java1234.java1234mallv3")
@MapperScan("com.java1234.java1234mallv3.mapper")
public class Java1234MallV3Application {

    public static void main(String[] args) {
        SpringApplication.run(Java1234MallV3Application.class, args);


    }

}
