package one.gigitalinnovation.gof.service;

import one.gigitalinnovation.gof.model.Cliente;

/*
* Cliente HTTP,criado via <b>OpenFeign</b>, para o consumo da API do <b>ViaCep</b>
*
*/

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep)
}