package com.example.squence3r.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Slf4j
@Component
public class StateMachine {

    @Autowired
    DelayQueueEventBuilder mDelayQueueEventBuilder;

    @Autowired
    StateBuilder mStateBuilder;

    void start(State current, State terminating){
        log.info("******************************************************************************");
        log.info("starting state machine with initial state as {} ",current.getLabel());

        while (current!=terminating){
            ListIterator<Action>actionListIterator=current.getActions().listIterator();
            while (actionListIterator.hasNext()){
                Action action=actionListIterator.next();

                try {
                    log.info("out of action is {} ",action.execute("input"));
                    actionListIterator.remove();
                } catch (Exception e) {
//                    log.error("exception while executing action, state {}  {} {}",current.getLabel(),action.name(),e.getMessage());
//                    log.info("adding state to delay queue {} ",current);
//                    log.info("adding event to delay queue {} ",);
                    log.info("removing  event from delay queue {} ",mStateBuilder.build(mDelayQueueEventBuilder.build(current)));
                    log.info("removing  event from delay queue {} ",mStateBuilder.build(mDelayQueueEventBuilder.build(current)).equals(current));
                    break;
                    //add state to delay queue
                }

            }
            current=StateGraph.getNextState(current);
        }

        log.info("final state is {} ",current);
        log.info("******************************************************************************");

    }


}
