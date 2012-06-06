/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.mapping.storedprocedures;

import java.io.Serializable;
import java.sql.Blob;
import org.hibernate.type.BlobType;

/**
 *
 * @author USUARIO
 */
public class SPCursosPorMatricular implements Serializable {

    private static final long serialVersionUID = 1L;
    private int m_iCurApeId;//curape_Id
    private int m_iAluId;//alu_id
    private int m_iCreditoApro;//credito_apro
    private int m_iDocumento;//documento
    private int m_iEspId;//esp_id
    private int m_iExaSufiI;//exasufiI
    private int m_iExaSufiO;//exasufiO
    private int m_iPlancurCredito;//plancur_credito
    private int m_iPlancurId;//plancur_id
    private Integer m_iPreRequisito;//prerequisito
    private int m_iPromedio;//promedio
    private int m_iRepitencia;//repitencia
    private double m_dDeuBibli;//deu_bibli
    private double m_dDeuLabo;//deu_labo
    private String m_sAluCodigo;//alu_codigo
    private String m_sAlumno;//alumno
    private String m_sAsignatura;//asignatura
    private String m_sCiclo;//ciclo
    private String m_sCompromiso;//compromiso
    private String m_sEspecialidad;//especialidad
    private String m_sFacultad;//facultad
    private String m_sFecha;//fecha
    private String m_sNivelExaSufiI;//nivelexasufiI
    private String m_sPlanCodigo;//plan_codigo;
    private String m_sPlancurCiclo;//plancur_ciclo
    private String m_sPlancurCodigo;//plancur_codigo
    private String m_sSemCompro;//sem_compro
    private String m_sTipo;//tipo
    private Blob m_blobAluFoto;//alu_foto

    public SPCursosPorMatricular() {
    }

    public SPCursosPorMatricular( int iCurApeId, int iAluId, int iCreditoApro, int iDocumento, int iEspId, int iExaSufiI,
            int iExaSufiO, int iPlancurCredito, int iPlancurId, Integer iPreRequisito, int iPromedio, int iRepitencia,
            double dDeuBibli, double dDeuLabo, String sAluCodigo, String sAlumno, String sAsignatura, String sCiclo,
            String sCompromiso, String sEspecialidad, String sFacultad, String sFecha, String sNivelExaSufiI,
            String sPlanCodigo, String sPlancurCiclo, String sPlancurCodigo, String sSemCompro, String sTipo, Blob blobAluFoto ) {
        m_iCurApeId = iCurApeId;
        m_iAluId = iAluId;
        m_iCreditoApro = iCreditoApro;
        m_iDocumento = iDocumento;
        m_iEspId = iEspId;
        m_iExaSufiI = iExaSufiI;
        m_iExaSufiO = iExaSufiO;
        m_iPlancurCredito = iPlancurCredito;
        m_iPlancurId = iPlancurId;
        m_iPreRequisito = iPreRequisito;
        m_iPromedio = iPromedio;
        m_iRepitencia = iRepitencia;
        m_dDeuBibli = dDeuBibli;
        m_dDeuLabo = dDeuLabo;
        m_sAluCodigo = sAluCodigo;
        m_sAlumno = sAlumno;
        m_sAsignatura = sAsignatura;
        m_sCiclo = sCiclo;
        m_sCompromiso = sCompromiso;
        m_sEspecialidad = sEspecialidad;
        m_sFacultad = sFacultad;
        m_sFecha = sFecha;
        m_sNivelExaSufiI = sNivelExaSufiI;
        m_sPlanCodigo = sPlanCodigo;
        m_sPlancurCiclo = sPlancurCiclo;
        m_sPlancurCodigo = sPlancurCodigo;
        m_sSemCompro = sSemCompro;
        m_sTipo = sTipo;
        m_blobAluFoto = blobAluFoto;
    }

    public int getCurApeId() {
        return m_iCurApeId;
    }

    public void setCurApeId( int iCurApeId ) {
        m_iCurApeId = iCurApeId;
    }

    public String getAluCodigo() {
        return m_sAluCodigo;
    }

    public void setAluCodigo( String aluCodigo ) {
        m_sAluCodigo = aluCodigo;
    }

    public Blob getAluFoto() {
        return m_blobAluFoto;
    }

    public void setAluFoto( Blob aluFoto ) {
        m_blobAluFoto = aluFoto;
    }

    public int getAluId() {
        return m_iAluId;
    }

    public void setAluId( int aluId ) {
        m_iAluId = aluId;
    }

    public String getAlumno() {
        return m_sAlumno;
    }

    public void setAlumno( String alumno ) {
        m_sAlumno = alumno;
    }

    public String getAsignatura() {
        return m_sAsignatura;
    }

    public void setAsignatura( String asignatura ) {
        m_sAsignatura = asignatura;
    }

    public String getCiclo() {
        return m_sCiclo;
    }

    public void setCiclo( String ciclo ) {
        m_sCiclo = ciclo;
    }

    public String getCompromiso() {
        return m_sCompromiso;
    }

    public void setCompromiso( String compromiso ) {
        m_sCompromiso = compromiso;
    }

    public int getCreditoApro() {
        return m_iCreditoApro;
    }

    public void setCreditoApro( int creditoApro ) {
        m_iCreditoApro = creditoApro;
    }

    public double getDeuBibli() {
        return m_dDeuBibli;
    }

    public void setDeuBibli( double deuBibli ) {
        m_dDeuBibli = deuBibli;
    }

    public double getDeuLabo() {
        return m_dDeuLabo;
    }

    public void setDeuLabo( double deuLabo ) {
        m_dDeuLabo = deuLabo;
    }

    public int getDocumento() {
        return m_iDocumento;
    }

    public void setDocumento( int documento ) {
        m_iDocumento = documento;
    }

    public int getEspId() {
        return m_iEspId;
    }

    public void setEspId( int espId ) {
        m_iEspId = espId;
    }

    public String getEspecialidad() {
        return m_sEspecialidad;
    }

    public void setEspecialidad( String especialidad ) {
        m_sEspecialidad = especialidad;
    }

    public int getExaSufiI() {
        return m_iExaSufiI;
    }

    public void setExaSufiI( int exaSufiI ) {
        m_iExaSufiI = exaSufiI;
    }

    public int getExaSufiO() {
        return m_iExaSufiO;
    }

    public void setExaSufiO( int exaSufiO ) {
        m_iExaSufiO = exaSufiO;
    }

    public String getFacultad() {
        return m_sFacultad;
    }

    public void setFacultad( String facultad ) {
        m_sFacultad = facultad;
    }

    public String getFecha() {
        return m_sFecha;
    }

    public void setFecha( String fecha ) {
        m_sFecha = fecha;
    }

    public String getNivelExaSufiI() {
        return m_sNivelExaSufiI;
    }

    public void setNivelExaSufiI( String nivelExaSufiI ) {
        m_sNivelExaSufiI = nivelExaSufiI;
    }

    public String getPlanCodigo() {
        return m_sPlanCodigo;
    }

    public void setPlanCodigo( String planCodigo ) {
        m_sPlanCodigo = planCodigo;
    }

    public String getPlancurCiclo() {
        return m_sPlancurCiclo;
    }

    public void setPlancurCiclo( String plancurCiclo ) {
        m_sPlancurCiclo = plancurCiclo;
    }

    public String getPlancurCodigo() {
        return m_sPlancurCodigo;
    }

    public void setPlancurCodigo( String plancurCodigo ) {
        m_sPlancurCodigo = plancurCodigo;
    }

    public int getPlancurCredito() {
        return m_iPlancurCredito;
    }

    public void setPlancurCredito( int plancurCredito ) {
        m_iPlancurCredito = plancurCredito;
    }

    public int getPlancurId() {
        return m_iPlancurId;
    }

    public void setPlancurId( int plancurId ) {
        m_iPlancurId = plancurId;
    }

    public Integer getPreRequisito() {
        return m_iPreRequisito;
    }

    public void setPreRequisito( Integer preRequisito ) {
        m_iPreRequisito = preRequisito;
    }

    public int getPromedio() {
        return m_iPromedio;
    }

    public void setPromedio( int promedio ) {
        m_iPromedio = promedio;
    }

    public int getRepitencia() {
        return m_iRepitencia;
    }

    public void setRepitencia( int repitencia ) {
        m_iRepitencia = repitencia;
    }

    public String getSemCompro() {
        return m_sSemCompro;
    }

    public void setSemCompro( String semCompro ) {
        m_sSemCompro = semCompro;
    }

    public String getTipo() {
        return m_sTipo;
    }

    public void setTipo( String tipo ) {
        m_sTipo = tipo;
    }
}
