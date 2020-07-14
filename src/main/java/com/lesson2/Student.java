package com.lesson2;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    @Autowired
    private Device device;
    private String name;

    public Student(String name) {
//        this.device = device;
        this.name = name;
    }

    public void sayHelloToFriend(String friendName) {
        System.out.println("My name is " + name);
        device.sendMessage("friend name is " + friendName);

    }
}
