/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.beans;

/**
 *
 * @author USUARIO
 */
public class AlumnoBean {

    private int m_iOrden;
    private int m_iAluId;
    private String m_sCodigo;
    private String m_sNomCompleto;
    private String m_sNombre;
    private String m_sApePaterno;
    private String m_sApeMaterno;

    public AlumnoBean() {
    }

    public AlumnoBean( int iOrden, int iAluId, String sCodigo, String sNomCompleto, String sNombre, String sApePaterno, String sApeMaterno ) {
        this.m_iOrden = iOrden;
        this.m_iAluId = iAluId;
        this.m_sCodigo = sCodigo;
        this.m_sNomCompleto = sNomCompleto;
        this.m_sNombre = sNombre;
        this.m_sApePaterno = sApePaterno;
        this.m_sApeMaterno = sApeMaterno;
    }

    public int getAluId() {
        return m_iAluId;
    }

    public void setAluId( int iAluId ) {
        this.m_iAluId = iAluId;
    }

    public int getOrden() {
        return m_iOrden;
    }

    public void setOrden( int iOrden ) {
        this.m_iOrden = iOrden;
    }

    public String getApeMaterno() {
        return m_sApeMaterno;
    }

    public void setApeMaterno( String sApeMaterno ) {
        this.m_sApeMaterno = sApeMaterno;
    }

    public String getApePaterno() {
        return m_sApePaterno;
    }

    public void setApePaterno( String sApePaterno ) {
        this.m_sApePaterno = sApePaterno;
    }

    public String getCodigo() {
        return m_sCodigo;
    }

    public void setCodigo( String sCodigo ) {
        this.m_sCodigo = sCodigo;
    }

    public String getNomCompleto() {
        return m_sNomCompleto;
    }

    public void setNomCompleto( String sNomCompleto ) {
        this.m_sNomCompleto = sNomCompleto;
    }

    public String getNombre() {
        return m_sNombre;
    }

    public void setNombre( String sNombre ) {
        this.m_sNombre = sNombre;
    }
}
