package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcEspecialidad entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcEspecialidad implements java.io.Serializable {

	// Fields

	private Integer espId;
	private AcFacultad acFacultad;
	private String espNombre;
	private String espCodigo;
	private Date espFechacreacion;
	private String espResolrectoral;
	private String espNroperiodos;
	private String espTipoperiodo;
	private String espCreditostotal;
	private String espActivo;
	private Set adEstructuraPagoses = new HashSet(0);
	private Set acAlumnos = new HashSet(0);
	private Set acCursos = new HashSet(0);
	private Set acPlancurriculars = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcEspecialidad() {
	}

	/** minimal constructor */
	public AcEspecialidad(Integer espId) {
		this.espId = espId;
	}

	/** full constructor */
	public AcEspecialidad(Integer espId, AcFacultad acFacultad,
			String espNombre, String espCodigo, Date espFechacreacion,
			String espResolrectoral, String espNroperiodos,
			String espTipoperiodo, String espCreditostotal, String espActivo,
			Set adEstructuraPagoses, Set acAlumnos, Set acCursos,
			Set acPlancurriculars) {
		this.espId = espId;
		this.acFacultad = acFacultad;
		this.espNombre = espNombre;
		this.espCodigo = espCodigo;
		this.espFechacreacion = espFechacreacion;
		this.espResolrectoral = espResolrectoral;
		this.espNroperiodos = espNroperiodos;
		this.espTipoperiodo = espTipoperiodo;
		this.espCreditostotal = espCreditostotal;
		this.espActivo = espActivo;
		this.adEstructuraPagoses = adEstructuraPagoses;
		this.acAlumnos = acAlumnos;
		this.acCursos = acCursos;
		this.acPlancurriculars = acPlancurriculars;
	}

	// Property accessors

	public Integer getEspId() {
		return this.espId;
	}

	public void setEspId(Integer espId) {
		this.espId = espId;
	}

	public AcFacultad getAcFacultad() {
		return this.acFacultad;
	}

	public void setAcFacultad(AcFacultad acFacultad) {
		this.acFacultad = acFacultad;
	}

	public String getEspNombre() {
		return this.espNombre;
	}

	public void setEspNombre(String espNombre) {
		this.espNombre = espNombre;
	}

	public String getEspCodigo() {
		return this.espCodigo;
	}

	public void setEspCodigo(String espCodigo) {
		this.espCodigo = espCodigo;
	}

	public Date getEspFechacreacion() {
		return this.espFechacreacion;
	}

	public void setEspFechacreacion(Date espFechacreacion) {
		this.espFechacreacion = espFechacreacion;
	}

	public String getEspResolrectoral() {
		return this.espResolrectoral;
	}

	public void setEspResolrectoral(String espResolrectoral) {
		this.espResolrectoral = espResolrectoral;
	}

	public String getEspNroperiodos() {
		return this.espNroperiodos;
	}

	public void setEspNroperiodos(String espNroperiodos) {
		this.espNroperiodos = espNroperiodos;
	}

	public String getEspTipoperiodo() {
		return this.espTipoperiodo;
	}

	public void setEspTipoperiodo(String espTipoperiodo) {
		this.espTipoperiodo = espTipoperiodo;
	}

	public String getEspCreditostotal() {
		return this.espCreditostotal;
	}

	public void setEspCreditostotal(String espCreditostotal) {
		this.espCreditostotal = espCreditostotal;
	}

	public String getEspActivo() {
		return this.espActivo;
	}

	public void setEspActivo(String espActivo) {
		this.espActivo = espActivo;
	}

	public Set getAdEstructuraPagoses() {
		return this.adEstructuraPagoses;
	}

	public void setAdEstructuraPagoses(Set adEstructuraPagoses) {
		this.adEstructuraPagoses = adEstructuraPagoses;
	}

	public Set getAcAlumnos() {
		return this.acAlumnos;
	}

	public void setAcAlumnos(Set acAlumnos) {
		this.acAlumnos = acAlumnos;
	}

	public Set getAcCursos() {
		return this.acCursos;
	}

	public void setAcCursos(Set acCursos) {
		this.acCursos = acCursos;
	}

	public Set getAcPlancurriculars() {
		return this.acPlancurriculars;
	}

	public void setAcPlancurriculars(Set acPlancurriculars) {
		this.acPlancurriculars = acPlancurriculars;
	}

}