package com.debugBeauty.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerClass {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic(1768,"Spring Boot","Framework for Java"),
                new Topic(3487,"Django", "Framework for Python"),
                new Topic(5921,"React", "Framework for JavaScript")
        );
    }
}