package com.hashort.database;

import com.hashort.database.entity.Person;
import com.hashort.database.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonSpringDataRepository personSpringDataRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("User ID 10001: {}", personSpringDataRepository.findById(10001));
        logger.info("Inserting 10004: {}", personSpringDataRepository.save(
                new Person("Hannah", "Burgess Hill", new Date())));
        logger.info("Update 10003: {}", personSpringDataRepository.save(
                new Person("Joe", "Brighton", new Date())));
        personSpringDataRepository.deleteById(10002);
        logger.info("All users: {}", personSpringDataRepository.findAll());
    }
}
