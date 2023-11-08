package com.chinalife.supervision.eureka.client;

import com.chinalife.supervision.eureka.client.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者的业务调用接口
 * 在这里调用supervision-eureka-client模块，提供的server。ServerController
 */
@RestController
public class ClientController {

    //生产者集群模式部署，通过其生产服务名称，来调用
    public static final  String PAYMENT_URL = "http://SUPERVISION-EUREKA-SERVER/eurekaServer/test";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PaymentFeignService paymentFeignService;

    //获取id获取支付订单
    @GetMapping("/client/requestFromServer")
    public String getPayment(@RequestParam(name="args", required = false)String param){
        return "i request from eureka server,response:"+restTemplate.getForObject(PAYMENT_URL,String.class);
    }

    //获取id获取支付订单
    @GetMapping("/client/requestFromServer/byFeign")
    public String getPaymentWithFeign(@RequestParam(name="args", required = false)String param){
        return "i request from eureka server with feign client,response:"+paymentFeignService.eurekaServerTest("miao");
    }

}
