package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdConceptoPago entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdConceptoPago implements java.io.Serializable {

	// Fields

	private Integer conpagId;
	private String conpagCodigo;
	private String conpagDescripcion;
	private Float conpagMonto;
	private String conpagTipo;
	private Date conpagCreacion;
	private Date conpagActualizacion;
	private String conpagActivo;
	private String conpagRubro;
	private Integer compag;
	private Set adPagos = new HashSet(0);
	private Set adAlumnoTarifas = new HashSet(0);

	// Constructors

	/** default constructor */
	public AdConceptoPago() {
	}

	/** minimal constructor */
	public AdConceptoPago(Integer conpagId) {
		this.conpagId = conpagId;
	}

	/** full constructor */
	public AdConceptoPago(Integer conpagId, String conpagCodigo,
			String conpagDescripcion, Float conpagMonto, String conpagTipo,
			Date conpagCreacion, Date conpagActualizacion, String conpagActivo,
			String conpagRubro, Integer compag, Set adPagos,
			Set adAlumnoTarifas) {
		this.conpagId = conpagId;
		this.conpagCodigo = conpagCodigo;
		this.conpagDescripcion = conpagDescripcion;
		this.conpagMonto = conpagMonto;
		this.conpagTipo = conpagTipo;
		this.conpagCreacion = conpagCreacion;
		this.conpagActualizacion = conpagActualizacion;
		this.conpagActivo = conpagActivo;
		this.conpagRubro = conpagRubro;
		this.compag = compag;
		this.adPagos = adPagos;
		this.adAlumnoTarifas = adAlumnoTarifas;
	}

	// Property accessors

	public Integer getConpagId() {
		return this.conpagId;
	}

	public void setConpagId(Integer conpagId) {
		this.conpagId = conpagId;
	}

	public String getConpagCodigo() {
		return this.conpagCodigo;
	}

	public void setConpagCodigo(String conpagCodigo) {
		this.conpagCodigo = conpagCodigo;
	}

	public String getConpagDescripcion() {
		return this.conpagDescripcion;
	}

	public void setConpagDescripcion(String conpagDescripcion) {
		this.conpagDescripcion = conpagDescripcion;
	}

	public Float getConpagMonto() {
		return this.conpagMonto;
	}

	public void setConpagMonto(Float conpagMonto) {
		this.conpagMonto = conpagMonto;
	}

	public String getConpagTipo() {
		return this.conpagTipo;
	}

	public void setConpagTipo(String conpagTipo) {
		this.conpagTipo = conpagTipo;
	}

	public Date getConpagCreacion() {
		return this.conpagCreacion;
	}

	public void setConpagCreacion(Date conpagCreacion) {
		this.conpagCreacion = conpagCreacion;
	}

	public Date getConpagActualizacion() {
		return this.conpagActualizacion;
	}

	public void setConpagActualizacion(Date conpagActualizacion) {
		this.conpagActualizacion = conpagActualizacion;
	}

	public String getConpagActivo() {
		return this.conpagActivo;
	}

	public void setConpagActivo(String conpagActivo) {
		this.conpagActivo = conpagActivo;
	}

	public String getConpagRubro() {
		return this.conpagRubro;
	}

	public void setConpagRubro(String conpagRubro) {
		this.conpagRubro = conpagRubro;
	}

	public Integer getCompag() {
		return this.compag;
	}

	public void setCompag(Integer compag) {
		this.compag = compag;
	}

	public Set getAdPagos() {
		return this.adPagos;
	}

	public void setAdPagos(Set adPagos) {
		this.adPagos = adPagos;
	}

	public Set getAdAlumnoTarifas() {
		return this.adAlumnoTarifas;
	}

	public void setAdAlumnoTarifas(Set adAlumnoTarifas) {
		this.adAlumnoTarifas = adAlumnoTarifas;
	}

}