package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcMatriculaConafu entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcMatriculaConafu implements java.io.Serializable {

	// Fields

	private Integer matId;
	private Integer aluId;
	private String matCodigo;
	private Date matFecha;
	private String matTipo;
	private String matActivo;
	private Integer usuId;
	private Integer semId;
	private Set acMatriculaCursoConafus = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcMatriculaConafu() {
	}

	/** minimal constructor */
	public AcMatriculaConafu(Integer matId, Integer aluId) {
		this.matId = matId;
		this.aluId = aluId;
	}

	/** full constructor */
	public AcMatriculaConafu(Integer matId, Integer aluId, String matCodigo,
			Date matFecha, String matTipo, String matActivo, Integer usuId,
			Integer semId, Set acMatriculaCursoConafus) {
		this.matId = matId;
		this.aluId = aluId;
		this.matCodigo = matCodigo;
		this.matFecha = matFecha;
		this.matTipo = matTipo;
		this.matActivo = matActivo;
		this.usuId = usuId;
		this.semId = semId;
		this.acMatriculaCursoConafus = acMatriculaCursoConafus;
	}

	// Property accessors

	public Integer getMatId() {
		return this.matId;
	}

	public void setMatId(Integer matId) {
		this.matId = matId;
	}

	public Integer getAluId() {
		return this.aluId;
	}

	public void setAluId(Integer aluId) {
		this.aluId = aluId;
	}

	public String getMatCodigo() {
		return this.matCodigo;
	}

	public void setMatCodigo(String matCodigo) {
		this.matCodigo = matCodigo;
	}

	public Date getMatFecha() {
		return this.matFecha;
	}

	public void setMatFecha(Date matFecha) {
		this.matFecha = matFecha;
	}

	public String getMatTipo() {
		return this.matTipo;
	}

	public void setMatTipo(String matTipo) {
		this.matTipo = matTipo;
	}

	public String getMatActivo() {
		return this.matActivo;
	}

	public void setMatActivo(String matActivo) {
		this.matActivo = matActivo;
	}

	public Integer getUsuId() {
		return this.usuId;
	}

	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}

	public Integer getSemId() {
		return this.semId;
	}

	public void setSemId(Integer semId) {
		this.semId = semId;
	}

	public Set getAcMatriculaCursoConafus() {
		return this.acMatriculaCursoConafus;
	}

	public void setAcMatriculaCursoConafus(Set acMatriculaCursoConafus) {
		this.acMatriculaCursoConafus = acMatriculaCursoConafus;
	}

}