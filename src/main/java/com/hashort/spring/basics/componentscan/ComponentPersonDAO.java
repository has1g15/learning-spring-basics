package com.hashort.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentPersonDAO {

    @Autowired
    ComponentJdbcConnection jdbcConnection;

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return jdbcConnection;
    }

    public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
