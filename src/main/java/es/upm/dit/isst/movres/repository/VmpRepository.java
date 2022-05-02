package es.upm.dit.isst.movres.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import es.upm.dit.isst.movres.model.Vmp;

public interface VmpRepository extends CrudRepository<Vmp, Integer> {
    
    //List<Vmp> findByUbicacion(Double latitud, Double longitude);
}
