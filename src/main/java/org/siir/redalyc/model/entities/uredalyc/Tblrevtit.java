package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TBLREVTIT database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLREVTIT")
public class Tblrevtit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLREVTIT_CVEREVTIT_GENERATOR", sequenceName="UREDALYC.SQ_TBLREVTIT", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLREVTIT_CVEREVTIT_GENERATOR")
	private long cverevtit;

	private BigDecimal clarevtit;

	private BigDecimal convistit;

	private String cvepdfidioma;

	private String derrestit;

	private String doititulo;

	private BigDecimal edorevtit;

	private BigDecimal edotitmrc;

	@Temporal(TemporalType.DATE)
	private Date fecaceptit;

	@Temporal(TemporalType.DATE)
	private Date fecaltsis;

	@Temporal(TemporalType.DATE)
	private Date fecpubelec;

	@Temporal(TemporalType.DATE)
	private Date fecpubtit;

	@Temporal(TemporalType.DATE)
	private Date fecrectit;

	@Temporal(TemporalType.DATE)
	private Date fecreendos;

	@Temporal(TemporalType.DATE)
	private Date fecreentres;

	@Temporal(TemporalType.DATE)
	private Date fecreeuno;

	@Temporal(TemporalType.DATE)
	private Date fecultmod;

	private String nomrevtit;

	private BigDecimal ordrevtit;

	private String pagrevtit;

	private String psorevtit;

	private String titsegidi;

	private String titteridi;

	private String tpolictit;

	private String urlrevtit;

	private String usualtsis;

	private String usuultmod;
	
	private String urlhtmlorg;//Ruta del HTML original para el marcador
	
	private String tpocitart;//Tipo de citacion
	
	private BigDecimal bndelmart;//0-No eliminado, 1-Eliminado
	
	private BigDecimal edojats;//0-No JATS, 1-JATS, 2-En proceso JATS
	
	private String nomimgdes;//Nombre de imagen destacada de articulo //DESCOMENTAR Y COLOCAR SETTERS Y GETTERS
	
	private String elepagrev;// Campo para la paginacion electronica 

	//bi-directional many-to-one association to Tblartaut
	@OneToMany(mappedBy="tblrevtit")
	private List<Tblartaut> tblartauts;

	@JsonManagedReference("tblrevtits1-tblentidi1")
	//bi-directional many-to-one association to Tblentidi
	@ManyToOne
	@JoinColumn(name="TERIDITIT")
	private Tblentidi tblentidi1;

	@JsonManagedReference("tblrevtits2-tblentidi2")
	//bi-directional many-to-one association to Tblentidi
	@ManyToOne
	@JoinColumn(name="SEGIDITIT")
	private Tblentidi tblentidi2;

	@JsonManagedReference("tblrevtits3-tblentidi3")
	//bi-directional many-to-one association to Tblentidi
	@ManyToOne
	@JoinColumn(name="IDIORGTIT")
	private Tblentidi tblentidi3;

	//bi-directional many-to-one association to Tblentrev
	@ManyToOne
	@JoinColumn(name="CVEENTREV")
	private Tblentrev tblentrev;

	//bi-directional many-to-one association to Tblenttem
	@ManyToOne
	@JoinColumn(name="CVEENTTEM")
	private Tblenttem tblenttem;

	@JsonBackReference("tblrevsec-tblrevtits")
	//bi-directional many-to-one association to Tblrevsec
	@ManyToOne
	@JoinColumn(name="CVEENTSEC")
	private Tblrevsec tblrevsec;

	//bi-directional many-to-one association to Tbltitrsm
	@OneToMany(mappedBy="tblrevtit")
	private List<Tbltitrsm> tbltitrsms;
	
	@JsonManagedReference("tblrevtitarc-arcrevtits")
	//bi-directional many-to-one association to Arcrevtit
	@OneToMany(mappedBy="tblrevtitarc", cascade = CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<Arcrevtit> arcrevtits;

	public Tblrevtit() {
	}

	public long getCverevtit() {
		return this.cverevtit;
	}

	public void setCverevtit(long cverevtit) {
		this.cverevtit = cverevtit;
	}

	public BigDecimal getClarevtit() {
		return this.clarevtit;
	}

	public void setClarevtit(BigDecimal clarevtit) {
		this.clarevtit = clarevtit;
	}

	public BigDecimal getConvistit() {
		return this.convistit;
	}

	public void setConvistit(BigDecimal convistit) {
		this.convistit = convistit;
	}

	public String getCvepdfidioma() {
		return this.cvepdfidioma;
	}

	public void setCvepdfidioma(String cvepdfidioma) {
		this.cvepdfidioma = cvepdfidioma;
	}

	public String getDerrestit() {
		return this.derrestit;
	}

	public void setDerrestit(String derrestit) {
		this.derrestit = derrestit;
	}

	public String getDoititulo() {
		return this.doititulo;
	}

	public void setDoititulo(String doititulo) {
		this.doititulo = doititulo;
	}

	public BigDecimal getEdorevtit() {
		return this.edorevtit;
	}

	public void setEdorevtit(BigDecimal edorevtit) {
		this.edorevtit = edorevtit;
	}

	public BigDecimal getEdotitmrc() {
		return this.edotitmrc;
	}

	public void setEdotitmrc(BigDecimal edotitmrc) {
		this.edotitmrc = edotitmrc;
	}

	public Date getFecaceptit() {
		return this.fecaceptit;
	}

	public void setFecaceptit(Date fecaceptit) {
		this.fecaceptit = fecaceptit;
	}

	public Date getFecaltsis() {
		return this.fecaltsis;
	}

	public void setFecaltsis(Date fecaltsis) {
		this.fecaltsis = fecaltsis;
	}

	public Date getFecpubelec() {
		return this.fecpubelec;
	}

	public void setFecpubelec(Date fecpubelec) {
		this.fecpubelec = fecpubelec;
	}

	public Date getFecpubtit() {
		return this.fecpubtit;
	}

	public void setFecpubtit(Date fecpubtit) {
		this.fecpubtit = fecpubtit;
	}

	public Date getFecrectit() {
		return this.fecrectit;
	}

	public void setFecrectit(Date fecrectit) {
		this.fecrectit = fecrectit;
	}

	public Date getFecreendos() {
		return this.fecreendos;
	}

	public void setFecreendos(Date fecreendos) {
		this.fecreendos = fecreendos;
	}

	public Date getFecreentres() {
		return this.fecreentres;
	}

	public void setFecreentres(Date fecreentres) {
		this.fecreentres = fecreentres;
	}

	public Date getFecreeuno() {
		return this.fecreeuno;
	}

	public void setFecreeuno(Date fecreeuno) {
		this.fecreeuno = fecreeuno;
	}

	public Date getFecultmod() {
		return this.fecultmod;
	}

	public void setFecultmod(Date fecultmod) {
		this.fecultmod = fecultmod;
	}

	public String getNomrevtit() {
		return this.nomrevtit;
	}

	public void setNomrevtit(String nomrevtit) {
		this.nomrevtit = nomrevtit;
	}

	public BigDecimal getOrdrevtit() {
		return this.ordrevtit;
	}

	public void setOrdrevtit(BigDecimal ordrevtit) {
		this.ordrevtit = ordrevtit;
	}

	public String getPagrevtit() {
		return this.pagrevtit;
	}

	public void setPagrevtit(String pagrevtit) {
		this.pagrevtit = pagrevtit;
	}

	public String getPsorevtit() {
		return this.psorevtit;
	}

	public void setPsorevtit(String psorevtit) {
		this.psorevtit = psorevtit;
	}

	public String getTitsegidi() {
		return this.titsegidi;
	}

	public void setTitsegidi(String titsegidi) {
		this.titsegidi = titsegidi;
	}

	public String getTitteridi() {
		return this.titteridi;
	}

	public void setTitteridi(String titteridi) {
		this.titteridi = titteridi;
	}

	public String getTpolictit() {
		return this.tpolictit;
	}

	public void setTpolictit(String tpolictit) {
		this.tpolictit = tpolictit;
	}

	public String getUrlrevtit() {
		return this.urlrevtit;
	}

	public void setUrlrevtit(String urlrevtit) {
		this.urlrevtit = urlrevtit;
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

	public String getUrlhtmlorg() {
		return urlhtmlorg;
	}

	public void setUrlhtmlorg(String urlhtmlorg) {
		this.urlhtmlorg = urlhtmlorg;
	}

	public String getTpocitart() {
		return tpocitart;
	}

	public void setTpocitart(String tpocitart) {
		this.tpocitart = tpocitart;
	}

	public BigDecimal getBndelmart() {
		return bndelmart;
	}

	public void setBndelmart(BigDecimal bndelmart) {
		this.bndelmart = bndelmart;
	}

	public BigDecimal getEdojats() {
		return edojats;
	}

	public void setEdojats(BigDecimal edojats) {
		this.edojats = edojats;
	}
	
	public String getNomimgdes() {
		return nomimgdes;
	}

	public void setNomimgdes(String nomimgdes) {
		this.nomimgdes = nomimgdes;
	}

	@JsonIgnore
	public List<Tblartaut> getTblartauts() {
		return this.tblartauts;
	}

	public void setTblartauts(List<Tblartaut> tblartauts) {
		this.tblartauts = tblartauts;
	}

	public Tblartaut addTblartaut(Tblartaut tblartaut) {
		getTblartauts().add(tblartaut);
		tblartaut.setTblrevtit(this);

		return tblartaut;
	}

	public Tblartaut removeTblartaut(Tblartaut tblartaut) {
		getTblartauts().remove(tblartaut);
		tblartaut.setTblrevtit(null);

		return tblartaut;
	}

	public Tblentidi getTblentidi1() {
		return this.tblentidi1;
	}

	public void setTblentidi1(Tblentidi tblentidi1) {
		this.tblentidi1 = tblentidi1;
	}

	public Tblentidi getTblentidi2() {
		return this.tblentidi2;
	}

	public void setTblentidi2(Tblentidi tblentidi2) {
		this.tblentidi2 = tblentidi2;
	}

	public Tblentidi getTblentidi3() {
		return this.tblentidi3;
	}

	public void setTblentidi3(Tblentidi tblentidi3) {
		this.tblentidi3 = tblentidi3;
	}

	@JsonIgnore
	public Tblentrev getTblentrev() {
		return this.tblentrev;
	}

	public void setTblentrev(Tblentrev tblentrev) {
		this.tblentrev = tblentrev;
	}

	@JsonIgnore
	public Tblenttem getTblenttem() {
		return this.tblenttem;
	}

	public void setTblenttem(Tblenttem tblenttem) {
		this.tblenttem = tblenttem;
	}

	public Tblrevsec getTblrevsec() {
		return this.tblrevsec;
	}

	public void setTblrevsec(Tblrevsec tblrevsec) {
		this.tblrevsec = tblrevsec;
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
		tbltitrsm.setTblrevtit(this);

		return tbltitrsm;
	}

	public Tbltitrsm removeTbltitrsm(Tbltitrsm tbltitrsm) {
		getTbltitrsms().remove(tbltitrsm);
		tbltitrsm.setTblrevtit(null);

		return tbltitrsm;
	}

	public List<Arcrevtit> getArcrevtits() {
		return arcrevtits;
	}

	public void setArcrevtits(List<Arcrevtit> arcrevtits) {
		this.arcrevtits = arcrevtits;
	}

	public String getElepagrev() {
		return elepagrev;
	}

	public void setElepagrev(String elepagrev) {
		this.elepagrev = elepagrev;
	}

	@Override
	public String toString() {
		return "Tblrevtit [cverevtit=" + cverevtit + ", ordrevtit=" + ordrevtit + "]";
	}

}