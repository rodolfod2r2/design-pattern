package org.framework.rodolfo.freire.git.design.pattern.observer.observership;

import org.framework.rodolfo.freire.git.design.pattern.observer.harness.Subject;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.printf("Hex String: %s \n", Integer.toHexString(subject.getState()).toUpperCase());
    }

}
