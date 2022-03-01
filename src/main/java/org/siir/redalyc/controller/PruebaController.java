package org.siir.redalyc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.siir.redalyc.model.Prueba;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class PruebaController {
	private List<Prueba> pruebas;
	
	@PostConstruct//Se crea al momento de implementar el controlador
	public void init() {
		pruebas = new ArrayList<Prueba>();
		pruebas.add(new Prueba("1", "María", "López", "Revista Colombiana", 2018 ));
		pruebas.add(new Prueba("2", "Pedro", "Sánchez", "Revista del Norte", 2015 ));
		pruebas.add(new Prueba("3", "Juan", "García", "Revista de Idiomas", 2015 ));
		pruebas.add(new Prueba("4", "Flor", "García", "Revista Argentina", 2020 ));
	}
	
	//Recuperar un registro
	@GetMapping(value = "revista", produces = MediaType.APPLICATION_JSON_VALUE)
	public Prueba getPrueba() {
		return new Prueba("1", "José", "Pérez", "Revista Mexicana", 2022);
	}
	
	//Recuperar listados
	@GetMapping(value = "revistas", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Prueba> getPruebas() {
		return pruebas;
	}
	
	//Eliminar un registro
	@DeleteMapping(value = "revista/{clave}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String deletePrueba(@PathVariable("clave") String clave) {
		int tamInicial = pruebas.size();
		pruebas.removeIf(p -> p.getClave().equals(clave));//Elimina el elemento con lamda
		
		if(pruebas.size() < tamInicial)
			return "Eliminado";
		else
			return "No se encuentra el registro";
	}
	
	//Guardar un registro
	@PostMapping(value = "revista", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Prueba> insertPrueba(@RequestBody Prueba prueba) {
		pruebas.add(prueba);
		return pruebas;
	}
	
	//Actualizar un registro
	@PutMapping(value = "revista", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Prueba> updatePrueba(@RequestBody Prueba prueba) {//No se deben agregar parametros, solo el objeto como RequestBody
		for(int i = 0; i < pruebas.size(); i++) {
			if(pruebas.get(i).getClave().equals(prueba.getClave())) {
				pruebas.set(i, prueba);
			}
		}
		return pruebas;
	}
	
	@GetMapping(value = "revistas/{anio}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Prueba> buscarRevistasPorAnio(@PathVariable("anio") int anio) {
		List<Prueba> resultados = new ArrayList<Prueba>();
		
		for(Prueba prueba : pruebas) {
			if(prueba.getAnio() == anio) {
				resultados.add(prueba);
			}
		}
		
		return resultados;
	}
	
	@GetMapping(value = "revistasxml", produces = MediaType.APPLICATION_XML_VALUE)
	public List<Prueba> getPruebasXML() {
		return pruebas;
	}
	
}
