package org.framework.rodolfo.freire.git.design.pattern.observer.observership;

import org.framework.rodolfo.freire.git.design.pattern.observer.harness.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.printf("Binary String: %s \n", Integer.toBinaryString(subject.getState()));
    }
}
