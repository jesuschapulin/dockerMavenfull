package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBLENTNAC database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLENTNAC")
public class Tblentnac implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLENTNAC_CVEENTNAC_GENERATOR", sequenceName="UREDALYC.TBLENTNAC_SEQUENCE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLENTNAC_CVEENTNAC_GENERATOR")
	private long cveentnac;

	private String codentnac;

	private BigDecimal cveentcont;

	private String latentnac;

	private BigDecimal lonentnac;

	private String nomentnac;

	//bi-directional many-to-one association to Tblentint
	@OneToMany(mappedBy="tblentnac")
	private List<Tblentint> tblentints;

	//bi-directional many-to-one association to Tblentrev
	@OneToMany(mappedBy="tblentnac")
	private List<Tblentrev> tblentrev;
	
	public Tblentnac() {
	}

	public long getCveentnac() {
		return this.cveentnac;
	}

	public void setCveentnac(long cveentnac) {
		this.cveentnac = cveentnac;
	}

	public String getCodentnac() {
		return this.codentnac;
	}

	public void setCodentnac(String codentnac) {
		this.codentnac = codentnac;
	}

	public BigDecimal getCveentcont() {
		return this.cveentcont;
	}

	public void setCveentcont(BigDecimal cveentcont) {
		this.cveentcont = cveentcont;
	}

	public String getLatentnac() {
		return this.latentnac;
	}

	public void setLatentnac(String latentnac) {
		this.latentnac = latentnac;
	}

	public BigDecimal getLonentnac() {
		return this.lonentnac;
	}

	public void setLonentnac(BigDecimal lonentnac) {
		this.lonentnac = lonentnac;
	}

	public String getNomentnac() {
		return this.nomentnac;
	}

	public void setNomentnac(String nomentnac) {
		this.nomentnac = nomentnac;
	}

	public List<Tblentint> getTblentints() {
		return this.tblentints;
	}

	public void setTblentints(List<Tblentint> tblentints) {
		this.tblentints = tblentints;
	}

	public Tblentint addTblentint(Tblentint tblentint) {
		getTblentints().add(tblentint);
		tblentint.setTblentnac(this);

		return tblentint;
	}

	public Tblentint removeTblentint(Tblentint tblentint) {
		getTblentints().remove(tblentint);
		tblentint.setTblentnac(null);

		return tblentint;
	}

	public List<Tblentrev> getTblentrev() {
		return tblentrev;
	}

	public void setTblentrev(List<Tblentrev> tblentrev) {
		this.tblentrev = tblentrev;
	}


 
}