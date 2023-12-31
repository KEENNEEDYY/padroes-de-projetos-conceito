package org.desenvolvedorkennedy.gof.singleton;

/**
 * Singleton "apressado".\
 * 
 * @author desenvolvedorkennedy
 */
public class SingletonEager {
   
    private static SingletonEager  instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
