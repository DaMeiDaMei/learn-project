package com.chinalife;

import com.chinalife.biz.BizServiceA;
import com.chinalife.biz.BizServiceB;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Mockito 与 JUnit 5集成
 *
 * @author tianyu
 * @version 1.0.0
 * @Date 2022-11-16 18:04:00
 */
@ExtendWith(MockitoExtension.class)
public class MockitoJUnitTest {

    @Spy
    @InjectMocks
    private BizServiceA bizServiceA;

    @Mock
    private BizServiceB bizServiceB;


    @BeforeAll
    public void init() {
        //
        // MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() {
        when(bizServiceB.create(eq("B"))).thenReturn("BizServiceB");
        bizServiceA.create("B");

    }

    public void mockito() {
        // mock creation
        List mockedList = mock(List.class);

        // using mock object - it does not throw any "unexpected interaction" exception
        mockedList.add("one");
        mockedList.clear();

        // selective, explicit, highly readable verification
        verify(mockedList).add("one");

        verify(mockedList).

                clear();
    }

}
