package com.hashort.springAOP.data;

import com.hashort.springAOP.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DAO1 {

    @TrackTime
    public String retrieveSomething() {
        return "DAO1";
    }
}
