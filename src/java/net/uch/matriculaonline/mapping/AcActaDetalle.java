package net.uch.matriculaonline.mapping;

/**
 * AcActaDetalle entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcActaDetalle implements java.io.Serializable {

	// Fields

	private Integer actdetId;
	private AcActa acActa;
	private String actdetTipoNota;
	private Integer sisevaDetalleId;
	private Float actdetNota;
	private Integer aluId;
	private String actdetActivo;

	// Constructors

	/** default constructor */
	public AcActaDetalle() {
	}

	/** minimal constructor */
	public AcActaDetalle(Integer actdetId, AcActa acActa) {
		this.actdetId = actdetId;
		this.acActa = acActa;
	}

	/** full constructor */
	public AcActaDetalle(Integer actdetId, AcActa acActa,
			String actdetTipoNota, Integer sisevaDetalleId, Float actdetNota,
			Integer aluId, String actdetActivo) {
		this.actdetId = actdetId;
		this.acActa = acActa;
		this.actdetTipoNota = actdetTipoNota;
		this.sisevaDetalleId = sisevaDetalleId;
		this.actdetNota = actdetNota;
		this.aluId = aluId;
		this.actdetActivo = actdetActivo;
	}

	// Property accessors

	public Integer getActdetId() {
		return this.actdetId;
	}

	public void setActdetId(Integer actdetId) {
		this.actdetId = actdetId;
	}

	public AcActa getAcActa() {
		return this.acActa;
	}

	public void setAcActa(AcActa acActa) {
		this.acActa = acActa;
	}

	public String getActdetTipoNota() {
		return this.actdetTipoNota;
	}

	public void setActdetTipoNota(String actdetTipoNota) {
		this.actdetTipoNota = actdetTipoNota;
	}

	public Integer getSisevaDetalleId() {
		return this.sisevaDetalleId;
	}

	public void setSisevaDetalleId(Integer sisevaDetalleId) {
		this.sisevaDetalleId = sisevaDetalleId;
	}

	public Float getActdetNota() {
		return this.actdetNota;
	}

	public void setActdetNota(Float actdetNota) {
		this.actdetNota = actdetNota;
	}

	public Integer getAluId() {
		return this.aluId;
	}

	public void setAluId(Integer aluId) {
		this.aluId = aluId;
	}

	public String getActdetActivo() {
		return this.actdetActivo;
	}

	public void setActdetActivo(String actdetActivo) {
		this.actdetActivo = actdetActivo;
	}

}