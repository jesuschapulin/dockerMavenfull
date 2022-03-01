package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;


/**
 * The persistent class for the TBLARTAUT database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLARTAUT")
public class Tblartaut implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLARTAUT_CVEARTAUT_GENERATOR", sequenceName="UREDALYC.TBLARTAUT_SEQUENCE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLARTAUT_CVEARTAUT_GENERATOR")
	private long cveartaut;

	private BigDecimal priartaut;

	//bi-directional many-to-one association to Tblentaut2
	@ManyToOne
	@JoinColumn(name="CVEENTAUT")
	private Tblentaut2 tblentaut2;

	//bi-directional many-to-one association to Tblrevtit
	@ManyToOne
	@JoinColumn(name="CVEREVTIT")
	private Tblrevtit tblrevtit;

	public Tblartaut() {
	}

	public long getCveartaut() {
		return this.cveartaut;
	}

	public void setCveartaut(long cveartaut) {
		this.cveartaut = cveartaut;
	}

	public BigDecimal getPriartaut() {
		return this.priartaut;
	}

	public void setPriartaut(BigDecimal priartaut) {
		this.priartaut = priartaut;
	}

	public Tblentaut2 getTblentaut2() {
		return this.tblentaut2;
	}

	public void setTblentaut2(Tblentaut2 tblentaut2) {
		this.tblentaut2 = tblentaut2;
	}

	public Tblrevtit getTblrevtit() {
		return this.tblrevtit;
	}

	public void setTblrevtit(Tblrevtit tblrevtit) {
		this.tblrevtit = tblrevtit;
	}

}