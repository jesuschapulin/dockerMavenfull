package org.siir.redalyc.model.entities.usuarios;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the ENTPERUSU database table.
 * tabla de permisos de usuario
 */
@Entity
@Table(schema="USUARIOS", name="ENTPERUSU")
public class Entperusu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ENTPERUSU_CVEPERUSU_GENERATOR", sequenceName="USUARIOS.ENTPERUSU_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ENTPERUSU_CVEPERUSU_GENERATOR")
	private long cveperusu;//131-pruebaPilotoMarcaje para que no puedan ingresar otros usuarios que no sean del grupo marcador

	private String nomperusu;

	//bi-directional many-to-one association to Relperper
	@OneToMany(mappedBy="entperusu")
	private List<Relperper> relperpers;

	//bi-directional many-to-one association to Relperusu
	@OneToMany(mappedBy="entperusu")
	private List<Relperusu> relperusus;

	public Entperusu() {
	}

	public long getCveperusu() {
		return this.cveperusu;
	}

	public void setCveperusu(long cveperusu) {
		this.cveperusu = cveperusu;
	}

	public String getNomperusu() {
		return this.nomperusu;
	}

	public void setNomperusu(String nomperusu) {
		this.nomperusu = nomperusu;
	}

	public List<Relperper> getRelperpers() {
		return this.relperpers;
	}

	public void setRelperpers(List<Relperper> relperpers) {
		this.relperpers = relperpers;
	}

	public Relperper addRelperper(Relperper relperper) {
		getRelperpers().add(relperper);
		relperper.setEntperusu(this);

		return relperper;
	}

	public Relperper removeRelperper(Relperper relperper) {
		getRelperpers().remove(relperper);
		relperper.setEntperusu(null);

		return relperper;
	}

	public List<Relperusu> getRelperusus() {
		return this.relperusus;
	}

	public void setRelperusus(List<Relperusu> relperusus) {
		this.relperusus = relperusus;
	}

	public Relperusu addRelperusus(Relperusu relperusus) {
		getRelperusus().add(relperusus);
		relperusus.setEntperusu(this);

		return relperusus;
	}

	public Relperusu removeRelperusus(Relperusu relperusus) {
		getRelperusus().remove(relperusus);
		relperusus.setEntperusu(null);

		return relperusus;
	}

}