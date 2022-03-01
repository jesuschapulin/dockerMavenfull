package org.siir.redalyc.service;

import java.util.List;

import org.siir.redalyc.model.entities.uredalyc.Tblentrev;
import org.siir.redalyc.model.pojos.Revista;

public interface RevistaService {
	void agregarActualizarRevista(Tblentrev revista);
	Tblentrev recuperarRevista(long clave);
	void eliminarRevista(long clave);
	List<Revista> recuperarRevistasLinea();
}
