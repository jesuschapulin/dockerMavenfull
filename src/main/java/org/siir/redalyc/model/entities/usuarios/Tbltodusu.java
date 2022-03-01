package org.siir.redalyc.model.entities.usuarios;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TBLTODUSU database table.
 * 
 */
@Entity
@Table(schema="USUARIOS", name="TBLTODUSU")
public class Tbltodusu implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String BUSCAR_USUARIO_LOGIN = "Tbltodusu.buscarUsuarioLogin";
	public static final String BUSCAR_USUARIO_LOGIN_COMPLETO = "Tbltodusu.buscarUsuarioLoginCompleto";
	public static final String BUSCAR_BUSCAR_REVISTAS_ASIGNADAS = "Tbltodusu.buscarRevistasAsignadas";
	public static final String BUSCAR_BUSCAR_NUMEROS_ASIGNADOS = "Tbltodusu.buscarNumerosAsignados";
	public static final String BUSCAR_CAMBIO_CONTRASENA = "Tbltodusu.cambioContrasena";
	public static final String BUSCAR_USUARIO_MAIL = "Tbltodusu.buscarUsuarioMail";
	public static final String BUSCAR_EMAIL_USUARIOS_EXTERNOS = "Tbltodusu.buscarEmailUsuariosExternos";

	@Id
	@SequenceGenerator(name="TBLTODUSU_CVETODUSU_GENERATOR", sequenceName="USUARIOS.TBLTODUSU_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBLTODUSU_CVETODUSU_GENERATOR")
	private long cvetodusu;

	private BigDecimal cverecurso;

	@Temporal(TemporalType.DATE)
	private Date feccretod;

	@Temporal(TemporalType.DATE)
	private Date fecultmod;

	private String logtodusu;

	private String pastodusu;

	private BigDecimal tipousuario;

	private BigDecimal usucretod;

	private BigDecimal usuultmod;
	
	private BigDecimal acttodusu;
	
	private Long cveentidi;
	
	@Temporal(TemporalType.DATE)
	private Date fecactusu;

	//bi-directional many-to-one association to Relperusu
	@OneToMany(mappedBy="tbltodusu")
	private List<Relperusu> relperusus;

	//bi-directional many-to-one association to Tblrevusu
	@OneToMany(mappedBy="tbltodusu1")
	private List<Tblrevusu> tblrevusus1;

	//bi-directional many-to-one association to Tblrevusu
	@OneToMany(mappedBy="tbltodusu2")
	private List<Tblrevusu> tblrevusus2;
	
	@ManyToOne
	@JoinColumn(name="CVEENTARE")
	private TblentareU tblentareu;
	
	@OneToOne(mappedBy="tbltodusur")
	private Tblusured tblusured;

	public Tbltodusu() {
	}

	public long getCvetodusu() {
		return this.cvetodusu;
	}

	public void setCvetodusu(long cvetodusu) {
		this.cvetodusu = cvetodusu;
	}

	public BigDecimal getCverecurso() {
		return this.cverecurso;
	}

	public void setCverecurso(BigDecimal cverecurso) {
		this.cverecurso = cverecurso;
	}

	public Date getFeccretod() {
		return this.feccretod;
	}

	public void setFeccretod(Date feccretod) {
		this.feccretod = feccretod;
	}

	public Date getFecultmod() {
		return this.fecultmod;
	}

	public void setFecultmod(Date fecultmod) {
		this.fecultmod = fecultmod;
	}

	public String getLogtodusu() {
		return this.logtodusu;
	}

	public void setLogtodusu(String logtodusu) {
		this.logtodusu = logtodusu;
	}

	public String getPastodusu() {
		return this.pastodusu;
	}

	public void setPastodusu(String pastodusu) {
		this.pastodusu = pastodusu;
	}

	public BigDecimal getTipousuario() {
		return this.tipousuario;
	}

	public void setTipousuario(BigDecimal tipousuario) {
		this.tipousuario = tipousuario;
	}

	public BigDecimal getUsucretod() {
		return this.usucretod;
	}

	public void setUsucretod(BigDecimal usucretod) {
		this.usucretod = usucretod;
	}

	public BigDecimal getUsuultmod() {
		return this.usuultmod;
	}

	public void setUsuultmod(BigDecimal usuultmod) {
		this.usuultmod = usuultmod;
	}

	public BigDecimal getActtodusu() {
		return acttodusu;
	}

	public void setActtodusu(BigDecimal acttodusu) {
		this.acttodusu = acttodusu;
	}

	public Date getFecactusu() {
		return fecactusu;
	}

	public void setFecactusu(Date fecactusu) {
		this.fecactusu = fecactusu;
	}

	public List<Relperusu> getRelperusus() {
		return this.relperusus;
	}

	public void setRelperusus(List<Relperusu> relperusus) {
		this.relperusus = relperusus;
	}

	public Relperusu addRelperusus(Relperusu relperusus) {
		getRelperusus().add(relperusus);
		relperusus.setTbltodusu(this);

		return relperusus;
	}

	public Relperusu removeRelperusus(Relperusu relperusus) {
		getRelperusus().remove(relperusus);
		relperusus.setTbltodusu(null);

		return relperusus;
	}

	public List<Tblrevusu> getTblrevusus1() {
		return this.tblrevusus1;
	}

	public void setTblrevusus1(List<Tblrevusu> tblrevusus1) {
		this.tblrevusus1 = tblrevusus1;
	}

	public Tblrevusu addTblrevusus1(Tblrevusu tblrevusus1) {
		getTblrevusus1().add(tblrevusus1);
		tblrevusus1.setTbltodusu1(this);

		return tblrevusus1;
	}

	public Tblrevusu removeTblrevusus1(Tblrevusu tblrevusus1) {
		getTblrevusus1().remove(tblrevusus1);
		tblrevusus1.setTbltodusu1(null);

		return tblrevusus1;
	}

	public List<Tblrevusu> getTblrevusus2() {
		return this.tblrevusus2;
	}

	public void setTblrevusus2(List<Tblrevusu> tblrevusus2) {
		this.tblrevusus2 = tblrevusus2;
	}

	public Tblrevusu addTblrevusus2(Tblrevusu tblrevusus2) {
		getTblrevusus2().add(tblrevusus2);
		tblrevusus2.setTbltodusu2(this);

		return tblrevusus2;
	}

	public Tblrevusu removeTblrevusus2(Tblrevusu tblrevusus2) {
		getTblrevusus2().remove(tblrevusus2);
		tblrevusus2.setTbltodusu2(null);

		return tblrevusus2;
	}

	public TblentareU getTblentareu() {
		return tblentareu;
	}

	public void setTblentareu(TblentareU tblentareu) {
		this.tblentareu = tblentareu;
	}

	public Tblusured getTblusured() {
		return tblusured;
	}

	public void setTblusured(Tblusured tblusured) {
		this.tblusured = tblusured;
	}

	public Long getCveentidi() {
		return cveentidi;
	}

	public void setCveentidi(Long cveentidi) {
		this.cveentidi = cveentidi;
	}

}