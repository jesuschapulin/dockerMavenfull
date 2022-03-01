package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBLENTARE database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLENTARE")
public class Tblentare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@SequenceGenerator(name="TBLENTARE_CVEENTARE_GENERATOR", sequenceName="TBLENTARE_SEQUENCE")
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLENTARE_CVEENTARE_GENERATOR")
	@Column(name="CVEENTARE")
	private long cveentare;

	@Column(name="EDOENTARE")
	private BigDecimal edoentare;

	@Column(name="GPOENTARE")
	private BigDecimal gpoentare;

	@Column(name="NOMENTARE")
	private String nomentare;

	//bi-directional many-to-one association to Tblentrev
	@OneToMany(mappedBy="tblentare1")
	private List<Tblentrev> tblentrevs1;

	//bi-directional many-to-one association to Tblentrev
	@OneToMany(mappedBy="tblentare2")
	private List<Tblentrev> tblentrevs2;

	//bi-directional many-to-one association to Tblentrev
	@OneToMany(mappedBy="tblentare3")
	private List<Tblentrev> tblentrevs3;

	public Tblentare() {
	}

	public long getCveentare() {
		return this.cveentare;
	}

	public void setCveentare(long cveentare) {
		this.cveentare = cveentare;
	}

	public BigDecimal getEdoentare() {
		return this.edoentare;
	}

	public void setEdoentare(BigDecimal edoentare) {
		this.edoentare = edoentare;
	}

	public BigDecimal getGpoentare() {
		return this.gpoentare;
	}

	public void setGpoentare(BigDecimal gpoentare) {
		this.gpoentare = gpoentare;
	}

	public String getNomentare() {
		return this.nomentare;
	}

	public void setNomentare(String nomentare) {
		this.nomentare = nomentare;
	}

	public List<Tblentrev> getTblentrevs1() {
		return this.tblentrevs1;
	}

	public void setTblentrevs1(List<Tblentrev> tblentrevs1) {
		this.tblentrevs1 = tblentrevs1;
	}

	public Tblentrev addTblentrevs1(Tblentrev tblentrevs1) {
		getTblentrevs1().add(tblentrevs1);
		tblentrevs1.setTblentare1(this);

		return tblentrevs1;
	}

	public Tblentrev removeTblentrevs1(Tblentrev tblentrevs1) {
		getTblentrevs1().remove(tblentrevs1);
		tblentrevs1.setTblentare1(null);

		return tblentrevs1;
	}

	public List<Tblentrev> getTblentrevs2() {
		return this.tblentrevs2;
	}

	public void setTblentrevs2(List<Tblentrev> tblentrevs2) {
		this.tblentrevs2 = tblentrevs2;
	}

	public Tblentrev addTblentrevs2(Tblentrev tblentrevs2) {
		getTblentrevs2().add(tblentrevs2);
		tblentrevs2.setTblentare2(this);

		return tblentrevs2;
	}

	public Tblentrev removeTblentrevs2(Tblentrev tblentrevs2) {
		getTblentrevs2().remove(tblentrevs2);
		tblentrevs2.setTblentare2(null);

		return tblentrevs2;
	}

	public List<Tblentrev> getTblentrevs3() {
		return this.tblentrevs3;
	}

	public void setTblentrevs3(List<Tblentrev> tblentrevs3) {
		this.tblentrevs3 = tblentrevs3;
	}

	public Tblentrev addTblentrevs3(Tblentrev tblentrevs3) {
		getTblentrevs3().add(tblentrevs3);
		tblentrevs3.setTblentare3(this);

		return tblentrevs3;
	}

	public Tblentrev removeTblentrevs3(Tblentrev tblentrevs3) {
		getTblentrevs3().remove(tblentrevs3);
		tblentrevs3.setTblentare3(null);

		return tblentrevs3;
	}

}