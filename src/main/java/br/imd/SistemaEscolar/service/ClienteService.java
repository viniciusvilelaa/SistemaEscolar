package br.imd.SistemaEscolar.service;

import br.imd.SistemaEscolar.model.Cliente;
import br.imd.SistemaEscolar.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteService {
    ClienteRepository repository;

    @Autowired
    public void setRepository(ClienteRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        repository.salvar(cliente);
    }

    public void validarCliente(Cliente cliente){

    }

}
