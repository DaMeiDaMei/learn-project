package com.chinalife.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务处理Service A
 *
 * @author tianyu
 * @version 1.0.0
 * @Date 2022-11-15 23:35:00
 */
@Service
public class BizServiceA {
    @Autowired
    private BizServiceB bizServiceB;


    public String create(String arg) {
        String strFromB = bizServiceB.create(arg);
        return strFromB != null ? strFromB : "BizServiceA";
    }
}
