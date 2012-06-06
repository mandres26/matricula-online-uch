package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcTurno entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcTurno implements java.io.Serializable {

	// Fields

	private Integer turId;
	private String turCodigo;
	private String turNombre;
	private Integer turPeriodo;
	private Date turHoraInicio;
	private String turVigente;
	private Integer semId;
	private Integer turTiempoPeriodo;
	private String turActivo;
	private Set acTurnoDetalles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcTurno() {
	}

	/** minimal constructor */
	public AcTurno(Integer turId, Integer semId) {
		this.turId = turId;
		this.semId = semId;
	}

	/** full constructor */
	public AcTurno(Integer turId, String turCodigo, String turNombre,
			Integer turPeriodo, Date turHoraInicio, String turVigente,
			Integer semId, Integer turTiempoPeriodo, String turActivo,
			Set acTurnoDetalles) {
		this.turId = turId;
		this.turCodigo = turCodigo;
		this.turNombre = turNombre;
		this.turPeriodo = turPeriodo;
		this.turHoraInicio = turHoraInicio;
		this.turVigente = turVigente;
		this.semId = semId;
		this.turTiempoPeriodo = turTiempoPeriodo;
		this.turActivo = turActivo;
		this.acTurnoDetalles = acTurnoDetalles;
	}

	// Property accessors

	public Integer getTurId() {
		return this.turId;
	}

	public void setTurId(Integer turId) {
		this.turId = turId;
	}

	public String getTurCodigo() {
		return this.turCodigo;
	}

	public void setTurCodigo(String turCodigo) {
		this.turCodigo = turCodigo;
	}

	public String getTurNombre() {
		return this.turNombre;
	}

	public void setTurNombre(String turNombre) {
		this.turNombre = turNombre;
	}

	public Integer getTurPeriodo() {
		return this.turPeriodo;
	}

	public void setTurPeriodo(Integer turPeriodo) {
		this.turPeriodo = turPeriodo;
	}

	public Date getTurHoraInicio() {
		return this.turHoraInicio;
	}

	public void setTurHoraInicio(Date turHoraInicio) {
		this.turHoraInicio = turHoraInicio;
	}

	public String getTurVigente() {
		return this.turVigente;
	}

	public void setTurVigente(String turVigente) {
		this.turVigente = turVigente;
	}

	public Integer getSemId() {
		return this.semId;
	}

	public void setSemId(Integer semId) {
		this.semId = semId;
	}

	public Integer getTurTiempoPeriodo() {
		return this.turTiempoPeriodo;
	}

	public void setTurTiempoPeriodo(Integer turTiempoPeriodo) {
		this.turTiempoPeriodo = turTiempoPeriodo;
	}

	public String getTurActivo() {
		return this.turActivo;
	}

	public void setTurActivo(String turActivo) {
		this.turActivo = turActivo;
	}

	public Set getAcTurnoDetalles() {
		return this.acTurnoDetalles;
	}

	public void setAcTurnoDetalles(Set acTurnoDetalles) {
		this.acTurnoDetalles = acTurnoDetalles;
	}

}