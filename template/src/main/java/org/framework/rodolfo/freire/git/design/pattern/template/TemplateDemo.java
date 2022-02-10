package org.framework.rodolfo.freire.git.design.pattern.template;

public class TemplateDemo {

    public static void main(String[] args) {

        StarterInit starterInit = new SocketServer();
        starterInit.init();

        System.out.println();

        starterInit = new SocketClient();
        starterInit.init();

    }

}
