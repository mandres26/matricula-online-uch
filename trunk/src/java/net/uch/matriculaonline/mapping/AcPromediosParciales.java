package net.uch.matriculaonline.mapping;

import java.util.Date;

/**
 * AcPromediosParciales entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcPromediosParciales implements java.io.Serializable {

	// Fields

	private Integer promparId;
	private AcPromediosFinales acPromediosFinales;
	private String promparVigente;
	private Date promparCreacion;
	private String promparDescripcion;
	private String promparActivo;
	private Float promparPromedio;
	private Date promparModificacion;
	private Integer sisevaDet;

	// Constructors

	/** default constructor */
	public AcPromediosParciales() {
	}

	/** minimal constructor */
	public AcPromediosParciales(Integer promparId) {
		this.promparId = promparId;
	}

	/** full constructor */
	public AcPromediosParciales(Integer promparId,
			AcPromediosFinales acPromediosFinales, String promparVigente,
			Date promparCreacion, String promparDescripcion,
			String promparActivo, Float promparPromedio,
			Date promparModificacion, Integer sisevaDet) {
		this.promparId = promparId;
		this.acPromediosFinales = acPromediosFinales;
		this.promparVigente = promparVigente;
		this.promparCreacion = promparCreacion;
		this.promparDescripcion = promparDescripcion;
		this.promparActivo = promparActivo;
		this.promparPromedio = promparPromedio;
		this.promparModificacion = promparModificacion;
		this.sisevaDet = sisevaDet;
	}

	// Property accessors

	public Integer getPromparId() {
		return this.promparId;
	}

	public void setPromparId(Integer promparId) {
		this.promparId = promparId;
	}

	public AcPromediosFinales getAcPromediosFinales() {
		return this.acPromediosFinales;
	}

	public void setAcPromediosFinales(AcPromediosFinales acPromediosFinales) {
		this.acPromediosFinales = acPromediosFinales;
	}

	public String getPromparVigente() {
		return this.promparVigente;
	}

	public void setPromparVigente(String promparVigente) {
		this.promparVigente = promparVigente;
	}

	public Date getPromparCreacion() {
		return this.promparCreacion;
	}

	public void setPromparCreacion(Date promparCreacion) {
		this.promparCreacion = promparCreacion;
	}

	public String getPromparDescripcion() {
		return this.promparDescripcion;
	}

	public void setPromparDescripcion(String promparDescripcion) {
		this.promparDescripcion = promparDescripcion;
	}

	public String getPromparActivo() {
		return this.promparActivo;
	}

	public void setPromparActivo(String promparActivo) {
		this.promparActivo = promparActivo;
	}

	public Float getPromparPromedio() {
		return this.promparPromedio;
	}

	public void setPromparPromedio(Float promparPromedio) {
		this.promparPromedio = promparPromedio;
	}

	public Date getPromparModificacion() {
		return this.promparModificacion;
	}

	public void setPromparModificacion(Date promparModificacion) {
		this.promparModificacion = promparModificacion;
	}

	public Integer getSisevaDet() {
		return this.sisevaDet;
	}

	public void setSisevaDet(Integer sisevaDet) {
		this.sisevaDet = sisevaDet;
	}

}