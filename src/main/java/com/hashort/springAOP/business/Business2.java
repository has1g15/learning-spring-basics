package com.hashort.springAOP.business;

import com.hashort.springAOP.data.DAO2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private DAO2 dao2;

    public String calculateSomething() {
        //Business logic
        return dao2.retrieveSomething();
    }
}
