package net.uch.matriculaonline.mapping;

import java.util.Date;

/**
 * TbEvaluacionDatos entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TbEvaluacionDatos implements java.io.Serializable {

	// Fields

	private Integer datevaId;
	private AcAlumno acAlumno;
	private String datevaRespuesta;
	private Integer tespreId;
	private String datevaActivo;
	private Date datevaFecha;
	private Integer evaId;
	private Integer testpreNumero;
	private Integer activo;
	private Integer teorico;
	private Integer reflexivo;
	private Integer pragmatico;
	private String tiempoEnfermedad;

	// Constructors

	/** default constructor */
	public TbEvaluacionDatos() {
	}

	/** minimal constructor */
	public TbEvaluacionDatos(Integer datevaId) {
		this.datevaId = datevaId;
	}

	/** full constructor */
	public TbEvaluacionDatos(Integer datevaId, AcAlumno acAlumno,
			String datevaRespuesta, Integer tespreId, String datevaActivo,
			Date datevaFecha, Integer evaId, Integer testpreNumero,
			Integer activo, Integer teorico, Integer reflexivo,
			Integer pragmatico, String tiempoEnfermedad) {
		this.datevaId = datevaId;
		this.acAlumno = acAlumno;
		this.datevaRespuesta = datevaRespuesta;
		this.tespreId = tespreId;
		this.datevaActivo = datevaActivo;
		this.datevaFecha = datevaFecha;
		this.evaId = evaId;
		this.testpreNumero = testpreNumero;
		this.activo = activo;
		this.teorico = teorico;
		this.reflexivo = reflexivo;
		this.pragmatico = pragmatico;
		this.tiempoEnfermedad = tiempoEnfermedad;
	}

	// Property accessors

	public Integer getDatevaId() {
		return this.datevaId;
	}

	public void setDatevaId(Integer datevaId) {
		this.datevaId = datevaId;
	}

	public AcAlumno getAcAlumno() {
		return this.acAlumno;
	}

	public void setAcAlumno(AcAlumno acAlumno) {
		this.acAlumno = acAlumno;
	}

	public String getDatevaRespuesta() {
		return this.datevaRespuesta;
	}

	public void setDatevaRespuesta(String datevaRespuesta) {
		this.datevaRespuesta = datevaRespuesta;
	}

	public Integer getTespreId() {
		return this.tespreId;
	}

	public void setTespreId(Integer tespreId) {
		this.tespreId = tespreId;
	}

	public String getDatevaActivo() {
		return this.datevaActivo;
	}

	public void setDatevaActivo(String datevaActivo) {
		this.datevaActivo = datevaActivo;
	}

	public Date getDatevaFecha() {
		return this.datevaFecha;
	}

	public void setDatevaFecha(Date datevaFecha) {
		this.datevaFecha = datevaFecha;
	}

	public Integer getEvaId() {
		return this.evaId;
	}

	public void setEvaId(Integer evaId) {
		this.evaId = evaId;
	}

	public Integer getTestpreNumero() {
		return this.testpreNumero;
	}

	public void setTestpreNumero(Integer testpreNumero) {
		this.testpreNumero = testpreNumero;
	}

	public Integer getActivo() {
		return this.activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Integer getTeorico() {
		return this.teorico;
	}

	public void setTeorico(Integer teorico) {
		this.teorico = teorico;
	}

	public Integer getReflexivo() {
		return this.reflexivo;
	}

	public void setReflexivo(Integer reflexivo) {
		this.reflexivo = reflexivo;
	}

	public Integer getPragmatico() {
		return this.pragmatico;
	}

	public void setPragmatico(Integer pragmatico) {
		this.pragmatico = pragmatico;
	}

	public String getTiempoEnfermedad() {
		return this.tiempoEnfermedad;
	}

	public void setTiempoEnfermedad(String tiempoEnfermedad) {
		this.tiempoEnfermedad = tiempoEnfermedad;
	}

}