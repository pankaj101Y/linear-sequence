package com.example.squence3r.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    StateMachine stateMachine;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostConstruct
    void test(){
        stateMachine.start(State.INITIAL,State.COMPLETE);
    }

}
