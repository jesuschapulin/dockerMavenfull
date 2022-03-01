package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MARCTRANSACCION database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="MARCTRANSACCION")
public class Marctransaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MARCTRANSACCION_CVETRANSACCION_GENERATOR", sequenceName="UREDALYC.SQ_MARCTRANSACCION", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MARCTRANSACCION_CVETRANSACCION_GENERATOR")
	private long cvetransaccion;

	private BigDecimal cveusutran;//clave de usuario

	private String fecentusu;//fecha de inicio de sesion

	private String fecsalusu;//fecha de salida de sesion

	private String horentusu;//hora de inicio de sesion

	private String horsalusu;//hora de salida de sesion

	private String ipusutran;//direccion ip del usuario

	private String navusutran;//navegador del usuario

	private String sousutran;//sistema operativo del usuario

	public Marctransaccion() {
	}

	public long getCvetransaccion() {
		return this.cvetransaccion;
	}

	public void setCvetransaccion(long cvetransaccion) {
		this.cvetransaccion = cvetransaccion;
	}

	public BigDecimal getCveusutran() {
		return this.cveusutran;
	}

	public void setCveusutran(BigDecimal cveusutran) {
		this.cveusutran = cveusutran;
	}

	
	public String getFecentusu() {
		return fecentusu;
	}

	public void setFecentusu(String fecentusu) {
		this.fecentusu = fecentusu;
	}

	public String getFecsalusu() {
		return fecsalusu;
	}

	public void setFecsalusu(String fecsalusu) {
		this.fecsalusu = fecsalusu;
	}

	public String getHorentusu() {
		return this.horentusu;
	}

	public void setHorentusu(String horentusu) {
		this.horentusu = horentusu;
	}

	public String getHorsalusu() {
		return this.horsalusu;
	}

	public void setHorsalusu(String horsalusu) {
		this.horsalusu = horsalusu;
	}

	public String getIpusutran() {
		return this.ipusutran;
	}

	public void setIpusutran(String ipusutran) {
		this.ipusutran = ipusutran;
	}

	public String getNavusutran() {
		return this.navusutran;
	}

	public void setNavusutran(String navusutran) {
		this.navusutran = navusutran;
	}

	public String getSousutran() {
		return this.sousutran;
	}

	public void setSousutran(String sousutran) {
		this.sousutran = sousutran;
	}

}