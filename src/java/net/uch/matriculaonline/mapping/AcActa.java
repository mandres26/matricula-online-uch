package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcActa entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcActa implements java.io.Serializable {

	// Fields

	private Integer actId;
	private AcSeccion acSeccion;
	private String actCodigo;
	private String actNombre;
	private String actNumero;
	private Date actCreacion;
	private String actActivo;
	private String actTipo;
	private Set acActaDetalles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcActa() {
	}

	/** minimal constructor */
	public AcActa(Integer actId) {
		this.actId = actId;
	}

	/** full constructor */
	public AcActa(Integer actId, AcSeccion acSeccion, String actCodigo,
			String actNombre, String actNumero, Date actCreacion,
			String actActivo, String actTipo, Set acActaDetalles) {
		this.actId = actId;
		this.acSeccion = acSeccion;
		this.actCodigo = actCodigo;
		this.actNombre = actNombre;
		this.actNumero = actNumero;
		this.actCreacion = actCreacion;
		this.actActivo = actActivo;
		this.actTipo = actTipo;
		this.acActaDetalles = acActaDetalles;
	}

	// Property accessors

	public Integer getActId() {
		return this.actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public AcSeccion getAcSeccion() {
		return this.acSeccion;
	}

	public void setAcSeccion(AcSeccion acSeccion) {
		this.acSeccion = acSeccion;
	}

	public String getActCodigo() {
		return this.actCodigo;
	}

	public void setActCodigo(String actCodigo) {
		this.actCodigo = actCodigo;
	}

	public String getActNombre() {
		return this.actNombre;
	}

	public void setActNombre(String actNombre) {
		this.actNombre = actNombre;
	}

	public String getActNumero() {
		return this.actNumero;
	}

	public void setActNumero(String actNumero) {
		this.actNumero = actNumero;
	}

	public Date getActCreacion() {
		return this.actCreacion;
	}

	public void setActCreacion(Date actCreacion) {
		this.actCreacion = actCreacion;
	}

	public String getActActivo() {
		return this.actActivo;
	}

	public void setActActivo(String actActivo) {
		this.actActivo = actActivo;
	}

	public String getActTipo() {
		return this.actTipo;
	}

	public void setActTipo(String actTipo) {
		this.actTipo = actTipo;
	}

	public Set getAcActaDetalles() {
		return this.acActaDetalles;
	}

	public void setAcActaDetalles(Set acActaDetalles) {
		this.acActaDetalles = acActaDetalles;
	}

}