package org.framework.rodolfo.freire.git.design.pattern.observer.observership;

import org.framework.rodolfo.freire.git.design.pattern.observer.harness.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.printf("Octal String: %s \n", Integer.toOctalString(subject.getState()));
    }

}
