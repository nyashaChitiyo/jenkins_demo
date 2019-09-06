package com.newhealth.demo.controller;

import com.newhealth.demo.model.Person;
import com.newhealth.demo.repo.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
    @Autowired
    private PersonRepository repository;

    @PostMapping("/test")
    public Person getName(@RequestBody Person person){
        logger.info("person object {}",person);
        Person save = repository.save(person);
        return save;
    }
}
