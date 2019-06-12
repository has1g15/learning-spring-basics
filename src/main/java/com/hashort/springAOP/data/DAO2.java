package com.hashort.springAOP.data;

import org.springframework.stereotype.Repository;

@Repository
public class DAO2 {

    public String retrieveSomething() {
        return "DAO2";
    }
}