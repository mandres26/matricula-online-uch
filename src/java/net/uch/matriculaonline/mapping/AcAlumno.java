package net.uch.matriculaonline.mapping;

import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

/**
 * AcAlumno entity.
 *
 * @author MyEclipse Persistence Tools
 */
public class AcAlumno implements java.io.Serializable {

    // Fields
    private Integer aluId;
    private AcEspecialidad acEspecialidad;
    private String aluCodigo;
    private String aluAppaterno;
    private String aluApmaterno;
    private String aluNombres;
    private String aluDni;
    private String aluMail;
    private String aluTipo;
    private String aluModalidad;
    private String aluEstado;
    private Blob aluFoto;
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
    private String aluAppaternoBack;
    private String aluApmaternoBack;
    private String aluNombresBack;
    private String aluProcedenciaBack;
    private Set acNotas = new HashSet( 0 );
    private Set tbParentescos = new HashSet( 0 );
    private Set adSaldos = new HashSet( 0 );
    private Set acMatriculas = new HashSet( 0 );
    private Set adAlumnoTarifas = new HashSet( 0 );
    private Set acApoderadoAlumnos = new HashSet( 0 );
    private Set acAlumnoDocumentos = new HashSet( 0 );
    private Set tbEvaluacionDatoses = new HashSet( 0 );
    private Set acAlumnoDatos;

    // Constructors
    /**
     * default constructor
     */
    public AcAlumno() {
    }

    /**
     * minimal constructor
     */
    public AcAlumno( Integer aluId, AcEspecialidad acEspecialidad,
            String aluCodigo, String aluDni, String aluTipo,
            String aluModalidad, String aluEstado, Blob aluFoto,
            Integer espIdIngreso, Integer semId, String aluActivo,
            Integer planIdIngreso, Integer planIdActual, String aluDuplicado,
            String aluProcedencia, Integer posId, String aluFamiliar,
            String aluTipoFamiliar, String aluFormaPago, String aluUnidad ) {
        this.aluId = aluId;
        this.acEspecialidad = acEspecialidad;
        this.aluCodigo = aluCodigo;
        this.aluDni = aluDni;
        this.aluTipo = aluTipo;
        this.aluModalidad = aluModalidad;
        this.aluEstado = aluEstado;
        this.aluFoto = aluFoto;
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

    /**
     * full constructor
     */
    public AcAlumno( Integer aluId, AcEspecialidad acEspecialidad,
            String aluCodigo, String aluAppaterno, String aluApmaterno,
            String aluNombres, String aluDni, String aluMail, String aluTipo,
            String aluModalidad, String aluEstado, Blob aluFoto,
            Integer espIdIngreso, Integer semId, String aluActivo,
            Integer planIdIngreso, Integer planIdActual, String aluDuplicado,
            String aluProcedencia, String aluPassword, Integer posId,
            String aluFamiliar, String aluTipoFamiliar, String aluFormaPago,
            String aluUnidad, Float aluMontoPago, String aluAppaternoBack,
            String aluApmaternoBack, String aluNombresBack,
            String aluProcedenciaBack, Set acAlumnoDatos,
            Set acNotas, Set tbParentescos,
            Set adSaldos, Set acMatriculas,
            Set acApoderadoAlumnos, Set acAlumnoDocumentos,
            Set tbEvaluacionDatoses ) {
        this.aluId = aluId;
        this.acEspecialidad = acEspecialidad;
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
        this.aluAppaternoBack = aluAppaternoBack;
        this.aluApmaternoBack = aluApmaternoBack;
        this.aluNombresBack = aluNombresBack;
        this.aluProcedenciaBack = aluProcedenciaBack;
        this.acNotas = acNotas;
        this.tbParentescos = tbParentescos;
        this.adSaldos = adSaldos;
        this.acMatriculas = acMatriculas;
        this.acApoderadoAlumnos = acApoderadoAlumnos;
        this.acAlumnoDocumentos = acAlumnoDocumentos;
        this.tbEvaluacionDatoses = tbEvaluacionDatoses;
        this.acAlumnoDatos = acAlumnoDatos;
    }

    // Property accessors
    public Integer getAluId() {
        return this.aluId;
    }

    public void setAluId( Integer aluId ) {
        this.aluId = aluId;
    }

    public AcEspecialidad getAcEspecialidad() {
        return this.acEspecialidad;
    }

    public void setAcEspecialidad( AcEspecialidad acEspecialidad ) {
        this.acEspecialidad = acEspecialidad;
    }

    public String getAluCodigo() {
        return this.aluCodigo;
    }

    public void setAluCodigo( String aluCodigo ) {
        this.aluCodigo = aluCodigo;
    }

    public String getAluAppaterno() {
        return this.aluAppaterno;
    }

    public void setAluAppaterno( String aluAppaterno ) {
        this.aluAppaterno = aluAppaterno;
    }

    public String getAluApmaterno() {
        return this.aluApmaterno;
    }

    public void setAluApmaterno( String aluApmaterno ) {
        this.aluApmaterno = aluApmaterno;
    }

    public String getAluNombres() {
        return this.aluNombres;
    }

    public void setAluNombres( String aluNombres ) {
        this.aluNombres = aluNombres;
    }

    public String getAluDni() {
        return this.aluDni;
    }

    public void setAluDni( String aluDni ) {
        this.aluDni = aluDni;
    }

    public String getAluMail() {
        return this.aluMail;
    }

    public void setAluMail( String aluMail ) {
        this.aluMail = aluMail;
    }

    public String getAluTipo() {
        return this.aluTipo;
    }

    public void setAluTipo( String aluTipo ) {
        this.aluTipo = aluTipo;
    }

    public String getAluModalidad() {
        return this.aluModalidad;
    }

    public void setAluModalidad( String aluModalidad ) {
        this.aluModalidad = aluModalidad;
    }

    public String getAluEstado() {
        return this.aluEstado;
    }

    public void setAluEstado( String aluEstado ) {
        this.aluEstado = aluEstado;
    }

    public Blob getAluFoto() {
        return this.aluFoto;
    }

    public void setAluFoto( Blob aluFoto ) {
        this.aluFoto = aluFoto;
    }

    public Integer getEspIdIngreso() {
        return this.espIdIngreso;
    }

    public void setEspIdIngreso( Integer espIdIngreso ) {
        this.espIdIngreso = espIdIngreso;
    }

    public Integer getSemId() {
        return this.semId;
    }

    public void setSemId( Integer semId ) {
        this.semId = semId;
    }

    public String getAluActivo() {
        return this.aluActivo;
    }

    public void setAluActivo( String aluActivo ) {
        this.aluActivo = aluActivo;
    }

    public Integer getPlanIdIngreso() {
        return this.planIdIngreso;
    }

    public void setPlanIdIngreso( Integer planIdIngreso ) {
        this.planIdIngreso = planIdIngreso;
    }

    public Integer getPlanIdActual() {
        return this.planIdActual;
    }

    public void setPlanIdActual( Integer planIdActual ) {
        this.planIdActual = planIdActual;
    }

    public String getAluDuplicado() {
        return this.aluDuplicado;
    }

    public void setAluDuplicado( String aluDuplicado ) {
        this.aluDuplicado = aluDuplicado;
    }

    public String getAluProcedencia() {
        return this.aluProcedencia;
    }

    public void setAluProcedencia( String aluProcedencia ) {
        this.aluProcedencia = aluProcedencia;
    }

    public String getAluPassword() {
        return this.aluPassword;
    }

    public void setAluPassword( String aluPassword ) {
        this.aluPassword = aluPassword;
    }

    public Integer getPosId() {
        return this.posId;
    }

    public void setPosId( Integer posId ) {
        this.posId = posId;
    }

    public String getAluFamiliar() {
        return this.aluFamiliar;
    }

    public void setAluFamiliar( String aluFamiliar ) {
        this.aluFamiliar = aluFamiliar;
    }

    public String getAluTipoFamiliar() {
        return this.aluTipoFamiliar;
    }

    public void setAluTipoFamiliar( String aluTipoFamiliar ) {
        this.aluTipoFamiliar = aluTipoFamiliar;
    }

    public String getAluFormaPago() {
        return this.aluFormaPago;
    }

    public void setAluFormaPago( String aluFormaPago ) {
        this.aluFormaPago = aluFormaPago;
    }

    public String getAluUnidad() {
        return this.aluUnidad;
    }

    public void setAluUnidad( String aluUnidad ) {
        this.aluUnidad = aluUnidad;
    }

    public Float getAluMontoPago() {
        return this.aluMontoPago;
    }

    public void setAluMontoPago( Float aluMontoPago ) {
        this.aluMontoPago = aluMontoPago;
    }

    public String getAluAppaternoBack() {
        return this.aluAppaternoBack;
    }

    public void setAluAppaternoBack( String aluAppaternoBack ) {
        this.aluAppaternoBack = aluAppaternoBack;
    }

    public String getAluApmaternoBack() {
        return this.aluApmaternoBack;
    }

    public void setAluApmaternoBack( String aluApmaternoBack ) {
        this.aluApmaternoBack = aluApmaternoBack;
    }

    public String getAluNombresBack() {
        return this.aluNombresBack;
    }

    public void setAluNombresBack( String aluNombresBack ) {
        this.aluNombresBack = aluNombresBack;
    }

    public String getAluProcedenciaBack() {
        return this.aluProcedenciaBack;
    }

    public void setAluProcedenciaBack( String aluProcedenciaBack ) {
        this.aluProcedenciaBack = aluProcedenciaBack;
    }

    public Set getAcNotas() {
        return this.acNotas;
    }

    public void setAcNotas( Set acNotas ) {
        this.acNotas = acNotas;
    }

    public Set getTbParentescos() {
        return this.tbParentescos;
    }

    public void setTbParentescos( Set tbParentescos ) {
        this.tbParentescos = tbParentescos;
    }

    public Set getAdSaldos() {
        return this.adSaldos;
    }

    public void setAdSaldos( Set adSaldos ) {
        this.adSaldos = adSaldos;
    }

    public Set getAcMatriculas() {
        return this.acMatriculas;
    }

    public void setAcMatriculas( Set acMatriculas ) {
        this.acMatriculas = acMatriculas;
    }

    public Set getAdAlumnoTarifas() {
        return adAlumnoTarifas;
    }

    public void setAdAlumnoTarifas( Set adAlumnoTarifas ) {
        this.adAlumnoTarifas = adAlumnoTarifas;
    }

    public Set getAcApoderadoAlumnos() {
        return this.acApoderadoAlumnos;
    }

    public void setAcApoderadoAlumnos( Set acApoderadoAlumnos ) {
        this.acApoderadoAlumnos = acApoderadoAlumnos;
    }

    public Set getAcAlumnoDocumentos() {
        return this.acAlumnoDocumentos;
    }

    public void setAcAlumnoDocumentos( Set acAlumnoDocumentos ) {
        this.acAlumnoDocumentos = acAlumnoDocumentos;
    }

    public Set getTbEvaluacionDatoses() {
        return this.tbEvaluacionDatoses;
    }

    public void setTbEvaluacionDatoses( Set tbEvaluacionDatoses ) {
        this.tbEvaluacionDatoses = tbEvaluacionDatoses;
    }

    public Set getAcAlumnoDatos() {
        return this.acAlumnoDatos;
    }

    public void setAcAlumnoDatos( Set acAlumnoDatos ) {
        this.acAlumnoDatos = acAlumnoDatos;
    }
}