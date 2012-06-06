package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AcCurso entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcCurso implements java.io.Serializable {

	// Fields

	private Integer curId;
	private AcEspecialidad acEspecialidad;
	private String curCodigo;
	private String curNombre;
	private String curActivo;
	private Set acPlanCursos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcCurso() {
	}

	/** minimal constructor */
	public AcCurso(Integer curId) {
		this.curId = curId;
	}

	/** full constructor */
	public AcCurso(Integer curId, AcEspecialidad acEspecialidad,
			String curCodigo, String curNombre, String curActivo,
			Set acPlanCursos) {
		this.curId = curId;
		this.acEspecialidad = acEspecialidad;
		this.curCodigo = curCodigo;
		this.curNombre = curNombre;
		this.curActivo = curActivo;
		this.acPlanCursos = acPlanCursos;
	}

	// Property accessors

	public Integer getCurId() {
		return this.curId;
	}

	public void setCurId(Integer curId) {
		this.curId = curId;
	}

	public AcEspecialidad getAcEspecialidad() {
		return this.acEspecialidad;
	}

	public void setAcEspecialidad(AcEspecialidad acEspecialidad) {
		this.acEspecialidad = acEspecialidad;
	}

	public String getCurCodigo() {
		return this.curCodigo;
	}

	public void setCurCodigo(String curCodigo) {
		this.curCodigo = curCodigo;
	}

	public String getCurNombre() {
		return this.curNombre;
	}

	public void setCurNombre(String curNombre) {
		this.curNombre = curNombre;
	}

	public String getCurActivo() {
		return this.curActivo;
	}

	public void setCurActivo(String curActivo) {
		this.curActivo = curActivo;
	}

	public Set getAcPlanCursos() {
		return this.acPlanCursos;
	}

	public void setAcPlanCursos(Set acPlanCursos) {
		this.acPlanCursos = acPlanCursos;
	}

}