package com.formation.lab.service.impl;

import com.formation.lab.service.SimpleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SimpleServiceImpl implements SimpleService {

    private final Logger logger = LoggerFactory.getLogger(SimpleServiceImpl.class);

    @Override
    public void functionLog() {
        logger.info("info log");
        logger.error("error log");
    }
}
