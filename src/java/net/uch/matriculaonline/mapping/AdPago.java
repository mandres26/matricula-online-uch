package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdPago entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdPago implements java.io.Serializable {

	// Fields

	private Integer pagId;
	private AdComprobantePago adComprobantePago;
	private AdConceptoPago adConceptoPago;
	private Float pagMonto;
	private Date pagFecha;
	private Integer alutarId;
	private String pagActivo;
	private Integer usuId;
	private Integer pagCan;
	private String pagEstadoCancelacion;
	private Date pagFechaCancelacion;
	private Integer descuId;
	private Double pagDscto;
	private Set adDevTransDetalles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AdPago() {
	}

	/** minimal constructor */
	public AdPago(Integer pagId) {
		this.pagId = pagId;
	}

	/** full constructor */
	public AdPago(Integer pagId, AdComprobantePago adComprobantePago,
			AdConceptoPago adConceptoPago, Float pagMonto, Date pagFecha,
			Integer alutarId, String pagActivo, Integer usuId, Integer pagCan,
			String pagEstadoCancelacion, Date pagFechaCancelacion,
			Integer descuId, Double pagDscto, Set adDevTransDetalles) {
		this.pagId = pagId;
		this.adComprobantePago = adComprobantePago;
		this.adConceptoPago = adConceptoPago;
		this.pagMonto = pagMonto;
		this.pagFecha = pagFecha;
		this.alutarId = alutarId;
		this.pagActivo = pagActivo;
		this.usuId = usuId;
		this.pagCan = pagCan;
		this.pagEstadoCancelacion = pagEstadoCancelacion;
		this.pagFechaCancelacion = pagFechaCancelacion;
		this.descuId = descuId;
		this.pagDscto = pagDscto;
		this.adDevTransDetalles = adDevTransDetalles;
	}

	// Property accessors

	public Integer getPagId() {
		return this.pagId;
	}

	public void setPagId(Integer pagId) {
		this.pagId = pagId;
	}

	public AdComprobantePago getAdComprobantePago() {
		return this.adComprobantePago;
	}

	public void setAdComprobantePago(AdComprobantePago adComprobantePago) {
		this.adComprobantePago = adComprobantePago;
	}

	public AdConceptoPago getAdConceptoPago() {
		return this.adConceptoPago;
	}

	public void setAdConceptoPago(AdConceptoPago adConceptoPago) {
		this.adConceptoPago = adConceptoPago;
	}

	public Float getPagMonto() {
		return this.pagMonto;
	}

	public void setPagMonto(Float pagMonto) {
		this.pagMonto = pagMonto;
	}

	public Date getPagFecha() {
		return this.pagFecha;
	}

	public void setPagFecha(Date pagFecha) {
		this.pagFecha = pagFecha;
	}

	public Integer getAlutarId() {
		return this.alutarId;
	}

	public void setAlutarId(Integer alutarId) {
		this.alutarId = alutarId;
	}

	public String getPagActivo() {
		return this.pagActivo;
	}

	public void setPagActivo(String pagActivo) {
		this.pagActivo = pagActivo;
	}

	public Integer getUsuId() {
		return this.usuId;
	}

	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}

	public Integer getPagCan() {
		return this.pagCan;
	}

	public void setPagCan(Integer pagCan) {
		this.pagCan = pagCan;
	}

	public String getPagEstadoCancelacion() {
		return this.pagEstadoCancelacion;
	}

	public void setPagEstadoCancelacion(String pagEstadoCancelacion) {
		this.pagEstadoCancelacion = pagEstadoCancelacion;
	}

	public Date getPagFechaCancelacion() {
		return this.pagFechaCancelacion;
	}

	public void setPagFechaCancelacion(Date pagFechaCancelacion) {
		this.pagFechaCancelacion = pagFechaCancelacion;
	}

	public Integer getDescuId() {
		return this.descuId;
	}

	public void setDescuId(Integer descuId) {
		this.descuId = descuId;
	}

	public Double getPagDscto() {
		return this.pagDscto;
	}

	public void setPagDscto(Double pagDscto) {
		this.pagDscto = pagDscto;
	}

	public Set getAdDevTransDetalles() {
		return this.adDevTransDetalles;
	}

	public void setAdDevTransDetalles(Set adDevTransDetalles) {
		this.adDevTransDetalles = adDevTransDetalles;
	}

}