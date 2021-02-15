package com.example.squence3r.demo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Data
@Component
public class InitialAction implements Action {


    @Override
    public Object execute(Object input) throws Exception {
        log.info("executing initial state");
        return null;
    }

    @Override
    public String name() {
        return null;
    }
}
