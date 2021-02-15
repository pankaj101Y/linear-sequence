package com.example.squence3r.demo;

import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class DelayQueueEventBuilder {

    DelayQueueEvent build(State state){

        DelayQueueEvent delayQueueEvent = new DelayQueueEvent();
        delayQueueEvent.setStateId(state.getLabel());
        delayQueueEvent.setActionIds(state.getActions().stream().map(Action::name).collect(Collectors.toList()));
        delayQueueEvent.setData(new Object());
        return delayQueueEvent;

    }

}
