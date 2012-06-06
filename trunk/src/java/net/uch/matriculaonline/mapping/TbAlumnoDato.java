package net.uch.matriculaonline.mapping;

import java.util.Date;

/**
 * TbAlumnoDato entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TbAlumnoDato implements java.io.Serializable {

	// Fields

	private Integer aluDatoId;
	private AcAlumno acAlumno;
	private Date aluDatoFechaNacimiento;
	private String aluDatoLugarNacimiento;
	private String aluDni;
	private String aluDatoSexo;
	private String aluDatoEmail;
	private Integer aluDatoNumHijo;
	private String aluDatoCivil;
	private Integer aluDatoPais;
	private String aluDatoResidenciaLima;
	private String aluDatoDireccion;
	private String aluDatoTelefonoF;
	private String aluDatoTelefTrabajo;
	private String aluDatoTelefonoC;
	private String aluDatoPersonaContacto;
	private String aluDatoTipoContacto;
	private String aluDatoTelefContacto;
	private String aluDatoDireccionContacto;
	private String aluDatoUbicolegio;
	private Integer aluDatoNumRepitencia;
	private String aluDatoGradoRepitencia;
	private String aluDatoCursoNivelacion;
	private String aluDatoGradoNivelacion;
	private String aluDatoTipoPrepa;
	private String aluDatoAcademia;
	private String aluDatoAcademiaOtro;
	private String aluDatoColegio;
	private String aluDatoEstatal;
	private String aluDatoEstatalOtro;
	private String aluModalidad;
	private String aluDatoCicloCero;
	private String aluDatoTdoc;
	private String aluDatoNrodoc;
	private String aluDatoAniosPrepa;
	private String aluDatoMesesPrepa;
	private Double aluDatoTalla;
	private Double aluDatoMasa;
	private String aluDatoActivo;
	private Date usuModificacion;
	private Integer usuId;

	// Constructors

	/** default constructor */
	public TbAlumnoDato() {
	}

	/** minimal constructor */
	public TbAlumnoDato(Integer aluDatoId) {
		this.aluDatoId = aluDatoId;
	}

	/** full constructor */
	public TbAlumnoDato(Integer aluDatoId, AcAlumno acAlumno,
			Date aluDatoFechaNacimiento, String aluDatoLugarNacimiento,
			String aluDni, String aluDatoSexo, String aluDatoEmail,
			Integer aluDatoNumHijo, String aluDatoCivil, Integer aluDatoPais,
			String aluDatoResidenciaLima, String aluDatoDireccion,
			String aluDatoTelefonoF, String aluDatoTelefTrabajo,
			String aluDatoTelefonoC, String aluDatoPersonaContacto,
			String aluDatoTipoContacto, String aluDatoTelefContacto,
			String aluDatoDireccionContacto, String aluDatoUbicolegio,
			Integer aluDatoNumRepitencia, String aluDatoGradoRepitencia,
			String aluDatoCursoNivelacion, String aluDatoGradoNivelacion,
			String aluDatoTipoPrepa, String aluDatoAcademia,
			String aluDatoAcademiaOtro, String aluDatoColegio,
			String aluDatoEstatal, String aluDatoEstatalOtro,
			String aluModalidad, String aluDatoCicloCero, String aluDatoTdoc,
			String aluDatoNrodoc, String aluDatoAniosPrepa,
			String aluDatoMesesPrepa, Double aluDatoTalla, Double aluDatoMasa,
			String aluDatoActivo, Date usuModificacion, Integer usuId) {
		this.aluDatoId = aluDatoId;
		this.acAlumno = acAlumno;
		this.aluDatoFechaNacimiento = aluDatoFechaNacimiento;
		this.aluDatoLugarNacimiento = aluDatoLugarNacimiento;
		this.aluDni = aluDni;
		this.aluDatoSexo = aluDatoSexo;
		this.aluDatoEmail = aluDatoEmail;
		this.aluDatoNumHijo = aluDatoNumHijo;
		this.aluDatoCivil = aluDatoCivil;
		this.aluDatoPais = aluDatoPais;
		this.aluDatoResidenciaLima = aluDatoResidenciaLima;
		this.aluDatoDireccion = aluDatoDireccion;
		this.aluDatoTelefonoF = aluDatoTelefonoF;
		this.aluDatoTelefTrabajo = aluDatoTelefTrabajo;
		this.aluDatoTelefonoC = aluDatoTelefonoC;
		this.aluDatoPersonaContacto = aluDatoPersonaContacto;
		this.aluDatoTipoContacto = aluDatoTipoContacto;
		this.aluDatoTelefContacto = aluDatoTelefContacto;
		this.aluDatoDireccionContacto = aluDatoDireccionContacto;
		this.aluDatoUbicolegio = aluDatoUbicolegio;
		this.aluDatoNumRepitencia = aluDatoNumRepitencia;
		this.aluDatoGradoRepitencia = aluDatoGradoRepitencia;
		this.aluDatoCursoNivelacion = aluDatoCursoNivelacion;
		this.aluDatoGradoNivelacion = aluDatoGradoNivelacion;
		this.aluDatoTipoPrepa = aluDatoTipoPrepa;
		this.aluDatoAcademia = aluDatoAcademia;
		this.aluDatoAcademiaOtro = aluDatoAcademiaOtro;
		this.aluDatoColegio = aluDatoColegio;
		this.aluDatoEstatal = aluDatoEstatal;
		this.aluDatoEstatalOtro = aluDatoEstatalOtro;
		this.aluModalidad = aluModalidad;
		this.aluDatoCicloCero = aluDatoCicloCero;
		this.aluDatoTdoc = aluDatoTdoc;
		this.aluDatoNrodoc = aluDatoNrodoc;
		this.aluDatoAniosPrepa = aluDatoAniosPrepa;
		this.aluDatoMesesPrepa = aluDatoMesesPrepa;
		this.aluDatoTalla = aluDatoTalla;
		this.aluDatoMasa = aluDatoMasa;
		this.aluDatoActivo = aluDatoActivo;
		this.usuModificacion = usuModificacion;
		this.usuId = usuId;
	}

	// Property accessors

	public Integer getAluDatoId() {
		return this.aluDatoId;
	}

	public void setAluDatoId(Integer aluDatoId) {
		this.aluDatoId = aluDatoId;
	}

	public AcAlumno getAcAlumno() {
		return this.acAlumno;
	}

	public void setAcAlumno(AcAlumno acAlumno) {
		this.acAlumno = acAlumno;
	}

	public Date getAluDatoFechaNacimiento() {
		return this.aluDatoFechaNacimiento;
	}

	public void setAluDatoFechaNacimiento(Date aluDatoFechaNacimiento) {
		this.aluDatoFechaNacimiento = aluDatoFechaNacimiento;
	}

	public String getAluDatoLugarNacimiento() {
		return this.aluDatoLugarNacimiento;
	}

	public void setAluDatoLugarNacimiento(String aluDatoLugarNacimiento) {
		this.aluDatoLugarNacimiento = aluDatoLugarNacimiento;
	}

	public String getAluDni() {
		return this.aluDni;
	}

	public void setAluDni(String aluDni) {
		this.aluDni = aluDni;
	}

	public String getAluDatoSexo() {
		return this.aluDatoSexo;
	}

	public void setAluDatoSexo(String aluDatoSexo) {
		this.aluDatoSexo = aluDatoSexo;
	}

	public String getAluDatoEmail() {
		return this.aluDatoEmail;
	}

	public void setAluDatoEmail(String aluDatoEmail) {
		this.aluDatoEmail = aluDatoEmail;
	}

	public Integer getAluDatoNumHijo() {
		return this.aluDatoNumHijo;
	}

	public void setAluDatoNumHijo(Integer aluDatoNumHijo) {
		this.aluDatoNumHijo = aluDatoNumHijo;
	}

	public String getAluDatoCivil() {
		return this.aluDatoCivil;
	}

	public void setAluDatoCivil(String aluDatoCivil) {
		this.aluDatoCivil = aluDatoCivil;
	}

	public Integer getAluDatoPais() {
		return this.aluDatoPais;
	}

	public void setAluDatoPais(Integer aluDatoPais) {
		this.aluDatoPais = aluDatoPais;
	}

	public String getAluDatoResidenciaLima() {
		return this.aluDatoResidenciaLima;
	}

	public void setAluDatoResidenciaLima(String aluDatoResidenciaLima) {
		this.aluDatoResidenciaLima = aluDatoResidenciaLima;
	}

	public String getAluDatoDireccion() {
		return this.aluDatoDireccion;
	}

	public void setAluDatoDireccion(String aluDatoDireccion) {
		this.aluDatoDireccion = aluDatoDireccion;
	}

	public String getAluDatoTelefonoF() {
		return this.aluDatoTelefonoF;
	}

	public void setAluDatoTelefonoF(String aluDatoTelefonoF) {
		this.aluDatoTelefonoF = aluDatoTelefonoF;
	}

	public String getAluDatoTelefTrabajo() {
		return this.aluDatoTelefTrabajo;
	}

	public void setAluDatoTelefTrabajo(String aluDatoTelefTrabajo) {
		this.aluDatoTelefTrabajo = aluDatoTelefTrabajo;
	}

	public String getAluDatoTelefonoC() {
		return this.aluDatoTelefonoC;
	}

	public void setAluDatoTelefonoC(String aluDatoTelefonoC) {
		this.aluDatoTelefonoC = aluDatoTelefonoC;
	}

	public String getAluDatoPersonaContacto() {
		return this.aluDatoPersonaContacto;
	}

	public void setAluDatoPersonaContacto(String aluDatoPersonaContacto) {
		this.aluDatoPersonaContacto = aluDatoPersonaContacto;
	}

	public String getAluDatoTipoContacto() {
		return this.aluDatoTipoContacto;
	}

	public void setAluDatoTipoContacto(String aluDatoTipoContacto) {
		this.aluDatoTipoContacto = aluDatoTipoContacto;
	}

	public String getAluDatoTelefContacto() {
		return this.aluDatoTelefContacto;
	}

	public void setAluDatoTelefContacto(String aluDatoTelefContacto) {
		this.aluDatoTelefContacto = aluDatoTelefContacto;
	}

	public String getAluDatoDireccionContacto() {
		return this.aluDatoDireccionContacto;
	}

	public void setAluDatoDireccionContacto(String aluDatoDireccionContacto) {
		this.aluDatoDireccionContacto = aluDatoDireccionContacto;
	}

	public String getAluDatoUbicolegio() {
		return this.aluDatoUbicolegio;
	}

	public void setAluDatoUbicolegio(String aluDatoUbicolegio) {
		this.aluDatoUbicolegio = aluDatoUbicolegio;
	}

	public Integer getAluDatoNumRepitencia() {
		return this.aluDatoNumRepitencia;
	}

	public void setAluDatoNumRepitencia(Integer aluDatoNumRepitencia) {
		this.aluDatoNumRepitencia = aluDatoNumRepitencia;
	}

	public String getAluDatoGradoRepitencia() {
		return this.aluDatoGradoRepitencia;
	}

	public void setAluDatoGradoRepitencia(String aluDatoGradoRepitencia) {
		this.aluDatoGradoRepitencia = aluDatoGradoRepitencia;
	}

	public String getAluDatoCursoNivelacion() {
		return this.aluDatoCursoNivelacion;
	}

	public void setAluDatoCursoNivelacion(String aluDatoCursoNivelacion) {
		this.aluDatoCursoNivelacion = aluDatoCursoNivelacion;
	}

	public String getAluDatoGradoNivelacion() {
		return this.aluDatoGradoNivelacion;
	}

	public void setAluDatoGradoNivelacion(String aluDatoGradoNivelacion) {
		this.aluDatoGradoNivelacion = aluDatoGradoNivelacion;
	}

	public String getAluDatoTipoPrepa() {
		return this.aluDatoTipoPrepa;
	}

	public void setAluDatoTipoPrepa(String aluDatoTipoPrepa) {
		this.aluDatoTipoPrepa = aluDatoTipoPrepa;
	}

	public String getAluDatoAcademia() {
		return this.aluDatoAcademia;
	}

	public void setAluDatoAcademia(String aluDatoAcademia) {
		this.aluDatoAcademia = aluDatoAcademia;
	}

	public String getAluDatoAcademiaOtro() {
		return this.aluDatoAcademiaOtro;
	}

	public void setAluDatoAcademiaOtro(String aluDatoAcademiaOtro) {
		this.aluDatoAcademiaOtro = aluDatoAcademiaOtro;
	}

	public String getAluDatoColegio() {
		return this.aluDatoColegio;
	}

	public void setAluDatoColegio(String aluDatoColegio) {
		this.aluDatoColegio = aluDatoColegio;
	}

	public String getAluDatoEstatal() {
		return this.aluDatoEstatal;
	}

	public void setAluDatoEstatal(String aluDatoEstatal) {
		this.aluDatoEstatal = aluDatoEstatal;
	}

	public String getAluDatoEstatalOtro() {
		return this.aluDatoEstatalOtro;
	}

	public void setAluDatoEstatalOtro(String aluDatoEstatalOtro) {
		this.aluDatoEstatalOtro = aluDatoEstatalOtro;
	}

	public String getAluModalidad() {
		return this.aluModalidad;
	}

	public void setAluModalidad(String aluModalidad) {
		this.aluModalidad = aluModalidad;
	}

	public String getAluDatoCicloCero() {
		return this.aluDatoCicloCero;
	}

	public void setAluDatoCicloCero(String aluDatoCicloCero) {
		this.aluDatoCicloCero = aluDatoCicloCero;
	}

	public String getAluDatoTdoc() {
		return this.aluDatoTdoc;
	}

	public void setAluDatoTdoc(String aluDatoTdoc) {
		this.aluDatoTdoc = aluDatoTdoc;
	}

	public String getAluDatoNrodoc() {
		return this.aluDatoNrodoc;
	}

	public void setAluDatoNrodoc(String aluDatoNrodoc) {
		this.aluDatoNrodoc = aluDatoNrodoc;
	}

	public String getAluDatoAniosPrepa() {
		return this.aluDatoAniosPrepa;
	}

	public void setAluDatoAniosPrepa(String aluDatoAniosPrepa) {
		this.aluDatoAniosPrepa = aluDatoAniosPrepa;
	}

	public String getAluDatoMesesPrepa() {
		return this.aluDatoMesesPrepa;
	}

	public void setAluDatoMesesPrepa(String aluDatoMesesPrepa) {
		this.aluDatoMesesPrepa = aluDatoMesesPrepa;
	}

	public Double getAluDatoTalla() {
		return this.aluDatoTalla;
	}

	public void setAluDatoTalla(Double aluDatoTalla) {
		this.aluDatoTalla = aluDatoTalla;
	}

	public Double getAluDatoMasa() {
		return this.aluDatoMasa;
	}

	public void setAluDatoMasa(Double aluDatoMasa) {
		this.aluDatoMasa = aluDatoMasa;
	}

	public String getAluDatoActivo() {
		return this.aluDatoActivo;
	}

	public void setAluDatoActivo(String aluDatoActivo) {
		this.aluDatoActivo = aluDatoActivo;
	}

	public Date getUsuModificacion() {
		return this.usuModificacion;
	}

	public void setUsuModificacion(Date usuModificacion) {
		this.usuModificacion = usuModificacion;
	}

	public Integer getUsuId() {
		return this.usuId;
	}

	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}

}