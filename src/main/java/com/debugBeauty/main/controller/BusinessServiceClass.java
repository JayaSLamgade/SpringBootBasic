package com.debugBeauty.main.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BusinessServiceClass {
    private int numb = 23;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1768, "Spring Boot", "Framework for Java"),
            new Topic(3487, "Django", "Framework for Python"),
            new Topic(5921, "React", "Framework for JavaScript")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(int id) {
        return topics.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(int id, Topic topic) {
        for(int i =0; i<topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId()==id){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(int id) {
        topics.removeIf(t -> t.getId()==id);
    }
}
