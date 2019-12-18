package com.students.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private static final Logger LOG = LoggerFactory.getLogger(CalculatorService.class);

    public int sum(int a, int b){
        LOG.debug("[ a = {}, b = {}", a, b);

        int result = a + b;

        LOG.debug("] (return : {})", result);
        return result;
    }

}
