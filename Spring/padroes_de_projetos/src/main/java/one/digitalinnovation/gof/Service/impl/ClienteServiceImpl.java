package one.digitalinnovation.gof.service.impl;

import org.springframework.beans.factory.annotation.Autowired;


/*
* Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
* injetada pelo Spring (via {@link Autowired}. Com isso, como essa classe é um {@link Service},
* ela será tratada como um <b>Singleton</b>.
*/


public class ClienteServiceImpl implements ClienteService {
    //TODO Singleton: Injetar os componentes do Spring com @Autowired;
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;
    //TODO Strategy: Implementar os métodos definidos na interface;
    //TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples

    @Override
    public Iterable<Cliente> buscarTodos() {
        //FIXME Buscar todos os clientes;
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //FIXME Buscar por Id
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        //FIXME Buscar Cliente por Id caso exista
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

        public void deletar (Long id){
            //FIXME Deletar Cliente por Id
            clienteRepository.deleteById(id);
        }

    private void salvarClienteComCep(Cliente cliente) {
        //FIXME Verificar se o endereço do cliente já existe (pelo CEP)
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            //FIXME Caso não exista, integrar com o ViaCep e persistir o retorno
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        })
        cliente.setEndereco(endereco);
        //FIXME Inserir Cliente, vinculando o Endereço (novo ou existente)
        clienteRepository.save(cliente);
    }

    }
