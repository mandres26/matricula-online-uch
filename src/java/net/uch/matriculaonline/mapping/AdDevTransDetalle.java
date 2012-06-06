package net.uch.matriculaonline.mapping;

/**
 * AdDevTransDetalle entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdDevTransDetalle implements java.io.Serializable {

	// Fields

	private Integer dtdId;
	private AdDevTrans adDevTrans;
	private AdPago adPago;

	// Constructors

	/** default constructor */
	public AdDevTransDetalle() {
	}

	/** full constructor */
	public AdDevTransDetalle(Integer dtdId, AdDevTrans adDevTrans, AdPago adPago) {
		this.dtdId = dtdId;
		this.adDevTrans = adDevTrans;
		this.adPago = adPago;
	}

	// Property accessors

	public Integer getDtdId() {
		return this.dtdId;
	}

	public void setDtdId(Integer dtdId) {
		this.dtdId = dtdId;
	}

	public AdDevTrans getAdDevTrans() {
		return this.adDevTrans;
	}

	public void setAdDevTrans(AdDevTrans adDevTrans) {
		this.adDevTrans = adDevTrans;
	}

	public AdPago getAdPago() {
		return this.adPago;
	}

	public void setAdPago(AdPago adPago) {
		this.adPago = adPago;
	}

}