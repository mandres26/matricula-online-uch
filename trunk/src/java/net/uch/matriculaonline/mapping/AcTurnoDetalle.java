package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcTurnoDetalle entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcTurnoDetalle implements java.io.Serializable {

	// Fields

	private Integer turdetId;
	private AcTurno acTurno;
	private Date turdetHora;
	private String turdetActivo;
	private Set acHorarioAreas = new HashSet(0);
	private Set acHorarios = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcTurnoDetalle() {
	}

	/** minimal constructor */
	public AcTurnoDetalle(Integer turdetId, AcTurno acTurno) {
		this.turdetId = turdetId;
		this.acTurno = acTurno;
	}

	/** full constructor */
	public AcTurnoDetalle(Integer turdetId, AcTurno acTurno, Date turdetHora,
			String turdetActivo, Set acHorarioAreas, Set acHorarios) {
		this.turdetId = turdetId;
		this.acTurno = acTurno;
		this.turdetHora = turdetHora;
		this.turdetActivo = turdetActivo;
		this.acHorarioAreas = acHorarioAreas;
		this.acHorarios = acHorarios;
	}

	// Property accessors

	public Integer getTurdetId() {
		return this.turdetId;
	}

	public void setTurdetId(Integer turdetId) {
		this.turdetId = turdetId;
	}

	public AcTurno getAcTurno() {
		return this.acTurno;
	}

	public void setAcTurno(AcTurno acTurno) {
		this.acTurno = acTurno;
	}

	public Date getTurdetHora() {
		return this.turdetHora;
	}

	public void setTurdetHora(Date turdetHora) {
		this.turdetHora = turdetHora;
	}

	public String getTurdetActivo() {
		return this.turdetActivo;
	}

	public void setTurdetActivo(String turdetActivo) {
		this.turdetActivo = turdetActivo;
	}

	public Set getAcHorarioAreas() {
		return this.acHorarioAreas;
	}

	public void setAcHorarioAreas(Set acHorarioAreas) {
		this.acHorarioAreas = acHorarioAreas;
	}

	public Set getAcHorarios() {
		return this.acHorarios;
	}

	public void setAcHorarios(Set acHorarios) {
		this.acHorarios = acHorarios;
	}

}