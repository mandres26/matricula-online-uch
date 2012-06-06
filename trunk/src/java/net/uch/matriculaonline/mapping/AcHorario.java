package net.uch.matriculaonline.mapping;

import java.util.Date;

/**
 * AcHorario entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcHorario implements java.io.Serializable {

	// Fields

	private Integer horId;
	private AcSeccion acSeccion;
	private AcDocente acDocente;
	private AcAula acAula;
	private AcTurnoDetalle acTurnoDetalle;
	private String horDia;
	private String horActivo;
	private String horTipoClase;
	private Date horCreacion;

	// Constructors

	/** default constructor */
	public AcHorario() {
	}

	/** minimal constructor */
	public AcHorario(Integer horId, AcSeccion acSeccion, AcAula acAula) {
		this.horId = horId;
		this.acSeccion = acSeccion;
		this.acAula = acAula;
	}

	/** full constructor */
	public AcHorario(Integer horId, AcSeccion acSeccion, AcDocente acDocente,
			AcAula acAula, AcTurnoDetalle acTurnoDetalle, String horDia,
			String horActivo, String horTipoClase, Date horCreacion) {
		this.horId = horId;
		this.acSeccion = acSeccion;
		this.acDocente = acDocente;
		this.acAula = acAula;
		this.acTurnoDetalle = acTurnoDetalle;
		this.horDia = horDia;
		this.horActivo = horActivo;
		this.horTipoClase = horTipoClase;
		this.horCreacion = horCreacion;
	}

	// Property accessors

	public Integer getHorId() {
		return this.horId;
	}

	public void setHorId(Integer horId) {
		this.horId = horId;
	}

	public AcSeccion getAcSeccion() {
		return this.acSeccion;
	}

	public void setAcSeccion(AcSeccion acSeccion) {
		this.acSeccion = acSeccion;
	}

	public AcDocente getAcDocente() {
		return this.acDocente;
	}

	public void setAcDocente(AcDocente acDocente) {
		this.acDocente = acDocente;
	}

	public AcAula getAcAula() {
		return this.acAula;
	}

	public void setAcAula(AcAula acAula) {
		this.acAula = acAula;
	}

	public AcTurnoDetalle getAcTurnoDetalle() {
		return this.acTurnoDetalle;
	}

	public void setAcTurnoDetalle(AcTurnoDetalle acTurnoDetalle) {
		this.acTurnoDetalle = acTurnoDetalle;
	}

	public String getHorDia() {
		return this.horDia;
	}

	public void setHorDia(String horDia) {
		this.horDia = horDia;
	}

	public String getHorActivo() {
		return this.horActivo;
	}

	public void setHorActivo(String horActivo) {
		this.horActivo = horActivo;
	}

	public String getHorTipoClase() {
		return this.horTipoClase;
	}

	public void setHorTipoClase(String horTipoClase) {
		this.horTipoClase = horTipoClase;
	}

	public Date getHorCreacion() {
		return this.horCreacion;
	}

	public void setHorCreacion(Date horCreacion) {
		this.horCreacion = horCreacion;
	}

}