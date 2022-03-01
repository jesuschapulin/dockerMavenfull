package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;


/**
 * The persistent class for the TBLTITRSM database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLTITRSM")
public class Tbltitrsm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLTITRSM_CVETITRSM_GENERATOR", sequenceName="UREDALYC.TBLTITRSM_SEQUENCE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLTITRSM_CVETITRSM_GENERATOR")
	private long cvetitrsm;

	private BigDecimal ordtitrsm;

	private String palcvetit;

	private String rsmtitulo;

	//bi-directional many-to-one association to Tblentidi
	@ManyToOne
	@JoinColumn(name="IDITITRSM")
	private Tblentidi tblentidi;

	//bi-directional many-to-one association to Tblrevtit
	@ManyToOne
	@JoinColumn(name="CVEREVTIT")
	private Tblrevtit tblrevtit;

	//bi-directional one-to-one association to Tbltitrsm
	@OneToOne
	@PrimaryKeyJoinColumn(name="CVETITRSM")
	private Tbltitrsm tbltitrsm1;

	//bi-directional one-to-one association to Tbltitrsm
	@OneToOne(mappedBy="tbltitrsm1")
	private Tbltitrsm tbltitrsm2;

	public Tbltitrsm() {
	}

	public long getCvetitrsm() {
		return this.cvetitrsm;
	}

	public void setCvetitrsm(long cvetitrsm) {
		this.cvetitrsm = cvetitrsm;
	}

	public BigDecimal getOrdtitrsm() {
		return this.ordtitrsm;
	}

	public void setOrdtitrsm(BigDecimal ordtitrsm) {
		this.ordtitrsm = ordtitrsm;
	}

	public String getPalcvetit() {
		return this.palcvetit;
	}

	public void setPalcvetit(String palcvetit) {
		this.palcvetit = palcvetit;
	}

	public String getRsmtitulo() {
		return this.rsmtitulo;
	}

	public void setRsmtitulo(String rsmtitulo) {
		this.rsmtitulo = rsmtitulo;
	}

	public Tblentidi getTblentidi() {
		return this.tblentidi;
	}

	public void setTblentidi(Tblentidi tblentidi) {
		this.tblentidi = tblentidi;
	}

	public Tblrevtit getTblrevtit() {
		return this.tblrevtit;
	}

	public void setTblrevtit(Tblrevtit tblrevtit) {
		this.tblrevtit = tblrevtit;
	}

	public Tbltitrsm getTbltitrsm1() {
		return this.tbltitrsm1;
	}

	public void setTbltitrsm1(Tbltitrsm tbltitrsm1) {
		this.tbltitrsm1 = tbltitrsm1;
	}

	public Tbltitrsm getTbltitrsm2() {
		return this.tbltitrsm2;
	}

	public void setTbltitrsm2(Tbltitrsm tbltitrsm2) {
		this.tbltitrsm2 = tbltitrsm2;
	}

}