package org.framework.rodolfo.freire.git.design.pattern.proxy;

import org.framework.rodolfo.freire.git.design.pattern.proxy.image.Image;
import org.framework.rodolfo.freire.git.design.pattern.proxy.image.ProxyImage;

public class ProxyDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        System.out.println("");
        image.display();

    }
}
