package com.chinalife.supervision.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *EnableFeignClients 用于开启OpenFeign 方式调用服务
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ClientMain {
    public static void main(String[] args) {
        SpringApplication.run(ClientMain.class,args);
    }
}
