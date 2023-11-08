package com.chinalife.controller;

import com.chinalife.jpa.dao.PtmAgriInfoRepository;
import com.chinalife.jpa.entity.PtmAgriInfoEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

/**
 * @author tianyu
 * @version 1.0.0
 * @Date 2023-10-16 14:05:00
 */
@RestController
public class TestController {

    @Autowired
    private PtmAgriInfoRepository ptmAgriInfoRepository;

    /**
     * 顺便在这里写个简单的测试吧
     */
    @GetMapping("/hibernate/dm/query")
    public PtmAgriInfoEO getPayment(@RequestParam(name="businessNo", required = false)String businessNo){

        return  ptmAgriInfoRepository.findByBusinessNo(businessNo);
    }
    /**
     * 顺便在这里写个简单的测试吧
     */
    @GetMapping("/hibernate/dm/id")
    public PtmAgriInfoEO getId(@RequestParam(name="businessNo", required = false)String businessNo){

        return  ptmAgriInfoRepository.findByBusinessNo(businessNo);
    }

    /**
     * 顺便在这里写个简单的测试吧
     */
    @GetMapping("/hibernate/dm/update")
    public int update(@RequestParam(name="businessNo", required = false)String businessNo){

        PtmAgriInfoEO record = ptmAgriInfoRepository.findByBusinessNo(businessNo);
        if(record==null){
            return 0;
        }

        Date currDate = new Date();
        record.setErrorMessage(currDate.toString());

        PtmAgriInfoEO res = ptmAgriInfoRepository.save(record);
        return 1;
    }

}
