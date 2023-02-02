package dio.edu.gof;
/*
* Singleton preguiçoso é um Singleton que no primeiro momento ele
* já não disponibiliza a instância pro usuário
*
* Lembrete: Sicngleton tem uma instância dele msm
*
* */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() { //Esse construtor privado vai garantir que ninguém externamente consiga instanciar o SingletonLazy
     super(); //Aqui ele está chamando o cosntrutor da Classe-Pai
    }

    public static SingletonLazy getInstance(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
