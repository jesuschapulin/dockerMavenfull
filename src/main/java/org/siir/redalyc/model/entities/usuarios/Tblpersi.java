package org.siir.redalyc.model.entities.usuarios;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the TBLPERSIS database table.
 * tabla con los permisos de sistema
 */
@Entity
@Table(schema="USUARIOS", name="TBLPERSIS")
public class Tblpersi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLPERSIS_CVEPERSIS_GENERATOR", sequenceName="USUARIOS.TBLPERSIS_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLPERSIS_CVEPERSIS_GENERATOR")
	private long cvepersis;

	private String nompersis;

	//bi-directional many-to-one association to Relperper
	@OneToMany(mappedBy="tblpersi")
	private List<Relperper> relperpers;

	public Tblpersi() {
	}

	public long getCvepersis() {
		return this.cvepersis;
	}

	public void setCvepersis(long cvepersis) {
		this.cvepersis = cvepersis;
	}

	public String getNompersis() {
		return this.nompersis;
	}

	public void setNompersis(String nompersis) {
		this.nompersis = nompersis;
	}

	public List<Relperper> getRelperpers() {
		return this.relperpers;
	}

	public void setRelperpers(List<Relperper> relperpers) {
		this.relperpers = relperpers;
	}

	public Relperper addRelperper(Relperper relperper) {
		getRelperpers().add(relperper);
		relperper.setTblpersi(this);

		return relperper;
	}

	public Relperper removeRelperper(Relperper relperper) {
		getRelperpers().remove(relperper);
		relperper.setTblpersi(null);

		return relperper;
	}

}