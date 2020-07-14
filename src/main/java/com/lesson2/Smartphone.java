package com.lesson2;

public class Smartphone implements Device {
    @Override
    public void sendMessage(String message) {
        System.out.println("iPhone send " + message);
    }
}
