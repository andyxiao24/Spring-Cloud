package com.zzp.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * Created by zhuzhengping on 2017/3/31.
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScans({
        @ComponentScan("com.zzp.common.aspect"),
        @ComponentScan("com.zzp.user")
})
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}