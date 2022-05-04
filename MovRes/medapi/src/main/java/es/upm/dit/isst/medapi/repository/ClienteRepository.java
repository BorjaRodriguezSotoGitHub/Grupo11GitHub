package es.upm.dit.isst.medapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.upm.dit.isst.medapi.model.Cliente;

public interface ClienteRepository extends CrudRepository <Cliente, String> {
    
}
