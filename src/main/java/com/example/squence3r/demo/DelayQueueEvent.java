package com.example.squence3r.demo;

import lombok.Data;

import java.util.List;

@Data
public class DelayQueueEvent {

    String stateId;
    List<String> actionIds;
    Object data;

}
