package net.uch.matriculaonline.mapping;

import java.util.Date;

/**
 * AcAlumnoDato entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcAlumnoDato implements java.io.Serializable {

	// Fields

	private Integer aluDatoId;
	private Integer aluId;
	private Date aluDatoFechaNacimiento;
	private String aluDatoLugarNacimiento;
	private String aluDatoSexo;
	private String aluDatoEmail;
	private String aluDatoPadre;
	private String aluDatoMadre;
	private String aluDatoApoderado;
	private Integer aluDatoPais;
	private String aluDatoResidenciaLima;
	private String aluDatoDireccion;
	private String aluDatoTelefonoF;
	private String aluDatoTelefonoC;
	private String aluDatoUbicolegio;
	private String aluDatoTipoPrepa;
	private String aluDatoAcademia;
	private String aluDatoAcademiaOtro;
	private String aluDatoColegio;
	private String aluDatoEstatal;
	private String aluDatoTdoc;
	private String aluDatoNrodoc;
	private String aluDatoAniosPrepa;
	private String aluDatoMesesPrepa;
	private Double aluDatoTalla;
	private Double aluDatoMasa;
	private String aluDatoFirma;
	private String aluDatoHuella;
	private String aluDatoFoto;
	private Integer aluDatoPosId;
	private Integer aluDatoAnioEgreso;
	private String aluDatoActivo;
	private Date usuModificacion;
	private Integer usuId;
	private String aluNivelInstruccion;
	private String aluNivelacion;
	private String aluDatoRepitencia;
	private String aluDatoOtroEstudio;
	private String aluDatoOtraCarrera;
	private String aluDatoGradoNivelacion;
	private String aluDatoCursoNivelacion;
	private String aluDatoGradoRepitencia;
	private Integer aluDatoNumHijo;
	private String aluDatoCivil;
	private String aluDatoLaboral;
	private String aluDni;
	private String aluDatoEstatalOtro;
	private Integer aluDatoNumRepitencia;
	private String aluModalidad;
	private String aluDatoCicloCero;
	private String aluDatoTelefTrabajo;
	private String aluDatoPersonaContacto;
	private String aluDatoTipoContacto;
	private String aluDatoTelefContacto;
	private String aluDatoDireccionContacto;
	private Date ultFechaDoc;

	// Constructors

	/** default constructor */
	public AcAlumnoDato() {
	}

	/** minimal constructor */
	public AcAlumnoDato(Integer aluDatoId) {
		this.aluDatoId = aluDatoId;
	}

	/** full constructor */
	public AcAlumnoDato(Integer aluDatoId, Integer aluId,
			Date aluDatoFechaNacimiento, String aluDatoLugarNacimiento,
			String aluDatoSexo, String aluDatoEmail, String aluDatoPadre,
			String aluDatoMadre, String aluDatoApoderado, Integer aluDatoPais,
			String aluDatoResidenciaLima, String aluDatoDireccion,
			String aluDatoTelefonoF, String aluDatoTelefonoC,
			String aluDatoUbicolegio, String aluDatoTipoPrepa,
			String aluDatoAcademia, String aluDatoAcademiaOtro,
			String aluDatoColegio, String aluDatoEstatal, String aluDatoTdoc,
			String aluDatoNrodoc, String aluDatoAniosPrepa,
			String aluDatoMesesPrepa, Double aluDatoTalla, Double aluDatoMasa,
			String aluDatoFirma, String aluDatoHuella, String aluDatoFoto,
			Integer aluDatoPosId, Integer aluDatoAnioEgreso,
			String aluDatoActivo, Date usuModificacion, Integer usuId,
			String aluNivelInstruccion, String aluNivelacion,
			String aluDatoRepitencia, String aluDatoOtroEstudio,
			String aluDatoOtraCarrera, String aluDatoGradoNivelacion,
			String aluDatoCursoNivelacion, String aluDatoGradoRepitencia,
			Integer aluDatoNumHijo, String aluDatoCivil, String aluDatoLaboral,
			String aluDni, String aluDatoEstatalOtro,
			Integer aluDatoNumRepitencia, String aluModalidad,
			String aluDatoCicloCero, String aluDatoTelefTrabajo,
			String aluDatoPersonaContacto, String aluDatoTipoContacto,
			String aluDatoTelefContacto, String aluDatoDireccionContacto,
			Date ultFechaDoc) {
		this.aluDatoId = aluDatoId;
		this.aluId = aluId;
		this.aluDatoFechaNacimiento = aluDatoFechaNacimiento;
		this.aluDatoLugarNacimiento = aluDatoLugarNacimiento;
		this.aluDatoSexo = aluDatoSexo;
		this.aluDatoEmail = aluDatoEmail;
		this.aluDatoPadre = aluDatoPadre;
		this.aluDatoMadre = aluDatoMadre;
		this.aluDatoApoderado = aluDatoApoderado;
		this.aluDatoPais = aluDatoPais;
		this.aluDatoResidenciaLima = aluDatoResidenciaLima;
		this.aluDatoDireccion = aluDatoDireccion;
		this.aluDatoTelefonoF = aluDatoTelefonoF;
		this.aluDatoTelefonoC = aluDatoTelefonoC;
		this.aluDatoUbicolegio = aluDatoUbicolegio;
		this.aluDatoTipoPrepa = aluDatoTipoPrepa;
		this.aluDatoAcademia = aluDatoAcademia;
		this.aluDatoAcademiaOtro = aluDatoAcademiaOtro;
		this.aluDatoColegio = aluDatoColegio;
		this.aluDatoEstatal = aluDatoEstatal;
		this.aluDatoTdoc = aluDatoTdoc;
		this.aluDatoNrodoc = aluDatoNrodoc;
		this.aluDatoAniosPrepa = aluDatoAniosPrepa;
		this.aluDatoMesesPrepa = aluDatoMesesPrepa;
		this.aluDatoTalla = aluDatoTalla;
		this.aluDatoMasa = aluDatoMasa;
		this.aluDatoFirma = aluDatoFirma;
		this.aluDatoHuella = aluDatoHuella;
		this.aluDatoFoto = aluDatoFoto;
		this.aluDatoPosId = aluDatoPosId;
		this.aluDatoAnioEgreso = aluDatoAnioEgreso;
		this.aluDatoActivo = aluDatoActivo;
		this.usuModificacion = usuModificacion;
		this.usuId = usuId;
		this.aluNivelInstruccion = aluNivelInstruccion;
		this.aluNivelacion = aluNivelacion;
		this.aluDatoRepitencia = aluDatoRepitencia;
		this.aluDatoOtroEstudio = aluDatoOtroEstudio;
		this.aluDatoOtraCarrera = aluDatoOtraCarrera;
		this.aluDatoGradoNivelacion = aluDatoGradoNivelacion;
		this.aluDatoCursoNivelacion = aluDatoCursoNivelacion;
		this.aluDatoGradoRepitencia = aluDatoGradoRepitencia;
		this.aluDatoNumHijo = aluDatoNumHijo;
		this.aluDatoCivil = aluDatoCivil;
		this.aluDatoLaboral = aluDatoLaboral;
		this.aluDni = aluDni;
		this.aluDatoEstatalOtro = aluDatoEstatalOtro;
		this.aluDatoNumRepitencia = aluDatoNumRepitencia;
		this.aluModalidad = aluModalidad;
		this.aluDatoCicloCero = aluDatoCicloCero;
		this.aluDatoTelefTrabajo = aluDatoTelefTrabajo;
		this.aluDatoPersonaContacto = aluDatoPersonaContacto;
		this.aluDatoTipoContacto = aluDatoTipoContacto;
		this.aluDatoTelefContacto = aluDatoTelefContacto;
		this.aluDatoDireccionContacto = aluDatoDireccionContacto;
		this.ultFechaDoc = ultFechaDoc;
	}

	// Property accessors

	public Integer getAluDatoId() {
		return this.aluDatoId;
	}

	public void setAluDatoId(Integer aluDatoId) {
		this.aluDatoId = aluDatoId;
	}

	public Integer getAluId() {
		return this.aluId;
	}

	public void setAluId(Integer aluId) {
		this.aluId = aluId;
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

	public String getAluDatoPadre() {
		return this.aluDatoPadre;
	}

	public void setAluDatoPadre(String aluDatoPadre) {
		this.aluDatoPadre = aluDatoPadre;
	}

	public String getAluDatoMadre() {
		return this.aluDatoMadre;
	}

	public void setAluDatoMadre(String aluDatoMadre) {
		this.aluDatoMadre = aluDatoMadre;
	}

	public String getAluDatoApoderado() {
		return this.aluDatoApoderado;
	}

	public void setAluDatoApoderado(String aluDatoApoderado) {
		this.aluDatoApoderado = aluDatoApoderado;
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

	public String getAluDatoTelefonoC() {
		return this.aluDatoTelefonoC;
	}

	public void setAluDatoTelefonoC(String aluDatoTelefonoC) {
		this.aluDatoTelefonoC = aluDatoTelefonoC;
	}

	public String getAluDatoUbicolegio() {
		return this.aluDatoUbicolegio;
	}

	public void setAluDatoUbicolegio(String aluDatoUbicolegio) {
		this.aluDatoUbicolegio = aluDatoUbicolegio;
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

	public String getAluDatoFirma() {
		return this.aluDatoFirma;
	}

	public void setAluDatoFirma(String aluDatoFirma) {
		this.aluDatoFirma = aluDatoFirma;
	}

	public String getAluDatoHuella() {
		return this.aluDatoHuella;
	}

	public void setAluDatoHuella(String aluDatoHuella) {
		this.aluDatoHuella = aluDatoHuella;
	}

	public String getAluDatoFoto() {
		return this.aluDatoFoto;
	}

	public void setAluDatoFoto(String aluDatoFoto) {
		this.aluDatoFoto = aluDatoFoto;
	}

	public Integer getAluDatoPosId() {
		return this.aluDatoPosId;
	}

	public void setAluDatoPosId(Integer aluDatoPosId) {
		this.aluDatoPosId = aluDatoPosId;
	}

	public Integer getAluDatoAnioEgreso() {
		return this.aluDatoAnioEgreso;
	}

	public void setAluDatoAnioEgreso(Integer aluDatoAnioEgreso) {
		this.aluDatoAnioEgreso = aluDatoAnioEgreso;
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

	public String getAluNivelInstruccion() {
		return this.aluNivelInstruccion;
	}

	public void setAluNivelInstruccion(String aluNivelInstruccion) {
		this.aluNivelInstruccion = aluNivelInstruccion;
	}

	public String getAluNivelacion() {
		return this.aluNivelacion;
	}

	public void setAluNivelacion(String aluNivelacion) {
		this.aluNivelacion = aluNivelacion;
	}

	public String getAluDatoRepitencia() {
		return this.aluDatoRepitencia;
	}

	public void setAluDatoRepitencia(String aluDatoRepitencia) {
		this.aluDatoRepitencia = aluDatoRepitencia;
	}

	public String getAluDatoOtroEstudio() {
		return this.aluDatoOtroEstudio;
	}

	public void setAluDatoOtroEstudio(String aluDatoOtroEstudio) {
		this.aluDatoOtroEstudio = aluDatoOtroEstudio;
	}

	public String getAluDatoOtraCarrera() {
		return this.aluDatoOtraCarrera;
	}

	public void setAluDatoOtraCarrera(String aluDatoOtraCarrera) {
		this.aluDatoOtraCarrera = aluDatoOtraCarrera;
	}

	public String getAluDatoGradoNivelacion() {
		return this.aluDatoGradoNivelacion;
	}

	public void setAluDatoGradoNivelacion(String aluDatoGradoNivelacion) {
		this.aluDatoGradoNivelacion = aluDatoGradoNivelacion;
	}

	public String getAluDatoCursoNivelacion() {
		return this.aluDatoCursoNivelacion;
	}

	public void setAluDatoCursoNivelacion(String aluDatoCursoNivelacion) {
		this.aluDatoCursoNivelacion = aluDatoCursoNivelacion;
	}

	public String getAluDatoGradoRepitencia() {
		return this.aluDatoGradoRepitencia;
	}

	public void setAluDatoGradoRepitencia(String aluDatoGradoRepitencia) {
		this.aluDatoGradoRepitencia = aluDatoGradoRepitencia;
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

	public String getAluDatoLaboral() {
		return this.aluDatoLaboral;
	}

	public void setAluDatoLaboral(String aluDatoLaboral) {
		this.aluDatoLaboral = aluDatoLaboral;
	}

	public String getAluDni() {
		return this.aluDni;
	}

	public void setAluDni(String aluDni) {
		this.aluDni = aluDni;
	}

	public String getAluDatoEstatalOtro() {
		return this.aluDatoEstatalOtro;
	}

	public void setAluDatoEstatalOtro(String aluDatoEstatalOtro) {
		this.aluDatoEstatalOtro = aluDatoEstatalOtro;
	}

	public Integer getAluDatoNumRepitencia() {
		return this.aluDatoNumRepitencia;
	}

	public void setAluDatoNumRepitencia(Integer aluDatoNumRepitencia) {
		this.aluDatoNumRepitencia = aluDatoNumRepitencia;
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

	public String getAluDatoTelefTrabajo() {
		return this.aluDatoTelefTrabajo;
	}

	public void setAluDatoTelefTrabajo(String aluDatoTelefTrabajo) {
		this.aluDatoTelefTrabajo = aluDatoTelefTrabajo;
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

	public Date getUltFechaDoc() {
		return this.ultFechaDoc;
	}

	public void setUltFechaDoc(Date ultFechaDoc) {
		this.ultFechaDoc = ultFechaDoc;
	}

}