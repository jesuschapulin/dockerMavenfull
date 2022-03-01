package org.siir.redalyc.model.entities.uredalyc;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBLREVSEC database table.
 * 
 */
@Entity
@Table(schema="UREDALYC", name="TBLREVSEC")
public class Tblrevsec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLREVSEC_CVEENTSEC_GENERATOR", sequenceName="UREDALYC.SQ_TBLREVSEC", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLREVSEC_CVEENTSEC_GENERATOR")
	private long cveentsec;

	private String nomentsec;

	private BigDecimal ordentsec;
	
	private BigDecimal bndelmsec;

	@JsonBackReference("tblrevnum-tblrevsecs")
	//bi-directional many-to-one association to Tblrevnum
	@ManyToOne
	@JoinColumn(name="CVEREVNUM")
	private Tblrevnum tblrevnum;

	@JsonManagedReference("tblrevsec-tblrevtits")
	//bi-directional many-to-one association to Tblrevtit
	@OneToMany(mappedBy="tblrevsec", cascade = CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<Tblrevtit> tblrevtits;

	public Tblrevsec() {
	}

	public long getCveentsec() {
		return this.cveentsec;
	}

	public void setCveentsec(long cveentsec) {
		this.cveentsec = cveentsec;
	}

	public String getNomentsec() {
		return this.nomentsec;
	}

	public void setNomentsec(String nomentsec) {
		this.nomentsec = nomentsec;
	}

	public BigDecimal getOrdentsec() {
		return this.ordentsec;
	}

	public void setOrdentsec(BigDecimal ordentsec) {
		this.ordentsec = ordentsec;
	}

	public BigDecimal getBndelmsec() {
		return bndelmsec;
	}

	public void setBndelmsec(BigDecimal bndelmsec) {
		this.bndelmsec = bndelmsec;
	}

	public Tblrevnum getTblrevnum() {
		return this.tblrevnum;
	}

	public void setTblrevnum(Tblrevnum tblrevnum) {
		this.tblrevnum = tblrevnum;
	}

	public List<Tblrevtit> getTblrevtits() {
		return this.tblrevtits;
	}

	public void setTblrevtits(List<Tblrevtit> tblrevtits) {
		this.tblrevtits = tblrevtits;
	}

	public Tblrevtit addTblrevtit(Tblrevtit tblrevtit) {
		getTblrevtits().add(tblrevtit);
		tblrevtit.setTblrevsec(this);

		return tblrevtit;
	}

	public Tblrevtit removeTblrevtit(Tblrevtit tblrevtit) {
		getTblrevtits().remove(tblrevtit);
		tblrevtit.setTblrevsec(null);

		return tblrevtit;
	}

	@Override
	public String toString() {
		return "Tblrevsec [cveentsec=" + cveentsec + ", nomentsec=" + nomentsec + ", ordentsec=" + ordentsec + "]";
	}
}