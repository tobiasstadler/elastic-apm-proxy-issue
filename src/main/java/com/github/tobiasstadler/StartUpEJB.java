package com.github.tobiasstadler;

import co.elastic.apm.api.CaptureTransaction;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class StartUpEJB {

    @Inject
    private MyEJB myEJB;

    @Inject
    private MyCDIBean myCDIBean;

    @CaptureTransaction
    @PostConstruct
    public void postConstruct() {
        try {
            myEJB.doSomething();
            myCDIBean.doSomething();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
