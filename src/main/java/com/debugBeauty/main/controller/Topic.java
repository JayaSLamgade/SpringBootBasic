package com.debugBeauty.main.controller;

public class Topic {
    private int Id;
    private String Name;
    private String Discription;

    public Topic(){

    }

    public Topic(int id, String name, String discription) {
        Id = id;
        Name = name;
        Discription = discription;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }
}
