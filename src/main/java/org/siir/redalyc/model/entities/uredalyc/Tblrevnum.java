package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import org.siir.redalyc.model.entities.arribos.Tblrevnumarb;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TBLREVNUM database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLREVNUM")
public class Tblrevnum implements Serializable {
	private static final long serialVersionUID = 1L;	

	@Id
	@SequenceGenerator(name="TBLREVNUM_CVEREVNUM_GENERATOR", sequenceName="UREDALYC.SQ_TBLREVNUM", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLREVNUM_CVEREVNUM_GENERATOR")
	private long cverevnum;

	private String anoedcnum;

	private BigDecimal clanumarb;//Tipo de fasciculo, 12-Especial

	private BigDecimal edorevnum;//12-Numero en JATS

	@Temporal(TemporalType.DATE)
	private Date fecaltsis;

	@Temporal(TemporalType.DATE)
	private Date fecultmod;

	private String mesnumrev;

	private String numrevnum;

	private BigDecimal numtemrev;

	private BigDecimal tpoperarb;

	private String usualtsis;

	private String usuultmod;

	private String volrevnum;
	
	private BigDecimal bndelmnum;//0-No eliminado, 1-Eliminado
	
	private BigDecimal edojats;//0-No JATS, 1-JATS, 2-En proceso JATS
	
	private String urllic;//Url de la licencia
	
	private String nomtpolic;//Descripcion de la licencia
	
	private String copyrightholder;//Depositario del copyright
	
	private String copyrightstat;//Declaración de copyright
	
	private String copyrightyear;//Año de copyright
	
	private BigDecimal termparc;//0-Terminado normal, 1-Terminado parcial

	@JsonManagedReference("tblrevnums-tblentrev")
	//bi-directional many-to-one association to Tblentrev
	@ManyToOne
	@JoinColumn(name="CVEENTREV")
	private Tblentrev tblentrev;

	@JsonManagedReference("tblrevnum-tblrevsecs")
	//bi-directional many-to-one association to Tblrevsec
	@OneToMany(mappedBy="tblrevnum", cascade = {CascadeType.PERSIST,CascadeType.MERGE}, fetch=FetchType.EAGER)
	private List<Tblrevsec> tblrevsecs;
	
	//bi-directional one-to-one association to Tblrevnumarb
	@OneToOne(mappedBy="tblrevnum")
	private Tblrevnumarb tblrevnumarb;

	public Tblrevnum() {
	}

	public long getCverevnum() {
		return this.cverevnum;
	}

	public void setCverevnum(long cverevnum) {
		this.cverevnum = cverevnum;
	}

	public String getAnoedcnum() {
		return this.anoedcnum;
	}

	public void setAnoedcnum(String anoedcnum) {
		this.anoedcnum = anoedcnum;
	}

	public BigDecimal getClanumarb() {
		return this.clanumarb;
	}

	public void setClanumarb(BigDecimal clanumarb) {
		this.clanumarb = clanumarb;
	}

	public BigDecimal getEdorevnum() {
		return this.edorevnum;
	}

	public void setEdorevnum(BigDecimal edorevnum) {
		this.edorevnum = edorevnum;
	}

	public Date getFecaltsis() {
		return this.fecaltsis;
	}

	public void setFecaltsis(Date fecaltsis) {
		this.fecaltsis = fecaltsis;
	}

	public Date getFecultmod() {
		return this.fecultmod;
	}

	public void setFecultmod(Date fecultmod) {
		this.fecultmod = fecultmod;
	}

	public String getMesnumrev() {
		return this.mesnumrev;
	}

	public void setMesnumrev(String mesnumrev) {
		this.mesnumrev = mesnumrev;
	}

	public String getNumrevnum() {
		return this.numrevnum;
	}

	public void setNumrevnum(String numrevnum) {
		this.numrevnum = numrevnum;
	}

	public BigDecimal getNumtemrev() {
		return this.numtemrev;
	}

	public void setNumtemrev(BigDecimal numtemrev) {
		this.numtemrev = numtemrev;
	}

	public BigDecimal getTpoperarb() {
		return this.tpoperarb;
	}

	public void setTpoperarb(BigDecimal tpoperarb) {
		this.tpoperarb = tpoperarb;
	}

	public String getUsualtsis() {
		return this.usualtsis;
	}

	public void setUsualtsis(String usualtsis) {
		this.usualtsis = usualtsis;
	}

	public String getUsuultmod() {
		return this.usuultmod;
	}

	public void setUsuultmod(String usuultmod) {
		this.usuultmod = usuultmod;
	}

	public String getVolrevnum() {
		return this.volrevnum;
	}

	public void setVolrevnum(String volrevnum) {
		this.volrevnum = volrevnum;
	}

	public BigDecimal getBndelmnum() {
		return bndelmnum;
	}

	public void setBndelmnum(BigDecimal bndelmnum) {
		this.bndelmnum = bndelmnum;
	}

	public BigDecimal getEdojats() {
		return edojats;
	}

	public void setEdojats(BigDecimal edojats) {
		this.edojats = edojats;
	}

	public String getUrllic() {
		if(urllic== null){
			urllic = "";
		}
		return urllic;
	}

	public void setUrllic(String urllic) {
		this.urllic = urllic;
	}

	public String getNomtpolic() {
		if(nomtpolic == null){
			nomtpolic = "";
		}
		return nomtpolic;
	}

	public void setNomtpolic(String nomtpolic) {
		this.nomtpolic = nomtpolic;
	}

	public String getCopyrightholder() {
		return copyrightholder;
	}

	public void setCopyrightholder(String copyrightholder) {
		this.copyrightholder = copyrightholder;
	}

	public String getCopyrightstat() {
		return copyrightstat;
	}

	public void setCopyrightstat(String copyrightstat) {
		this.copyrightstat = copyrightstat;
	}

	public String getCopyrightyear() {
		return copyrightyear;
	}

	public void setCopyrightyear(String copyrightyear) {
		this.copyrightyear = copyrightyear;
	}

	public BigDecimal getTermparc() {
		return termparc;
	}

	public void setTermparc(BigDecimal termparc) {
		this.termparc = termparc;
	}

	public Tblentrev getTblentrev() {
		return this.tblentrev;
	}

	public void setTblentrev(Tblentrev tblentrev) {
		this.tblentrev = tblentrev;
	}

	public List<Tblrevsec> getTblrevsecs() {
		return this.tblrevsecs;
	}

	public void setTblrevsecs(List<Tblrevsec> tblrevsecs) {
		this.tblrevsecs = tblrevsecs;
	}

	public Tblrevsec addTblrevsec(Tblrevsec tblrevsec) {
		getTblrevsecs().add(tblrevsec);
		tblrevsec.setTblrevnum(this);

		return tblrevsec;
	}

	public Tblrevsec removeTblrevsec(Tblrevsec tblrevsec) {
		getTblrevsecs().remove(tblrevsec);
		tblrevsec.setTblrevnum(null);

		return tblrevsec;
	}

	@JsonIgnore
	public Tblrevnumarb getTblrevnumarb() {
		return tblrevnumarb;
	}

	public void setTblrevnumarb(Tblrevnumarb tblrevnumarb) {
		this.tblrevnumarb = tblrevnumarb;
	}

}