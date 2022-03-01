package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBLENTAUT2 database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLENTAUT2")
public class Tblentaut2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLENTAUT2_CVEENTAUT_GENERATOR", sequenceName="UREDALYC.TBLENTAUT2_SEQUENCE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLENTAUT2_CVEENTAUT_GENERATOR")
	private long cveentaut;

	private BigDecimal acpteraut;

	private String apsmataut;

	private String apspataut;

	private BigDecimal bndelmaut;

	private BigDecimal bndfiraut;

	private BigDecimal bndnoraut;

	private BigDecimal bndvalaut;

	private String ciuentaut;

	private BigDecimal cpentaut;

	private String direntaut;

	private String emailaut;

	private String emailinsaut;

	private String faxentaut;

	@Lob
	private String firmaaut;

	private BigDecimal intsinnor;

	private String movilentaut;

	private BigDecimal nacentaut;

	private String nomentaut;

	private String telentaut;

	private BigDecimal tipoaut;

	private String urlcvaut;

	private String urlfotoaut;

	private String webperaut;

	//bi-directional many-to-one association to Tblartaut
	@OneToMany(mappedBy="tblentaut2")
	private List<Tblartaut> tblartauts;

	//bi-directional many-to-one association to Tblentint
	@ManyToOne
	@JoinColumn(name="CVEENTINS")
	private Tblentint tblentint;

	public Tblentaut2() {
	}

	public long getCveentaut() {
		return this.cveentaut;
	}

	public void setCveentaut(long cveentaut) {
		this.cveentaut = cveentaut;
	}

	public BigDecimal getAcpteraut() {
		return this.acpteraut;
	}

	public void setAcpteraut(BigDecimal acpteraut) {
		this.acpteraut = acpteraut;
	}

	public String getApsmataut() {
		return this.apsmataut;
	}

	public void setApsmataut(String apsmataut) {
		this.apsmataut = apsmataut;
	}

	public String getApspataut() {
		return this.apspataut;
	}

	public void setApspataut(String apspataut) {
		this.apspataut = apspataut;
	}

	public BigDecimal getBndelmaut() {
		return this.bndelmaut;
	}

	public void setBndelmaut(BigDecimal bndelmaut) {
		this.bndelmaut = bndelmaut;
	}

	public BigDecimal getBndfiraut() {
		return this.bndfiraut;
	}

	public void setBndfiraut(BigDecimal bndfiraut) {
		this.bndfiraut = bndfiraut;
	}

	public BigDecimal getBndnoraut() {
		return this.bndnoraut;
	}

	public void setBndnoraut(BigDecimal bndnoraut) {
		this.bndnoraut = bndnoraut;
	}

	public BigDecimal getBndvalaut() {
		return this.bndvalaut;
	}

	public void setBndvalaut(BigDecimal bndvalaut) {
		this.bndvalaut = bndvalaut;
	}

	public String getCiuentaut() {
		return this.ciuentaut;
	}

	public void setCiuentaut(String ciuentaut) {
		this.ciuentaut = ciuentaut;
	}

	public BigDecimal getCpentaut() {
		return this.cpentaut;
	}

	public void setCpentaut(BigDecimal cpentaut) {
		this.cpentaut = cpentaut;
	}

	public String getDirentaut() {
		return this.direntaut;
	}

	public void setDirentaut(String direntaut) {
		this.direntaut = direntaut;
	}

	public String getEmailaut() {
		return this.emailaut;
	}

	public void setEmailaut(String emailaut) {
		this.emailaut = emailaut;
	}

	public String getEmailinsaut() {
		return this.emailinsaut;
	}

	public void setEmailinsaut(String emailinsaut) {
		this.emailinsaut = emailinsaut;
	}

	public String getFaxentaut() {
		return this.faxentaut;
	}

	public void setFaxentaut(String faxentaut) {
		this.faxentaut = faxentaut;
	}

	public String getFirmaaut() {
		return this.firmaaut;
	}

	public void setFirmaaut(String firmaaut) {
		this.firmaaut = firmaaut;
	}

	public BigDecimal getIntsinnor() {
		return this.intsinnor;
	}

	public void setIntsinnor(BigDecimal intsinnor) {
		this.intsinnor = intsinnor;
	}

	public String getMovilentaut() {
		return this.movilentaut;
	}

	public void setMovilentaut(String movilentaut) {
		this.movilentaut = movilentaut;
	}

	public BigDecimal getNacentaut() {
		return this.nacentaut;
	}

	public void setNacentaut(BigDecimal nacentaut) {
		this.nacentaut = nacentaut;
	}

	public String getNomentaut() {
		return this.nomentaut;
	}

	public void setNomentaut(String nomentaut) {
		this.nomentaut = nomentaut;
	}

	public String getTelentaut() {
		return this.telentaut;
	}

	public void setTelentaut(String telentaut) {
		this.telentaut = telentaut;
	}

	public BigDecimal getTipoaut() {
		return this.tipoaut;
	}

	public void setTipoaut(BigDecimal tipoaut) {
		this.tipoaut = tipoaut;
	}

	public String getUrlcvaut() {
		return this.urlcvaut;
	}

	public void setUrlcvaut(String urlcvaut) {
		this.urlcvaut = urlcvaut;
	}

	public String getUrlfotoaut() {
		return this.urlfotoaut;
	}

	public void setUrlfotoaut(String urlfotoaut) {
		this.urlfotoaut = urlfotoaut;
	}

	public String getWebperaut() {
		return this.webperaut;
	}

	public void setWebperaut(String webperaut) {
		this.webperaut = webperaut;
	}

	public List<Tblartaut> getTblartauts() {
		return this.tblartauts;
	}

	public void setTblartauts(List<Tblartaut> tblartauts) {
		this.tblartauts = tblartauts;
	}

	public Tblartaut addTblartaut(Tblartaut tblartaut) {
		getTblartauts().add(tblartaut);
		tblartaut.setTblentaut2(this);

		return tblartaut;
	}

	public Tblartaut removeTblartaut(Tblartaut tblartaut) {
		getTblartauts().remove(tblartaut);
		tblartaut.setTblentaut2(null);

		return tblartaut;
	}

	public Tblentint getTblentint() {
		return this.tblentint;
	}

	public void setTblentint(Tblentint tblentint) {
		this.tblentint = tblentint;
	}

}