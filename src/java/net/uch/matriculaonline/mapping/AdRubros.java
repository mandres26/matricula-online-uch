package net.uch.matriculaonline.mapping;

/**
 * AdRubros entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdRubros implements java.io.Serializable {

	// Fields

	private Integer rubId;
	private String rubConcepto;
	private String rubDescripcion;

	// Constructors

	/** default constructor */
	public AdRubros() {
	}

	/** minimal constructor */
	public AdRubros(Integer rubId) {
		this.rubId = rubId;
	}

	/** full constructor */
	public AdRubros(Integer rubId, String rubConcepto, String rubDescripcion) {
		this.rubId = rubId;
		this.rubConcepto = rubConcepto;
		this.rubDescripcion = rubDescripcion;
	}

	// Property accessors

	public Integer getRubId() {
		return this.rubId;
	}

	public void setRubId(Integer rubId) {
		this.rubId = rubId;
	}

	public String getRubConcepto() {
		return this.rubConcepto;
	}

	public void setRubConcepto(String rubConcepto) {
		this.rubConcepto = rubConcepto;
	}

	public String getRubDescripcion() {
		return this.rubDescripcion;
	}

	public void setRubDescripcion(String rubDescripcion) {
		this.rubDescripcion = rubDescripcion;
	}

}