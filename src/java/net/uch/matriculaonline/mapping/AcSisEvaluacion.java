package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcSisEvaluacion entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcSisEvaluacion implements java.io.Serializable {

	// Fields

	private Integer sisevaId;
	private String sisevaCodigo;
	private String sisevaNombre;
	private String sisevaVigente;
	private Date sisevaCreacion;
	private String sisevaActivo;
	private String sisevaAluTipo;
	private Set acSisEvaDetalles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcSisEvaluacion() {
	}

	/** minimal constructor */
	public AcSisEvaluacion(Integer sisevaId) {
		this.sisevaId = sisevaId;
	}

	/** full constructor */
	public AcSisEvaluacion(Integer sisevaId, String sisevaCodigo,
			String sisevaNombre, String sisevaVigente, Date sisevaCreacion,
			String sisevaActivo, String sisevaAluTipo, Set acSisEvaDetalles) {
		this.sisevaId = sisevaId;
		this.sisevaCodigo = sisevaCodigo;
		this.sisevaNombre = sisevaNombre;
		this.sisevaVigente = sisevaVigente;
		this.sisevaCreacion = sisevaCreacion;
		this.sisevaActivo = sisevaActivo;
		this.sisevaAluTipo = sisevaAluTipo;
		this.acSisEvaDetalles = acSisEvaDetalles;
	}

	// Property accessors

	public Integer getSisevaId() {
		return this.sisevaId;
	}

	public void setSisevaId(Integer sisevaId) {
		this.sisevaId = sisevaId;
	}

	public String getSisevaCodigo() {
		return this.sisevaCodigo;
	}

	public void setSisevaCodigo(String sisevaCodigo) {
		this.sisevaCodigo = sisevaCodigo;
	}

	public String getSisevaNombre() {
		return this.sisevaNombre;
	}

	public void setSisevaNombre(String sisevaNombre) {
		this.sisevaNombre = sisevaNombre;
	}

	public String getSisevaVigente() {
		return this.sisevaVigente;
	}

	public void setSisevaVigente(String sisevaVigente) {
		this.sisevaVigente = sisevaVigente;
	}

	public Date getSisevaCreacion() {
		return this.sisevaCreacion;
	}

	public void setSisevaCreacion(Date sisevaCreacion) {
		this.sisevaCreacion = sisevaCreacion;
	}

	public String getSisevaActivo() {
		return this.sisevaActivo;
	}

	public void setSisevaActivo(String sisevaActivo) {
		this.sisevaActivo = sisevaActivo;
	}

	public String getSisevaAluTipo() {
		return this.sisevaAluTipo;
	}

	public void setSisevaAluTipo(String sisevaAluTipo) {
		this.sisevaAluTipo = sisevaAluTipo;
	}

	public Set getAcSisEvaDetalles() {
		return this.acSisEvaDetalles;
	}

	public void setAcSisEvaDetalles(Set acSisEvaDetalles) {
		this.acSisEvaDetalles = acSisEvaDetalles;
	}

}