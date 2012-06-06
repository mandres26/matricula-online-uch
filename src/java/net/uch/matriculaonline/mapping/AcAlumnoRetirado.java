package net.uch.matriculaonline.mapping;

/**
 * AcAlumnoRetirado entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcAlumnoRetirado implements java.io.Serializable {

	// Fields

	private Integer aluId;
	private String aluCodigo;
	private String aluAppaterno;
	private String aluApmaterno;
	private String aluNombres;
	private String aluDni;
	private String aluMail;
	private String aluTipo;
	private String aluModalidad;
	private String aluEstado;
	private String aluFoto;
	private Integer espId;
	private Integer espIdIngreso;
	private Integer semId;
	private String aluActivo;
	private Integer planIdIngreso;
	private Integer planIdActual;
	private String aluDuplicado;
	private String aluProcedencia;
	private String aluPassword;
	private Integer posId;
	private String aluFamiliar;
	private String aluTipoFamiliar;
	private String aluFormaPago;
	private String aluUnidad;
	private Float aluMontoPago;

	// Constructors

	/** default constructor */
	public AcAlumnoRetirado() {
	}

	/** minimal constructor */
	public AcAlumnoRetirado(Integer aluId, String aluCodigo, String aluDni,
			String aluTipo, String aluModalidad, String aluEstado,
			String aluFoto, Integer espId, Integer espIdIngreso, Integer semId,
			String aluActivo, Integer planIdIngreso, Integer planIdActual,
			String aluDuplicado, String aluProcedencia, Integer posId,
			String aluFamiliar, String aluTipoFamiliar, String aluFormaPago,
			String aluUnidad) {
		this.aluId = aluId;
		this.aluCodigo = aluCodigo;
		this.aluDni = aluDni;
		this.aluTipo = aluTipo;
		this.aluModalidad = aluModalidad;
		this.aluEstado = aluEstado;
		this.aluFoto = aluFoto;
		this.espId = espId;
		this.espIdIngreso = espIdIngreso;
		this.semId = semId;
		this.aluActivo = aluActivo;
		this.planIdIngreso = planIdIngreso;
		this.planIdActual = planIdActual;
		this.aluDuplicado = aluDuplicado;
		this.aluProcedencia = aluProcedencia;
		this.posId = posId;
		this.aluFamiliar = aluFamiliar;
		this.aluTipoFamiliar = aluTipoFamiliar;
		this.aluFormaPago = aluFormaPago;
		this.aluUnidad = aluUnidad;
	}

	/** full constructor */
	public AcAlumnoRetirado(Integer aluId, String aluCodigo,
			String aluAppaterno, String aluApmaterno, String aluNombres,
			String aluDni, String aluMail, String aluTipo, String aluModalidad,
			String aluEstado, String aluFoto, Integer espId,
			Integer espIdIngreso, Integer semId, String aluActivo,
			Integer planIdIngreso, Integer planIdActual, String aluDuplicado,
			String aluProcedencia, String aluPassword, Integer posId,
			String aluFamiliar, String aluTipoFamiliar, String aluFormaPago,
			String aluUnidad, Float aluMontoPago) {
		this.aluId = aluId;
		this.aluCodigo = aluCodigo;
		this.aluAppaterno = aluAppaterno;
		this.aluApmaterno = aluApmaterno;
		this.aluNombres = aluNombres;
		this.aluDni = aluDni;
		this.aluMail = aluMail;
		this.aluTipo = aluTipo;
		this.aluModalidad = aluModalidad;
		this.aluEstado = aluEstado;
		this.aluFoto = aluFoto;
		this.espId = espId;
		this.espIdIngreso = espIdIngreso;
		this.semId = semId;
		this.aluActivo = aluActivo;
		this.planIdIngreso = planIdIngreso;
		this.planIdActual = planIdActual;
		this.aluDuplicado = aluDuplicado;
		this.aluProcedencia = aluProcedencia;
		this.aluPassword = aluPassword;
		this.posId = posId;
		this.aluFamiliar = aluFamiliar;
		this.aluTipoFamiliar = aluTipoFamiliar;
		this.aluFormaPago = aluFormaPago;
		this.aluUnidad = aluUnidad;
		this.aluMontoPago = aluMontoPago;
	}

	// Property accessors

	public Integer getAluId() {
		return this.aluId;
	}

	public void setAluId(Integer aluId) {
		this.aluId = aluId;
	}

	public String getAluCodigo() {
		return this.aluCodigo;
	}

	public void setAluCodigo(String aluCodigo) {
		this.aluCodigo = aluCodigo;
	}

	public String getAluAppaterno() {
		return this.aluAppaterno;
	}

	public void setAluAppaterno(String aluAppaterno) {
		this.aluAppaterno = aluAppaterno;
	}

	public String getAluApmaterno() {
		return this.aluApmaterno;
	}

	public void setAluApmaterno(String aluApmaterno) {
		this.aluApmaterno = aluApmaterno;
	}

	public String getAluNombres() {
		return this.aluNombres;
	}

	public void setAluNombres(String aluNombres) {
		this.aluNombres = aluNombres;
	}

	public String getAluDni() {
		return this.aluDni;
	}

	public void setAluDni(String aluDni) {
		this.aluDni = aluDni;
	}

	public String getAluMail() {
		return this.aluMail;
	}

	public void setAluMail(String aluMail) {
		this.aluMail = aluMail;
	}

	public String getAluTipo() {
		return this.aluTipo;
	}

	public void setAluTipo(String aluTipo) {
		this.aluTipo = aluTipo;
	}

	public String getAluModalidad() {
		return this.aluModalidad;
	}

	public void setAluModalidad(String aluModalidad) {
		this.aluModalidad = aluModalidad;
	}

	public String getAluEstado() {
		return this.aluEstado;
	}

	public void setAluEstado(String aluEstado) {
		this.aluEstado = aluEstado;
	}

	public String getAluFoto() {
		return this.aluFoto;
	}

	public void setAluFoto(String aluFoto) {
		this.aluFoto = aluFoto;
	}

	public Integer getEspId() {
		return this.espId;
	}

	public void setEspId(Integer espId) {
		this.espId = espId;
	}

	public Integer getEspIdIngreso() {
		return this.espIdIngreso;
	}

	public void setEspIdIngreso(Integer espIdIngreso) {
		this.espIdIngreso = espIdIngreso;
	}

	public Integer getSemId() {
		return this.semId;
	}

	public void setSemId(Integer semId) {
		this.semId = semId;
	}

	public String getAluActivo() {
		return this.aluActivo;
	}

	public void setAluActivo(String aluActivo) {
		this.aluActivo = aluActivo;
	}

	public Integer getPlanIdIngreso() {
		return this.planIdIngreso;
	}

	public void setPlanIdIngreso(Integer planIdIngreso) {
		this.planIdIngreso = planIdIngreso;
	}

	public Integer getPlanIdActual() {
		return this.planIdActual;
	}

	public void setPlanIdActual(Integer planIdActual) {
		this.planIdActual = planIdActual;
	}

	public String getAluDuplicado() {
		return this.aluDuplicado;
	}

	public void setAluDuplicado(String aluDuplicado) {
		this.aluDuplicado = aluDuplicado;
	}

	public String getAluProcedencia() {
		return this.aluProcedencia;
	}

	public void setAluProcedencia(String aluProcedencia) {
		this.aluProcedencia = aluProcedencia;
	}

	public String getAluPassword() {
		return this.aluPassword;
	}

	public void setAluPassword(String aluPassword) {
		this.aluPassword = aluPassword;
	}

	public Integer getPosId() {
		return this.posId;
	}

	public void setPosId(Integer posId) {
		this.posId = posId;
	}

	public String getAluFamiliar() {
		return this.aluFamiliar;
	}

	public void setAluFamiliar(String aluFamiliar) {
		this.aluFamiliar = aluFamiliar;
	}

	public String getAluTipoFamiliar() {
		return this.aluTipoFamiliar;
	}

	public void setAluTipoFamiliar(String aluTipoFamiliar) {
		this.aluTipoFamiliar = aluTipoFamiliar;
	}

	public String getAluFormaPago() {
		return this.aluFormaPago;
	}

	public void setAluFormaPago(String aluFormaPago) {
		this.aluFormaPago = aluFormaPago;
	}

	public String getAluUnidad() {
		return this.aluUnidad;
	}

	public void setAluUnidad(String aluUnidad) {
		this.aluUnidad = aluUnidad;
	}

	public Float getAluMontoPago() {
		return this.aluMontoPago;
	}

	public void setAluMontoPago(Float aluMontoPago) {
		this.aluMontoPago = aluMontoPago;
	}

}