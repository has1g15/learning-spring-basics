package com.hashort.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(SpringBootBasicApplication.class);

        for (String beanName: applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
