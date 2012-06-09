/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.beans;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class MatriculasDetalleBean {

    private int m_iMaxCredPerm = 50;
    private int m_iTotalCredMatr;
    private int m_iNumCurMat;
    private double m_dCostoCalculado;
    private String m_sFechaMatricula;
    private String m_sDetalleCosto;

    public MatriculasDetalleBean() {
    }

    public MatriculasDetalleBean( int iTotalCredMatr, int iNumCurMat ) {
        m_iTotalCredMatr = iTotalCredMatr;
        m_iNumCurMat = iNumCurMat;
    }

    public int getMaxCredPerm() {
        return m_iMaxCredPerm;
    }

    public void setMaxCredPerm( int iMaxCredPerm ) {
        m_iMaxCredPerm = iMaxCredPerm;
    }

    public int getNumCurMat() {
        return m_iNumCurMat;
    }

    public void setNumCurMat( int iNumCurMat ) {
        m_iNumCurMat = iNumCurMat;
    }

    public int getTotalCredMatr() {
        return m_iTotalCredMatr;
    }

    public void setTotalCredMatr( int iTotalCredMatr ) {
        m_iTotalCredMatr = iTotalCredMatr;
    }

    public String getFechaMatricula() {
        DateFormat dateFormat = new SimpleDateFormat( "yyyy/MM/dd" );
        Date date = new Date();
        m_sFechaMatricula = dateFormat.format( date );
        return m_sFechaMatricula;
    }

    public void setFechaMatricula( String sFechaMatricula ) {
        m_sFechaMatricula = sFechaMatricula;
    }

    public double getCostoCalculado() {
        return m_dCostoCalculado;
    }

    public void setCostoCalculado( double dCostoCalculado ) {
        this.m_dCostoCalculado = dCostoCalculado;
    }

    public String getDetalleCosto() {
        return m_sDetalleCosto;
    }

    public void setDetalleCosto( String sDetalleCosto ) {
        this.m_sDetalleCosto = sDetalleCosto;
    }
}
