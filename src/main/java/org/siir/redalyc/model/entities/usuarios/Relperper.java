package org.siir.redalyc.model.entities.usuarios;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the RELPERPER database table.
 * tyabla de relacion entre permisos de usuario y permisos de sistema
 */
@Entity
@Table(schema="USUARIOS", name="RELPERPER")
public class Relperper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RELPERPER_CVEPERPER_GENERATOR", sequenceName="USUARIOS.RELPERPER_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RELPERPER_CVEPERPER_GENERATOR")
	private long cveperper;

	//bi-directional many-to-one association to Entperusu
	@ManyToOne
	@JoinColumn(name="CVEPERUSU")
	private Entperusu entperusu;

	//bi-directional many-to-one association to Tblpersi
	@ManyToOne
	@JoinColumn(name="CVEPERSIS")
	private Tblpersi tblpersi;

	public Relperper() {
	}

	public long getCveperper() {
		return this.cveperper;
	}

	public void setCveperper(long cveperper) {
		this.cveperper = cveperper;
	}

	public Entperusu getEntperusu() {
		return this.entperusu;
	}

	public void setEntperusu(Entperusu entperusu) {
		this.entperusu = entperusu;
	}

	public Tblpersi getTblpersi() {
		return this.tblpersi;
	}

	public void setTblpersi(Tblpersi tblpersi) {
		this.tblpersi = tblpersi;
	}

}