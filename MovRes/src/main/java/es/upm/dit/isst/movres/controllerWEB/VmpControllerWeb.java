package es.upm.dit.isst.movres.controllerWEB;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.*;
import es.upm.dit.isst.movres.repository.VmpRepository;

import es.upm.dit.isst.movres.model.Vmp;
import es.upm.dit.isst.movres.model.Cliente;

@Controller
@RequestMapping("/movres")
public class VmpControllerWeb {


    private RestTemplate restTemplate = new RestTemplate();
    
    // Devuelve la vista login.html
    @GetMapping("/login/admin")
    public String loginadmin() {
        return "login_admin";     
    }

    // Devuelve la vista login.html
    @GetMapping("/login/client")
    public String loginclient() {
        return "login_client";     
    }

    @GetMapping("/saliradmin")
    public String saliradmin() {
        return "redirect:/movres/login/admin" ;
    }

    @GetMapping("/salirciente")
    public String salirciente() {
        return "redirect:/movres/login/client" ;
    }
    
    @RequestMapping("/listado_admin")
    public String adminLogin(Model model, @RequestParam("email") String email){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "admin/" + email, Vmp[].class).getBody());
        model.addAttribute("listaAdmin", lista);
        return "listado_admin";
    }

    @RequestMapping("/listado_client")
    public String clientLogin(Model model, @RequestParam("email") String email){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "cliente/" + email, Vmp[].class).getBody());
        model.addAttribute("listaClient", lista);
        return "listado_client";
    }

    @RequestMapping("/listado_admin_clientes")
    public String adminLoginListaClientes(Model model){
        List<Cliente> listac = new ArrayList<Cliente>();
        listac = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "cliente/", Cliente[].class).getBody());
        model.addAttribute("listaClientes", listac);
        return "listado_admin_clientes";
    }

    @GetMapping("/reserva/{id}")
    public String reservar(Model model, @PathVariable(value ="id") Integer id){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "reserva/" + id, Vmp[].class).getBody());
       model.addAttribute("listaClient", lista);
       return "listado_client";
    }

    @GetMapping("/libera/{id}")
    public String liberar(Model model, @PathVariable(value ="id") Integer id){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "libera/" + id, Vmp[].class).getBody());
       model.addAttribute("listaClient", lista);
       return "listado_client";
    }

    @RequestMapping("/mapa")
    public String mapa(){
        return "listado_mapa";
    }

    @GetMapping("/bloquea/{id}")
    public String bloquea(Model model, @PathVariable(value ="id") Integer id){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "bloquea/" + id, Vmp[].class).getBody());
       model.addAttribute("listaAdmin", lista);
       return "listado_admin";
    }

    @GetMapping("/desbloquea/{id}")
    public String desbloquea(Model model, @PathVariable(value ="id") Integer id){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "desbloquea/" + id, Vmp[].class).getBody());
       model.addAttribute("listaAdmin", lista);
       return "listado_admin";
    }

    @GetMapping("/repara/{id}")
    public String repara(Model model, @PathVariable(value ="id") Integer id){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "repara/" + id, Vmp[].class).getBody());
       model.addAttribute("listaAdmin", lista);
       return "listado_admin";
    }

    @GetMapping("/arregla/{id}")
    public String arregla(Model model, @PathVariable(value ="id") Integer id){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "arregla/" + id, Vmp[].class).getBody());
       model.addAttribute("listaAdmin", lista);
       return "listado_admin";
    }
    
    @GetMapping("/elimina/{email}")
    public String elimina(Model model, @PathVariable(value ="email") String email){
        List<Cliente> lista = new ArrayList<Cliente>();
        lista = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "elimina/" + email, Cliente[].class).getBody());
       model.addAttribute("listaClientes", lista);
       return "listado_admin_clientes";
    }
    
    @RequestMapping("/crearusuario")
    public String crearusuario(){
        return "registro_client";
    }

    @RequestMapping("/crear")
    public String adminLogin(Model model, @RequestParam("email") String email, @RequestParam("contraseña") String contraseña, @RequestParam("usuario") String usuario, @RequestParam("nombre") String nombre, @RequestParam("apellidos") String apellidos){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity("http://localhost:8080/vmp/" + "crear/" + email +"/"+ contraseña +"/"+ usuario +"/"+ nombre +"/"+ apellidos, Vmp[].class).getBody());
        model.addAttribute("listaClient", lista);
        return "listado_client";
    }

}
  