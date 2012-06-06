package net.uch.matriculaonline.mapping;

/**
 * AcAlumnoDocumento entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcAlumnoDocumento implements java.io.Serializable {

	// Fields

	private Integer aludocId;
	private AcAlumno acAlumno;
	private String aludocDocumento;
	private String aludocActivo;

	// Constructors

	/** default constructor */
	public AcAlumnoDocumento() {
	}

	/** minimal constructor */
	public AcAlumnoDocumento(Integer aludocId) {
		this.aludocId = aludocId;
	}

	/** full constructor */
	public AcAlumnoDocumento(Integer aludocId, AcAlumno acAlumno,
			String aludocDocumento, String aludocActivo) {
		this.aludocId = aludocId;
		this.acAlumno = acAlumno;
		this.aludocDocumento = aludocDocumento;
		this.aludocActivo = aludocActivo;
	}

	// Property accessors

	public Integer getAludocId() {
		return this.aludocId;
	}

	public void setAludocId(Integer aludocId) {
		this.aludocId = aludocId;
	}

	public AcAlumno getAcAlumno() {
		return this.acAlumno;
	}

	public void setAcAlumno(AcAlumno acAlumno) {
		this.acAlumno = acAlumno;
	}

	public String getAludocDocumento() {
		return this.aludocDocumento;
	}

	public void setAludocDocumento(String aludocDocumento) {
		this.aludocDocumento = aludocDocumento;
	}

	public String getAludocActivo() {
		return this.aludocActivo;
	}

	public void setAludocActivo(String aludocActivo) {
		this.aludocActivo = aludocActivo;
	}

}