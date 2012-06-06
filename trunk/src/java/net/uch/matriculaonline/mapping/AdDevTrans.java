package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdDevTrans entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdDevTrans implements java.io.Serializable {

	// Fields

	private Integer dtId;
	private AdComprobantePago adComprobantePago;
	private String dtTipo;
	private Float dtPorcentajeDesc;
	private Float dtMonto;
	private Integer compagIdSaliente;
	private String dtComentario;
	private Date dtCreacion;
	private Set adDevTransDetalles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AdDevTrans() {
	}

	/** minimal constructor */
	public AdDevTrans(Integer dtId,
			AdComprobantePago adComprobantePago, Integer compagIdSaliente) {
		this.dtId = dtId;
		this.adComprobantePago = adComprobantePago;
		this.compagIdSaliente = compagIdSaliente;
	}

	/** full constructor */
	public AdDevTrans(Integer dtId, 
			AdComprobantePago adComprobantePago, String dtTipo,
			Float dtPorcentajeDesc, Float dtMonto, Integer compagIdSaliente,
			String dtComentario, Date dtCreacion, Set adDevTransDetalles) {
		this.dtId = dtId;
		this.adComprobantePago = adComprobantePago;
		this.dtTipo = dtTipo;
		this.dtPorcentajeDesc = dtPorcentajeDesc;
		this.dtMonto = dtMonto;
		this.compagIdSaliente = compagIdSaliente;
		this.dtComentario = dtComentario;
		this.dtCreacion = dtCreacion;
		this.adDevTransDetalles = adDevTransDetalles;
	}

	// Property accessors

	public Integer getDtId() {
		return this.dtId;
	}

	public void setDtId(Integer dtId) {
		this.dtId = dtId;
	}

	public AdComprobantePago getAdComprobantePago() {
		return this.adComprobantePago;
	}

	public void setAdComprobantePago(AdComprobantePago adComprobantePago) {
		this.adComprobantePago = adComprobantePago;
	}

	public String getDtTipo() {
		return this.dtTipo;
	}

	public void setDtTipo(String dtTipo) {
		this.dtTipo = dtTipo;
	}

	public Float getDtPorcentajeDesc() {
		return this.dtPorcentajeDesc;
	}

	public void setDtPorcentajeDesc(Float dtPorcentajeDesc) {
		this.dtPorcentajeDesc = dtPorcentajeDesc;
	}

	public Float getDtMonto() {
		return this.dtMonto;
	}

	public void setDtMonto(Float dtMonto) {
		this.dtMonto = dtMonto;
	}

	public Integer getCompagIdSaliente() {
		return this.compagIdSaliente;
	}

	public void setCompagIdSaliente(Integer compagIdSaliente) {
		this.compagIdSaliente = compagIdSaliente;
	}

	public String getDtComentario() {
		return this.dtComentario;
	}

	public void setDtComentario(String dtComentario) {
		this.dtComentario = dtComentario;
	}

	public Date getDtCreacion() {
		return this.dtCreacion;
	}

	public void setDtCreacion(Date dtCreacion) {
		this.dtCreacion = dtCreacion;
	}

	public Set getAdDevTransDetalles() {
		return this.adDevTransDetalles;
	}

	public void setAdDevTransDetalles(Set adDevTransDetalles) {
		this.adDevTransDetalles = adDevTransDetalles;
	}

}