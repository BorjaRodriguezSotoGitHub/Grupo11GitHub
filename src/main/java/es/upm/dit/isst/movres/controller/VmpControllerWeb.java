package es.upm.dit.isst.movres.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import es.upm.dit.isst.movres.model.Vmp;


@Controller
@RequestMapping("/movres")
public class VmpControllerWeb {
    public final String VMP_STRING= "http://localhost:8080/vmp/";
    private RestTemplate restTemplate = new RestTemplate();
    
    // Devuelve la vista login_admin.html
    @GetMapping("/login/admin")
    public String loginadmin() {
        return "login_admin";     
    }

    // Devuelve la vista login_client.html
    @GetMapping("/login/client")
    public String loginclient() {
        return "login_client";     
    }

    @RequestMapping("/listado_admin")
    public String adminLogin(Model model, @RequestParam("email") String email){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity(VMP_STRING + "admin/" + email, Vmp[].class).getBody());
        model.addAttribute("listaAdmin", lista);
        return "listado_admin";
    }

    @RequestMapping("/listado_client")
    public String clientLogin(Model model, @RequestParam("email") String email){
        List<Vmp> lista = new ArrayList<Vmp>();
        lista = Arrays.asList(restTemplate.getForEntity(VMP_STRING + "cliente/" + email, Vmp[].class).getBody());
        model.addAttribute("listaClient", lista);
        return "listado_client";
    }

}



