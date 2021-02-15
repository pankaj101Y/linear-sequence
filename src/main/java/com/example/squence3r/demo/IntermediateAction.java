package com.example.squence3r.demo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Data
@Component
public class IntermediateAction implements Action {


    @Override
    public Object execute(Object input) throws Exception {
        log.info("executing intermediate state");
        return null;
    }

    @Override
    public int priority() {
        return 1;
    }

    @Override
    public String name() {
        return IntermediateAction.class.getName();
    }
}
