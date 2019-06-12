package com.hashort.spring.basics.springbasics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalService {

    //from property file
    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL() {
        return url;
    }
}
