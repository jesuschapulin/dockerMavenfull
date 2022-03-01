package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TBLINDREV database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLINDREV")
public class Tblindrev implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="TBLINDREV_CVEENTREV_GENERATOR", sequenceName="UREDALYC.TBLINDREV_SEQUENCE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLINDREV_CVEENTREV_GENERATOR")
	private long cveentrev;

	private String arbentrev;

	private BigDecimal bndissnreg;

	private String caredirev;

	private String coltb1rev;

	private String coltb2rev;

	private String coltb3rev;

	private String contacrev;

	private String emailaltcont;

	private String faxentrev;

	@Temporal(TemporalType.DATE)
	private Date fecinired;

	@Temporal(TemporalType.DATE)
	private Date fecregrev;

	private String imgentrev;

	private String imgreflejo;

	private String imgsello;

	private String issnelerev;

	private String issnrev;

	private String linaltinsedirev;

	private String lininsedirev;

	private String lnkinsrev;

	private String nomentrev;

	private String norcolrev;

	private String obsentrev;

	private String paipubrev;

	private String prdentrev;

	private String telentrev;

	private String urlacubv;

	private String urlcarcesder;

	private String urlcarori;

	private String urlextrev;

	private String urlfordic;
	
	private BigDecimal tpovisores;//1-Automaticos, 0-Manuales
	
	private String modelopdf;//Riga, Upsala

	@JsonBackReference("tblentrev-tblindrev")
	//bi-directional one-to-one association to Tblentrev
	@OneToOne
	@PrimaryKeyJoinColumn(name="CVEENTREV")
	private Tblentrev tblentrev;

	public Tblindrev() {
	}

	@JsonIgnore
	public long getCveentrev() {
		return this.cveentrev;
	}

	public void setCveentrev(long cveentrev) {
		this.cveentrev = cveentrev;
	}

	@JsonIgnore
	public String getArbentrev() {
		return this.arbentrev;
	}

	public void setArbentrev(String arbentrev) {
		this.arbentrev = arbentrev;
	}

	@JsonIgnore
	public BigDecimal getBndissnreg() {
		return this.bndissnreg;
	}

	public void setBndissnreg(BigDecimal bndissnreg) {
		this.bndissnreg = bndissnreg;
	}

	@JsonIgnore
	public String getCaredirev() {
		return this.caredirev;
	}

	public void setCaredirev(String caredirev) {
		this.caredirev = caredirev;
	}

	@JsonIgnore
	public String getColtb1rev() {
		return this.coltb1rev;
	}

	public void setColtb1rev(String coltb1rev) {
		this.coltb1rev = coltb1rev;
	}

	@JsonIgnore
	public String getColtb2rev() {
		return this.coltb2rev;
	}

	public void setColtb2rev(String coltb2rev) {
		this.coltb2rev = coltb2rev;
	}

	@JsonIgnore
	public String getColtb3rev() {
		return this.coltb3rev;
	}

	public void setColtb3rev(String coltb3rev) {
		this.coltb3rev = coltb3rev;
	}

	@JsonIgnore
	public String getContacrev() {
		return this.contacrev;
	}

	public void setContacrev(String contacrev) {
		this.contacrev = contacrev;
	}

	@JsonIgnore
	public String getEmailaltcont() {
		return this.emailaltcont;
	}

	public void setEmailaltcont(String emailaltcont) {
		this.emailaltcont = emailaltcont;
	}

	@JsonIgnore
	public String getFaxentrev() {
		return this.faxentrev;
	}

	public void setFaxentrev(String faxentrev) {
		this.faxentrev = faxentrev;
	}

	@JsonIgnore
	public Date getFecinired() {
		return this.fecinired;
	}

	public void setFecinired(Date fecinired) {
		this.fecinired = fecinired;
	}

	@JsonIgnore
	public Date getFecregrev() {
		return this.fecregrev;
	}

	public void setFecregrev(Date fecregrev) {
		this.fecregrev = fecregrev;
	}

	@JsonIgnore
	public String getImgentrev() {
		return this.imgentrev;
	}

	public void setImgentrev(String imgentrev) {
		this.imgentrev = imgentrev;
	}

	@JsonIgnore
	public String getImgreflejo() {
		return this.imgreflejo;
	}

	public void setImgreflejo(String imgreflejo) {
		this.imgreflejo = imgreflejo;
	}

	@JsonIgnore
	public String getImgsello() {
		return this.imgsello;
	}

	public void setImgsello(String imgsello) {
		this.imgsello = imgsello;
	}

	@JsonIgnore
	public String getIssnelerev() {
		return this.issnelerev;
	}

	public void setIssnelerev(String issnelerev) {
		this.issnelerev = issnelerev;
	}

	@JsonIgnore
	public String getIssnrev() {
		return this.issnrev;
	}

	public void setIssnrev(String issnrev) {
		this.issnrev = issnrev;
	}

	@JsonIgnore
	public String getLinaltinsedirev() {
		return this.linaltinsedirev;
	}

	public void setLinaltinsedirev(String linaltinsedirev) {
		this.linaltinsedirev = linaltinsedirev;
	}

	@JsonIgnore
	public String getLininsedirev() {
		return this.lininsedirev;
	}

	public void setLininsedirev(String lininsedirev) {
		this.lininsedirev = lininsedirev;
	}

	@JsonIgnore
	public String getLnkinsrev() {
		return this.lnkinsrev;
	}

	public void setLnkinsrev(String lnkinsrev) {
		this.lnkinsrev = lnkinsrev;
	}

	@JsonIgnore
	public String getNomentrev() {
		return this.nomentrev;
	}

	public void setNomentrev(String nomentrev) {
		this.nomentrev = nomentrev;
	}

	@JsonIgnore
	public String getNorcolrev() {
		return this.norcolrev;
	}

	public void setNorcolrev(String norcolrev) {
		this.norcolrev = norcolrev;
	}

	@JsonIgnore
	public String getObsentrev() {
		return this.obsentrev;
	}

	public void setObsentrev(String obsentrev) {
		this.obsentrev = obsentrev;
	}

	@JsonIgnore
	public String getPaipubrev() {
		return this.paipubrev;
	}

	public void setPaipubrev(String paipubrev) {
		this.paipubrev = paipubrev;
	}

	@JsonIgnore
	public String getPrdentrev() {
		return this.prdentrev;
	}

	public void setPrdentrev(String prdentrev) {
		this.prdentrev = prdentrev;
	}

	@JsonIgnore
	public String getTelentrev() {
		return this.telentrev;
	}

	public void setTelentrev(String telentrev) {
		this.telentrev = telentrev;
	}

	@JsonIgnore
	public String getUrlacubv() {
		return this.urlacubv;
	}

	public void setUrlacubv(String urlacubv) {
		this.urlacubv = urlacubv;
	}

	@JsonIgnore
	public String getUrlcarcesder() {
		return this.urlcarcesder;
	}

	public void setUrlcarcesder(String urlcarcesder) {
		this.urlcarcesder = urlcarcesder;
	}

	@JsonIgnore
	public String getUrlcarori() {
		return this.urlcarori;
	}

	public void setUrlcarori(String urlcarori) {
		this.urlcarori = urlcarori;
	}

	@JsonIgnore
	public String getUrlextrev() {
		return this.urlextrev;
	}

	public void setUrlextrev(String urlextrev) {
		this.urlextrev = urlextrev;
	}

	@JsonIgnore
	public String getUrlfordic() {
		return this.urlfordic;
	}

	public void setUrlfordic(String urlfordic) {
		this.urlfordic = urlfordic;
	}

	public BigDecimal getTpovisores() {
		return tpovisores;
	}

	public void setTpovisores(BigDecimal tpovisores) {
		this.tpovisores = tpovisores;
	}

	public String getModelopdf() {
		return modelopdf;
	}

	public void setModelopdf(String modelopdf) {
		this.modelopdf = modelopdf;
	}

	public Tblentrev getTblentrev() {
		return this.tblentrev;
	}

	public void setTblentrev(Tblentrev tblentrev) {
		this.tblentrev = tblentrev;
	}

}