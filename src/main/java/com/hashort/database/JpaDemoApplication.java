package com.hashort.database;

import com.hashort.database.entity.Person;
import com.hashort.database.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.Date;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PersonJpaRepository personJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users: {}", personJpaRepository.findAll());
        logger.info("User ID 10001: {}", personJpaRepository.findById(10001));
        personJpaRepository.delete(10002);
        logger.info("Inserting 10004: {}", personJpaRepository.insert(
                new Person(10004, "Hannah", "Burgess Hill", new Date())));
        logger.info("Update 10003: {}", personJpaRepository.update(
                new Person(10003, "Joe", "Brighton", new Date())));
    }
}
