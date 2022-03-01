package org.siir.redalyc.dao;

import java.util.List;

import org.siir.redalyc.model.entities.uredalyc.Tblentrev;
import org.siir.redalyc.repository.RevistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RevistaDAOImpl implements RevistaDAO {

	@Autowired
	private RevistaRepository revistaRepository;
	
	/**
	 * Guarda o actualiza una revista
	 * @param revista Entidad revista
	 */
	@Override
	public void agregarActualizarRevista(Tblentrev revista) {
		revistaRepository.save(revista);
	}

	/**
	 * Recupera una clave por su clave
	 * @param clave de la revista
	 */
	@Override
	public Tblentrev recuperarRevista(long clave) {
		return revistaRepository.findByCveentrev(clave);
	}

	/**
	 * Elimina una clave por su clave
	 * @param clave de la revista
	 */
	@Override
	public void eliminarRevista(long clave) {
		revistaRepository.deleteById(clave);
	}

	/**
	 * Recupera las 15 primeras revistas en linea
	 */
	@Override
	public List<Object[]> recuperarRevistasLinea() {
		return revistaRepository.recuperarRevistasLinea();
	}

}
