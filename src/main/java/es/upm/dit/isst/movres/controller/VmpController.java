package es.upm.dit.isst.movres.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import es.upm.dit.isst.movres.model.Users;
import es.upm.dit.isst.movres.model.Vmp;
import es.upm.dit.isst.movres.repository.VmpRepository;
import es.upm.dit.isst.movres.repository.UsersRepository;

@RestController
public class VmpController {
    
    private final VmpRepository vmpRepository;
    private final UsersRepository usersRepository;
    

    public VmpController(VmpRepository p, UsersRepository u){
        this.vmpRepository = p;
        this.usersRepository = u;
    }

    @GetMapping("/vmp")
    List<Vmp> readAll(){
        return (List<Vmp>) vmpRepository.findAll();
    } 

    @GetMapping("/vmp/users")
    List<Users> allUsers(){
        return (List<Users>) usersRepository.findAll();
    } 
 
    @GetMapping("/vmp/users/{usuario}")
    List<Vmp> readByUsers(@PathVariable String usuario) {
        List <Users> usuarios =  (List<Users>) usersRepository.findAll();
      /*  List <Vmp> vacio =  (List<Vmp>) vmpRepository.findAll();
        for (int i=0; i< usuarios.size();i++) {
            vacio.remove(i);
        } */
        for (int i=0; i< usuarios.size();i++) {
            if(usuario == usuarios.get(i).getUsuario()) {
                if(usuarios.get(i).getIsAdmin()) return (List<Vmp>) vmpRepository.findByLocked(true);
            }
        }
        return vmpRepository.findByLibre();
        
    }

}
