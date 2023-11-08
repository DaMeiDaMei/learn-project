package com.chinalife.springboot.jpa;


import com.chinalife.springboot.jpa.dao.EmployeeDAO;
import com.chinalife.springboot.jpa.eo.EmployeeEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@SpringBootApplication
public class JpaMain {

    public static void main(String[] args) {
        SpringApplication.run(JpaMain.class,args);
    }

    @Autowired
    private EmployeeDAO employeeDAO;

    /**
     * 顺便在这里写个简单的测试吧
     */
    @GetMapping("/hibernate/dm/query")
    public String getPayment(@RequestParam(name="args", required = false)String param){

        Optional<EmployeeEO> data = employeeDAO.findById(1);
        return data.map(employeeEO -> "hibernate+dm,response:" + employeeEO.getTitle()).orElse(null);
    }


}
