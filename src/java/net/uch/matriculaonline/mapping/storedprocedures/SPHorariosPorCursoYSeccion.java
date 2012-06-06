/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.mapping.storedprocedures;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class SPHorariosPorCursoYSeccion implements Serializable {

    private int m_iHorId;//" column="hor_Id"/>
    private String m_sHIni;//" column="hini"/>
    private String m_sHFin;//" column="hfin"/>
    private String m_sHora;//" column="hora"/>
    private String m_sLunes;//" column="lunes"/>
    private String m_sMartes;//" column="martes"/>
    private String m_sMiercoles;//" column="miercoles"/>
    private String m_sJueves;//" column="jueves"/>
    private String m_sViernes;//" column="viernes"/>
    private String m_sSabado;//" column="sabado"/>

    public SPHorariosPorCursoYSeccion() {
    }

    public SPHorariosPorCursoYSeccion( int iHorId, String sHIni, String sHFin, String sHora, String sLunes, String sMartes,
            String sMiercoles, String sJueves, String sViernes, String sSabado ) {
        m_iHorId = iHorId;
        m_sHIni = sHIni;
        m_sHFin = sHFin;
        m_sHora = sHora;
        m_sLunes = sLunes;
        m_sMartes = sMartes;
        m_sMiercoles = sMiercoles;
        m_sJueves = sJueves;
        m_sViernes = sViernes;
        m_sSabado = sSabado;
    }

    public int getHorId() {
        return m_iHorId;
    }

    public void setHorId( int iHorId ) {
        m_iHorId = iHorId;
    }

    public String getHIni() {
        return m_sHIni;
    }

    public void setHIni( String sHIni ) {
        m_sHIni = sHIni;
    }

    public String getHFin() {
        return m_sHFin;
    }

    public void setHFin( String sHFin ) {
        m_sHFin = sHFin;
    }

    public String getHora() {
        return m_sHora;
    }

    public void setHora( String sHora ) {
        m_sHora = sHora;
    }

    public String getJueves() {
        return m_sJueves;
    }

    public void setJueves( String sJueves ) {
        m_sJueves = sJueves;
    }

    public String getLunes() {
        return m_sLunes;
    }

    public void setLunes( String sLunes ) {
        m_sLunes = sLunes;
    }

    public String getMartes() {
        return m_sMartes;
    }

    public void setMartes( String sMartes ) {
        m_sMartes = sMartes;
    }

    public String getMiercoles() {
        return m_sMiercoles;
    }

    public void setMiercoles( String sMiercoles ) {
        m_sMiercoles = sMiercoles;
    }

    public String getSabado() {
        return m_sSabado;
    }

    public void setSabado( String sSabado ) {
        m_sSabado = sSabado;
    }

    public String getViernes() {
        return m_sViernes;
    }

    public void setViernes( String sViernes ) {
        m_sViernes = sViernes;
    }

    public String getNomDia( String sDia ) {
        String sRetDia = "";
        if ( "lunes".equals( sDia.trim() ) ) {
            sRetDia = m_sLunes;
        } else if ( "martes".equals( sDia.trim() ) ) {
            sRetDia = m_sMartes;
        } else if ( "miercoles".equals( sDia.trim() ) ) {
            sRetDia = m_sMiercoles;
        } else if ( "jueves".equals( sDia.trim() ) ) {
            sRetDia = m_sJueves;
        } else if ( "viernes".equals( sDia.trim() ) ) {
            sRetDia = m_sViernes;
        } else if ( "sabado".equals( sDia.trim() ) ) {
            sRetDia = m_sSabado;
        }
        return sRetDia;
    }
}
