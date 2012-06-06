package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcPromediosFinales entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcPromediosFinales implements java.io.Serializable {

	// Fields

	private Integer promfinId;
	private AcMatriculaCurso acMatriculaCurso;
	private Float promfinPromedio;
	private String promfinVigente;
	private String promfinActivo;
	private Date promfinCreacion;
	private Date promfinModificacion;
	private Set acPromediosParcialeses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcPromediosFinales() {
	}

	/** minimal constructor */
	public AcPromediosFinales(Integer promfinId,
			AcMatriculaCurso acMatriculaCurso) {
		this.promfinId = promfinId;
		this.acMatriculaCurso = acMatriculaCurso;
	}

	/** full constructor */
	public AcPromediosFinales(Integer promfinId,
			AcMatriculaCurso acMatriculaCurso, Float promfinPromedio,
			String promfinVigente, String promfinActivo, Date promfinCreacion,
			Date promfinModificacion, Set acPromediosParcialeses) {
		this.promfinId = promfinId;
		this.acMatriculaCurso = acMatriculaCurso;
		this.promfinPromedio = promfinPromedio;
		this.promfinVigente = promfinVigente;
		this.promfinActivo = promfinActivo;
		this.promfinCreacion = promfinCreacion;
		this.promfinModificacion = promfinModificacion;
		this.acPromediosParcialeses = acPromediosParcialeses;
	}

	// Property accessors

	public Integer getPromfinId() {
		return this.promfinId;
	}

	public void setPromfinId(Integer promfinId) {
		this.promfinId = promfinId;
	}

	public AcMatriculaCurso getAcMatriculaCurso() {
		return this.acMatriculaCurso;
	}

	public void setAcMatriculaCurso(AcMatriculaCurso acMatriculaCurso) {
		this.acMatriculaCurso = acMatriculaCurso;
	}

	public Float getPromfinPromedio() {
		return this.promfinPromedio;
	}

	public void setPromfinPromedio(Float promfinPromedio) {
		this.promfinPromedio = promfinPromedio;
	}

	public String getPromfinVigente() {
		return this.promfinVigente;
	}

	public void setPromfinVigente(String promfinVigente) {
		this.promfinVigente = promfinVigente;
	}

	public String getPromfinActivo() {
		return this.promfinActivo;
	}

	public void setPromfinActivo(String promfinActivo) {
		this.promfinActivo = promfinActivo;
	}

	public Date getPromfinCreacion() {
		return this.promfinCreacion;
	}

	public void setPromfinCreacion(Date promfinCreacion) {
		this.promfinCreacion = promfinCreacion;
	}

	public Date getPromfinModificacion() {
		return this.promfinModificacion;
	}

	public void setPromfinModificacion(Date promfinModificacion) {
		this.promfinModificacion = promfinModificacion;
	}

	public Set getAcPromediosParcialeses() {
		return this.acPromediosParcialeses;
	}

	public void setAcPromediosParcialeses(Set acPromediosParcialeses) {
		this.acPromediosParcialeses = acPromediosParcialeses;
	}

}