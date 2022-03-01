package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;


/**
 * The persistent class for the ARCREVTIT database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="ARCREVTIT")
public class Arcrevtit implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ARCREVTIT_CVEARCHREVTIT_GENERATOR", sequenceName="UREDALYC.SQ_ARCREVTIT", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ARCREVTIT_CVEARCHREVTIT_GENERATOR")
	private long cvearchrevtit;

	private BigDecimal archivogenerado;

	private BigDecimal bndauto;

	private String tipo;

	private String urlarchivo;

	private BigDecimal vldarcrevtit;
	
	@JsonBackReference("tblrevtitarc-arcrevtits")
	//bi-directional many-to-one association to Tblrevtit
	@ManyToOne
	@JoinColumn(name="CVEREVTIT")
	private Tblrevtit tblrevtitarc;
	
	@JsonManagedReference("arcrevtits-tblentidiarc")
	//bi-directional many-to-one association to Tblentidi
	@ManyToOne
	@JoinColumn(name="CVEIDIOMA")
	private Tblentidi tblentidiarc;

	public Arcrevtit() {
	}

	public long getCvearchrevtit() {
		return this.cvearchrevtit;
	}

	public void setCvearchrevtit(long cvearchrevtit) {
		this.cvearchrevtit = cvearchrevtit;
	}

	public BigDecimal getArchivogenerado() {
		return this.archivogenerado;
	}

	public void setArchivogenerado(BigDecimal archivogenerado) {
		this.archivogenerado = archivogenerado;
	}

	public BigDecimal getBndauto() {
		return this.bndauto;
	}

	public void setBndauto(BigDecimal bndauto) {
		this.bndauto = bndauto;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUrlarchivo() {
		return this.urlarchivo;
	}

	public void setUrlarchivo(String urlarchivo) {
		this.urlarchivo = urlarchivo;
	}

	public BigDecimal getVldarcrevtit() {
		return this.vldarcrevtit;
	}

	public void setVldarcrevtit(BigDecimal vldarcrevtit) {
		this.vldarcrevtit = vldarcrevtit;
	}

	public Tblrevtit getTblrevtitarc() {
		return tblrevtitarc;
	}

	public void setTblrevtitarc(Tblrevtit tblrevtitarc) {
		this.tblrevtitarc = tblrevtitarc;
	}

	public Tblentidi getTblentidiarc() {
		return tblentidiarc;
	}

	public void setTblentidiarc(Tblentidi tblentidiarc) {
		this.tblentidiarc = tblentidiarc;
	}
	
}