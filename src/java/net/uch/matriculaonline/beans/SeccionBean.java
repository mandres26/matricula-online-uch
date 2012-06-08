/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import net.uch.matriculaonline.commonService.ServiceFinder;
import net.uch.matriculaonline.hibernateSpringDao.HSMatriculaDAO;
import net.uch.matriculaonline.mapping.storedprocedures.SPHorariosPorCursoYSeccion;
import net.uch.matriculaonline.util.ConstantesWeb;

/**
 *
 * @author USUARIO
 */
public class SeccionBean {

    private int m_iCurapeId;
    private int m_iMatriculados;
    private int m_iSecId;
    private int m_iVacantes;
    private String m_sNomSeccion;
    private StringBuilder m_sHorario;

    public SeccionBean() {
    }

    public SeccionBean( int iSecId, int iCurapeId, String sNomSeccion, int iVacantes, int iMatriculados ) {
        m_iCurapeId = iCurapeId;
        m_iSecId = iSecId;
        m_iVacantes = iVacantes;
        m_iMatriculados = iMatriculados;
        m_sNomSeccion = sNomSeccion;
    }

    public int getCurapeId() {
        return m_iCurapeId;
    }

    public void setCurapeId( int iCurapeId ) {
        m_iCurapeId = iCurapeId;
    }

    public int getSecId() {
        return m_iSecId;
    }

    public void setSecId( int iSecId ) {
        m_iSecId = iSecId;
    }

    public int getVacantes() {
        return m_iVacantes;
    }

    public int getMatriculados() {
        return m_iMatriculados;
    }

    public void setMatriculados( int iMatriculados ) {
        m_iMatriculados = iMatriculados;
    }

    public void setVacantes( int iVacantes ) {
        m_iVacantes = iVacantes;
    }

    public StringBuilder getHorario() {
        return m_sHorario;
    }

    public void setHorario( StringBuilder sHorario ) {
        m_sHorario = sHorario;
    }

    public String getNomSeccion() {
        return m_sNomSeccion;
    }

    public void setNomSeccion( String sNomSeccion ) {
        m_sNomSeccion = sNomSeccion;
    }

    public void generarHorarios() {
        boolean blFlag = true;
        String sNL;
        TreeMap<String, String> tmHorario;
        tmHorario = armarHorarios( m_iCurapeId, m_iSecId );
        if ( !tmHorario.isEmpty() ) {
            m_sHorario = new StringBuilder();
            String sHor;
            for ( String sKeyDia : tmHorario.keySet() ) {
                sNL = blFlag ? "" : "<br />";
                sHor = tmHorario.get( sKeyDia );
                m_sHorario.append( sNL );
                m_sHorario.append( sKeyDia );
                m_sHorario.append( " : <br />" );
                m_sHorario.append( sHor.substring( 0, 5 ) );
                m_sHorario.append( " - " );
                m_sHorario.append( sHor.substring( sHor.length() - 5 ) );
                blFlag = false;
            }
        } else {
            m_sHorario = new StringBuilder();
        }
    }

    public static TreeMap<String, String> armarHorarios( int iCurApeId, int iSecId ) {
        int iSizeHor;
        String sEspacio;
        String[] asDias = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado" };
        SPHorariosPorCursoYSeccion horario;
//        HSMatriculaDAO matriculaDAO;
        List<SPHorariosPorCursoYSeccion> lstHorariosXCyS;
        TreeMap<String, String> tmHorario = new TreeMap<String, String>();;
        if ( iSecId != 0 && iCurApeId != 0 ) {
//            matriculaDAO = (HSMatriculaDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_MATRICULA );
//            lstHorariosXCyS = matriculaDAO.seleccionarHorariosPorCurapeIdYSecId( iCurApeId, iSecId );
            lstHorariosXCyS = traerHorarioPorCurApeYSec( iCurApeId, iSecId );
            if ( lstHorariosXCyS != null && !lstHorariosXCyS.isEmpty() ) {
                iSizeHor = lstHorariosXCyS.size();
                for ( int i = 0; i < iSizeHor; i++ ) {
                    horario = lstHorariosXCyS.get( i );
                    for ( String sDia : asDias ) {
                        if ( !horario.getNomDia( sDia ).isEmpty() ) {
                            if ( tmHorario.get( sDia ) == null ) {
                                tmHorario.put( sDia, "" );
                                sEspacio = "";
                            } else {
                                sEspacio = "<br />";
                            }
                            tmHorario.put( sDia, tmHorario.get( sDia ) + sEspacio + horario.getHora() );
                        }
                    }
                }
            }
        }
        return tmHorario;
    }

    public static List<SPHorariosPorCursoYSeccion> traerHorarioPorCurApeYSec( int iCurApeId, int iSecId ) {
        HSMatriculaDAO matriculaDAO;
        List<SPHorariosPorCursoYSeccion> lstHorariosXCyS = new ArrayList<SPHorariosPorCursoYSeccion>();

        try {
            matriculaDAO = (HSMatriculaDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_MATRICULA );
            lstHorariosXCyS = matriculaDAO.seleccionarHorariosPorCurapeIdYSecId( iCurApeId, iSecId );
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }

        return lstHorariosXCyS;
    }
}
