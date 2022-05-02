package es.upm.dit.isst.movres.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import es.upm.dit.isst.movres.model.Vmp;
import es.upm.dit.isst.movres.repository.VmpRepository;

@RestController
public class VmpController {
    
    private final VmpRepository vmpRepository;

    public VmpController(VmpRepository p){
        this.vmpRepository = p;
    }

    @GetMapping("/vmp")
    List<Vmp> readAll(){
        return (List<Vmp>) vmpRepository.findAll();
    } 
}
