package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcFacultad entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcFacultad implements java.io.Serializable {

	// Fields

	private Integer facId;
	private String facCodigo;
	private String facNombre;
	private Date facFechacreacion;
	private String facResolrectoral;
	private String facActivo;
	private Set acEspecialidads = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcFacultad() {
	}

	/** minimal constructor */
	public AcFacultad(Integer facId, String facActivo) {
		this.facId = facId;
		this.facActivo = facActivo;
	}

	/** full constructor */
	public AcFacultad(Integer facId, String facCodigo, String facNombre,
			Date facFechacreacion, String facResolrectoral, String facActivo,
			Set acEspecialidads) {
		this.facId = facId;
		this.facCodigo = facCodigo;
		this.facNombre = facNombre;
		this.facFechacreacion = facFechacreacion;
		this.facResolrectoral = facResolrectoral;
		this.facActivo = facActivo;
		this.acEspecialidads = acEspecialidads;
	}

	// Property accessors

	public Integer getFacId() {
		return this.facId;
	}

	public void setFacId(Integer facId) {
		this.facId = facId;
	}

	public String getFacCodigo() {
		return this.facCodigo;
	}

	public void setFacCodigo(String facCodigo) {
		this.facCodigo = facCodigo;
	}

	public String getFacNombre() {
		return this.facNombre;
	}

	public void setFacNombre(String facNombre) {
		this.facNombre = facNombre;
	}

	public Date getFacFechacreacion() {
		return this.facFechacreacion;
	}

	public void setFacFechacreacion(Date facFechacreacion) {
		this.facFechacreacion = facFechacreacion;
	}

	public String getFacResolrectoral() {
		return this.facResolrectoral;
	}

	public void setFacResolrectoral(String facResolrectoral) {
		this.facResolrectoral = facResolrectoral;
	}

	public String getFacActivo() {
		return this.facActivo;
	}

	public void setFacActivo(String facActivo) {
		this.facActivo = facActivo;
	}

	public Set getAcEspecialidads() {
		return this.acEspecialidads;
	}

	public void setAcEspecialidads(Set acEspecialidads) {
		this.acEspecialidads = acEspecialidads;
	}

}