package es.upm.dit.isst.movres;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import es.upm.dit.isst.movres.model.Admin;
import es.upm.dit.isst.movres.model.Cliente;
import es.upm.dit.isst.movres.model.Vmp;

@SpringBootTest
class MovResapiApplicationTests {

	@Test
	void pruebaCliente() {

		Cliente pruebacliente = new Cliente("borja@gmail.com", "1234", "borja", "Borja", "Ruiz");
		String pruebausuariocliente = pruebacliente.getUsuario();

		assertEquals("borja", pruebausuariocliente);

	}

	@Test
	void pruebaAdmin() {

		Admin pruebaadmin = new Admin("ruben@gmail.com", "1234", "ruben", "Ruben", "Rodriguez");
		String pruebausuarioadmin = pruebaadmin.getUsuario();

		assertEquals("ruben", pruebausuarioadmin);

	}

	@Test
	void pruebaVmp() {

		Vmp pruebavmp = new Vmp(40.82, 3.4, false, true, false, true, 0.2);
		Boolean pruebausovmp = pruebavmp.getInUse();

		assertEquals(true, pruebausovmp);

	}

}
