package org.siir.redalyc.model.entities.usuarios;

import java.io.Serializable;

import javax.persistence.*;

import org.siir.redalyc.model.entities.uredalyc.Tblentrev;


/**
 * The persistent class for the TBLREVUSU database table.
 * tabla de relacion entre usuario y revista
 */
@Entity
@Table(schema="USUARIOS", name="TBLREVUSU")
public class Tblrevusu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLREVUSU_CVEUSUREV_GENERATOR", sequenceName="USUARIOS.TBLREVUSU_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLREVUSU_CVEUSUREV_GENERATOR")
	private long cveusurev;

	private String fecrevusu;

	private String obsrevusu;
	
	///bi-directional many-to-one association to Tblentrev
	@ManyToOne
	@JoinColumn(name="CVEENTREV")
	private Tblentrev tblentrev;

	//bi-directional many-to-one association to Tbltodusu
	@ManyToOne
	@JoinColumn(name="CVEENTUSU")
	private Tbltodusu tbltodusu1;

	//bi-directional many-to-one association to Tbltodusu
	@ManyToOne
	@JoinColumn(name="CVEUSUASG")
	private Tbltodusu tbltodusu2;

	public Tblrevusu() {
	}

	public long getCveusurev() {
		return this.cveusurev;
	}

	public void setCveusurev(long cveusurev) {
		this.cveusurev = cveusurev;
	}

	public String getFecrevusu() {
		return this.fecrevusu;
	}

	public void setFecrevusu(String fecrevusu) {
		this.fecrevusu = fecrevusu;
	}

	public String getObsrevusu() {
		return this.obsrevusu;
	}

	public void setObsrevusu(String obsrevusu) {
		this.obsrevusu = obsrevusu;
	}

	public Tblentrev getTblentrev() {
		return tblentrev;
	}

	public void setTblentrev(Tblentrev tblentrev) {
		this.tblentrev = tblentrev;
	}

	public Tbltodusu getTbltodusu1() {
		return this.tbltodusu1;
	}

	public void setTbltodusu1(Tbltodusu tbltodusu1) {
		this.tbltodusu1 = tbltodusu1;
	}

	public Tbltodusu getTbltodusu2() {
		return this.tbltodusu2;
	}

	public void setTbltodusu2(Tbltodusu tbltodusu2) {
		this.tbltodusu2 = tbltodusu2;
	}

}