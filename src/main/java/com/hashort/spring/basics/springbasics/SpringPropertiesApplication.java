package com.hashort.spring.basics.springbasics;

import com.hashort.spring.basics.springbasics.properties.ExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringPropertiesApplication.class)) {


            ExternalService externalService =
                    applicationContext.getBean(ExternalService.class);

            System.out.println(externalService.returnServiceURL());
        }
    }
}
