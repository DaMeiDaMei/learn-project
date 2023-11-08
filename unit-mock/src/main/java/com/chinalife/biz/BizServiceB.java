package com.chinalife.biz;

import org.springframework.stereotype.Service;

/**
 * 业务处理Service B
 *
 * @author tianyu
 * @version 1.0.0
 * @Date 2022-11-15 23:36:00
 */
@Service
public class BizServiceB {
    public String create(String arg) {
        return "B".equals(arg) ? "BizServiceB" : null;
    }
}
