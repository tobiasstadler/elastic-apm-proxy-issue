package com.github.tobiasstadler;

import co.elastic.apm.api.CaptureSpan;

import javax.ejb.Stateful;

@Stateful
public class MyEJB {

    @CaptureSpan
    public void doSomething() throws Exception {
        Thread.sleep(1000l);
    }
}
