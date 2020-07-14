package com.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Device device = new Pager();
//
//        Student student = new Student(device, "Roma");
//        student.sayHelloToFriend("Max");
//
//        Batman batman = new Batman(device);
//        batman.talkToJoker();

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
//        Device device = applicationContext.getBean(Pager.class);
//        device.sendMessage("TEST");
//        Student student = applicationContext.getBean(Student.class);
//        student.sayHelloToFriend("Pedro");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Device bean = applicationContext.getBean(Device.class);
        bean.sendMessage("TEST");

        Student student = applicationContext.getBean(Student.class);
        student.sayHelloToFriend("Pavlo");

        Pirate pirate = applicationContext.getBean(Pirate.class);
        pirate.yoHoHo();

        Batman batman = applicationContext.getBean(Batman.class);
        batman.talkToJoker();

    }
}
