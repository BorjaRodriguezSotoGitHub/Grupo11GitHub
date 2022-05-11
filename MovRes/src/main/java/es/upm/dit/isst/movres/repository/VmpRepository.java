package es.upm.dit.isst.movres.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import es.upm.dit.isst.movres.model.Vmp;

public interface VmpRepository extends CrudRepository<Vmp, Integer> {

    List<Vmp> findByLocked(boolean b);
    List<Vmp> findByInUse(boolean b);
    List<Vmp> findByInRep(boolean b);

    public default Vmp findByIds (Integer id) {
        List <Vmp> vmps =  (List<Vmp>) findAll();
        Vmp vehiculo = vmps.get(0);
        for(int i=0;i< vmps.size();i++) {
                if(vmps.get(i).getId().equals(id)) {
                    vehiculo = vmps.get(i);
                }
        }
        return vehiculo;
    } 
    
    public default List<Vmp> findByLibre() {
        List <Vmp> vmps =  (List<Vmp>) findAll();
        List <Vmp> libres =  (List<Vmp>) findAll();
        
        for(int i=0;i< vmps.size();i++) {
            if (vmps.get(i).getInUse() || vmps.get(i).getLocked() || vmps.get(i).getInRep()) {
                libres.remove(vmps.get(i));
            }
        }
        return libres;
    }

    
    //List<Vmp> findByUbicacion(Double latitud, Double longitude);
}
