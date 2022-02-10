package org.framework.rodolfo.freire.git.design.pattern.observer;

import org.framework.rodolfo.freire.git.design.pattern.observer.harness.Subject;
import org.framework.rodolfo.freire.git.design.pattern.observer.observership.BinaryObserver;
import org.framework.rodolfo.freire.git.design.pattern.observer.observership.HexaObserver;
import org.framework.rodolfo.freire.git.design.pattern.observer.observership.OctalObserver;

public class ObserverDemo {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new HexaObserver(subject);

        new OctalObserver(subject);

        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);

    }

}
