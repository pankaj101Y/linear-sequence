package com.example.squence3r.demo;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

import static com.example.squence3r.demo.State.*;

@Data
@Slf4j
public class StateGraph {


    private static final Map<State, State>STATE_GRAPH=new HashMap<>();

    public static final List<State> STATES= Arrays.asList(
            INITIAL,
            INTERMEDIATE,
            WAITING,
            PRE_FINAL,
            COMPLETE,
            EMPTY
    );

    static {
        STATE_GRAPH.put(INITIAL, INTERMEDIATE);
        STATE_GRAPH.put(INTERMEDIATE, WAITING);
        STATE_GRAPH.put(WAITING, PRE_FINAL);
        STATE_GRAPH.put(PRE_FINAL, COMPLETE);
        STATE_GRAPH.put(EMPTY, COMPLETE);
    }

    static public State getNextState(State current){
        return STATE_GRAPH.getOrDefault(current,COMPLETE);
    }





}
