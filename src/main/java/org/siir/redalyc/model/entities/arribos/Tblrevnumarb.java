package org.siir.redalyc.model.entities.arribos;

import java.io.Serializable;
import javax.persistence.*;

import org.siir.redalyc.model.entities.uredalyc.Tblentrev;
import org.siir.redalyc.model.entities.uredalyc.Tblrevnum;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TBLREVNUMARB database table.
 * 
 */
@Entity
@Table(schema="ARRIBOS", name="TBLREVNUMARB")
public class Tblrevnumarb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLREVNUMARB_CVEREVNUMARB_GENERATOR", sequenceName="ARRIBOS.SEQ_TBLREVNUMARB")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLREVNUMARB_CVEREVNUMARB_GENERATOR")
	private long cverevnumarb;

	private BigDecimal anoedcnum;

	private BigDecimal clanumarb;

	private BigDecimal ctdarcharb;

	private BigDecimal cverevnum;

	private BigDecimal edonumarb;

	@Temporal(TemporalType.DATE)
	private Date feccararb;

	@Temporal(TemporalType.DATE)
	private Date feclibnum;

	@Temporal(TemporalType.DATE)
	private Date fecrcparb;

	private BigDecimal ftearribo;

	private String mailaltarb;

	private String mesnumrev;

	private BigDecimal numlibcom;

	private String numrevnum;

	private String observacionesarb;

	private BigDecimal tpoarribo;

	private BigDecimal tpoperarb;

	private String urltblcnt;

	private String volrevnum;
	
	//bi-directional many-to-one association to Tblentrev
	@ManyToOne
	@JoinColumn(name="CVEENTREV")
	private Tblentrev tblentrev;
	
	//bi-directional one-to-one association to Tblrevnum
	@OneToOne
	@PrimaryKeyJoinColumn(name="CVEREVNUM")
	private Tblrevnum tblrevnum;

	public Tblrevnumarb() {
	}

	public long getCverevnumarb() {
		return this.cverevnumarb;
	}

	public void setCverevnumarb(long cverevnumarb) {
		this.cverevnumarb = cverevnumarb;
	}

	public BigDecimal getAnoedcnum() {
		return this.anoedcnum;
	}

	public void setAnoedcnum(BigDecimal anoedcnum) {
		this.anoedcnum = anoedcnum;
	}

	public BigDecimal getClanumarb() {
		return this.clanumarb;
	}

	public void setClanumarb(BigDecimal clanumarb) {
		this.clanumarb = clanumarb;
	}

	public BigDecimal getCtdarcharb() {
		return this.ctdarcharb;
	}

	public void setCtdarcharb(BigDecimal ctdarcharb) {
		this.ctdarcharb = ctdarcharb;
	}

	public BigDecimal getCverevnum() {
		return this.cverevnum;
	}

	public void setCverevnum(BigDecimal cverevnum) {
		this.cverevnum = cverevnum;
	}

	public BigDecimal getEdonumarb() {
		return this.edonumarb;
	}

	public void setEdonumarb(BigDecimal edonumarb) {
		this.edonumarb = edonumarb;
	}

	public Date getFeccararb() {
		return this.feccararb;
	}

	public void setFeccararb(Date feccararb) {
		this.feccararb = feccararb;
	}

	public Date getFeclibnum() {
		return this.feclibnum;
	}

	public void setFeclibnum(Date feclibnum) {
		this.feclibnum = feclibnum;
	}

	public Date getFecrcparb() {
		return this.fecrcparb;
	}

	public void setFecrcparb(Date fecrcparb) {
		this.fecrcparb = fecrcparb;
	}

	public BigDecimal getFtearribo() {
		return this.ftearribo;
	}

	public void setFtearribo(BigDecimal ftearribo) {
		this.ftearribo = ftearribo;
	}

	public String getMailaltarb() {
		return this.mailaltarb;
	}

	public void setMailaltarb(String mailaltarb) {
		this.mailaltarb = mailaltarb;
	}

	public String getMesnumrev() {
		return this.mesnumrev;
	}

	public void setMesnumrev(String mesnumrev) {
		this.mesnumrev = mesnumrev;
	}

	public BigDecimal getNumlibcom() {
		return this.numlibcom;
	}

	public void setNumlibcom(BigDecimal numlibcom) {
		this.numlibcom = numlibcom;
	}

	public String getNumrevnum() {
		return this.numrevnum;
	}

	public void setNumrevnum(String numrevnum) {
		this.numrevnum = numrevnum;
	}

	public String getObservacionesarb() {
		return this.observacionesarb;
	}

	public void setObservacionesarb(String observacionesarb) {
		this.observacionesarb = observacionesarb;
	}

	public BigDecimal getTpoarribo() {
		return this.tpoarribo;
	}

	public void setTpoarribo(BigDecimal tpoarribo) {
		this.tpoarribo = tpoarribo;
	}

	public BigDecimal getTpoperarb() {
		return this.tpoperarb;
	}

	public void setTpoperarb(BigDecimal tpoperarb) {
		this.tpoperarb = tpoperarb;
	}

	public String getUrltblcnt() {
		return this.urltblcnt;
	}

	public void setUrltblcnt(String urltblcnt) {
		this.urltblcnt = urltblcnt;
	}

	public String getVolrevnum() {
		return this.volrevnum;
	}

	public void setVolrevnum(String volrevnum) {
		this.volrevnum = volrevnum;
	}

	public Tblentrev getTblentrev() {
		return tblentrev;
	}

	public void setTblentrev(Tblentrev tblentrev) {
		this.tblentrev = tblentrev;
	}

	public Tblrevnum getTblrevnum() {
		return tblrevnum;
	}

	public void setTblrevnum(Tblrevnum tblrevnum) {
		this.tblrevnum = tblrevnum;
	}

}