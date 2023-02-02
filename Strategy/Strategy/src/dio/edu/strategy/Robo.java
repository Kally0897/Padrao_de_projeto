package dio.edu.strategy;

public class Robo {

    //Contexto do nosso Startegy

    private Comportamento comportamento; //Nossa estratégia de comprotamento pro robô

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    //Preciso garantir que eu consigo fazer meu robô se mover
    public void mover(){
        comportamento.mover();
    }




}
