package com.example.squence3r.demo;


public interface Action<I,O> {


    //this method must be atomic
    O execute(I input) throws Exception;

    String name();

}
