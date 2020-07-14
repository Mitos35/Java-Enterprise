package com.lesson2;

import org.springframework.beans.factory.annotation.Autowired;

public class Batman {
    @Autowired
    private Device device;

//    public Batman(Device device) {
//        this.device = device;
//    }

    public void talkToJoker() {
        System.out.println("Batman say:");
        device.sendMessage("Where is detonator?!");
    }
}
