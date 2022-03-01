package org.siir.redalyc.controller;

import java.util.List;

import org.siir.redalyc.model.entities.uredalyc.Tblentrev;
import org.siir.redalyc.model.pojos.Revista;
import org.siir.redalyc.service.RevistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

//Evita que se bloquee el llamado desde Script, por default se bloquean esas llamadas en los microservicios
//puede llevar los metodos o no, si todos se permiten
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
public class RevistaController {
	@Autowired
	private RevistaService revistaService;
	
	/**
	 * Recupera una revista por medio de su clave
	 * @param clave Clave de la revista
	 * @return Revista en formato JSON
	 */
	@GetMapping(value = "journal/{clave}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Tblentrev recuperaRevista(@PathVariable("clave") String clave) {
		System.out.println("CLAVE: " + clave);
		return revistaService.recuperarRevista(Long.parseLong(clave));
	}
	
	/**
	 * Recupera un listado de revistas (clave, nombre) limitado a las primeras 20
	 * @param clave Clave de la revista
	 * @return Listado de revistas en formato JSON
	 */
	@GetMapping(value = "journals", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Revista> recuperarRevistasLinea() {	
		return revistaService.recuperarRevistasLinea();
	}
}
