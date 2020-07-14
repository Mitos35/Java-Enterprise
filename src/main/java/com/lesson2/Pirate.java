package com.lesson2;

import org.springframework.beans.factory.annotation.Autowired;

public class Pirate {
    @Autowired
    private Device device;

//    public Pirate(Device device) {
//        this.device = device;
//    }

    public void yoHoHo() {
        System.out.println("Pirate say:");
        device.sendMessage("where is whisky?");
    }
}
