package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AcMatriculaCurso entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcMatriculaCurso implements java.io.Serializable {

	// Fields

	private Integer matcurId;
	private AcMatricula acMatricula;
	private AcSeccion acSeccion;
	private String matcurActivo;
	private String matcurObs;
	private String matcurEstado;
	private Set acPromediosFinaleses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcMatriculaCurso() {
	}

	/** minimal constructor */
	public AcMatriculaCurso(Integer matcurId, AcMatricula acMatricula,
			AcSeccion acSeccion) {
		this.matcurId = matcurId;
		this.acMatricula = acMatricula;
		this.acSeccion = acSeccion;
	}

	/** full constructor */
	public AcMatriculaCurso(Integer matcurId, AcMatricula acMatricula,
			AcSeccion acSeccion, String matcurActivo, String matcurObs,
			String matcurEstado, Set acPromediosFinaleses) {
		this.matcurId = matcurId;
		this.acMatricula = acMatricula;
		this.acSeccion = acSeccion;
		this.matcurActivo = matcurActivo;
		this.matcurObs = matcurObs;
		this.matcurEstado = matcurEstado;
		this.acPromediosFinaleses = acPromediosFinaleses;
	}

	// Property accessors

	public Integer getMatcurId() {
		return this.matcurId;
	}

	public void setMatcurId(Integer matcurId) {
		this.matcurId = matcurId;
	}

	public AcMatricula getAcMatricula() {
		return this.acMatricula;
	}

	public void setAcMatricula(AcMatricula acMatricula) {
		this.acMatricula = acMatricula;
	}

	public AcSeccion getAcSeccion() {
		return this.acSeccion;
	}

	public void setAcSeccion(AcSeccion acSeccion) {
		this.acSeccion = acSeccion;
	}

	public String getMatcurActivo() {
		return this.matcurActivo;
	}

	public void setMatcurActivo(String matcurActivo) {
		this.matcurActivo = matcurActivo;
	}

	public String getMatcurObs() {
		return this.matcurObs;
	}

	public void setMatcurObs(String matcurObs) {
		this.matcurObs = matcurObs;
	}

	public String getMatcurEstado() {
		return this.matcurEstado;
	}

	public void setMatcurEstado(String matcurEstado) {
		this.matcurEstado = matcurEstado;
	}

	public Set getAcPromediosFinaleses() {
		return this.acPromediosFinaleses;
	}

	public void setAcPromediosFinaleses(Set acPromediosFinaleses) {
		this.acPromediosFinaleses = acPromediosFinaleses;
	}

}