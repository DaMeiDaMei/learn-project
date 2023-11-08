package org.chinalife.supervision.eureka.server.controller;


import org.chinalife.supervision.common.enums.CustomerTypeEum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Slf4j
public class ServerController {
//    @Autowired
//    private CustomerTypeEum paymentService;

    @GetMapping("/eurekaServer/test")
    public String create(@RequestParam(name = "arg",required = false) String test){

            return "hi "+test + CustomerTypeEum.values();
    }


}
