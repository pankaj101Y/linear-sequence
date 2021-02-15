package com.example.squence3r.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@ToString
@EqualsAndHashCode(exclude = {"actions"})
@Getter
@Setter
class State {

    public static final State INITIAL = new State("Initial", new LinkedList<>(Arrays.asList(new InitialAction())));
    public static final State INTERMEDIATE = new State("intermediate", new LinkedList<>(Arrays.asList(new IntermediateAction())));
    public static final State WAITING = new State("waiting", new LinkedList<>(Arrays.asList(new WaitingAction())));
    public static final State PRE_FINAL = new State("pre final", new LinkedList<>(Arrays.asList(new WaitingAction(),new PreFinalAction())));
    public static final State COMPLETE = new State("complete", new LinkedList<>(Arrays.asList(new CompleteActionAction())));
    public static final State EMPTY = new State("empty", new LinkedList<>(Arrays.asList()));

    private  String label;
    private List<Action> actions;


    State(String label, List<Action> actions) {
        this.label=label;
        this.actions=actions;
    }

}