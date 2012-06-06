package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcMatricula entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcMatricula implements java.io.Serializable {

	// Fields

	private Integer matId;
	private AcAlumno acAlumno;
	private String matCodigo;
	private Date matFecha;
	private String matTipo;
	private String matActivo;
	private Integer usuId;
	private Integer semId;
	private Set acMatriculaCursos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcMatricula() {
	}

	/** minimal constructor */
	public AcMatricula(Integer matId, AcAlumno acAlumno) {
		this.matId = matId;
		this.acAlumno = acAlumno;
	}

	/** full constructor */
	public AcMatricula(Integer matId, AcAlumno acAlumno, String matCodigo,
			Date matFecha, String matTipo, String matActivo, Integer usuId,
			Integer semId, Set acMatriculaCursos) {
		this.matId = matId;
		this.acAlumno = acAlumno;
		this.matCodigo = matCodigo;
		this.matFecha = matFecha;
		this.matTipo = matTipo;
		this.matActivo = matActivo;
		this.usuId = usuId;
		this.semId = semId;
		this.acMatriculaCursos = acMatriculaCursos;
	}

	// Property accessors

	public Integer getMatId() {
		return this.matId;
	}

	public void setMatId(Integer matId) {
		this.matId = matId;
	}

	public AcAlumno getAcAlumno() {
		return this.acAlumno;
	}

	public void setAcAlumno(AcAlumno acAlumno) {
		this.acAlumno = acAlumno;
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

	public Set getAcMatriculaCursos() {
		return this.acMatriculaCursos;
	}

	public void setAcMatriculaCursos(Set acMatriculaCursos) {
		this.acMatriculaCursos = acMatriculaCursos;
	}

}