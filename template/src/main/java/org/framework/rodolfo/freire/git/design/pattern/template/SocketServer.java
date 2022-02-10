package org.framework.rodolfo.freire.git.design.pattern.template;

public class SocketServer extends StarterInit {

    @Override
    void endPlay() {
        System.out.println("SocketServer StarterInit Finished!");
    }

    @Override
    void initialize() {
        System.out.println("SocketServer StarterInit Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("SocketServer StarterInit Started. Enjoy the game!");
    }

}
