package org.siir.redalyc.dao;

import java.util.List;

import org.siir.redalyc.model.entities.uredalyc.Tblentrev;

public interface RevistaDAO {
	void agregarActualizarRevista(Tblentrev revista);
	Tblentrev recuperarRevista(long clave);
	void eliminarRevista(long clave);
	List<Object[]> recuperarRevistasLinea();
}
