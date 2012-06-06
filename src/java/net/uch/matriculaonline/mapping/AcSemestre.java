package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcSemestre entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcSemestre implements java.io.Serializable {

	// Fields

	private Integer semId;
	private String semCodigo;
	private String semNombre;
	private Date semFechaInicio;
	private Date semFechaFin;
	private String semVigente;
	private Integer semNumSemanas;
	private String semActivo;
	private Date semCreacion;
	private String semPensiones;
	private String semActual;
	private String semAcademico;
	private Set acCursoAperturados = new HashSet(0);
	private Set adEstructuraPagoses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcSemestre() {
	}

	/** minimal constructor */
	public AcSemestre(Integer semId) {
		this.semId = semId;
	}

	/** full constructor */
	public AcSemestre(Integer semId, String semCodigo, String semNombre,
			Date semFechaInicio, Date semFechaFin, String semVigente,
			Integer semNumSemanas, String semActivo, Date semCreacion,
			String semPensiones, String semActual, String semAcademico,
			Set acCursoAperturados, Set adEstructuraPagoses) {
		this.semId = semId;
		this.semCodigo = semCodigo;
		this.semNombre = semNombre;
		this.semFechaInicio = semFechaInicio;
		this.semFechaFin = semFechaFin;
		this.semVigente = semVigente;
		this.semNumSemanas = semNumSemanas;
		this.semActivo = semActivo;
		this.semCreacion = semCreacion;
		this.semPensiones = semPensiones;
		this.semActual = semActual;
		this.semAcademico = semAcademico;
		this.acCursoAperturados = acCursoAperturados;
		this.adEstructuraPagoses = adEstructuraPagoses;
	}

	// Property accessors

	public Integer getSemId() {
		return this.semId;
	}

	public void setSemId(Integer semId) {
		this.semId = semId;
	}

	public String getSemCodigo() {
		return this.semCodigo;
	}

	public void setSemCodigo(String semCodigo) {
		this.semCodigo = semCodigo;
	}

	public String getSemNombre() {
		return this.semNombre;
	}

	public void setSemNombre(String semNombre) {
		this.semNombre = semNombre;
	}

	public Date getSemFechaInicio() {
		return this.semFechaInicio;
	}

	public void setSemFechaInicio(Date semFechaInicio) {
		this.semFechaInicio = semFechaInicio;
	}

	public Date getSemFechaFin() {
		return this.semFechaFin;
	}

	public void setSemFechaFin(Date semFechaFin) {
		this.semFechaFin = semFechaFin;
	}

	public String getSemVigente() {
		return this.semVigente;
	}

	public void setSemVigente(String semVigente) {
		this.semVigente = semVigente;
	}

	public Integer getSemNumSemanas() {
		return this.semNumSemanas;
	}

	public void setSemNumSemanas(Integer semNumSemanas) {
		this.semNumSemanas = semNumSemanas;
	}

	public String getSemActivo() {
		return this.semActivo;
	}

	public void setSemActivo(String semActivo) {
		this.semActivo = semActivo;
	}

	public Date getSemCreacion() {
		return this.semCreacion;
	}

	public void setSemCreacion(Date semCreacion) {
		this.semCreacion = semCreacion;
	}

	public String getSemPensiones() {
		return this.semPensiones;
	}

	public void setSemPensiones(String semPensiones) {
		this.semPensiones = semPensiones;
	}

	public String getSemActual() {
		return this.semActual;
	}

	public void setSemActual(String semActual) {
		this.semActual = semActual;
	}

	public String getSemAcademico() {
		return this.semAcademico;
	}

	public void setSemAcademico(String semAcademico) {
		this.semAcademico = semAcademico;
	}

	public Set getAcCursoAperturados() {
		return this.acCursoAperturados;
	}

	public void setAcCursoAperturados(Set acCursoAperturados) {
		this.acCursoAperturados = acCursoAperturados;
	}

	public Set getAdEstructuraPagoses() {
		return this.adEstructuraPagoses;
	}

	public void setAdEstructuraPagoses(Set adEstructuraPagoses) {
		this.adEstructuraPagoses = adEstructuraPagoses;
	}

}