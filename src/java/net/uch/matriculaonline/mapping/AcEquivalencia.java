package net.uch.matriculaonline.mapping;

import java.util.Date;

/**
 * AcEquivalencia entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcEquivalencia implements java.io.Serializable {

	// Fields

	private Integer equId;
	private AcPlanCurso acPlanCurso;
	private String equCursoEquivalente;
	private String equObservacion;
	private Date equCreacion;
	private String equActivo;

	// Constructors

	/** default constructor */
	public AcEquivalencia() {
	}

	/** minimal constructor */
	public AcEquivalencia(Integer equId, AcPlanCurso acPlanCurso) {
		this.equId = equId;
		this.acPlanCurso = acPlanCurso;
	}

	/** full constructor */
	public AcEquivalencia(Integer equId, AcPlanCurso acPlanCurso,
			String equCursoEquivalente, String equObservacion,
			Date equCreacion, String equActivo) {
		this.equId = equId;
		this.acPlanCurso = acPlanCurso;
		this.equCursoEquivalente = equCursoEquivalente;
		this.equObservacion = equObservacion;
		this.equCreacion = equCreacion;
		this.equActivo = equActivo;
	}

	// Property accessors

	public Integer getEquId() {
		return this.equId;
	}

	public void setEquId(Integer equId) {
		this.equId = equId;
	}

	public AcPlanCurso getAcPlanCurso() {
		return this.acPlanCurso;
	}

	public void setAcPlanCurso(AcPlanCurso acPlanCurso) {
		this.acPlanCurso = acPlanCurso;
	}

	public String getEquCursoEquivalente() {
		return this.equCursoEquivalente;
	}

	public void setEquCursoEquivalente(String equCursoEquivalente) {
		this.equCursoEquivalente = equCursoEquivalente;
	}

	public String getEquObservacion() {
		return this.equObservacion;
	}

	public void setEquObservacion(String equObservacion) {
		this.equObservacion = equObservacion;
	}

	public Date getEquCreacion() {
		return this.equCreacion;
	}

	public void setEquCreacion(Date equCreacion) {
		this.equCreacion = equCreacion;
	}

	public String getEquActivo() {
		return this.equActivo;
	}

	public void setEquActivo(String equActivo) {
		this.equActivo = equActivo;
	}

}