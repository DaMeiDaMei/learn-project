package com.chinalife;

import com.chinalife.biz.BizServiceA;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * BizServiceA 的单元测试类
 */
@SpringBootTest
public class BizServiceSpringJunitTest {

    @Autowired
    private BizServiceA bizServiceA;

    @Test
    public void testCreate() {
        String str = bizServiceA.create("A");
        assertEquals("BizServiceA", str);
    }
}
