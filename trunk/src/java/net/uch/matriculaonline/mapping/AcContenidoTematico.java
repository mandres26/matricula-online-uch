package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AcContenidoTematico entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcContenidoTematico implements java.io.Serializable {

	// Fields

	private Integer contemId;
	private AcPlanCurso acPlanCurso;
	private String contemTitulo;
	private String contemDescripcion;
	private String contemNroSemanas;
	private String contemVigente;
	private String contemActivo;
	private Set acContenidoDetalles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcContenidoTematico() {
	}

	/** minimal constructor */
	public AcContenidoTematico(Integer contemId, AcPlanCurso acPlanCurso) {
		this.contemId = contemId;
		this.acPlanCurso = acPlanCurso;
	}

	/** full constructor */
	public AcContenidoTematico(Integer contemId, AcPlanCurso acPlanCurso,
			String contemTitulo, String contemDescripcion,
			String contemNroSemanas, String contemVigente, String contemActivo,
			Set acContenidoDetalles) {
		this.contemId = contemId;
		this.acPlanCurso = acPlanCurso;
		this.contemTitulo = contemTitulo;
		this.contemDescripcion = contemDescripcion;
		this.contemNroSemanas = contemNroSemanas;
		this.contemVigente = contemVigente;
		this.contemActivo = contemActivo;
		this.acContenidoDetalles = acContenidoDetalles;
	}

	// Property accessors

	public Integer getContemId() {
		return this.contemId;
	}

	public void setContemId(Integer contemId) {
		this.contemId = contemId;
	}

	public AcPlanCurso getAcPlanCurso() {
		return this.acPlanCurso;
	}

	public void setAcPlanCurso(AcPlanCurso acPlanCurso) {
		this.acPlanCurso = acPlanCurso;
	}

	public String getContemTitulo() {
		return this.contemTitulo;
	}

	public void setContemTitulo(String contemTitulo) {
		this.contemTitulo = contemTitulo;
	}

	public String getContemDescripcion() {
		return this.contemDescripcion;
	}

	public void setContemDescripcion(String contemDescripcion) {
		this.contemDescripcion = contemDescripcion;
	}

	public String getContemNroSemanas() {
		return this.contemNroSemanas;
	}

	public void setContemNroSemanas(String contemNroSemanas) {
		this.contemNroSemanas = contemNroSemanas;
	}

	public String getContemVigente() {
		return this.contemVigente;
	}

	public void setContemVigente(String contemVigente) {
		this.contemVigente = contemVigente;
	}

	public String getContemActivo() {
		return this.contemActivo;
	}

	public void setContemActivo(String contemActivo) {
		this.contemActivo = contemActivo;
	}

	public Set getAcContenidoDetalles() {
		return this.acContenidoDetalles;
	}

	public void setAcContenidoDetalles(Set acContenidoDetalles) {
		this.acContenidoDetalles = acContenidoDetalles;
	}

}