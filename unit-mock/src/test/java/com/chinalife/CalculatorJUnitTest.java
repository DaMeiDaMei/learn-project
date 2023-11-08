package com.chinalife;

import com.chinalife.biz.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 计算器 单元测试类
 */
public class CalculatorJUnitTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void test() {
        Assertions.assertEquals(2, calculator.add(1, 1));
    }


    /**
     * 标准断言
     */
    @Test
    void standardAssertions() {
        assertEquals(2, calculator.add(1, 1));
        assertEquals(3, calculator.multiply(2, 2), () -> "lamda表达式");
        assertEquals("haha", "haha");
        // 上一个断言失败，就不会继续往下执行, 所以assertTrue不报错
        assertTrue('a' > 'b', () -> "断言中的message是懒加载，避免不必要的字符串构建");
    }

    /**
     * 分组断言
     * <p>
     * 一组断言执行时，会一次执行所有，再把所有失败信息一块报告
     */
    @Test
    void groupedAssertions() {

        assertAll("grouped",
                () -> assertEquals(4, 2 * 2),
                () -> assertTrue(2 > 1, "failure2")
        );
    }
//
//    @Test
//    void dependentAssertions() {
//        // Within a code block, if an assertion fails the
//        // subsequent code in the same block will be skipped.
//        assertAll("properties",
//                () -> {
//                    String firstName = person.getFirstName();
//                    assertNotNull(firstName);
//
//                    // Executed only if the previous assertion is valid.
//                    assertAll("first name",
//                            () -> assertTrue(firstName.startsWith("J")),
//                            () -> assertTrue(firstName.endsWith("e"))
//                    );
//                },
//                () -> {
//                    // Grouped assertion, so processed independently
//                    // of results of first name assertions.
//                    String lastName = person.getLastName();
//                    assertNotNull(lastName);
//
//                    // Executed only if the previous assertion is valid.
//                    assertAll("last name",
//                            () -> assertTrue(lastName.startsWith("D")),
//                            () -> assertTrue(lastName.endsWith("e"))
//                    );
//                }
//        );
//    }
//
//    @Test
//    void exceptionTesting() {
//        Exception exception = assertThrows(ArithmeticException.class, () ->
//                calculator.divide(1, 0));
//        assertEquals("/ by zero", exception.getMessage());
//    }
//
//    @Test
//    void timeoutNotExceeded() {
//        // The following assertion succeeds.
//        assertTimeout(ofMinutes(2), () -> {
//            // Perform task that takes less than 2 minutes.
//        });
//    }
//
//    @Test
//    void timeoutNotExceededWithResult() {
//        // The following assertion succeeds, and returns the supplied object.
//        String actualResult = assertTimeout(ofMinutes(2), () -> {
//            return "a result";
//        });
//        assertEquals("a result", actualResult);
//    }
//
//    @Test
//    void timeoutNotExceededWithMethod() {
//        // The following assertion invokes a method reference and returns an object.
//        String actualGreeting = assertTimeout(ofMinutes(2), AssertionsDemo::greeting);
//        assertEquals("Hello, World!", actualGreeting);
//    }
//
//    @Test
//    void timeoutExceeded() {
//        // The following assertion fails with an error message similar to:
//        // execution exceeded timeout of 10 ms by 91 ms
//        assertTimeout(ofMillis(10), () -> {
//            // Simulate task that takes more than 10 ms.
//            Thread.sleep(100);
//        });
//    }
//
//    @Test
//    void timeoutExceededWithPreemptiveTermination() {
//        // The following assertion fails with an error message similar to:
//        // execution timed out after 10 ms
//        assertTimeoutPreemptively(ofMillis(10), () -> {
//            // Simulate task that takes more than 10 ms.
//            new CountDownLatch(1).await();
//        });
//    }
}
