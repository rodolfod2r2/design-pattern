package org.framework.rodolfo.freire.git.design.pattern.template;

public class SocketClient extends StarterInit {

    @Override
    void endPlay() {
        System.out.println("SocketClient StarterInit Finished!");
    }

    @Override
    void initialize() {
        System.out.println("SocketClient StarterInit Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("SocketClient StarterInit Started. Enjoy the game!");
    }

}
