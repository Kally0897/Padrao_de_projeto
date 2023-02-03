package one.digitalinnovation.gof.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

/*
* Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
* injetada pelo Spring (via {@link Autowired}. Com isso, como essa classe é um {@link Service},
* ela será tratada como um <b>Singleton</b>.
*/


public class ClienteServiceImpl implements ClienteService{
    //TODO Singleton: Injetar os componentes do Spring com @Autowired;
    //TODO Strategy: Implementar os métodos definidos na interface;
    //TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples

    @Override
    public Iterable<Cliente> buscarTodos(){
        //FIXME Buscar todos os clientes;
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id){
        //FIXME Buscar por Id
        return null;
    }
    @Override
    public void inserir(Cliente cliente){
        //FIXME Verificar se o Endereço do Cliente já existe (pelo CEP)
        //FIXME Caso não exista, integrar com o ViaCep e persistir o retorno
        //FIXME Inserir Cliente, vinculando o Endereço (novo ou existente)
    }

    @Override
    public void atualizar (Long id, Cliente cliente){
        //FIXME Buscar Cliente por Id caso exista
        //FIXME Verificar se o endereço do cliente já existe (pelo CEP)
        //FIXME Caso não exista, integrar com o ViaCep e persistir o retorno
        //FIXME Alterar Cliente, vinculando o endereço (novo ou existente)
    }

    public void deletar(Long id){
        //FIXME Deletar Cliente por Id
    }

}