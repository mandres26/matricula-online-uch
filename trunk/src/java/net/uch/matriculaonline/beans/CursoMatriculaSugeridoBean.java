/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class CursoMatriculaSugeridoBean {

    private int m_iCreditos;
    private int m_iCursoId;
    private String m_sCodCurso;
    private String m_sNomCursoSugerido;
    private String m_sCiclo;
    private String m_sTipoCurso;
    private String m_sEstado;
    private List<SeccionBean> m_lstSecciones;

    public CursoMatriculaSugeridoBean() {
    }

    public CursoMatriculaSugeridoBean( int iCursoId, String sCodCurso, String sNomCursoSugerido, int iCreditos, String sCiclo,
            String sTipoCurso, String sEstado ) {
        m_iCursoId = iCursoId;
        m_sCodCurso = sCodCurso;
        m_sNomCursoSugerido = sNomCursoSugerido;
        m_iCreditos = iCreditos;
        m_sCiclo = sCiclo;
        m_sTipoCurso = sTipoCurso;
        m_sEstado = sEstado;

        m_lstSecciones = new ArrayList<SeccionBean>();
//        m_lstSecciones.add( new SeccionBean( "Seccion de Prueba de " + sCodCurso, 0 ) );
    }

    public int getCursoId() {
        return m_iCursoId;
    }

    public void setCursoId( int iCursoId ) {
        m_iCursoId = iCursoId;
    }

    public String getCodCurso() {
        return m_sCodCurso;
    }

    public void setCodCurso( String sCodCurso ) {
        m_sCodCurso = sCodCurso;
    }

    public int getCreditos() {
        return m_iCreditos;
    }

    public void setCreditos( int iCreditos ) {
        m_iCreditos = iCreditos;
    }

    public String getCiclo() {
        return m_sCiclo;
    }

    public void setCiclo( String sCiclo ) {
        m_sCiclo = sCiclo;
    }

    public String getEstado() {
        return m_sEstado;
    }

    public void setEstado( String sEstado ) {
        m_sEstado = sEstado;
    }

    public String getNomCursoSugerido() {
        return m_sNomCursoSugerido;
    }

    public void setNomCursoSugerido( String sNomCursoSugerido ) {
        m_sNomCursoSugerido = sNomCursoSugerido;
    }

    public String getTipoCurso() {
        return m_sTipoCurso;
    }

    public void setTipoCurso( String sTipoCurso ) {
        m_sTipoCurso = sTipoCurso;
    }

    public List<SeccionBean> getLstSecciones() {
        return m_lstSecciones;
    }

    public void setLstSecciones( List<SeccionBean> lstSecciones ) {
        m_lstSecciones = lstSecciones;
    }
}
