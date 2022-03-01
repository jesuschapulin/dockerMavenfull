package org.siir.redalyc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.siir.redalyc.service.RevistaService;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)//Permite ordenar las pruebas
class PostulacionS3ApplicationTestsRevistaUnit {

	@Autowired
	private RevistaService revistaService;
	
	@Test
	@Order(1)
	void recuperarRevistas() {
		try {
			assertEquals(20, revistaService.recuperarRevistasLinea().size());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
