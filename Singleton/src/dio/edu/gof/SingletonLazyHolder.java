package dio.edu.gof;

// * Ele vai encapsular a instancia em uma classe static interna
// *
// * Algumas pessoas recomendam ela por ser ThreadSafe
// * @see <a href = "https://stackoverflow.com/a/24018148"></a>

public class SingletonLazyHolder {

    private static class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return Holder.instancia;
    }
}
