package com.chinalife.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务Controller
 * @author tianyu
 * @version 1.0.0
 * @Date 2022-11-15 23:34:00
 */
@RestController
public class BizController {

    @Autowired
    private BizServiceA bizServiceA;
    @GetMapping("/create")
    public String create(@RequestParam(name = "arg",required = false) String arg){
        return bizServiceA.create(arg);
    }
}
