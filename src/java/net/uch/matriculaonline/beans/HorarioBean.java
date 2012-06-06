/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.beans;

/**
 *
 * @author USUARIO
 */
public class HorarioBean {

    private String m_sHoraIni;
    private String m_sHoraFin;
    private String m_sCurLun;
    private String m_sCurMar;
    private String m_sCurMie;
    private String m_sCurJue;
    private String m_sCurVie;
    private String m_sCurSab;
    private String m_sCurDom;

    public HorarioBean() {
    }

    public HorarioBean( String sHoraIni, String sHoraFin, String sCurLun, String sCurMar,
            String sCurMie, String sCurJue, String sCurVie, String sCurSab, String sCurDom ) {
        m_sHoraIni = sHoraIni;
        m_sHoraFin = sHoraFin;
        m_sCurLun = sCurLun;
        m_sCurMar = sCurMar;
        m_sCurMie = sCurMie;
        m_sCurJue = sCurJue;
        m_sCurVie = sCurVie;
        m_sCurSab = sCurSab;
        m_sCurDom = sCurDom;
    }

    public String getCurDom() {
        return m_sCurDom;
    }

    public void setCurDom( String sCurDom ) {
        m_sCurDom = sCurDom;
    }

    public String getCurJue() {
        return m_sCurJue;
    }

    public void setCurJue( String sCurJue ) {
        m_sCurJue = sCurJue;
    }

    public String getCurLun() {
        return m_sCurLun;
    }

    public void setCurLun( String sCurLun ) {
        m_sCurLun = sCurLun;
    }

    public String getCurMar() {
        return m_sCurMar;
    }

    public void setCurMar( String sCurMar ) {
        m_sCurMar = sCurMar;
    }

    public String getCurMie() {
        return m_sCurMie;
    }

    public void setCurMie( String sCurMie ) {
        m_sCurMie = sCurMie;
    }

    public String getCurSab() {
        return m_sCurSab;
    }

    public void setCurSab( String sCurSab ) {
        m_sCurSab = sCurSab;
    }

    public String getCurVie() {
        return m_sCurVie;
    }

    public void setCurVie( String sCurVie ) {
        m_sCurVie = sCurVie;
    }

    public String getHoraFin() {
        return m_sHoraFin;
    }

    public void setHoraFin( String sHoraFin ) {
        m_sHoraFin = sHoraFin;
    }

    public String getHoraIni() {
        return m_sHoraIni;
    }

    public void setHoraIni( String sHoraIni ) {
        m_sHoraIni = sHoraIni;
    }
}
