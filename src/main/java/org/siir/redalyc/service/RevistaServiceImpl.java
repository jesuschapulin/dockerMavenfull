package org.siir.redalyc.service;

import java.util.ArrayList;
import java.util.List;

import org.siir.redalyc.dao.RevistaDAO;
import org.siir.redalyc.model.entities.uredalyc.Tblentrev;
import org.siir.redalyc.model.pojos.Revista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RevistaServiceImpl implements RevistaService {

	@Autowired
	private RevistaDAO revistaDAO;
	
	/**
	 * Guarda o actualiza una revista
	 * @param revista Entidad revista
	 */
	@Override
	public void agregarActualizarRevista(Tblentrev revista) {
		revistaDAO.agregarActualizarRevista(revista);	
	}

	/**
	 * Recupera una clave por su clave
	 * @param clave de la revista
	 */
	@Override
	public Tblentrev recuperarRevista(long clave) {
		return revistaDAO.recuperarRevista(clave);
	}

	/**
	 * Elimina una clave por su clave
	 * @param clave de la revista
	 */
	@Override
	public void eliminarRevista(long clave) {
		revistaDAO.eliminarRevista(clave);
	}

	/**
	 * Recupera las 20 primeras revistas en linea
	 */
	@Override
	public List<Revista> recuperarRevistasLinea() {
		List<Object[]> revs = revistaDAO.recuperarRevistasLinea();
		List<Revista> revistas = new ArrayList<Revista>();
		for(Object[] r : revs) {
			Revista revista = new Revista();
			revista.setClave((long) r[0]);
			revista.setNombre((String) r[1]);
			revistas.add(revista);
		}
		return revistas;
	}
}
