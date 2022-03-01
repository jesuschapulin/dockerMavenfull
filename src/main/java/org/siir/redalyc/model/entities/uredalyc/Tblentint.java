package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBLENTINT database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLENTINT")
public class Tblentint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLENTINT_CVEENTINT_GENERATOR", sequenceName="UREDALYC.TBLENTINT_SEQUENCE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLENTINT_CVEENTINT_GENERATOR")
	private long cveentint;

	private BigDecimal bndelmint;

	private BigDecimal bndnorint;

	private BigDecimal bndvalint;

	private String calleentint;

	private String cpentint;

	private BigDecimal cveentciu;

	private BigDecimal cveentedo;

	private BigDecimal cveinspadre;

	private BigDecimal cveinssinnor;

	private BigDecimal funentint;

	private String imgentint;

	private BigDecimal natjurint;

	private String nomentint;

	private String nominttra;

	private String obsentint;

	private BigDecimal secentint;

	private String sglentint;

	private BigDecimal tpoentint;

	private String urlaltint;

	private String urlentint;

	//bi-directional many-to-one association to Tblentaut2
	@OneToMany(mappedBy="tblentint")
	private List<Tblentaut2> tblentaut2s;

	//bi-directional many-to-one association to Tblentnac
	@ManyToOne
	@JoinColumn(name="CVEENTPAI")
	private Tblentnac tblentnac;

	//bi-directional many-to-one association to Tblentrev
	@OneToMany(mappedBy="tblentint")
	private List<Tblentrev> tblentrevs;

	public Tblentint() {
	}

	public long getCveentint() {
		return this.cveentint;
	}

	public void setCveentint(long cveentint) {
		this.cveentint = cveentint;
	}

	public BigDecimal getBndelmint() {
		return this.bndelmint;
	}

	public void setBndelmint(BigDecimal bndelmint) {
		this.bndelmint = bndelmint;
	}

	public BigDecimal getBndnorint() {
		return this.bndnorint;
	}

	public void setBndnorint(BigDecimal bndnorint) {
		this.bndnorint = bndnorint;
	}

	public BigDecimal getBndvalint() {
		return this.bndvalint;
	}

	public void setBndvalint(BigDecimal bndvalint) {
		this.bndvalint = bndvalint;
	}

	public String getCalleentint() {
		return this.calleentint;
	}

	public void setCalleentint(String calleentint) {
		this.calleentint = calleentint;
	}

	public String getCpentint() {
		return this.cpentint;
	}

	public void setCpentint(String cpentint) {
		this.cpentint = cpentint;
	}

	public BigDecimal getCveentciu() {
		return this.cveentciu;
	}

	public void setCveentciu(BigDecimal cveentciu) {
		this.cveentciu = cveentciu;
	}

	public BigDecimal getCveentedo() {
		return this.cveentedo;
	}

	public void setCveentedo(BigDecimal cveentedo) {
		this.cveentedo = cveentedo;
	}

	public BigDecimal getCveinspadre() {
		return this.cveinspadre;
	}

	public void setCveinspadre(BigDecimal cveinspadre) {
		this.cveinspadre = cveinspadre;
	}

	public BigDecimal getCveinssinnor() {
		return this.cveinssinnor;
	}

	public void setCveinssinnor(BigDecimal cveinssinnor) {
		this.cveinssinnor = cveinssinnor;
	}

	public BigDecimal getFunentint() {
		return this.funentint;
	}

	public void setFunentint(BigDecimal funentint) {
		this.funentint = funentint;
	}

	public String getImgentint() {
		return this.imgentint;
	}

	public void setImgentint(String imgentint) {
		this.imgentint = imgentint;
	}

	public BigDecimal getNatjurint() {
		return this.natjurint;
	}

	public void setNatjurint(BigDecimal natjurint) {
		this.natjurint = natjurint;
	}

	public String getNomentint() {
		return this.nomentint;
	}

	public void setNomentint(String nomentint) {
		this.nomentint = nomentint;
	}

	public String getNominttra() {
		return this.nominttra;
	}

	public void setNominttra(String nominttra) {
		this.nominttra = nominttra;
	}

	public String getObsentint() {
		return this.obsentint;
	}

	public void setObsentint(String obsentint) {
		this.obsentint = obsentint;
	}

	public BigDecimal getSecentint() {
		return this.secentint;
	}

	public void setSecentint(BigDecimal secentint) {
		this.secentint = secentint;
	}

	public String getSglentint() {
		return this.sglentint;
	}

	public void setSglentint(String sglentint) {
		this.sglentint = sglentint;
	}

	public BigDecimal getTpoentint() {
		return this.tpoentint;
	}

	public void setTpoentint(BigDecimal tpoentint) {
		this.tpoentint = tpoentint;
	}

	public String getUrlaltint() {
		return this.urlaltint;
	}

	public void setUrlaltint(String urlaltint) {
		this.urlaltint = urlaltint;
	}

	public String getUrlentint() {
		return this.urlentint;
	}

	public void setUrlentint(String urlentint) {
		this.urlentint = urlentint;
	}

	public List<Tblentaut2> getTblentaut2s() {
		return this.tblentaut2s;
	}

	public void setTblentaut2s(List<Tblentaut2> tblentaut2s) {
		this.tblentaut2s = tblentaut2s;
	}

	public Tblentaut2 addTblentaut2(Tblentaut2 tblentaut2) {
		getTblentaut2s().add(tblentaut2);
		tblentaut2.setTblentint(this);

		return tblentaut2;
	}

	public Tblentaut2 removeTblentaut2(Tblentaut2 tblentaut2) {
		getTblentaut2s().remove(tblentaut2);
		tblentaut2.setTblentint(null);

		return tblentaut2;
	}

	public Tblentnac getTblentnac() {
		return this.tblentnac;
	}

	public void setTblentnac(Tblentnac tblentnac) {
		this.tblentnac = tblentnac;
	}

	public List<Tblentrev> getTblentrevs() {
		return this.tblentrevs;
	}

	public void setTblentrevs(List<Tblentrev> tblentrevs) {
		this.tblentrevs = tblentrevs;
	}

	public Tblentrev addTblentrev(Tblentrev tblentrev) {
		getTblentrevs().add(tblentrev);
		tblentrev.setTblentint(this);

		return tblentrev;
	}

	public Tblentrev removeTblentrev(Tblentrev tblentrev) {
		getTblentrevs().remove(tblentrev);
		tblentrev.setTblentint(null);

		return tblentrev;
	}

}