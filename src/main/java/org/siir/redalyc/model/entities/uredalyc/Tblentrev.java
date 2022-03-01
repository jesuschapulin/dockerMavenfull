package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import org.siir.redalyc.model.entities.arribos.Tblrevnumarb;
import org.siir.redalyc.model.entities.usuarios.Tblrevusu;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBLENTREV database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLENTREV")
public class Tblentrev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLENTREV_CVEENTREV_GENERATOR", sequenceName="UREDALYC.TBLENTREV_SEQUENCE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLENTREV_CVEENTREV_GENERATOR")
	private long cveentrev;

	private String ciuentrev;

	private String edoentrev;

	private BigDecimal embargo;

	private String imgentrev;

	private BigDecimal intsinnor;

	private String nomentrev;

	private String urlentrev;
	
	//bi-directional many-to-one association to Tblrevusu
	@OneToMany(mappedBy="tblentrev")
	private List<Tblrevusu> tblrevusus;

	//bi-directional many-to-one association to Tblentare
	@ManyToOne
	@JoinColumn(name="CVEAREPRIN")
	private Tblentare tblentare1;

	//bi-directional many-to-one association to Tblentare
	@ManyToOne
	@JoinColumn(name="CVEARETER")
	private Tblentare tblentare2;

	//bi-directional many-to-one association to Tblentare
	@ManyToOne
	@JoinColumn(name="CVEARESEC")
	private Tblentare tblentare3;

	//bi-directional many-to-one association to Tblentidi
	@ManyToOne
	@JoinColumn(name="IDITERREV")
	private Tblentidi tblentidi1;

	//bi-directional many-to-one association to Tblentidi
	@ManyToOne
	@JoinColumn(name="IDISECREV")
	private Tblentidi tblentidi2;

	//bi-directional many-to-one association to Tblentidi
	@ManyToOne
	@JoinColumn(name="CVEENTIDI")
	private Tblentidi tblentidi3;

	//bi-directional many-to-one association to Tblentint
	@ManyToOne
	@JoinColumn(name="CVEENTINT")
	private Tblentint tblentint;

	@JsonManagedReference("tblentrev-tblindrev")
	//bi-directional one-to-one association to Tblindrev
	@OneToOne(mappedBy="tblentrev")
	private Tblindrev tblindrev;

	@JsonBackReference("tblrevnums-tblentrev")
	//bi-directional many-to-one association to Tblrevnum
	@OneToMany(mappedBy="tblentrev")
	private List<Tblrevnum> tblrevnums;

	//bi-directional many-to-one association to Tblrevtit
	@OneToMany(mappedBy="tblentrev")
	private List<Tblrevtit> tblrevtits;
	
	@OneToOne(mappedBy="tblentrev")
	private Tblrevcan tblrevcan;

	@ManyToOne
	@JoinColumn(name="cveentpai")
	private Tblentnac tblentnac;
	
	//bi-directional many-to-one association to Tblrevnumarb
	@OneToMany(mappedBy="tblentrev")
	private List<Tblrevnumarb> tblrevnumarbs;
	
	@JsonManagedReference("tblentrev-tblredameli")
	//bi-directional one-to-one association to Tblindrev
	@OneToOne(mappedBy="tblentrev")
	private Tblredameli tblredameli;

	public Tblentrev() {
	}

	public long getCveentrev() {
		return this.cveentrev;
	}

	public void setCveentrev(long cveentrev) {
		this.cveentrev = cveentrev;
	}

	@JsonIgnore
	public String getCiuentrev() {
		return this.ciuentrev;
	}

	public void setCiuentrev(String ciuentrev) {
		this.ciuentrev = ciuentrev;
	}

	@JsonIgnore
	public String getEdoentrev() {
		return this.edoentrev;
	}

	public void setEdoentrev(String edoentrev) {
		this.edoentrev = edoentrev;
	}

	@JsonIgnore
	public BigDecimal getEmbargo() {
		return this.embargo;
	}

	public void setEmbargo(BigDecimal embargo) {
		this.embargo = embargo;
	}

	@JsonIgnore
	public String getImgentrev() {
		return this.imgentrev;
	}

	public void setImgentrev(String imgentrev) {
		this.imgentrev = imgentrev;
	}

	@JsonIgnore
	public BigDecimal getIntsinnor() {
		return this.intsinnor;
	}

	public void setIntsinnor(BigDecimal intsinnor) {
		this.intsinnor = intsinnor;
	}

	public String getNomentrev() {
		return this.nomentrev;
	}

	public void setNomentrev(String nomentrev) {
		this.nomentrev = nomentrev;
	}

	@JsonIgnore
	public String getUrlentrev() {
		return this.urlentrev;
	}

	public void setUrlentrev(String urlentrev) {
		this.urlentrev = urlentrev;
	}

	@JsonIgnore
	public List<Tblrevusu> getTblrevusu() {
		return tblrevusus;
	}

	public void setTblrevusu(List<Tblrevusu> tblrevusus) {
		this.tblrevusus = tblrevusus;
	}

	@JsonIgnore
	public Tblentare getTblentare1() {
		return this.tblentare1;
	}

	public void setTblentare1(Tblentare tblentare1) {
		this.tblentare1 = tblentare1;
	}

	@JsonIgnore
	public Tblentare getTblentare2() {
		return this.tblentare2;
	}

	public void setTblentare2(Tblentare tblentare2) {
		this.tblentare2 = tblentare2;
	}

	@JsonIgnore
	public Tblentare getTblentare3() {
		return this.tblentare3;
	}

	public void setTblentare3(Tblentare tblentare3) {
		this.tblentare3 = tblentare3;
	}

	@JsonIgnore
	public Tblentidi getTblentidi1() {
		return this.tblentidi1;
	}

	public void setTblentidi1(Tblentidi tblentidi1) {
		this.tblentidi1 = tblentidi1;
	}

	@JsonIgnore
	public Tblentidi getTblentidi2() {
		return this.tblentidi2;
	}

	public void setTblentidi2(Tblentidi tblentidi2) {
		this.tblentidi2 = tblentidi2;
	}

	@JsonIgnore
	public Tblentidi getTblentidi3() {
		return this.tblentidi3;
	}

	public void setTblentidi3(Tblentidi tblentidi3) {
		this.tblentidi3 = tblentidi3;
	}

	@JsonIgnore
	public Tblentint getTblentint() {
		return this.tblentint;
	}

	public void setTblentint(Tblentint tblentint) {
		this.tblentint = tblentint;
	}

	public Tblindrev getTblindrev() {
		return this.tblindrev;
	}

	public void setTblindrev(Tblindrev tblindrev) {
		this.tblindrev = tblindrev;
	}

	public List<Tblrevnum> getTblrevnums() {
		return this.tblrevnums;
	}

	public void setTblrevnums(List<Tblrevnum> tblrevnums) {
		this.tblrevnums = tblrevnums;
	}

	@JsonIgnore
	public Tblrevcan getTblrevcan() {
		return tblrevcan;
	}

	public void setTblrevcan(Tblrevcan tblrevcan) {
		this.tblrevcan = tblrevcan;
	}

	public Tblrevnum addTblrevnum(Tblrevnum tblrevnum) {
		getTblrevnums().add(tblrevnum);
		tblrevnum.setTblentrev(this);

		return tblrevnum;
	}

	public Tblrevnum removeTblrevnum(Tblrevnum tblrevnum) {
		getTblrevnums().remove(tblrevnum);
		tblrevnum.setTblentrev(null);

		return tblrevnum;
	}

	@JsonIgnore
	public List<Tblrevtit> getTblrevtits() {
		return this.tblrevtits;
	}

	public void setTblrevtits(List<Tblrevtit> tblrevtits) {
		this.tblrevtits = tblrevtits;
	}

	public Tblrevtit addTblrevtit(Tblrevtit tblrevtit) {
		getTblrevtits().add(tblrevtit);
		tblrevtit.setTblentrev(this);

		return tblrevtit;
	}

	public Tblrevtit removeTblrevtit(Tblrevtit tblrevtit) {
		getTblrevtits().remove(tblrevtit);
		tblrevtit.setTblentrev(null);

		return tblrevtit;
	}
	
	@JsonIgnore
	public Tblentnac getTblentnac() {
		return tblentnac;
	}

	public void setTblentnac(Tblentnac tblentnac) {
		this.tblentnac = tblentnac;
	}

	@JsonIgnore
	public List<Tblrevnumarb> getTblrevnumarbs() {
		return tblrevnumarbs;
	}

	public void setTblrevnumarbs(List<Tblrevnumarb> tblrevnumarbs) {
		this.tblrevnumarbs = tblrevnumarbs;
	}

	public Tblredameli getTblredameli() {
		return tblredameli;
	}

	public void setTblredameli(Tblredameli tblredameli) {
		this.tblredameli = tblredameli;
	}
}