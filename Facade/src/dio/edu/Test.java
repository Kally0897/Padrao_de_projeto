package dio.edu;

import dio.edu.facade.Facade;

public class Test {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.migrarCliente("Kalliandra Lima", "50740-320");
    }
}
