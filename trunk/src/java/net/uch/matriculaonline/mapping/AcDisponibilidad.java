package net.uch.matriculaonline.mapping;

/**
 * AcDisponibilidad entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcDisponibilidad implements java.io.Serializable {

	// Fields

	private Integer disId;
	private AcDocente acDocente;
	private String disObservacion;
	private Integer turdetId;
	private String disActivo;
	private String disDia;

	// Constructors

	/** default constructor */
	public AcDisponibilidad() {
	}

	/** minimal constructor */
	public AcDisponibilidad(Integer disId, AcDocente acDocente, Integer turdetId) {
		this.disId = disId;
		this.acDocente = acDocente;
		this.turdetId = turdetId;
	}

	/** full constructor */
	public AcDisponibilidad(Integer disId, AcDocente acDocente,
			String disObservacion, Integer turdetId, String disActivo,
			String disDia) {
		this.disId = disId;
		this.acDocente = acDocente;
		this.disObservacion = disObservacion;
		this.turdetId = turdetId;
		this.disActivo = disActivo;
		this.disDia = disDia;
	}

	// Property accessors

	public Integer getDisId() {
		return this.disId;
	}

	public void setDisId(Integer disId) {
		this.disId = disId;
	}

	public AcDocente getAcDocente() {
		return this.acDocente;
	}

	public void setAcDocente(AcDocente acDocente) {
		this.acDocente = acDocente;
	}

	public String getDisObservacion() {
		return this.disObservacion;
	}

	public void setDisObservacion(String disObservacion) {
		this.disObservacion = disObservacion;
	}

	public Integer getTurdetId() {
		return this.turdetId;
	}

	public void setTurdetId(Integer turdetId) {
		this.turdetId = turdetId;
	}

	public String getDisActivo() {
		return this.disActivo;
	}

	public void setDisActivo(String disActivo) {
		this.disActivo = disActivo;
	}

	public String getDisDia() {
		return this.disDia;
	}

	public void setDisDia(String disDia) {
		this.disDia = disDia;
	}

}