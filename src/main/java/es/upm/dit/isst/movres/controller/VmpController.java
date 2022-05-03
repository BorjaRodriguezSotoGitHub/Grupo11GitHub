package es.upm.dit.isst.movres.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import es.upm.dit.isst.movres.model.Admin;
import es.upm.dit.isst.movres.model.Cliente;
import es.upm.dit.isst.movres.model.Vmp;
import es.upm.dit.isst.movres.repository.AdminRepository;
import es.upm.dit.isst.movres.repository.ClienteRepository;
import es.upm.dit.isst.movres.repository.VmpRepository;


@RestController
public class VmpController {
    
    private final VmpRepository vmpRepository;
    private final AdminRepository adminRepository;
    private final ClienteRepository clienteRepository;

    public VmpController(VmpRepository p, AdminRepository u, ClienteRepository c){
        this.vmpRepository = p;
        this.adminRepository = u;
        this.clienteRepository = c;
    }

    @GetMapping("/vmp")
    List<Vmp> readAll(){
        return (List<Vmp>) vmpRepository.findAll();
    } 

    @GetMapping("/vmp/admin")
    List<Admin> allAdmins(){
        return (List<Admin>) adminRepository.findAll();
    } 
 
    @GetMapping("/vmp/cliente")
    List<Cliente> allClientes(){
        return (List<Cliente>) clienteRepository.findAll();
    } 

    @GetMapping("/vmp/admin/{usuario}")
    List<Vmp> readByAdmin(@PathVariable String usuario) {
        return (List<Vmp>) vmpRepository.findByLocked(true);
}
    @GetMapping("/vmp/cliente/{usuario}")
    List<Vmp> readByCliente(@PathVariable String usuario){
        return (List<Vmp>) vmpRepository.findByLibre();

    }
}