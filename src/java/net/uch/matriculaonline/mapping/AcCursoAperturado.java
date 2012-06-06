package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AcCursoAperturado entity.
 *
 * @author MyEclipse Persistence Tools
 */
public class AcCursoAperturado implements java.io.Serializable {

    // Fields
    private Integer curapeId;
    private AcPlanCurso acPlanCurso;
    private AcSemestre acSemestre;
    private String curapeCodigo;
    private Integer sisevaId;
    private Date curapeCreacion;
    private String curapeAperturado;
    private String curapeActivo;
    private Set acSeccions = new HashSet( 0 );
    private Set<AcSisEvaPersonalizado> m_acSisEvaPersonalizados = new HashSet( 0 );

    // Constructors
    /**
     * default constructor
     */
    public AcCursoAperturado() {
    }

    /**
     * minimal constructor
     */
    public AcCursoAperturado( Integer curapeId, AcSemestre acSemestre ) {
        this.curapeId = curapeId;
        this.acSemestre = acSemestre;
    }

    /**
     * full constructor
     */
    public AcCursoAperturado( Integer curapeId, AcPlanCurso acPlanCurso,
            AcSemestre acSemestre, String curapeCodigo, Integer sisevaId,
            Date curapeCreacion, String curapeAperturado, String curapeActivo,
            Set acSeccions, Set acSisEvaPersonalizados ) {
        this.curapeId = curapeId;
        this.acPlanCurso = acPlanCurso;
        this.acSemestre = acSemestre;
        this.curapeCodigo = curapeCodigo;
        this.sisevaId = sisevaId;
        this.curapeCreacion = curapeCreacion;
        this.curapeAperturado = curapeAperturado;
        this.curapeActivo = curapeActivo;
        this.acSeccions = acSeccions;
        this.m_acSisEvaPersonalizados = acSisEvaPersonalizados;
    }

    // Property accessors
    public Integer getCurapeId() {
        return this.curapeId;
    }

    public void setCurapeId( Integer curapeId ) {
        this.curapeId = curapeId;
    }

    public AcPlanCurso getAcPlanCurso() {
        return this.acPlanCurso;
    }

    public void setAcPlanCurso( AcPlanCurso acPlanCurso ) {
        this.acPlanCurso = acPlanCurso;
    }

    public AcSemestre getAcSemestre() {
        return this.acSemestre;
    }

    public void setAcSemestre( AcSemestre acSemestre ) {
        this.acSemestre = acSemestre;
    }

    public String getCurapeCodigo() {
        return this.curapeCodigo;
    }

    public void setCurapeCodigo( String curapeCodigo ) {
        this.curapeCodigo = curapeCodigo;
    }

    public Integer getSisevaId() {
        return this.sisevaId;
    }

    public void setSisevaId( Integer sisevaId ) {
        this.sisevaId = sisevaId;
    }

    public Date getCurapeCreacion() {
        return this.curapeCreacion;
    }

    public void setCurapeCreacion( Date curapeCreacion ) {
        this.curapeCreacion = curapeCreacion;
    }

    public String getCurapeAperturado() {
        return this.curapeAperturado;
    }

    public void setCurapeAperturado( String curapeAperturado ) {
        this.curapeAperturado = curapeAperturado;
    }

    public String getCurapeActivo() {
        return this.curapeActivo;
    }

    public void setCurapeActivo( String curapeActivo ) {
        this.curapeActivo = curapeActivo;
    }

    public Set getAcSeccions() {
        return this.acSeccions;
    }

    public void setAcSeccions( Set acSeccions ) {
        this.acSeccions = acSeccions;
    }
    public Set getAcSisEvaPersonalizados() {
        return m_acSisEvaPersonalizados;
    }

    public void setAcSisEvaPersonalizados( Set acSisEvaPersonalizados ) {
        m_acSisEvaPersonalizados = acSisEvaPersonalizados;
    }
}