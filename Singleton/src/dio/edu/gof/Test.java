package dio.edu.gof;

public class Test {

    //Testes relacionados ao Design Pattern Singleton:

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance(); //Não conseguimos acessar pelo new pois ele é privado lembra?
        System.out.println(lazy); //Deve retornar o endereço de memória
        lazy = SingletonLazy.getInstance(); //Não conseguimos acessar pelo new pois ele é privado lembra?
        System.out.println(lazy); //Deve retornar o mesmco endereço de memória já que se trata da mesma instância

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
    }
}
