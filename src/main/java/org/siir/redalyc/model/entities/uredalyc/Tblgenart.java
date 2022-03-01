package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TBLGENART database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLGENART")
public class Tblgenart implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String BUSCAR_ARTICULO = "Tblgenart.buscarArticulo";

	@Id
	@SequenceGenerator(name="TBLGENART_CVEARTHTML_GENERATOR",sequenceName="UREDALYC.SQ_TBLGENART", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLGENART_CVEARTHTML_GENERATOR")
	private long cvearthtml;

	private String cverevtit;

	private BigDecimal html;

	private BigDecimal visorjats;

	public Tblgenart() {
	}

	public long getCvearthtml() {
		return this.cvearthtml;
	}

	public void setCvearthtml(long cvearthtml) {
		this.cvearthtml = cvearthtml;
	}

	public String getCverevtit() {
		return this.cverevtit;
	}

	public void setCverevtit(String cverevtit) {
		this.cverevtit = cverevtit;
	}

	public BigDecimal getHtml() {
		return this.html;
	}

	public void setHtml(BigDecimal html) {
		this.html = html;
	}

	public BigDecimal getVisorjats() {
		return this.visorjats;
	}

	public void setVisorjats(BigDecimal visorjats) {
		this.visorjats = visorjats;
	}

}