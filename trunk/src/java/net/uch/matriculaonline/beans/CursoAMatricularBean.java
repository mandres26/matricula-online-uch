/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.beans;

/**
 *
 * @author USUARIO
 */
public class CursoAMatricularBean {

    private static final long serialVersionUID = 1L;
    private int m_iCurApeId;
    private int m_iSecId;
    private String m_sCreditos;
    private String m_sCiclo;
    private String m_sCurApeCodigo;
    private String m_sCurApeNombre;
    private String m_sHorario;
    private String m_sTipoCurso;
    private String m_sSecCodigo;

    public CursoAMatricularBean() {
    }

    public CursoAMatricularBean( int iCurApeId, int iSecId, String sCreditos,
            String sCiclo, String sCurApeCodigo, String sCurApeNombre,
            String sHorario, String sTipoCurso, String sSecCodigo ) {
        m_iCurApeId = iCurApeId;
        m_iSecId = iSecId;
        m_sCreditos = sCreditos;
        m_sCiclo = sCiclo;
        m_sCurApeCodigo = sCurApeCodigo;
        m_sCurApeNombre = sCurApeNombre;
        m_sHorario = sHorario;
        m_sTipoCurso = sTipoCurso;
        m_sSecCodigo = sSecCodigo;
    }

    public String getCreditos() {
        return m_sCreditos;
    }

    public void setCreditos( String sCreditos ) {
        m_sCreditos = sCreditos;
    }

    public int getCurApeId() {
        return m_iCurApeId;
    }

    public void setCurApeId( int iCurApeId ) {
        m_iCurApeId = iCurApeId;
    }

    public int getSecId() {
        return m_iSecId;
    }

    public void setSecId( int iSecId ) {
        m_iSecId = iSecId;
    }

    public String getCiclo() {
        return m_sCiclo;
    }

    public void setCiclo( String sCiclo ) {
        m_sCiclo = sCiclo;
    }

    public String getCurApeCodigo() {
        return m_sCurApeCodigo;
    }

    public void setCurApeCodigo( String sCurApeCodigo ) {
        m_sCurApeCodigo = sCurApeCodigo;
    }

    public String getCurApeNombre() {
        return m_sCurApeNombre;
    }

    public void setCurApeNombre( String sCurApeNombre ) {
        m_sCurApeNombre = sCurApeNombre;
    }

    public String getHorario() {
        return m_sHorario;
    }

    public void setHorario( String sHorario ) {
        m_sHorario = sHorario;
    }

    public String getSecCodigo() {
        return m_sSecCodigo;
    }

    public void setSecCodigo( String sSecCodigo ) {
        m_sSecCodigo = sSecCodigo;
    }

    public String getTipoCurso() {
        return m_sTipoCurso;
    }

    public void setTipoCurso( String sTipoCurso ) {
        m_sTipoCurso = sTipoCurso;
    }
}
