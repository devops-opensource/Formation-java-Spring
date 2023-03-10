package com.formation.lab.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;

@RunWith(MockitoJUnitRunner.class)
public class SimpleServiceImplTest {

    @InjectMocks
    private SimpleServiceImpl simpleService;

    @Test(expected = Test.None.class)
    public void functionLog() {
        simpleService.functionLog();
    }
}