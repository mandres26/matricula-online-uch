/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.beans;

import java.util.HashMap;
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

//    public void generarHorarios() {
//        int iSizeHor;
//        String sEspacio;
//        SPHorariosPorCursoYSeccion horario;
//        HSMatriculaDAO matriculaDAO;
//        List<SPHorariosPorCursoYSeccion> lstHorariosXCyS;
//        Map<String, String> hmHorario;
//        if ( m_iSecId != 0 && m_iCurapeId != 0 ) {
//            matriculaDAO = (HSMatriculaDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_MATRICULA );
//
//            lstHorariosXCyS = matriculaDAO.seleccionarHorariosPorCurapeIdYSecId( m_iCurapeId, m_iSecId );
//            if ( lstHorariosXCyS != null && !lstHorariosXCyS.isEmpty() ) {
//                iSizeHor = lstHorariosXCyS.size();
//                hmHorario = new HashMap<String, String>();
//                for ( int i = 0; i < iSizeHor; i++ ) {
//                    horario = lstHorariosXCyS.get( i );
//                    if ( !horario.getLunes().isEmpty() ) {
//                        if ( !hmHorario.containsKey( "lunes" ) ) {
//                            hmHorario.put( "lunes", "" );
//                            sEspacio = "";
//                        } else {
//                            sEspacio = "<br />";
//                        }
//                        hmHorario.put( "lunes", hmHorario.get( "lunes" ) + sEspacio + horario.getHora() );
//                    }
//                    if ( !horario.getMartes().isEmpty() ) {
//                        if ( !hmHorario.containsKey( "martes" ) ) {
//                            hmHorario.put( "martes", "" );
//                            sEspacio = "";
//                        } else {
//                            sEspacio = "<br />";
//                        }
//                        hmHorario.put( "martes", hmHorario.get( "martes" ) + sEspacio + horario.getHora() );
//                    }
//                    if ( !horario.getMiercoles().isEmpty() ) {
//                        if ( !hmHorario.containsKey( "miercoles" ) ) {
//                            hmHorario.put( "miercoles", "" );
//                            sEspacio = "";
//                        } else {
//                            sEspacio = "<br />";
//                        }
//                        hmHorario.put( "miercoles", hmHorario.get( "miercoles" ) + sEspacio + horario.getHora() );
//                    }
//                    if ( !horario.getJueves().isEmpty() ) {
//                        if ( !hmHorario.containsKey( "jueves" ) ) {
//                            hmHorario.put( "jueves", "" );
//                            sEspacio = "";
//                        } else {
//                            sEspacio = "<br />";
//                        }
//                        hmHorario.put( "jueves", hmHorario.get( "jueves" ) + sEspacio + horario.getHora() );
//                    }
//                    if ( !horario.getViernes().isEmpty() ) {
//                        if ( !hmHorario.containsKey( "viernes" ) ) {
//                            hmHorario.put( "viernes", "" );
//                            sEspacio = "";
//                        } else {
//                            sEspacio = "<br />";
//                        }
//                        hmHorario.put( "viernes", hmHorario.get( "viernes" ) + sEspacio + horario.getHora() );
//                    }
//                    if ( !horario.getSabado().isEmpty() ) {
//                        if ( !hmHorario.containsKey( "sabado" ) ) {
//                            hmHorario.put( "sabado", "" );
//                            sEspacio = "";
//                        } else {
//                            sEspacio = "<br />";
//                        }
//                        hmHorario.put( "sabado", hmHorario.get( "sabado" ) + sEspacio + horario.getHora() );
//                    }
//                }
//                m_sHorario = new StringBuilder();
//                for ( String sKeyDia : hmHorario.keySet() ) {
//                    m_sHorario.append( sKeyDia );
//                    m_sHorario.append( " : " );
//                    m_sHorario.append( hmHorario.get( sKeyDia ) );
//
//                }
////                horario = 
////                hmHorario.put( m_sNomSeccion, m_sNomSeccion )
//            }
//        } else {
//            m_sHorario = new StringBuilder();
//        }
//    }
    public void generarHorarios() {
        int iSizeHor;
        String sEspacio;
        String sHIni = "";
        String sHFin = "";
        String sBRDia;
        String[] asHora;
        String[] asDias = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado" };
        SPHorariosPorCursoYSeccion horario;
        SPHorariosPorCursoYSeccion horarioAux;
        HSMatriculaDAO matriculaDAO;
        List<SPHorariosPorCursoYSeccion> lstHorariosXCyS;
        TreeMap<String, String> tmHorario;
        if ( m_iSecId != 0 && m_iCurapeId != 0 ) {
            matriculaDAO = (HSMatriculaDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_MATRICULA );

            lstHorariosXCyS = matriculaDAO.seleccionarHorariosPorCurapeIdYSecId( m_iCurapeId, m_iSecId );
            if ( lstHorariosXCyS != null && !lstHorariosXCyS.isEmpty() ) {
                iSizeHor = lstHorariosXCyS.size();
                tmHorario = new TreeMap<String, String>();
                System.out.println( "ID\t\tHORA\t\tHINI\t\tHFIN\t\tLUNES\t\tMARTES\t\tMIERC\t\tJUEV\t\tVIER\t\tSABA" );
                for ( int i = 0; i < iSizeHor; i++ ) {
                    horario = lstHorariosXCyS.get( i );
                        
                        System.out.println(
                                horario.getHorId() + " \t\t "
                                + horario.getHora() + " \t\t "
                                + horario.getHIni() + " \t\t "
                                + horario.getHFin() + " \t\t Lu"
                                + horario.getLunes() + " \t\t Ma"
                                + horario.getMartes() + " \t\t Mi"
                                + horario.getMiercoles() + " \t\t Ju"
                                + horario.getJueves() + " \t\t Vi"
                                + horario.getViernes() + " \t\t Sa"
                                + horario.getSabado() );
                }
                for ( String sDia : asDias ) {
                    for ( int i = 0; i < iSizeHor; i++ ) {
                        horario = lstHorariosXCyS.get( i );
                        if ( !horario.getNomDia( sDia ).isEmpty() ) {
//                            if ( !tmHorario.containsKey( sDia ) ) {
//                                tmHorario.put( sDia, "" );
//                                sEspacio = "";
//                            } else {
//                                sEspacio = "<br />";
//                            }
//                            sHIni = horario.getHIni().trim();
//                            sHFin = horario.getHFin().trim();
//                            if ( i == 0 ) {
////                                asHora = horario.getHora().split( "-" );
////                                sHIni = asHora[0].trim();
//                            } else {
//                                horarioAux = lstHorariosXCyS.get( i - 1 );
//                                sHFin = horarioAux.getHFin().trim();
//                                if ( sHFin.equals( sHIni ) && (i + 1) != lstHorariosXCyS.size() ) {
//                                    continue;
//                                }
//                            }
                            if ( i == 0 ) {
                                sHIni = horario.getHIni();
                            } else if ( i + 1 == lstHorariosXCyS.size() ) {
                                sHFin = horario.getHFin();
                            } else {
                                continue;
                            }
                            tmHorario.put( sDia, sHIni + "-" + sHFin );
                        }
                    }
                }
                m_sHorario = new StringBuilder();
                int i = 0;
                for ( String sKeyDia : tmHorario.keySet() ) {
                    sBRDia = (i > 0) ? "<br />" : "";
                    m_sHorario.append( sBRDia );
                    m_sHorario.append( sKeyDia );
                    m_sHorario.append( " : " );
                    m_sHorario.append( tmHorario.get( sKeyDia ) );
                    i++;
                }
            }
        } else {
            m_sHorario = new StringBuilder();
        }
    }
}
