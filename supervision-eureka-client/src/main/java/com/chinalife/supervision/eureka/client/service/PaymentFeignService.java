package com.chinalife.supervision.eureka.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务注册发现用，支持消费者，以OpenFeign方式去访问生产者
 * FeignClient.value = 生产者的名称
 */
@Component
@FeignClient(value = "SUPERVISION-EUREKA-SERVER")
public interface PaymentFeignService {

    @GetMapping(value = "/eurekaServer/test")  // 服务具体URL
    String eurekaServerTest(@RequestParam(name = "arg",required = false) String test );
}
