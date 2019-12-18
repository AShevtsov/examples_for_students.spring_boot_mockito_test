package com.students.controllers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.students.services.CalculatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {
    private static final Logger LOG = LoggerFactory.getLogger(CalculatorControllerTest.class);

    @Mock
    private CalculatorService calculatorService;

    @InjectMocks
    private CalculatorController calculatorController = new CalculatorController();

    @Test
    public void CalculatorControllerSumTest() throws Exception {
        LOG.debug("[");

        Integer expectedResult = 5;
        int a = 3, b = 2;

        when(calculatorService.sum(a, b)).thenReturn(5);

        Integer actualResult = calculatorController.sum(a, b);

        assertEquals("Controller has returned incorrect sum!", expectedResult, actualResult);

        LOG.debug("]");
    }

}