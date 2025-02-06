package com.study.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    private String name;

    public String helloWorld(String name){
        return "Hello World! " + name;
    }
}
