package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AcSeccion entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcSeccion implements java.io.Serializable {

	// Fields

	private Integer secId;
	private AcCursoAperturado acCursoAperturado;
	private String secCodigo;
	private String secNombre;
	private Integer secVacantes;
	private String secActivo;
	private Set tbBloqueoWebs = new HashSet(0);
	private Set acActas = new HashSet(0);
	private Set acNotasTemporaleses = new HashSet(0);
	private Set acMatriculaCursos = new HashSet(0);
	private Set acHorarios = new HashSet(0);
	private Set acMatriculaCursoConafus = new HashSet(0);
	private Set acImportacionNotases = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcSeccion() {
	}

	/** minimal constructor */
	public AcSeccion(Integer secId, AcCursoAperturado acCursoAperturado) {
		this.secId = secId;
		this.acCursoAperturado = acCursoAperturado;
	}

	/** full constructor */
	public AcSeccion(Integer secId, AcCursoAperturado acCursoAperturado,
			String secCodigo, String secNombre, Integer secVacantes,
			String secActivo, Set tbBloqueoWebs, Set acActas,
			Set acNotasTemporaleses, 
			Set acMatriculaCursos, Set acHorarios, Set acMatriculaCursoConafus,
			Set acImportacionNotases) {
		this.secId = secId;
		this.acCursoAperturado = acCursoAperturado;
		this.secCodigo = secCodigo;
		this.secNombre = secNombre;
		this.secVacantes = secVacantes;
		this.secActivo = secActivo;
		this.tbBloqueoWebs = tbBloqueoWebs;
		this.acActas = acActas;
		this.acNotasTemporaleses = acNotasTemporaleses;
		this.acMatriculaCursos = acMatriculaCursos;
		this.acHorarios = acHorarios;
		this.acMatriculaCursoConafus = acMatriculaCursoConafus;
		this.acImportacionNotases = acImportacionNotases;
	}

	// Property accessors

	public Integer getSecId() {
		return this.secId;
	}

	public void setSecId(Integer secId) {
		this.secId = secId;
	}

	public AcCursoAperturado getAcCursoAperturado() {
		return this.acCursoAperturado;
	}

	public void setAcCursoAperturado(AcCursoAperturado acCursoAperturado) {
		this.acCursoAperturado = acCursoAperturado;
	}

	public String getSecCodigo() {
		return this.secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getSecNombre() {
		return this.secNombre;
	}

	public void setSecNombre(String secNombre) {
		this.secNombre = secNombre;
	}

	public Integer getSecVacantes() {
		return this.secVacantes;
	}

	public void setSecVacantes(Integer secVacantes) {
		this.secVacantes = secVacantes;
	}

	public String getSecActivo() {
		return this.secActivo;
	}

	public void setSecActivo(String secActivo) {
		this.secActivo = secActivo;
	}

	public Set getTbBloqueoWebs() {
		return this.tbBloqueoWebs;
	}

	public void setTbBloqueoWebs(Set tbBloqueoWebs) {
		this.tbBloqueoWebs = tbBloqueoWebs;
	}

	public Set getAcActas() {
		return this.acActas;
	}

	public void setAcActas(Set acActas) {
		this.acActas = acActas;
	}

	public Set getAcNotasTemporaleses() {
		return this.acNotasTemporaleses;
	}

	public void setAcNotasTemporaleses(Set acNotasTemporaleses) {
		this.acNotasTemporaleses = acNotasTemporaleses;
	}

	public Set getAcMatriculaCursos() {
		return this.acMatriculaCursos;
	}

	public void setAcMatriculaCursos(Set acMatriculaCursos) {
		this.acMatriculaCursos = acMatriculaCursos;
	}

	public Set getAcHorarios() {
		return this.acHorarios;
	}

	public void setAcHorarios(Set acHorarios) {
		this.acHorarios = acHorarios;
	}

	public Set getAcMatriculaCursoConafus() {
		return this.acMatriculaCursoConafus;
	}

	public void setAcMatriculaCursoConafus(Set acMatriculaCursoConafus) {
		this.acMatriculaCursoConafus = acMatriculaCursoConafus;
	}

	public Set getAcImportacionNotases() {
		return this.acImportacionNotases;
	}

	public void setAcImportacionNotases(Set acImportacionNotases) {
		this.acImportacionNotases = acImportacionNotases;
	}

}