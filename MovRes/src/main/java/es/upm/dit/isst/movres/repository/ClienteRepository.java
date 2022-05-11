package es.upm.dit.isst.movres.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.upm.dit.isst.movres.model.Cliente;

public interface ClienteRepository extends CrudRepository <Cliente, String> {

    public default Cliente findByEmail (String email) {
        List <Cliente> vmps =  (List<Cliente>) findAll();
        Cliente cliente = vmps.get(0);
        for(int i=0;i< vmps.size();i++) {
                if(vmps.get(i).getEmail().equals(email)) {
                    cliente = vmps.get(i);
                }
        }
        return cliente;
    } 
    
}
