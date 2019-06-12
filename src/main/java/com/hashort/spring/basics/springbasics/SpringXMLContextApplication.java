package com.hashort.spring.basics.springbasics;

import com.hashort.spring.basics.springbasics.xml.XMLPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringXMLContextApplication.class);

    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext applicationContext =
                    new ClassPathXmlApplicationContext("applicationcontext.xml")) {

            LOGGER.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

            XMLPersonDao personDao =
                    applicationContext.getBean(XMLPersonDao.class);

            LOGGER.info("{} {}", personDao, personDao.getXMLJdbcConnection());
        }
    }
}
