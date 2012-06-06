package net.uch.matriculaonline.mapping;

import java.util.Date;

/**
 * AdSaldo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdSaldo implements java.io.Serializable {

	// Fields

	private Integer salId;
	private AcAlumno acAlumno;
	private Float salMonto;
	private Date salFechaIngresoMonto;
	private Date salCreacion;

	// Constructors

	/** default constructor */
	public AdSaldo() {
	}

	/** minimal constructor */
	public AdSaldo(Integer salId, AcAlumno acAlumno) {
		this.salId = salId;
		this.acAlumno = acAlumno;
	}

	/** full constructor */
	public AdSaldo(Integer salId, AcAlumno acAlumno, Float salMonto,
			Date salFechaIngresoMonto, Date salCreacion) {
		this.salId = salId;
		this.acAlumno = acAlumno;
		this.salMonto = salMonto;
		this.salFechaIngresoMonto = salFechaIngresoMonto;
		this.salCreacion = salCreacion;
	}

	// Property accessors

	public Integer getSalId() {
		return this.salId;
	}

	public void setSalId(Integer salId) {
		this.salId = salId;
	}

	public AcAlumno getAcAlumno() {
		return this.acAlumno;
	}

	public void setAcAlumno(AcAlumno acAlumno) {
		this.acAlumno = acAlumno;
	}

	public Float getSalMonto() {
		return this.salMonto;
	}

	public void setSalMonto(Float salMonto) {
		this.salMonto = salMonto;
	}

	public Date getSalFechaIngresoMonto() {
		return this.salFechaIngresoMonto;
	}

	public void setSalFechaIngresoMonto(Date salFechaIngresoMonto) {
		this.salFechaIngresoMonto = salFechaIngresoMonto;
	}

	public Date getSalCreacion() {
		return this.salCreacion;
	}

	public void setSalCreacion(Date salCreacion) {
		this.salCreacion = salCreacion;
	}

}