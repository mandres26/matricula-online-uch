package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AdEstructuraPagos entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdEstructuraPagos implements java.io.Serializable {

	// Fields

	private Integer estpagId;
	private AcEspecialidad acEspecialidad;
	private AcSemestre acSemestre;
	private String estpagoNombre;
	private String estpagoPublicado;
	private String estpagActivo;
	private Integer semIdIngreso;
	private Set adEstructuraPagosAfectas = new HashSet(0);
	private Set adEstructuraPagosDetalles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AdEstructuraPagos() {
	}

	/** minimal constructor */
	public AdEstructuraPagos(Integer estpagId, AcSemestre acSemestre) {
		this.estpagId = estpagId;
		this.acSemestre = acSemestre;
	}

	/** full constructor */
	public AdEstructuraPagos(Integer estpagId, AcEspecialidad acEspecialidad,
			AcSemestre acSemestre, String estpagoNombre,
			String estpagoPublicado, String estpagActivo, Integer semIdIngreso,
			Set adEstructuraPagosAfectas, Set adEstructuraPagosDetalles) {
		this.estpagId = estpagId;
		this.acEspecialidad = acEspecialidad;
		this.acSemestre = acSemestre;
		this.estpagoNombre = estpagoNombre;
		this.estpagoPublicado = estpagoPublicado;
		this.estpagActivo = estpagActivo;
		this.semIdIngreso = semIdIngreso;
		this.adEstructuraPagosAfectas = adEstructuraPagosAfectas;
		this.adEstructuraPagosDetalles = adEstructuraPagosDetalles;
	}

	// Property accessors

	public Integer getEstpagId() {
		return this.estpagId;
	}

	public void setEstpagId(Integer estpagId) {
		this.estpagId = estpagId;
	}

	public AcEspecialidad getAcEspecialidad() {
		return this.acEspecialidad;
	}

	public void setAcEspecialidad(AcEspecialidad acEspecialidad) {
		this.acEspecialidad = acEspecialidad;
	}

	public AcSemestre getAcSemestre() {
		return this.acSemestre;
	}

	public void setAcSemestre(AcSemestre acSemestre) {
		this.acSemestre = acSemestre;
	}

	public String getEstpagoNombre() {
		return this.estpagoNombre;
	}

	public void setEstpagoNombre(String estpagoNombre) {
		this.estpagoNombre = estpagoNombre;
	}

	public String getEstpagoPublicado() {
		return this.estpagoPublicado;
	}

	public void setEstpagoPublicado(String estpagoPublicado) {
		this.estpagoPublicado = estpagoPublicado;
	}

	public String getEstpagActivo() {
		return this.estpagActivo;
	}

	public void setEstpagActivo(String estpagActivo) {
		this.estpagActivo = estpagActivo;
	}

	public Integer getSemIdIngreso() {
		return this.semIdIngreso;
	}

	public void setSemIdIngreso(Integer semIdIngreso) {
		this.semIdIngreso = semIdIngreso;
	}

	public Set getAdEstructuraPagosAfectas() {
		return this.adEstructuraPagosAfectas;
	}

	public void setAdEstructuraPagosAfectas(Set adEstructuraPagosAfectas) {
		this.adEstructuraPagosAfectas = adEstructuraPagosAfectas;
	}

	public Set getAdEstructuraPagosDetalles() {
		return this.adEstructuraPagosDetalles;
	}

	public void setAdEstructuraPagosDetalles(Set adEstructuraPagosDetalles) {
		this.adEstructuraPagosDetalles = adEstructuraPagosDetalles;
	}

}