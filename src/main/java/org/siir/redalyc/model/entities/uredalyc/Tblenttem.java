package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBLENTTEM database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLENTTEM")
public class Tblenttem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLENTTEM_CVEENTTEM_GENERATOR", sequenceName="UREDALYC.TBLENTTEM_SEQUENCE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLENTTEM_CVEENTTEM_GENERATOR")
	private long cveenttem;

	private BigDecimal cvetempad;

	private String nomenttem;

	//bi-directional many-to-one association to Tblrevtit
	@OneToMany(mappedBy="tblenttem")
	private List<Tblrevtit> tblrevtits;

	public Tblenttem() {
	}

	public long getCveenttem() {
		return this.cveenttem;
	}

	public void setCveenttem(long cveenttem) {
		this.cveenttem = cveenttem;
	}

	public BigDecimal getCvetempad() {
		return this.cvetempad;
	}

	public void setCvetempad(BigDecimal cvetempad) {
		this.cvetempad = cvetempad;
	}

	public String getNomenttem() {
		return this.nomenttem;
	}

	public void setNomenttem(String nomenttem) {
		this.nomenttem = nomenttem;
	}

	public List<Tblrevtit> getTblrevtits() {
		return this.tblrevtits;
	}

	public void setTblrevtits(List<Tblrevtit> tblrevtits) {
		this.tblrevtits = tblrevtits;
	}

	public Tblrevtit addTblrevtit(Tblrevtit tblrevtit) {
		getTblrevtits().add(tblrevtit);
		tblrevtit.setTblenttem(this);

		return tblrevtit;
	}

	public Tblrevtit removeTblrevtit(Tblrevtit tblrevtit) {
		getTblrevtits().remove(tblrevtit);
		tblrevtit.setTblenttem(null);

		return tblrevtit;
	}

}