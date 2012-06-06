package net.uch.matriculaonline.mapping;

import java.util.Date;

/**
 * AcNotasTemporales entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcNotasTemporales implements java.io.Serializable {

	// Fields

	private Integer nottemId;
	private AcSeccion acSeccion;
	private Date nottemFecha;
	private Float nottemNota;
	private Integer sisevaPerId;
	private Integer aluId;
	private String nottemActivo;

	// Constructors

	/** default constructor */
	public AcNotasTemporales() {
	}

	/** minimal constructor */
	public AcNotasTemporales(Integer nottemId) {
		this.nottemId = nottemId;
	}

	/** full constructor */
	public AcNotasTemporales(Integer nottemId, AcSeccion acSeccion,
			Date nottemFecha, Float nottemNota, Integer sisevaPerId,
			Integer aluId, String nottemActivo) {
		this.nottemId = nottemId;
		this.acSeccion = acSeccion;
		this.nottemFecha = nottemFecha;
		this.nottemNota = nottemNota;
		this.sisevaPerId = sisevaPerId;
		this.aluId = aluId;
		this.nottemActivo = nottemActivo;
	}

	// Property accessors

	public Integer getNottemId() {
		return this.nottemId;
	}

	public void setNottemId(Integer nottemId) {
		this.nottemId = nottemId;
	}

	public AcSeccion getAcSeccion() {
		return this.acSeccion;
	}

	public void setAcSeccion(AcSeccion acSeccion) {
		this.acSeccion = acSeccion;
	}

	public Date getNottemFecha() {
		return this.nottemFecha;
	}

	public void setNottemFecha(Date nottemFecha) {
		this.nottemFecha = nottemFecha;
	}

	public Float getNottemNota() {
		return this.nottemNota;
	}

	public void setNottemNota(Float nottemNota) {
		this.nottemNota = nottemNota;
	}

	public Integer getSisevaPerId() {
		return this.sisevaPerId;
	}

	public void setSisevaPerId(Integer sisevaPerId) {
		this.sisevaPerId = sisevaPerId;
	}

	public Integer getAluId() {
		return this.aluId;
	}

	public void setAluId(Integer aluId) {
		this.aluId = aluId;
	}

	public String getNottemActivo() {
		return this.nottemActivo;
	}

	public void setNottemActivo(String nottemActivo) {
		this.nottemActivo = nottemActivo;
	}

}