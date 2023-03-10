package com.formation.lab;

import com.formation.lab.service.SimpleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LabApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(LabApplication.class, args);
        SimpleService simpleService = ctx.getBean(SimpleService.class);
        simpleService.functionLog();
    }

}
