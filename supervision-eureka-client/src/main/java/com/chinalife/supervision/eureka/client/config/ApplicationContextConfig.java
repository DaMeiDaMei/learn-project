package com.chinalife.supervision.eureka.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ApplicationContextConfig {
    /**
     * 服务间的调用，我们使用了RestTemplate，RestTemplate提供了多种便捷访问远程Http服务的方法，
     * 是一种简单便捷的访问restful服务的模板类，是spring提供的用于访问Rest服务的客户端模板工具集。
     *
     * LoadBalanced 给restTemplate开启负载均衡，默认是轮循。只需要在restTemplate配置类中加上@LoadBalanced这个注解
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
