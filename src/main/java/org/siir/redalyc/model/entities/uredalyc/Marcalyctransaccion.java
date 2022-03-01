package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(schema="UREDALYC", name="MARCALYCTRANSACCION")
public class Marcalyctransaccion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="MARCALYCTRANSACCION_CVETRANSACCION_GENERATOR", sequenceName="UREDALYC.SQ_MARCALYCTRANSACCION", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MARCALYCTRANSACCION_CVETRANSACCION_GENERATOR")
	private long cvetransaccion;
	private BigDecimal cverecurso;
	private BigDecimal cvetpotrans;
	private BigDecimal cveusutran;
	private String fecusutran;
	private String horatransaccion;	
	private String tpoestilopdf;
	
	public Marcalyctransaccion(){
		
	}
	
	public long getCvetransaccion() {
		return cvetransaccion;
	}

	public void setCvetransaccion(long cvetransaccion) {
		this.cvetransaccion = cvetransaccion;
	}

	public BigDecimal getCverecurso() {
		return cverecurso;
	}

	public void setCverecurso(BigDecimal cverecurso) {
		this.cverecurso = cverecurso;
	}

	public BigDecimal getCvetpotrans() {
		return cvetpotrans;
	}

	public void setCvetpotrans(BigDecimal cvetpotrans) {
		this.cvetpotrans = cvetpotrans;
	}

	public BigDecimal getCveusutran() {
		return cveusutran;
	}

	public void setCveusutran(BigDecimal cveusutran) {
		this.cveusutran = cveusutran;
	}

	public String getFecusutran() {
		return fecusutran;
	}

	public void setFecusutran(String fecusutran) {
		this.fecusutran = fecusutran;
	}

	public String getHoratransaccion() {
		return horatransaccion;
	}

	public void setHoratransaccion(String horatransaccion) {
		this.horatransaccion = horatransaccion;
	}

	public String getTpoestilopdf() {
		return tpoestilopdf;
	}

	public void setTpoestilopdf(String tpoestilopdf) {
		this.tpoestilopdf = tpoestilopdf;
	}
	
}
