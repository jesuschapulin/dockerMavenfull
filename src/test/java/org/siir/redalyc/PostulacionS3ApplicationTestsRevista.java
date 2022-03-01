package org.siir.redalyc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc//Configura el Mock
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)//Permite ordenar las pruebas
class PostulacionS3ApplicationTestsRevista {

	@Autowired
	MockMvc mock;

	@Test
	@Order(1)
	void recuperarRevista() {
		try {
			mock.perform(get("/journal/104")).andDo(print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@Order(2)
	void recuperarRevistas() {
		try {
			mock.perform(get("/journals")).andDo(print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
