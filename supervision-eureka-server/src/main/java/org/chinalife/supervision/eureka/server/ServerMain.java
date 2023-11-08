package org.chinalife.supervision.eureka.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring boot 启动类
 * EnableEurekaClient注解，作用：用于把server作为生产者，注册到eureka注册中心
 *
 * EnableDiscoveryClient和EnableEurekaClient共同点就是：都是能够让注册中心能够发现，扫描到改服务。
 * 区别是：EnableEurekaClient只适用于Eureka作为注册中心，EnableDiscoveryClient 可以是其他注册中心
 */
//@EnableEurekaClient
@RestController
@EnableDiscoveryClient
@SpringBootApplication
@EnableAdminServer
public class ServerMain {

    public static void main(String[] args) {
        SpringApplication.run(ServerMain.class,args);

    }
    
}

