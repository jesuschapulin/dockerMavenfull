package org.siir.redalyc.model.entities.usuarios;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TBLUSURED database table.
 * 
 */
@Entity
@Table(schema="USUARIOS", name="TBLUSURED")
public class Tblusured implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLUSURED_CVEUSURED_GENERATOR", sequenceName="USUARIOS.TBLUSURED_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLUSURED_CVEUSURED_GENERATOR")
	private long cveusured;
	
	@OneToOne
	@PrimaryKeyJoinColumn(name="CVEUSURED")
	private Tbltodusu tbltodusur;

	private String actpriusu;

	private String apedosusu;

	private String apeunuusu;

	private String calusured;

	private String celusured;

	private String ciuusured;

	private String codposred;

	private String colusured;

	private BigDecimal cvegpotrb;//1-Redalyc interno (usuario interno al que pertenece el marcador)

	private String edousured;

	private String emausured;

	@Temporal(TemporalType.DATE)
	private Date fecingusu;

	@Temporal(TemporalType.DATE)
	private Date fecnacusu;

	@Temporal(TemporalType.DATE)
	private Date fecregusu;

	@Temporal(TemporalType.DATE)
	private Date fecretred;

	private String gramaxest;

	private String lugnacusu;

	private String nomusured;

	private BigDecimal sexusured;

	private BigDecimal stausured;

	private String telcasusu;

	public Tblusured() {
	}

	public long getCveusured() {
		return this.cveusured;
	}

	public void setCveusured(long cveusured) {
		this.cveusured = cveusured;
	}

	public Tbltodusu getTbltodusur() {
		return tbltodusur;
	}

	public void setTbltodusur(Tbltodusu tbltodusur) {
		this.tbltodusur = tbltodusur;
	}

	public String getActpriusu() {
		return this.actpriusu;
	}

	public void setActpriusu(String actpriusu) {
		this.actpriusu = actpriusu;
	}

	public String getApedosusu() {
		return this.apedosusu;
	}

	public void setApedosusu(String apedosusu) {
		this.apedosusu = apedosusu;
	}

	public String getApeunuusu() {
		return this.apeunuusu;
	}

	public void setApeunuusu(String apeunuusu) {
		this.apeunuusu = apeunuusu;
	}

	public String getCalusured() {
		return this.calusured;
	}

	public void setCalusured(String calusured) {
		this.calusured = calusured;
	}

	public String getCelusured() {
		return this.celusured;
	}

	public void setCelusured(String celusured) {
		this.celusured = celusured;
	}

	public String getCiuusured() {
		return this.ciuusured;
	}

	public void setCiuusured(String ciuusured) {
		this.ciuusured = ciuusured;
	}

	public String getCodposred() {
		return this.codposred;
	}

	public void setCodposred(String codposred) {
		this.codposred = codposred;
	}

	public String getColusured() {
		return this.colusured;
	}

	public void setColusured(String colusured) {
		this.colusured = colusured;
	}

	public BigDecimal getCvegpotrb() {
		return this.cvegpotrb;
	}

	public void setCvegpotrb(BigDecimal cvegpotrb) {
		this.cvegpotrb = cvegpotrb;
	}

	public String getEdousured() {
		return this.edousured;
	}

	public void setEdousured(String edousured) {
		this.edousured = edousured;
	}

	public String getEmausured() {
		return this.emausured;
	}

	public void setEmausured(String emausured) {
		this.emausured = emausured;
	}

	public Date getFecingusu() {
		return this.fecingusu;
	}

	public void setFecingusu(Date fecingusu) {
		this.fecingusu = fecingusu;
	}

	public Date getFecnacusu() {
		return this.fecnacusu;
	}

	public void setFecnacusu(Date fecnacusu) {
		this.fecnacusu = fecnacusu;
	}

	public Date getFecregusu() {
		return this.fecregusu;
	}

	public void setFecregusu(Date fecregusu) {
		this.fecregusu = fecregusu;
	}

	public Date getFecretred() {
		return this.fecretred;
	}

	public void setFecretred(Date fecretred) {
		this.fecretred = fecretred;
	}

	public String getGramaxest() {
		return this.gramaxest;
	}

	public void setGramaxest(String gramaxest) {
		this.gramaxest = gramaxest;
	}

	public String getLugnacusu() {
		return this.lugnacusu;
	}

	public void setLugnacusu(String lugnacusu) {
		this.lugnacusu = lugnacusu;
	}

	public String getNomusured() {
		return this.nomusured;
	}

	public void setNomusured(String nomusured) {
		this.nomusured = nomusured;
	}

	public BigDecimal getSexusured() {
		return this.sexusured;
	}

	public void setSexusured(BigDecimal sexusured) {
		this.sexusured = sexusured;
	}

	public BigDecimal getStausured() {
		return this.stausured;
	}

	public void setStausured(BigDecimal stausured) {
		this.stausured = stausured;
	}

	public String getTelcasusu() {
		return this.telcasusu;
	}

	public void setTelcasusu(String telcasusu) {
		this.telcasusu = telcasusu;
	}

}