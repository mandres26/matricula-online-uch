package net.uch.matriculaonline.mapping;

/**
 * AcAreaDocente entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcAreaDocente implements java.io.Serializable {

	// Fields

	private Integer aredocId;
	private AcDocente acDocente;
	private AcArea acArea;
	private String aredocActivo;

	// Constructors

	/** default constructor */
	public AcAreaDocente() {
	}

	/** minimal constructor */
	public AcAreaDocente(Integer aredocId, AcDocente acDocente, AcArea acArea) {
		this.aredocId = aredocId;
		this.acDocente = acDocente;
		this.acArea = acArea;
	}

	/** full constructor */
	public AcAreaDocente(Integer aredocId, AcDocente acDocente, AcArea acArea,
			String aredocActivo) {
		this.aredocId = aredocId;
		this.acDocente = acDocente;
		this.acArea = acArea;
		this.aredocActivo = aredocActivo;
	}

	// Property accessors

	public Integer getAredocId() {
		return this.aredocId;
	}

	public void setAredocId(Integer aredocId) {
		this.aredocId = aredocId;
	}

	public AcDocente getAcDocente() {
		return this.acDocente;
	}

	public void setAcDocente(AcDocente acDocente) {
		this.acDocente = acDocente;
	}

	public AcArea getAcArea() {
		return this.acArea;
	}

	public void setAcArea(AcArea acArea) {
		this.acArea = acArea;
	}

	public String getAredocActivo() {
		return this.aredocActivo;
	}

	public void setAredocActivo(String aredocActivo) {
		this.aredocActivo = aredocActivo;
	}

}