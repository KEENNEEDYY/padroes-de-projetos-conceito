import org.desenvolvedorkennedy.gof.facade.Facade;
import org.desenvolvedorkennedy.gof.singleton.SingletonEager;
import org.desenvolvedorkennedy.gof.singleton.SingletonLazy;
import org.desenvolvedorkennedy.gof.singleton.SingletonLazyHolder;
import org.desenvolvedorkennedy.gof.strategy.Comportamento;
import org.desenvolvedorkennedy.gof.strategy.ComportamentoAgressivo;
import org.desenvolvedorkennedy.gof.strategy.ComportamentoDefensivo;
import org.desenvolvedorkennedy.gof.strategy.ComportamentoNormal;
import org.desenvolvedorkennedy.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        System.out.println("Singleton");
        // Singleton
        singletonTest(); 

        System.out.println("\n\n\n");

        System.out.println("Strategy");
        // Strategy
        strategyTest();

        System.out.println("\n\n\n");

        System.out.println("Facade");
        // Facade
        facadeTest();

    }

    public static void facadeTest(){
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }

    public static void strategyTest(){

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        
        robo.setComportamento(defensivo);

        robo.mover();
        
        robo.setComportamento(agressivo);

        robo.mover();
        robo.mover();
        robo.mover();
    }

    public static void singletonTest(){
        // Teste relacionados ao Design Patterns Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }

}
