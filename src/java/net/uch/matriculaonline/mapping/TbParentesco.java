package net.uch.matriculaonline.mapping;

/**
 * TbParentesco entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TbParentesco implements java.io.Serializable {

	// Fields

	private Integer parentescoId;
	private AcAlumno acAlumno;
	private String desParent;
	private String otroParent;

	// Constructors

	/** default constructor */
	public TbParentesco() {
	}

	/** minimal constructor */
	public TbParentesco(Integer parentescoId) {
		this.parentescoId = parentescoId;
	}

	/** full constructor */
	public TbParentesco(Integer parentescoId, AcAlumno acAlumno,
			String desParent, String otroParent) {
		this.parentescoId = parentescoId;
		this.acAlumno = acAlumno;
		this.desParent = desParent;
		this.otroParent = otroParent;
	}

	// Property accessors

	public Integer getParentescoId() {
		return this.parentescoId;
	}

	public void setParentescoId(Integer parentescoId) {
		this.parentescoId = parentescoId;
	}

	public AcAlumno getAcAlumno() {
		return this.acAlumno;
	}

	public void setAcAlumno(AcAlumno acAlumno) {
		this.acAlumno = acAlumno;
	}

	public String getDesParent() {
		return this.desParent;
	}

	public void setDesParent(String desParent) {
		this.desParent = desParent;
	}

	public String getOtroParent() {
		return this.otroParent;
	}

	public void setOtroParent(String otroParent) {
		this.otroParent = otroParent;
	}

}