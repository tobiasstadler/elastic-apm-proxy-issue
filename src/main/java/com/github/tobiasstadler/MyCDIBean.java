package com.github.tobiasstadler;

import co.elastic.apm.api.CaptureSpan;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyCDIBean {

    @CaptureSpan
    public void doSomething() throws Exception {
        Thread.sleep(1000l);
    }
}
