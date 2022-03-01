package org.siir.redalyc.model.entities.usuarios;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the AREADSUSU database table.
 * tabla de area geogr�fica de usuario
 */
@Entity
@Table(schema="USUARIOS", name="AREADSUSU")
public class Areadsusu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AREADSUSU_CVEAREADS_GENERATOR", sequenceName="USUARIOS.AREADSUSU_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AREADSUSU_CVEAREADS_GENERATOR")
	private long cveareads;

	private String nomareads;

	public Areadsusu() {
	}

	public long getCveareads() {
		return this.cveareads;
	}

	public void setCveareads(long cveareads) {
		this.cveareads = cveareads;
	}

	public String getNomareads() {
		return this.nomareads;
	}

	public void setNomareads(String nomareads) {
		this.nomareads = nomareads;
	}

}