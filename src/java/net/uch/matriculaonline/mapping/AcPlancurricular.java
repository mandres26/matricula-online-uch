package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcPlancurricular entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcPlancurricular implements java.io.Serializable {

	// Fields

	private Integer planId;
	private AcEspecialidad acEspecialidad;
	private String planCodigo;
	private String planDescripcion;
	private Date planCreacion;
	private String planResolucion;
	private String planVigente;
	private String planActual;
	private String planActivo;
	private Set acPlanCursos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcPlancurricular() {
	}

	/** minimal constructor */
	public AcPlancurricular(Integer planId, AcEspecialidad acEspecialidad) {
		this.planId = planId;
		this.acEspecialidad = acEspecialidad;
	}

	/** full constructor */
	public AcPlancurricular(Integer planId, AcEspecialidad acEspecialidad,
			String planCodigo, String planDescripcion, Date planCreacion,
			String planResolucion, String planVigente, String planActual,
			String planActivo, Set acPlanCursos) {
		this.planId = planId;
		this.acEspecialidad = acEspecialidad;
		this.planCodigo = planCodigo;
		this.planDescripcion = planDescripcion;
		this.planCreacion = planCreacion;
		this.planResolucion = planResolucion;
		this.planVigente = planVigente;
		this.planActual = planActual;
		this.planActivo = planActivo;
		this.acPlanCursos = acPlanCursos;
	}

	// Property accessors

	public Integer getPlanId() {
		return this.planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public AcEspecialidad getAcEspecialidad() {
		return this.acEspecialidad;
	}

	public void setAcEspecialidad(AcEspecialidad acEspecialidad) {
		this.acEspecialidad = acEspecialidad;
	}

	public String getPlanCodigo() {
		return this.planCodigo;
	}

	public void setPlanCodigo(String planCodigo) {
		this.planCodigo = planCodigo;
	}

	public String getPlanDescripcion() {
		return this.planDescripcion;
	}

	public void setPlanDescripcion(String planDescripcion) {
		this.planDescripcion = planDescripcion;
	}

	public Date getPlanCreacion() {
		return this.planCreacion;
	}

	public void setPlanCreacion(Date planCreacion) {
		this.planCreacion = planCreacion;
	}

	public String getPlanResolucion() {
		return this.planResolucion;
	}

	public void setPlanResolucion(String planResolucion) {
		this.planResolucion = planResolucion;
	}

	public String getPlanVigente() {
		return this.planVigente;
	}

	public void setPlanVigente(String planVigente) {
		this.planVigente = planVigente;
	}

	public String getPlanActual() {
		return this.planActual;
	}

	public void setPlanActual(String planActual) {
		this.planActual = planActual;
	}

	public String getPlanActivo() {
		return this.planActivo;
	}

	public void setPlanActivo(String planActivo) {
		this.planActivo = planActivo;
	}

	public Set getAcPlanCursos() {
		return this.acPlanCursos;
	}

	public void setAcPlanCursos(Set acPlanCursos) {
		this.acPlanCursos = acPlanCursos;
	}

}