package com.hashort.springAOP.business;

import com.hashort.springAOP.aspect.TrackTime;
import com.hashort.springAOP.data.DAO1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private DAO1 dao1;

    @TrackTime
    public String calculateSomething() {
        //Business logic
        return dao1.retrieveSomething();
    }
}
