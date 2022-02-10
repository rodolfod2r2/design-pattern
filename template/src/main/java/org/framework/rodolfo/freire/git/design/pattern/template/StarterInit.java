package org.framework.rodolfo.freire.git.design.pattern.template;

public abstract class StarterInit {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void init() {
        //initialize the game
        initialize();
        //start game
        startPlay();
        //end game
        endPlay();
    }

}
