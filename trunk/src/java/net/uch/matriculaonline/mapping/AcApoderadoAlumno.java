package net.uch.matriculaonline.mapping;

/**
 * AcApoderadoAlumno entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcApoderadoAlumno implements java.io.Serializable {

	// Fields

	private Integer apoaluId;
	private AcAlumno acAlumno;
	private AcApoderado acApoderado;
	private String apoaluActivo;

	// Constructors

	/** default constructor */
	public AcApoderadoAlumno() {
	}

	/** minimal constructor */
	public AcApoderadoAlumno(Integer apoaluId) {
		this.apoaluId = apoaluId;
	}

	/** full constructor */
	public AcApoderadoAlumno(Integer apoaluId, AcAlumno acAlumno,
			AcApoderado acApoderado, String apoaluActivo) {
		this.apoaluId = apoaluId;
		this.acAlumno = acAlumno;
		this.acApoderado = acApoderado;
		this.apoaluActivo = apoaluActivo;
	}

	// Property accessors

	public Integer getApoaluId() {
		return this.apoaluId;
	}

	public void setApoaluId(Integer apoaluId) {
		this.apoaluId = apoaluId;
	}

	public AcAlumno getAcAlumno() {
		return this.acAlumno;
	}

	public void setAcAlumno(AcAlumno acAlumno) {
		this.acAlumno = acAlumno;
	}

	public AcApoderado getAcApoderado() {
		return this.acApoderado;
	}

	public void setAcApoderado(AcApoderado acApoderado) {
		this.acApoderado = acApoderado;
	}

	public String getApoaluActivo() {
		return this.apoaluActivo;
	}

	public void setApoaluActivo(String apoaluActivo) {
		this.apoaluActivo = apoaluActivo;
	}

}