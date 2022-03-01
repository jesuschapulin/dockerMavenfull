package org.siir.redalyc.repository;

import java.util.List;

import org.siir.redalyc.model.entities.uredalyc.Tblentrev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RevistaRepository extends JpaRepository<Tblentrev, Long> {
	Tblentrev findByCveentrev(long clave);
	
	/**
	 * Recupera un listado de clave, revista en linea y limitado a 20
	 * @return
	 */
	@Query("SELECT r.cveentrev, r.nomentrev FROM Tblentrev r WHERE r.edoentrev = 1 AND ROWNUM BETWEEN 0 AND 20 ORDER BY r.cveentrev")
	List<Object[]> recuperarRevistasLinea();
	
//	@Transactional
//	@Modifying
//	@Query("DELETE FROM Tblentrev t WHERE t.cveentrev = ?1")
//	void eliminarRevistaQuery(long clave);
}
