package com.lesson2;

import org.springframework.context.annotation.Bean;

public class Config {

    @Bean
    public Device device() {
//        return new Pager();
        return new Smartphone();
    }

    @Bean
    public Student student() {
        return new Student("Max");
    }

    @Bean
    public Batman batman() {
        return new Batman();
    }

    @Bean
    public Pirate pirate() {
        return new Pirate();
    }
}
