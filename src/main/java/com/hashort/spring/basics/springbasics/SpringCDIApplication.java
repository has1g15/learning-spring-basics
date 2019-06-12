package com.hashort.spring.basics.springbasics;

import com.hashort.spring.basics.springbasics.CDI.CDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringCDIApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringCDIApplication.class, args);

        CDIBusiness business = applicationContext.getBean(CDIBusiness.class);

        LOGGER.info("{} dao-{}", business, business.getCdiDAO());

    }
}
