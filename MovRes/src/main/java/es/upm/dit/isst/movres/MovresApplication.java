package es.upm.dit.isst.movres;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import es.upm.dit.isst.movres.model.Admin;
import es.upm.dit.isst.movres.model.Cliente;
import es.upm.dit.isst.movres.model.Vmp;
import es.upm.dit.isst.movres.repository.AdminRepository;
import es.upm.dit.isst.movres.repository.ClienteRepository;
import es.upm.dit.isst.movres.repository.VmpRepository;



@SpringBootApplication
public class MovresApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovresApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(VmpRepository repository, AdminRepository repository2, ClienteRepository repository3) {
		return (args) -> {
			// save a few vmps
			repository.save(new Vmp(10.5,10.0,false,false,false,true, 0.0));
			repository.save(new Vmp(12.5,10.0,true,false,false,true, 0.2));
			repository.save(new Vmp(10.5,12.0,false,false,false, false, 0.0));
			repository.save(new Vmp(12.5,12.0,false,true,false, true, 0.2));
			repository.save(new Vmp(14.5,10.0,false,true,false, false, 0.0));
			repository.save(new Vmp(18.5,12.0,true,false,false, true, 0.2));
	
		// save a few admins
		repository2.save(new Admin("danbrown@gmail.com","1234","danbrown","Daniel","Brown Torres"));
		repository2.save(new Admin("ruben@gmail.com","1234","rubenzm","Ruben","Zafra Martin"));

		// save a few clientes
		repository3.save(new Cliente("rodrigo@gmail.com","1234","rodrigo","Rodrigo","Ruiz"));
		repository3.save(new Cliente("jorge@gmail.com","1234","jorge","Jorge","Ortega"));
		repository3.save(new Cliente("borja@gmail.com","1234","borja","Borja","Rodriguez"));
		repository3.save(new Cliente("sara@gmail.com","1234","sara","Sara","Saez"));
		repository3.save(new Cliente("maria@gmail.com","1234","maria","Maria","Brown"));
	  };
	}

}
