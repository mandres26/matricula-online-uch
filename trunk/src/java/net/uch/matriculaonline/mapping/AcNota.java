package net.uch.matriculaonline.mapping;

import java.util.Date;

/**
 * AcNota entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcNota implements java.io.Serializable {

	// Fields

	private Integer notId;
	private AcAlumno acAlumno;
	private AcSisEvaPersonalizado acSisEvaPersonalizado;
	private Float notNota;
	private String notObservacion;
	private Date notCreacion;
	private String notActivo;
	private Integer secId;

	// Constructors

	/** default constructor */
	public AcNota() {
	}

	/** minimal constructor */
	public AcNota(Integer notId, AcAlumno acAlumno,
			AcSisEvaPersonalizado acSisEvaPersonalizado) {
		this.notId = notId;
		this.acAlumno = acAlumno;
		this.acSisEvaPersonalizado = acSisEvaPersonalizado;
	}

	/** full constructor */
	public AcNota(Integer notId, AcAlumno acAlumno,
			AcSisEvaPersonalizado acSisEvaPersonalizado, Float notNota,
			String notObservacion, Date notCreacion, String notActivo,
			Integer secId) {
		this.notId = notId;
		this.acAlumno = acAlumno;
		this.acSisEvaPersonalizado = acSisEvaPersonalizado;
		this.notNota = notNota;
		this.notObservacion = notObservacion;
		this.notCreacion = notCreacion;
		this.notActivo = notActivo;
		this.secId = secId;
	}

	// Property accessors

	public Integer getNotId() {
		return this.notId;
	}

	public void setNotId(Integer notId) {
		this.notId = notId;
	}

	public AcAlumno getAcAlumno() {
		return this.acAlumno;
	}

	public void setAcAlumno(AcAlumno acAlumno) {
		this.acAlumno = acAlumno;
	}

	public AcSisEvaPersonalizado getAcSisEvaPersonalizado() {
		return this.acSisEvaPersonalizado;
	}

	public void setAcSisEvaPersonalizado(
			AcSisEvaPersonalizado acSisEvaPersonalizado) {
		this.acSisEvaPersonalizado = acSisEvaPersonalizado;
	}

	public Float getNotNota() {
		return this.notNota;
	}

	public void setNotNota(Float notNota) {
		this.notNota = notNota;
	}

	public String getNotObservacion() {
		return this.notObservacion;
	}

	public void setNotObservacion(String notObservacion) {
		this.notObservacion = notObservacion;
	}

	public Date getNotCreacion() {
		return this.notCreacion;
	}

	public void setNotCreacion(Date notCreacion) {
		this.notCreacion = notCreacion;
	}

	public String getNotActivo() {
		return this.notActivo;
	}

	public void setNotActivo(String notActivo) {
		this.notActivo = notActivo;
	}

	public Integer getSecId() {
		return this.secId;
	}

	public void setSecId(Integer secId) {
		this.secId = secId;
	}

}