package com.chinalife.supervision.eureka.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 因为是Eureka的服务端，所以要加该注解@EnableEurekaServer
 * 目前人寿这边已经起了公共的 Eureka服务，9.
 */
@RestController
@EnableEurekaServer
@SpringBootApplication
public class RegistryMain {
    public static void main(String[] args) {

        SpringApplication.run(RegistryMain.class, args);
    }

    @PostMapping("/haha")
    public void test(@RequestBody String param){
        System.out.println("haha");

    }

    @RequestMapping(value = "testMapping", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public void test2(@RequestBody String param){
        System.out.println(param);

    }
}
