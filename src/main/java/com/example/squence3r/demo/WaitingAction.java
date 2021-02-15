package com.example.squence3r.demo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Data
@Component
public class WaitingAction implements Action {

    @Override
    public Object execute(Object input) throws Exception {
        log.info("executing WaitingAction");
        return null;
    }


    @Override
    public String name() {
        return WaitingAction.class.getSimpleName();
    }
}
