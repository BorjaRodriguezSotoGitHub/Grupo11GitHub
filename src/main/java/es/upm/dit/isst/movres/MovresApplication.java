package es.upm.dit.isst.movres;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import es.upm.dit.isst.movres.model.Vmp;
import es.upm.dit.isst.movres.repository.VmpRepository;

@SpringBootApplication
public class MovresApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovresApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(VmpRepository repository) {
	  return (args) -> {
		// save a few customers
		repository.save(new Vmp(10.5,10.0,false,false));
		repository.save(new Vmp(12.5,10.0,true,false));
		repository.save(new Vmp(10.5,12.0,false,false));
		repository.save(new Vmp(12.5,12.0,false,true));
		repository.save(new Vmp(14.5,10.0,false,true));
	  };
	}

}
