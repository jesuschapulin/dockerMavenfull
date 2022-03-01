package org.siir.redalyc.model.entities.usuarios;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the TBLENTARE database table.
 * tabla de areas de usuario
 */
@Entity
@Table(schema="USUARIOS", name="TBLENTARE")
public class TblentareU implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBLENTARE_CVEARETRB_GENERATOR", sequenceName="USUARIOS.TBLENTARE_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLENTARE_CVEARETRB_GENERATOR")
	private long cvearetrb;

	private String nomaretrb;
	
	@OneToMany(mappedBy="tblentareu")
	private List<Tbltodusu> tbltodusus;

	public TblentareU() {
	}

	public long getCvearetrb() {
		return this.cvearetrb;
	}

	public void setCvearetrb(long cvearetrb) {
		this.cvearetrb = cvearetrb;
	}

	public String getNomaretrb() {
		return this.nomaretrb;
	}

	public void setNomaretrb(String nomaretrb) {
		this.nomaretrb = nomaretrb;
	}

	public List<Tbltodusu> getTbltodusus() {
		return tbltodusus;
	}

	public void setTbltodusus(List<Tbltodusu> tbltodusus) {
		this.tbltodusus = tbltodusus;
	}

}