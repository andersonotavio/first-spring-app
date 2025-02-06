package com.study.first_spring_app.controller;

import com.study.first_spring_app.domain.User;
import com.study.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloworld(){
        return helloWorldService.helloWorld("Otávio");
    }

    @PostMapping("{id}")
    public String helloWordPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body){
        return "Hello Word Post " + filter;
    }
}
