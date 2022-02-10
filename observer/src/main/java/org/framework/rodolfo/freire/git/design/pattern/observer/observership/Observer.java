package org.framework.rodolfo.freire.git.design.pattern.observer.observership;

import org.framework.rodolfo.freire.git.design.pattern.observer.harness.Subject;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
