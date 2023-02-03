package dio.edu.subsistema2.cep;

public class CepApi {

    //SINGLETON

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Recife";
    }


    public String recuperarEstado(String cep){
        return "PE";
    }
}


