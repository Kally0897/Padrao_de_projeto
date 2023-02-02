package dio.edu.gof;

/*
*
* Singleton mais apressado = logo no momento em que a variável static é definida,
* ele já atribui a instância
*
* */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
