package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the TBLENTIDI database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLENTIDI")
public class Tblentidi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLENTIDI_CVEENTIDI_GENERATOR", sequenceName="UREDALYC.TBLENTIDI_SEQUENCE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLENTIDI_CVEENTIDI_GENERATOR")
	private long cveentidi;

	private String abrentidi;

	private String nomentidi;

	//bi-directional many-to-one association to Tblentrev
	@OneToMany(mappedBy="tblentidi1")
	private List<Tblentrev> tblentrevs1;

	//bi-directional many-to-one association to Tblentrev
	@OneToMany(mappedBy="tblentidi2")
	private List<Tblentrev> tblentrevs2;

	//bi-directional many-to-one association to Tblentrev
	@OneToMany(mappedBy="tblentidi3")
	private List<Tblentrev> tblentrevs3;

	@JsonBackReference("tblrevtits1-tblentidi1")
	//bi-directional many-to-one association to Tblrevtit
	@OneToMany(mappedBy="tblentidi1")
	private List<Tblrevtit> tblrevtits1;

	@JsonBackReference("tblrevtits2-tblentidi2")
	//bi-directional many-to-one association to Tblrevtit
	@OneToMany(mappedBy="tblentidi2")
	private List<Tblrevtit> tblrevtits2;

	@JsonBackReference("tblrevtits3-tblentidi3")
	//bi-directional many-to-one association to Tblrevtit
	@OneToMany(mappedBy="tblentidi3")
	private List<Tblrevtit> tblrevtits3;

	//bi-directional many-to-one association to Tbltitrsm
	@OneToMany(mappedBy="tblentidi")
	private List<Tbltitrsm> tbltitrsms;
	
	@JsonBackReference("arcrevtits-tblentidiarc")
	//bi-directional many-to-one association to Arcrevtit
	@OneToMany(mappedBy="tblentidiarc")
	private List<Arcrevtit> arcrevtits;

	public Tblentidi() {
	}

	public long getCveentidi() {
		return this.cveentidi;
	}

	public void setCveentidi(long cveentidi) {
		this.cveentidi = cveentidi;
	}

	@JsonIgnore
	public String getAbrentidi() {
		return this.abrentidi;
	}

	public void setAbrentidi(String abrentidi) {
		this.abrentidi = abrentidi;
	}

	public String getNomentidi() {
		return this.nomentidi;
	}

	public void setNomentidi(String nomentidi) {
		this.nomentidi = nomentidi;
	}
	
	@JsonIgnore
	public List<Tblentrev> getTblentrevs1() {
		return this.tblentrevs1;
	}

	public void setTblentrevs1(List<Tblentrev> tblentrevs1) {
		this.tblentrevs1 = tblentrevs1;
	}

	public Tblentrev addTblentrevs1(Tblentrev tblentrevs1) {
		getTblentrevs1().add(tblentrevs1);
		tblentrevs1.setTblentidi1(this);

		return tblentrevs1;
	}

	public Tblentrev removeTblentrevs1(Tblentrev tblentrevs1) {
		getTblentrevs1().remove(tblentrevs1);
		tblentrevs1.setTblentidi1(null);

		return tblentrevs1;
	}

	@JsonIgnore
	public List<Tblentrev> getTblentrevs2() {
		return this.tblentrevs2;
	}

	public void setTblentrevs2(List<Tblentrev> tblentrevs2) {
		this.tblentrevs2 = tblentrevs2;
	}

	public Tblentrev addTblentrevs2(Tblentrev tblentrevs2) {
		getTblentrevs2().add(tblentrevs2);
		tblentrevs2.setTblentidi2(this);

		return tblentrevs2;
	}

	public Tblentrev removeTblentrevs2(Tblentrev tblentrevs2) {
		getTblentrevs2().remove(tblentrevs2);
		tblentrevs2.setTblentidi2(null);

		return tblentrevs2;
	}

	@JsonIgnore
	public List<Tblentrev> getTblentrevs3() {
		return this.tblentrevs3;
	}

	public void setTblentrevs3(List<Tblentrev> tblentrevs3) {
		this.tblentrevs3 = tblentrevs3;
	}

	public Tblentrev addTblentrevs3(Tblentrev tblentrevs3) {
		getTblentrevs3().add(tblentrevs3);
		tblentrevs3.setTblentidi3(this);

		return tblentrevs3;
	}

	public Tblentrev removeTblentrevs3(Tblentrev tblentrevs3) {
		getTblentrevs3().remove(tblentrevs3);
		tblentrevs3.setTblentidi3(null);

		return tblentrevs3;
	}

	public List<Tblrevtit> getTblrevtits1() {
		return this.tblrevtits1;
	}

	public void setTblrevtits1(List<Tblrevtit> tblrevtits1) {
		this.tblrevtits1 = tblrevtits1;
	}

	public Tblrevtit addTblrevtits1(Tblrevtit tblrevtits1) {
		getTblrevtits1().add(tblrevtits1);
		tblrevtits1.setTblentidi1(this);

		return tblrevtits1;
	}

	public Tblrevtit removeTblrevtits1(Tblrevtit tblrevtits1) {
		getTblrevtits1().remove(tblrevtits1);
		tblrevtits1.setTblentidi1(null);

		return tblrevtits1;
	}

	public List<Tblrevtit> getTblrevtits2() {
		return this.tblrevtits2;
	}

	public void setTblrevtits2(List<Tblrevtit> tblrevtits2) {
		this.tblrevtits2 = tblrevtits2;
	}

	public Tblrevtit addTblrevtits2(Tblrevtit tblrevtits2) {
		getTblrevtits2().add(tblrevtits2);
		tblrevtits2.setTblentidi2(this);

		return tblrevtits2;
	}

	public Tblrevtit removeTblrevtits2(Tblrevtit tblrevtits2) {
		getTblrevtits2().remove(tblrevtits2);
		tblrevtits2.setTblentidi2(null);

		return tblrevtits2;
	}

	public List<Tblrevtit> getTblrevtits3() {
		return this.tblrevtits3;
	}

	public void setTblrevtits3(List<Tblrevtit> tblrevtits3) {
		this.tblrevtits3 = tblrevtits3;
	}

	public Tblrevtit addTblrevtits3(Tblrevtit tblrevtits3) {
		getTblrevtits3().add(tblrevtits3);
		tblrevtits3.setTblentidi3(this);

		return tblrevtits3;
	}

	public Tblrevtit removeTblrevtits3(Tblrevtit tblrevtits3) {
		getTblrevtits3().remove(tblrevtits3);
		tblrevtits3.setTblentidi3(null);

		return tblrevtits3;
	}

	@JsonIgnore
	public List<Tbltitrsm> getTbltitrsms() {
		return this.tbltitrsms;
	}

	public void setTbltitrsms(List<Tbltitrsm> tbltitrsms) {
		this.tbltitrsms = tbltitrsms;
	}

	public Tbltitrsm addTbltitrsm(Tbltitrsm tbltitrsm) {
		getTbltitrsms().add(tbltitrsm);
		tbltitrsm.setTblentidi(this);

		return tbltitrsm;
	}

	public Tbltitrsm removeTbltitrsm(Tbltitrsm tbltitrsm) {
		getTbltitrsms().remove(tbltitrsm);
		tbltitrsm.setTblentidi(null);

		return tbltitrsm;
	}

	public List<Arcrevtit> getArcrevtits() {
		return arcrevtits;
	}

	public void setArcrevtits(List<Arcrevtit> arcrevtits) {
		this.arcrevtits = arcrevtits;
	}

}