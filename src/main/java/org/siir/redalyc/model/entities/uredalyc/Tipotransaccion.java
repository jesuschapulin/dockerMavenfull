package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the TIPOTRANSACCION database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TIPOTRANSACCION")
public class Tipotransaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@SequenceGenerator(name="TIPOTRANSACCION_CVETPOTRANS_GENERATOR", sequenceName="TIPOTRANSACCION_SEQUENCE")
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPOTRANSACCION_CVETPOTRANS_GENERATOR")
	@Column(name="CVETPOTRANS")
	private long cvetpotrans;

	@Column(name="NOMTPOTRANS")
	private String nomtpotrans;

	@Column(name="TPOPROCESO")
	private String tpoproceso;

	public Tipotransaccion() {
	}

	public long getCvetpotrans() {
		return this.cvetpotrans;
	}

	public void setCvetpotrans(long cvetpotrans) {
		this.cvetpotrans = cvetpotrans;
	}

	public String getNomtpotrans() {
		return this.nomtpotrans;
	}

	public void setNomtpotrans(String nomtpotrans) {
		this.nomtpotrans = nomtpotrans;
	}

	public String getTpoproceso() {
		return this.tpoproceso;
	}

	public void setTpoproceso(String tpoproceso) {
		this.tpoproceso = tpoproceso;
	}

}