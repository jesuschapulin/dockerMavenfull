package org.siir.redalyc.model.entities.usuarios;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the RELPERUSU database table.
 * tabla de relacion de permisos con usuario
 */
@Entity
@Table(schema="USUARIOS", name="RELPERUSU")
public class Relperusu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RELPERUSU_CVERELPER_GENERATOR", sequenceName="USUARIOS.RELPERUSU_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RELPERUSU_CVERELPER_GENERATOR")
	private long cverelper;

	//bi-directional many-to-one association to Entperusu
	@ManyToOne
	@JoinColumn(name="CVEPERUSU")
	private Entperusu entperusu;

	//bi-directional many-to-one association to Tbltodusu
	@ManyToOne
	@JoinColumn(name="CVEENTUSU")
	private Tbltodusu tbltodusu;

	public Relperusu() {
	}

	public long getCverelper() {
		return this.cverelper;
	}

	public void setCverelper(long cverelper) {
		this.cverelper = cverelper;
	}

	public Entperusu getEntperusu() {
		return this.entperusu;
	}

	public void setEntperusu(Entperusu entperusu) {
		this.entperusu = entperusu;
	}

	public Tbltodusu getTbltodusu() {
		return this.tbltodusu;
	}

	public void setTbltodusu(Tbltodusu tbltodusu) {
		this.tbltodusu = tbltodusu;
	}

}