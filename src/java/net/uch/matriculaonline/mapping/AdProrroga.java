package net.uch.matriculaonline.mapping;

import java.util.Date;

/**
 * AdProrroga entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdProrroga implements java.io.Serializable {

	// Fields

	private Integer proId;
	private AdAlumnoTarifa adAlumnoTarifa;
	private String proNumero;
	private Date proFecha;
	private String proComentario;
	private Date proCreacion;
	private String proActivo;

	// Constructors

	/** default constructor */
	public AdProrroga() {
	}

	/** minimal constructor */
	public AdProrroga(Integer proId) {
		this.proId = proId;
//		this.tbUsuario = tbUsuario;
	}

	/** full constructor */
	public AdProrroga(Integer proId,
			AdAlumnoTarifa adAlumnoTarifa, String proNumero, Date proFecha,
			String proComentario, Date proCreacion, String proActivo) {
		this.proId = proId;
//		this.tbUsuario = tbUsuario;
		this.adAlumnoTarifa = adAlumnoTarifa;
		this.proNumero = proNumero;
		this.proFecha = proFecha;
		this.proComentario = proComentario;
		this.proCreacion = proCreacion;
		this.proActivo = proActivo;
	}

	// Property accessors

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public AdAlumnoTarifa getAdAlumnoTarifa() {
		return this.adAlumnoTarifa;
	}

	public void setAdAlumnoTarifa(AdAlumnoTarifa adAlumnoTarifa) {
		this.adAlumnoTarifa = adAlumnoTarifa;
	}

	public String getProNumero() {
		return this.proNumero;
	}

	public void setProNumero(String proNumero) {
		this.proNumero = proNumero;
	}

	public Date getProFecha() {
		return this.proFecha;
	}

	public void setProFecha(Date proFecha) {
		this.proFecha = proFecha;
	}

	public String getProComentario() {
		return this.proComentario;
	}

	public void setProComentario(String proComentario) {
		this.proComentario = proComentario;
	}

	public Date getProCreacion() {
		return this.proCreacion;
	}

	public void setProCreacion(Date proCreacion) {
		this.proCreacion = proCreacion;
	}

	public String getProActivo() {
		return this.proActivo;
	}

	public void setProActivo(String proActivo) {
		this.proActivo = proActivo;
	}

}