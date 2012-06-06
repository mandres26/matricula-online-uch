package net.uch.matriculaonline.mapping;

/**
 * AcImportacionNotas entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcImportacionNotas implements java.io.Serializable {

	// Fields

	private Integer impnotId;
	private AcSisEvaPersonalizado acSisEvaPersonalizado;
	private AcSeccion acSeccion;
	private String impnotActivo;
	private String impnotEstado;

	// Constructors

	/** default constructor */
	public AcImportacionNotas() {
	}

	/** minimal constructor */
	public AcImportacionNotas(Integer impnotId) {
		this.impnotId = impnotId;
	}

	/** full constructor */
	public AcImportacionNotas(Integer impnotId,
			AcSisEvaPersonalizado acSisEvaPersonalizado, AcSeccion acSeccion,
			String impnotActivo, String impnotEstado) {
		this.impnotId = impnotId;
		this.acSisEvaPersonalizado = acSisEvaPersonalizado;
		this.acSeccion = acSeccion;
		this.impnotActivo = impnotActivo;
		this.impnotEstado = impnotEstado;
	}

	// Property accessors

	public Integer getImpnotId() {
		return this.impnotId;
	}

	public void setImpnotId(Integer impnotId) {
		this.impnotId = impnotId;
	}

	public AcSisEvaPersonalizado getAcSisEvaPersonalizado() {
		return this.acSisEvaPersonalizado;
	}

	public void setAcSisEvaPersonalizado(
			AcSisEvaPersonalizado acSisEvaPersonalizado) {
		this.acSisEvaPersonalizado = acSisEvaPersonalizado;
	}

	public AcSeccion getAcSeccion() {
		return this.acSeccion;
	}

	public void setAcSeccion(AcSeccion acSeccion) {
		this.acSeccion = acSeccion;
	}

	public String getImpnotActivo() {
		return this.impnotActivo;
	}

	public void setImpnotActivo(String impnotActivo) {
		this.impnotActivo = impnotActivo;
	}

	public String getImpnotEstado() {
		return this.impnotEstado;
	}

	public void setImpnotEstado(String impnotEstado) {
		this.impnotEstado = impnotEstado;
	}

}