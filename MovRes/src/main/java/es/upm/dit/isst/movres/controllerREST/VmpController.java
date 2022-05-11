package es.upm.dit.isst.movres.controllerREST;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.*;

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
    public static final Logger log = LoggerFactory.getLogger(VmpController.class);

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

    @GetMapping("/vmp/admin/{email}")
    List<Vmp> readByAdmin(@PathVariable String email) {
        return (List<Vmp>) vmpRepository.findAll();
    }

    @GetMapping("/vmp/cliente/{email}")
    List<Vmp> readByCliente(@PathVariable String email){
        return (List<Vmp>) vmpRepository.findByLocked(false);

    }

    @GetMapping("/vmp/reserva/{id}")
    List<Vmp> reserva(@PathVariable Integer id) {
      Vmp vmp = vmpRepository.findByIds(id);
      vmp.setInUse(true);
      vmpRepository.save(vmp);
      return (List<Vmp>) vmpRepository.findByLocked(false);
    }

    @GetMapping("/vmp/libera/{id}")
    List<Vmp> liberar(@PathVariable Integer id) {
      Vmp vmp = vmpRepository.findByIds(id);
      vmp.setInUse(false);
      vmpRepository.save(vmp);
      return (List<Vmp>) vmpRepository.findByLocked(false);
    }
    
    @GetMapping("/vmp/bloquea/{id}")
    List<Vmp> bloquea(@PathVariable Integer id) {
      Vmp vmp = vmpRepository.findByIds(id);
      vmp.setLocked(true);
      vmpRepository.save(vmp);
      return (List<Vmp>) vmpRepository.findAll();
    }

    @GetMapping("/vmp/desbloquea/{id}")
    List<Vmp> desbloquea(@PathVariable Integer id) {
      Vmp vmp = vmpRepository.findByIds(id);
      vmp.setLocked(false);
      vmpRepository.save(vmp);
      return (List<Vmp>) vmpRepository.findAll();
    }

    @GetMapping("/vmp/repara/{id}")
    List<Vmp> repara(@PathVariable Integer id) {
      Vmp vmp = vmpRepository.findByIds(id);
      vmp.setInRep(true);
      vmpRepository.save(vmp);
      return (List<Vmp>) vmpRepository.findAll();
    }

    @GetMapping("/vmp/arregla/{id}")
    List<Vmp> arregla(@PathVariable Integer id) {
      Vmp vmp = vmpRepository.findByIds(id);
      vmp.setInRep(false);
      vmpRepository.save(vmp);
      return (List<Vmp>) vmpRepository.findAll();
    }

    @GetMapping("/vmp/elimina/{email}")
    List<Cliente> elimina(@PathVariable String email) {
        Cliente cliente = clienteRepository.findByEmail(email); 
        clienteRepository.delete(cliente);
        return (List<Cliente>) clienteRepository.findAll();
    }

    @GetMapping("/vmp/crear/{email}/{contraseña}/{usuario}/{nombre}/{apellidos}")
    List<Vmp> crear(@PathVariable String email, @PathVariable String contraseña, @PathVariable String usuario, @PathVariable String nombre, @PathVariable String apellidos) {
        Cliente newcliente = new Cliente(email, contraseña, usuario, nombre, apellidos);
        clienteRepository.save(newcliente);
        return (List<Vmp>) vmpRepository.findByLocked(false);
    }
}
