package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcDocente entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcDocente implements java.io.Serializable {

	// Fields

	private Integer docId;
	private String docCodigo;
	private String docNombre;
	private String docDni;
	private String docFoto;
	private String docSituacion;
	private Date docPeriodoInicio;
	private String docNacimiento;
	private String docResidencia;
	private String docTelefono;
	private String docSexo;
	private String docCorreo;
	private String docPassword;
	private String docActivo;
	private String docAppaterno;
	private String docApmaterno;
	private String docNombres;
	private Integer docHorasContrato;
	private String docCodigoMarca;
	private String numCarne;
	private String docTipo;
	private Set acHorarios = new HashSet(0);
	private Set acDisponibilidads = new HashSet(0);
	private Set acAreaDocentes = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcDocente() {
	}

	/** minimal constructor */
	public AcDocente(Integer docId) {
		this.docId = docId;
	}

	/** full constructor */
	public AcDocente(Integer docId, String docCodigo, String docNombre,
			String docDni, String docFoto, String docSituacion,
			Date docPeriodoInicio, String docNacimiento, String docResidencia,
			String docTelefono, String docSexo, String docCorreo,
			String docPassword, String docActivo, String docAppaterno,
			String docApmaterno, String docNombres, Integer docHorasContrato,
			String docCodigoMarca, String numCarne, String docTipo,
			Set acHorarios, Set acDisponibilidads,
			Set acAreaDocentes ) {
		this.docId = docId;
		this.docCodigo = docCodigo;
		this.docNombre = docNombre;
		this.docDni = docDni;
		this.docFoto = docFoto;
		this.docSituacion = docSituacion;
		this.docPeriodoInicio = docPeriodoInicio;
		this.docNacimiento = docNacimiento;
		this.docResidencia = docResidencia;
		this.docTelefono = docTelefono;
		this.docSexo = docSexo;
		this.docCorreo = docCorreo;
		this.docPassword = docPassword;
		this.docActivo = docActivo;
		this.docAppaterno = docAppaterno;
		this.docApmaterno = docApmaterno;
		this.docNombres = docNombres;
		this.docHorasContrato = docHorasContrato;
		this.docCodigoMarca = docCodigoMarca;
		this.numCarne = numCarne;
		this.docTipo = docTipo;
		this.acHorarios = acHorarios;
		this.acDisponibilidads = acDisponibilidads;
		this.acAreaDocentes = acAreaDocentes;
	}

	// Property accessors

	public Integer getDocId() {
		return this.docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public String getDocCodigo() {
		return this.docCodigo;
	}

	public void setDocCodigo(String docCodigo) {
		this.docCodigo = docCodigo;
	}

	public String getDocNombre() {
		return this.docNombre;
	}

	public void setDocNombre(String docNombre) {
		this.docNombre = docNombre;
	}

	public String getDocDni() {
		return this.docDni;
	}

	public void setDocDni(String docDni) {
		this.docDni = docDni;
	}

	public String getDocFoto() {
		return this.docFoto;
	}

	public void setDocFoto(String docFoto) {
		this.docFoto = docFoto;
	}

	public String getDocSituacion() {
		return this.docSituacion;
	}

	public void setDocSituacion(String docSituacion) {
		this.docSituacion = docSituacion;
	}

	public Date getDocPeriodoInicio() {
		return this.docPeriodoInicio;
	}

	public void setDocPeriodoInicio(Date docPeriodoInicio) {
		this.docPeriodoInicio = docPeriodoInicio;
	}

	public String getDocNacimiento() {
		return this.docNacimiento;
	}

	public void setDocNacimiento(String docNacimiento) {
		this.docNacimiento = docNacimiento;
	}

	public String getDocResidencia() {
		return this.docResidencia;
	}

	public void setDocResidencia(String docResidencia) {
		this.docResidencia = docResidencia;
	}

	public String getDocTelefono() {
		return this.docTelefono;
	}

	public void setDocTelefono(String docTelefono) {
		this.docTelefono = docTelefono;
	}

	public String getDocSexo() {
		return this.docSexo;
	}

	public void setDocSexo(String docSexo) {
		this.docSexo = docSexo;
	}

	public String getDocCorreo() {
		return this.docCorreo;
	}

	public void setDocCorreo(String docCorreo) {
		this.docCorreo = docCorreo;
	}

	public String getDocPassword() {
		return this.docPassword;
	}

	public void setDocPassword(String docPassword) {
		this.docPassword = docPassword;
	}

	public String getDocActivo() {
		return this.docActivo;
	}

	public void setDocActivo(String docActivo) {
		this.docActivo = docActivo;
	}

	public String getDocAppaterno() {
		return this.docAppaterno;
	}

	public void setDocAppaterno(String docAppaterno) {
		this.docAppaterno = docAppaterno;
	}

	public String getDocApmaterno() {
		return this.docApmaterno;
	}

	public void setDocApmaterno(String docApmaterno) {
		this.docApmaterno = docApmaterno;
	}

	public String getDocNombres() {
		return this.docNombres;
	}

	public void setDocNombres(String docNombres) {
		this.docNombres = docNombres;
	}

	public Integer getDocHorasContrato() {
		return this.docHorasContrato;
	}

	public void setDocHorasContrato(Integer docHorasContrato) {
		this.docHorasContrato = docHorasContrato;
	}

	public String getDocCodigoMarca() {
		return this.docCodigoMarca;
	}

	public void setDocCodigoMarca(String docCodigoMarca) {
		this.docCodigoMarca = docCodigoMarca;
	}

	public String getNumCarne() {
		return this.numCarne;
	}

	public void setNumCarne(String numCarne) {
		this.numCarne = numCarne;
	}

	public String getDocTipo() {
		return this.docTipo;
	}

	public void setDocTipo(String docTipo) {
		this.docTipo = docTipo;
	}

	public Set getAcHorarios() {
		return this.acHorarios;
	}

	public void setAcHorarios(Set acHorarios) {
		this.acHorarios = acHorarios;
	}

	public Set getAcDisponibilidads() {
		return this.acDisponibilidads;
	}

	public void setAcDisponibilidads(Set acDisponibilidads) {
		this.acDisponibilidads = acDisponibilidads;
	}

	public Set getAcAreaDocentes() {
		return this.acAreaDocentes;
	}

	public void setAcAreaDocentes(Set acAreaDocentes) {
		this.acAreaDocentes = acAreaDocentes;
	}
}