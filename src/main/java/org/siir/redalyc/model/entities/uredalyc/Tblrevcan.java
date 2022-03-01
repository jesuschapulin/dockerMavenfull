package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TBLREVCAN database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLREVCAN")
public class Tblrevcan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLREVCAN_CVEREVCAN_GENERATOR", sequenceName="UREDALYC.SEQ_TBLREVCAN", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLREVCAN_CVEREVCAN_GENERATOR")
	private long cverevcan;

	private String acuerdovb;

	private String aniinirev;

	private String aniterrev;

	private BigDecimal areprinrev;

	private BigDecimal aresecdos;

	private BigDecimal aresectres;

	private BigDecimal bndvalrev;

	private String ciurevcan;

	private String coberturaisi;

	private String coberturascopus;

	private BigDecimal cveentedo;

	private BigDecimal cveentnac;

	private BigDecimal cveentpai;

	private BigDecimal cveentper;

	//bi-directional one-to-one association to Tblentrev
	@OneToOne
	@PrimaryKeyJoinColumn(name="CVEENTREV")
	private Tblentrev tblentrev;

	private BigDecimal cveentsit;

	private BigDecimal cvenatorg;

	private BigDecimal cvenatpub;

	private BigDecimal cverevexi;

	private BigDecimal cvetpocat;

	private String despubrev;

	private String direntrev;

	private String dirposrev;

	private BigDecimal edoentrev;

	private BigDecimal edorevcan;

	private String emailaltcon;

	private String emailcont;

	private String faxrevcan;

	@Temporal(TemporalType.DATE)
	private Date fecaltrev;

	@Temporal(TemporalType.DATE)
	private Date fecregrev;

	private BigDecimal forrevcan;

	private BigDecimal idiprinrev;

	private BigDecimal idisecrev;

	private BigDecimal iditerrev;

	private String imgreflejo;

	private String imgsello;

	private BigDecimal insedirev;

	private BigDecimal intsinnor;

	private String issnelerev;

	private String issnimprev;

	private BigDecimal issnregistrado;

	private String ladciurev;

	private String ladpairev;

	private String linaltinsedirev;

	private String lininsedirev;

	private String lininsrev;

	private String nomedires;

	private String nomedirev;

	private String nomentrev;

	private String nomestrev;

	private String nomfileevirev;

	private String nomlugrev;

	private String nomorgrev;

	private String nomrevalt;

	private BigDecimal numfasrev;

	private String obsrevcan;

	private String perrevcan;

	private String telrevcan;

	private String urlcarcesder;

	private String urlcarori;

	private String urlfordic;

	private String urllogrev;

	private String urlnorcol;

	public Tblrevcan() {
	}

	public long getCverevcan() {
		return this.cverevcan;
	}

	public void setCverevcan(long cverevcan) {
		this.cverevcan = cverevcan;
	}

	public String getAcuerdovb() {
		return this.acuerdovb;
	}

	public void setAcuerdovb(String acuerdovb) {
		this.acuerdovb = acuerdovb;
	}

	public String getAniinirev() {
		return this.aniinirev;
	}

	public void setAniinirev(String aniinirev) {
		this.aniinirev = aniinirev;
	}

	public String getAniterrev() {
		return this.aniterrev;
	}

	public void setAniterrev(String aniterrev) {
		this.aniterrev = aniterrev;
	}

	public BigDecimal getAreprinrev() {
		return this.areprinrev;
	}

	public void setAreprinrev(BigDecimal areprinrev) {
		this.areprinrev = areprinrev;
	}

	public BigDecimal getAresecdos() {
		return this.aresecdos;
	}

	public void setAresecdos(BigDecimal aresecdos) {
		this.aresecdos = aresecdos;
	}

	public BigDecimal getAresectres() {
		return this.aresectres;
	}

	public void setAresectres(BigDecimal aresectres) {
		this.aresectres = aresectres;
	}

	public BigDecimal getBndvalrev() {
		return this.bndvalrev;
	}

	public void setBndvalrev(BigDecimal bndvalrev) {
		this.bndvalrev = bndvalrev;
	}

	public String getCiurevcan() {
		return this.ciurevcan;
	}

	public void setCiurevcan(String ciurevcan) {
		this.ciurevcan = ciurevcan;
	}

	public String getCoberturaisi() {
		return this.coberturaisi;
	}

	public void setCoberturaisi(String coberturaisi) {
		this.coberturaisi = coberturaisi;
	}

	public String getCoberturascopus() {
		return this.coberturascopus;
	}

	public void setCoberturascopus(String coberturascopus) {
		this.coberturascopus = coberturascopus;
	}

	public BigDecimal getCveentedo() {
		return this.cveentedo;
	}

	public void setCveentedo(BigDecimal cveentedo) {
		this.cveentedo = cveentedo;
	}

	public BigDecimal getCveentnac() {
		return this.cveentnac;
	}

	public void setCveentnac(BigDecimal cveentnac) {
		this.cveentnac = cveentnac;
	}

	public BigDecimal getCveentpai() {
		return this.cveentpai;
	}

	public void setCveentpai(BigDecimal cveentpai) {
		this.cveentpai = cveentpai;
	}

	public BigDecimal getCveentper() {
		return this.cveentper;
	}

	public void setCveentper(BigDecimal cveentper) {
		this.cveentper = cveentper;
	}

	public Tblentrev getTblentrev() {
		return tblentrev;
	}

	public void setTblentrev(Tblentrev tblentrev) {
		this.tblentrev = tblentrev;
	}

	public BigDecimal getCveentsit() {
		return this.cveentsit;
	}

	public void setCveentsit(BigDecimal cveentsit) {
		this.cveentsit = cveentsit;
	}

	public BigDecimal getCvenatorg() {
		return this.cvenatorg;
	}

	public void setCvenatorg(BigDecimal cvenatorg) {
		this.cvenatorg = cvenatorg;
	}

	public BigDecimal getCvenatpub() {
		return this.cvenatpub;
	}

	public void setCvenatpub(BigDecimal cvenatpub) {
		this.cvenatpub = cvenatpub;
	}

	public BigDecimal getCverevexi() {
		return this.cverevexi;
	}

	public void setCverevexi(BigDecimal cverevexi) {
		this.cverevexi = cverevexi;
	}

	public BigDecimal getCvetpocat() {
		return this.cvetpocat;
	}

	public void setCvetpocat(BigDecimal cvetpocat) {
		this.cvetpocat = cvetpocat;
	}

	public String getDespubrev() {
		return this.despubrev;
	}

	public void setDespubrev(String despubrev) {
		this.despubrev = despubrev;
	}

	public String getDirentrev() {
		return this.direntrev;
	}

	public void setDirentrev(String direntrev) {
		this.direntrev = direntrev;
	}

	public String getDirposrev() {
		return this.dirposrev;
	}

	public void setDirposrev(String dirposrev) {
		this.dirposrev = dirposrev;
	}

	public BigDecimal getEdoentrev() {
		return this.edoentrev;
	}

	public void setEdoentrev(BigDecimal edoentrev) {
		this.edoentrev = edoentrev;
	}

	public BigDecimal getEdorevcan() {
		return this.edorevcan;
	}

	public void setEdorevcan(BigDecimal edorevcan) {
		this.edorevcan = edorevcan;
	}

	public String getEmailaltcon() {
		return this.emailaltcon;
	}

	public void setEmailaltcon(String emailaltcon) {
		this.emailaltcon = emailaltcon;
	}

	public String getEmailcont() {
		return this.emailcont;
	}

	public void setEmailcont(String emailcont) {
		this.emailcont = emailcont;
	}

	public String getFaxrevcan() {
		return this.faxrevcan;
	}

	public void setFaxrevcan(String faxrevcan) {
		this.faxrevcan = faxrevcan;
	}

	public Date getFecaltrev() {
		return this.fecaltrev;
	}

	public void setFecaltrev(Date fecaltrev) {
		this.fecaltrev = fecaltrev;
	}

	public Date getFecregrev() {
		return this.fecregrev;
	}

	public void setFecregrev(Date fecregrev) {
		this.fecregrev = fecregrev;
	}

	public BigDecimal getForrevcan() {
		return this.forrevcan;
	}

	public void setForrevcan(BigDecimal forrevcan) {
		this.forrevcan = forrevcan;
	}

	public BigDecimal getIdiprinrev() {
		return this.idiprinrev;
	}

	public void setIdiprinrev(BigDecimal idiprinrev) {
		this.idiprinrev = idiprinrev;
	}

	public BigDecimal getIdisecrev() {
		return this.idisecrev;
	}

	public void setIdisecrev(BigDecimal idisecrev) {
		this.idisecrev = idisecrev;
	}

	public BigDecimal getIditerrev() {
		return this.iditerrev;
	}

	public void setIditerrev(BigDecimal iditerrev) {
		this.iditerrev = iditerrev;
	}

	public String getImgreflejo() {
		return this.imgreflejo;
	}

	public void setImgreflejo(String imgreflejo) {
		this.imgreflejo = imgreflejo;
	}

	public String getImgsello() {
		return this.imgsello;
	}

	public void setImgsello(String imgsello) {
		this.imgsello = imgsello;
	}

	public BigDecimal getInsedirev() {
		return this.insedirev;
	}

	public void setInsedirev(BigDecimal insedirev) {
		this.insedirev = insedirev;
	}

	public BigDecimal getIntsinnor() {
		return this.intsinnor;
	}

	public void setIntsinnor(BigDecimal intsinnor) {
		this.intsinnor = intsinnor;
	}

	public String getIssnelerev() {
		return this.issnelerev;
	}

	public void setIssnelerev(String issnelerev) {
		this.issnelerev = issnelerev;
	}

	public String getIssnimprev() {
		return this.issnimprev;
	}

	public void setIssnimprev(String issnimprev) {
		this.issnimprev = issnimprev;
	}

	public BigDecimal getIssnregistrado() {
		return this.issnregistrado;
	}

	public void setIssnregistrado(BigDecimal issnregistrado) {
		this.issnregistrado = issnregistrado;
	}

	public String getLadciurev() {
		return this.ladciurev;
	}

	public void setLadciurev(String ladciurev) {
		this.ladciurev = ladciurev;
	}

	public String getLadpairev() {
		return this.ladpairev;
	}

	public void setLadpairev(String ladpairev) {
		this.ladpairev = ladpairev;
	}

	public String getLinaltinsedirev() {
		return this.linaltinsedirev;
	}

	public void setLinaltinsedirev(String linaltinsedirev) {
		this.linaltinsedirev = linaltinsedirev;
	}

	public String getLininsedirev() {
		return this.lininsedirev;
	}

	public void setLininsedirev(String lininsedirev) {
		this.lininsedirev = lininsedirev;
	}

	public String getLininsrev() {
		return this.lininsrev;
	}

	public void setLininsrev(String lininsrev) {
		this.lininsrev = lininsrev;
	}

	public String getNomedires() {
		return this.nomedires;
	}

	public void setNomedires(String nomedires) {
		this.nomedires = nomedires;
	}

	public String getNomedirev() {
		return this.nomedirev;
	}

	public void setNomedirev(String nomedirev) {
		this.nomedirev = nomedirev;
	}

	public String getNomentrev() {
		return this.nomentrev;
	}

	public void setNomentrev(String nomentrev) {
		this.nomentrev = nomentrev;
	}

	public String getNomestrev() {
		return this.nomestrev;
	}

	public void setNomestrev(String nomestrev) {
		this.nomestrev = nomestrev;
	}

	public String getNomfileevirev() {
		return this.nomfileevirev;
	}

	public void setNomfileevirev(String nomfileevirev) {
		this.nomfileevirev = nomfileevirev;
	}

	public String getNomlugrev() {
		return this.nomlugrev;
	}

	public void setNomlugrev(String nomlugrev) {
		this.nomlugrev = nomlugrev;
	}

	public String getNomorgrev() {
		return this.nomorgrev;
	}

	public void setNomorgrev(String nomorgrev) {
		this.nomorgrev = nomorgrev;
	}

	public String getNomrevalt() {
		return this.nomrevalt;
	}

	public void setNomrevalt(String nomrevalt) {
		this.nomrevalt = nomrevalt;
	}

	public BigDecimal getNumfasrev() {
		return this.numfasrev;
	}

	public void setNumfasrev(BigDecimal numfasrev) {
		this.numfasrev = numfasrev;
	}

	public String getObsrevcan() {
		return this.obsrevcan;
	}

	public void setObsrevcan(String obsrevcan) {
		this.obsrevcan = obsrevcan;
	}

	public String getPerrevcan() {
		return this.perrevcan;
	}

	public void setPerrevcan(String perrevcan) {
		this.perrevcan = perrevcan;
	}

	public String getTelrevcan() {
		return this.telrevcan;
	}

	public void setTelrevcan(String telrevcan) {
		this.telrevcan = telrevcan;
	}

	public String getUrlcarcesder() {
		return this.urlcarcesder;
	}

	public void setUrlcarcesder(String urlcarcesder) {
		this.urlcarcesder = urlcarcesder;
	}

	public String getUrlcarori() {
		return this.urlcarori;
	}

	public void setUrlcarori(String urlcarori) {
		this.urlcarori = urlcarori;
	}

	public String getUrlfordic() {
		return this.urlfordic;
	}

	public void setUrlfordic(String urlfordic) {
		this.urlfordic = urlfordic;
	}

	public String getUrllogrev() {
		return this.urllogrev;
	}

	public void setUrllogrev(String urllogrev) {
		this.urllogrev = urllogrev;
	}

	public String getUrlnorcol() {
		return this.urlnorcol;
	}

	public void setUrlnorcol(String urlnorcol) {
		this.urlnorcol = urlnorcol;
	}

}