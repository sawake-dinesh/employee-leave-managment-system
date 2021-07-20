package com.employee.leave.managment;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertEquals;

public class MyMockServiceTest {
    @Test
    public void testmock() {
        MyServiceProvider mockobj = Mockito.mock(MyServiceProvider.class);
        Mockito.when(mockobj.add(30, 70)).thenReturn(100);
        assertEquals(100, mockobj.add(30, 70));

        MyServiceProvider mockobj1 = Mockito.mock(MyServiceProvider.class);
        Mockito.when(mockobj1.multiply(3, 7)).thenReturn(21);
        assertEquals(21, mockobj1.multiply(3, 7));
    }
}
