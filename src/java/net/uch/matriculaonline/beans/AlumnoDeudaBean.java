/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.beans;

/**
 *
 * @author USUARIO
 */
public class AlumnoDeudaBean {

    private int m_iNumOrden;
    private String m_sDescripcion;
    private String m_sTipo;
    private String m_sObservacion;

    public AlumnoDeudaBean() {
    }

    public AlumnoDeudaBean( int iNumOrden, String sDescripcion, String sTipo, String sObservacion ) {
        this.m_iNumOrden = iNumOrden;
        this.m_sDescripcion = sDescripcion;
        this.m_sTipo = sTipo;
        this.m_sObservacion = sObservacion;
    }

    public int getNumOrden() {
        return m_iNumOrden;
    }

    public void setNumOrden( int iNumOrden ) {
        this.m_iNumOrden = iNumOrden;
    }

    public String getDescripcion() {
        return m_sDescripcion;
    }

    public void setDescripcion( String sDescripcion ) {
        this.m_sDescripcion = sDescripcion;
    }

    public String getObservacion() {
        return m_sObservacion;
    }

    public void setObservacion( String sObservacion ) {
        this.m_sObservacion = sObservacion;
    }

    public String getTipo() {
        return m_sTipo;
    }

    public void setTipo( String sTipo ) {
        this.m_sTipo = sTipo;
    }
}
