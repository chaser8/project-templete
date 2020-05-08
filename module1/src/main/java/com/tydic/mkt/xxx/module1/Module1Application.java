package com.tydic.mkt.xxx.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: sale-center
 * @description:
 * @author: zjy
 * @create: 2019-05-07 16:03
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Module1Application {
    public static void main(String[] args) {
        SpringApplication.run(Module1Application.class, args);
    }
}