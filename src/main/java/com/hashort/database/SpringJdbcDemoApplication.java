package com.hashort.database;

import com.hashort.database.entity.Person;
import com.hashort.database.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.Date;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PersonJdbcDAO personJdbcDAO;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcDemoApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users: {}", personJdbcDAO.findAll());
        logger.info("User ID 10001: {}", personJdbcDAO.findById(10001));
        logger.info("Deleting 10002: No. of rows deleted = {}", personJdbcDAO.deleteById(10002));
        logger.info("Inserting 10004: {}", personJdbcDAO.insert(
                new Person(10004, "Hannah", "Burgess Hill", new Date())));
        logger.info("Update 10003: {}", personJdbcDAO.update(
                new Person(10003, "Joe", "Brighton", new Date())));
    }
}
