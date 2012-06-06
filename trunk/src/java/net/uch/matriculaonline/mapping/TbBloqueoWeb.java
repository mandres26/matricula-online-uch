package net.uch.matriculaonline.mapping;

/**
 * TbBloqueoWeb entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TbBloqueoWeb implements java.io.Serializable {

	// Fields

	private Integer blowebId;
	private AcSeccion acSeccion;
	private String blowebEstado;
	private String blowebActivo;

	// Constructors

	/** default constructor */
	public TbBloqueoWeb() {
	}

	/** minimal constructor */
	public TbBloqueoWeb(Integer blowebId) {
		this.blowebId = blowebId;
	}

	/** full constructor */
	public TbBloqueoWeb(Integer blowebId, AcSeccion acSeccion,
			String blowebEstado, String blowebActivo) {
		this.blowebId = blowebId;
		this.acSeccion = acSeccion;
		this.blowebEstado = blowebEstado;
		this.blowebActivo = blowebActivo;
	}

	// Property accessors

	public Integer getBlowebId() {
		return this.blowebId;
	}

	public void setBlowebId(Integer blowebId) {
		this.blowebId = blowebId;
	}

	public AcSeccion getAcSeccion() {
		return this.acSeccion;
	}

	public void setAcSeccion(AcSeccion acSeccion) {
		this.acSeccion = acSeccion;
	}

	public String getBlowebEstado() {
		return this.blowebEstado;
	}

	public void setBlowebEstado(String blowebEstado) {
		this.blowebEstado = blowebEstado;
	}

	public String getBlowebActivo() {
		return this.blowebActivo;
	}

	public void setBlowebActivo(String blowebActivo) {
		this.blowebActivo = blowebActivo;
	}

}