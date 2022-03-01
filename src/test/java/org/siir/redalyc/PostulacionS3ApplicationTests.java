package org.siir.redalyc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc//Configura el Mock
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)//Permite ordenar las pruebas
class PostulacionS3ApplicationTests {

	@Autowired
	MockMvc mock;
//	@Test
//	void contextLoads() {
//	}
	@Test
	@Order(0)
	void deletePrueba() {
		try {
			mock.perform(delete("/revista/3")).andDo(print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@Order(1)
	void recuperarPruebas() {
		try {
			mock.perform(get("/revistas")).andDo(print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@Order(2)
	void insertarPrueba() {
		try {
			mock.perform(post("/revista")
					.contentType(MediaType.APPLICATION_JSON)
					.content("{\"clave\":\"5\",\"nombre\":\"Ramiro\",\"apellidos\":\"Sánchez\",\"revista\":\"Revista Chilena\",\"anio\":2022}"))
			.andDo(print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@Order(3)
	void actualizarPrueba() {
		try {
			mock.perform(put("/revista")
					.contentType(MediaType.APPLICATION_JSON)
					.content("{\"clave\":\"2\",\"nombre\":\"Pedro Juan\",\"apellidos\":\"Sánchez\",\"revista\":\"Revista del Norte y del Sur\",\"anio\":2015}"))
			.andDo(print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
