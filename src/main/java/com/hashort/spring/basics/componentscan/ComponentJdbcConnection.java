package com.hashort.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
/*When you try to get a bean with a dependency with prototype scope, a proxy should be used on the dependency in order
to get a new instance of the dependency - this is to keep the number of instances low. When a dependency is a prototype
but the bean using the dependency is not a prototype, we can solve using a proxy*/
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {

    @Autowired
    public ComponentJdbcConnection() {
        System.out.println("JDBC Connection");
    }
}
