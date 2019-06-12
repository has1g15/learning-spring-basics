package com.hashort.spring.basics.springbasics;

import com.hashort.spring.basics.componentscan.ComponentPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hashort.spring.basics.componentscan")
public class SpringComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringComponentScanApplication.class, args);

        ComponentPersonDAO personDAO = applicationContext.getBean(ComponentPersonDAO.class);

        LOGGER.info("{}", personDAO);

    }
}
