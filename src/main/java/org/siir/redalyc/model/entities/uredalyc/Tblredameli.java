package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the TBLREDAMELI database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLREDAMELI")
public class Tblredameli implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLREDAMELI_CVEREDAMELI_GENERATOR", sequenceName="UREDALYC.SQ_TBLREDAMELI", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLREDAMELI_CVEREDAMELI_GENERATOR")
	private long cveredameli;//Clave que sirve como secuencia de la tabla

	private long cverevameli;//Clave de revista Ameli

	@JsonBackReference("tblentrev-tblredameli")
	//bi-directional one-to-one association to Tblentrev
	@OneToOne
	@PrimaryKeyJoinColumn(name="CVEREVREDALYC")
	private Tblentrev tblentrev;

	public Tblredameli() {
	}

	public long getCveredameli() {
		return this.cveredameli;
	}

	public void setCveredameli(long cveredameli) {
		this.cveredameli = cveredameli;
	}

	public long getCverevameli() {
		return this.cverevameli;
	}

	public void setCverevameli(long cverevameli) {
		this.cverevameli = cverevameli;
	}

	public Tblentrev getTblentrev() {
		return tblentrev;
	}

	public void setTblentrev(Tblentrev tblentrev) {
		this.tblentrev = tblentrev;
	}
}