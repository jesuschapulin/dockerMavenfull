package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SIIRTRANSACCION database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="SIIRTRANSACCION")
public class Siirtransaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SIIRTRANSACCION_CVETRANSACCION_GENERATOR", sequenceName="UREDALYC.SIIRTRANSACCION_SEQUENCE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SIIRTRANSACCION_CVETRANSACCION_GENERATOR")
	private long cvetransaccion;

	private BigDecimal cverecurso;

	private BigDecimal cvetpotrans;

	private BigDecimal cveusutran;

	private String fecusutran;

	private String horatransaccion;

	public Siirtransaccion() {
	}

	public long getCvetransaccion() {
		return this.cvetransaccion;
	}

	public void setCvetransaccion(long cvetransaccion) {
		this.cvetransaccion = cvetransaccion;
	}

	public BigDecimal getCverecurso() {
		return this.cverecurso;
	}

	public void setCverecurso(BigDecimal cverecurso) {
		this.cverecurso = cverecurso;
	}

	public BigDecimal getCvetpotrans() {
		return this.cvetpotrans;
	}

	public void setCvetpotrans(BigDecimal cvetpotrans) {
		this.cvetpotrans = cvetpotrans;
	}

	public BigDecimal getCveusutran() {
		return this.cveusutran;
	}

	public void setCveusutran(BigDecimal cveusutran) {
		this.cveusutran = cveusutran;
	}

	public String getFecusutran() {
		return this.fecusutran;
	}

	public void setFecusutran(String fecusutran) {
		this.fecusutran = fecusutran;
	}

	public String getHoratransaccion() {
		return this.horatransaccion;
	}

	public void setHoratransaccion(String horatransaccion) {
		this.horatransaccion = horatransaccion;
	}

}