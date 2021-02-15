package com.example.squence3r.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Data
public class StateBuilder {

    @Autowired
    List<Action> actions;


    State build(DelayQueueEvent event){
        State state=StateGraph.STATES.stream().filter(tmp -> tmp.getLabel().equals(event.stateId)).findFirst().orElse(State.EMPTY);

        state.setActions(state.getActions().stream().filter(action -> event.getActionIds().contains(action.name())).collect(Collectors.toList()));
        return state;
    }

}
