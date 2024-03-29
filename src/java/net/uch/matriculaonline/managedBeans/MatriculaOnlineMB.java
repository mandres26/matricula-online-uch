/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.managedBeans;

import java.util.*;
import javax.faces.event.ActionEvent;
import net.uch.matriculaonline.beans.CursoAMatricularBean;
import net.uch.matriculaonline.beans.HorarioBean;
import net.uch.matriculaonline.beans.MatriculasDetalleBean;
import net.uch.matriculaonline.beans.SeccionBean;
import net.uch.matriculaonline.commonService.ServiceFinder;
import net.uch.matriculaonline.hibernateSpringDao.HSCursoAperturadoDAO;
import net.uch.matriculaonline.hibernateSpringDao.HSMatriculaDAO;
import net.uch.matriculaonline.hibernateSpringDao.HSSeccionDAO;
import net.uch.matriculaonline.mapping.*;
import net.uch.matriculaonline.mapping.storedprocedures.SPCursosPorMatricular;
import net.uch.matriculaonline.mapping.storedprocedures.SPHorariosPorCursoYSeccion;
import net.uch.matriculaonline.util.CommonWeb;
import net.uch.matriculaonline.util.ConstantesWeb;

/**
 *
 * @author USUARIO
 */
public class MatriculaOnlineMB {

    private int m_iCurSugerido;
    private int m_iMaxCred;
    private AcAlumno m_alumno;
    private HSMatriculaDAO m_matriculaDAO;
    private List<SPCursosPorMatricular> m_lstCursosSugeridos;
    private List<CursoAMatricularBean> m_lstCursosMatriculados;
    private List<HorarioBean> m_lstHorarios;
    private List<AcAlumno> m_lstAlumnosMatriculados;
    private List<SeccionBean> m_lstSecciones;
    private List<MatriculasDetalleBean> m_lstMatDetalle;
    private Map<String, String> m_hmCiclosConCurPend;
    private TreeMap<String, HorarioBean> m_tmHorarios;
    private TreeMap<String/*
             * hora
             */, TreeMap<String/*
             * dia
             */, String>> m_tmHorariosEstruc;

    /**
     * Creates a new instance of MatriculaOnlineMB
     */
    public MatriculaOnlineMB() {
        m_alumno = CommonWeb.traerAlumnoLogeado();
        m_matriculaDAO = (HSMatriculaDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_MATRICULA );
        m_lstCursosSugeridos = m_matriculaDAO.seleccionarCursosPorMatricular( m_alumno.getAluId() );
        if ( m_lstCursosSugeridos == null ) {
            m_lstCursosSugeridos = new ArrayList<SPCursosPorMatricular>();
        }

        //Lista de ciclos con cursos pendientes
        m_hmCiclosConCurPend = new HashMap<String, String>();
        String sCiclo;
        AcCursoAperturado curApe;
        
        for ( SPCursosPorMatricular spCurXMat : m_lstCursosSugeridos ) {
            sCiclo = spCurXMat.getPlancurCiclo();
            if ( !m_hmCiclosConCurPend.containsKey( sCiclo ) ) {
                m_hmCiclosConCurPend.put( sCiclo, sCiclo );
            }
        }

        //Maximo creditos permitidos
        m_iMaxCred = traerMaximoCreditosPermitidos();
        
        //-- Secciones
        m_lstSecciones = new ArrayList<SeccionBean>();
        //--Horarios
        m_lstHorarios = new ArrayList<HorarioBean>();

        //--Alumnos matriculados
        m_lstAlumnosMatriculados = new ArrayList<AcAlumno>();

        //--Cursos Matriculados
        m_lstCursosMatriculados = new ArrayList<CursoAMatricularBean>();

        //--Detalle de Matricula
        m_lstMatDetalle = new ArrayList<MatriculasDetalleBean>();
        m_lstMatDetalle.add( new MatriculasDetalleBean() );
        m_lstMatDetalle.get( 0 ).setMaxCredPerm( m_iMaxCred );

        //--Horarios
        m_lstHorarios = new ArrayList<HorarioBean>();
        m_tmHorarios = new TreeMap<String, HorarioBean>();

        //--Estructura de Horario
        m_tmHorariosEstruc = new TreeMap<String, TreeMap<String, String>>();

    }

    public int getCurSugerido() {
        return m_iCurSugerido;
    }

    public void setCurSugerido( int iCurSugerido ) {
        m_iCurSugerido = iCurSugerido;
    }

    public List<SPCursosPorMatricular> getLstCursosSugeridos() {
        return m_lstCursosSugeridos;
    }

    public void setLstCursosSugeridos( List<SPCursosPorMatricular> lstCursosSugeridos ) {
        m_lstCursosSugeridos = lstCursosSugeridos;
    }

    public List<HorarioBean> getLstHorarios() {
        return m_lstHorarios;
    }

    public void setLstHorarios( List<HorarioBean> lstHorarios ) {
        this.m_lstHorarios = lstHorarios;
    }

    public List<SeccionBean> getLstSecciones() {
        return m_lstSecciones;
    }

    public void setLstSecciones( List<SeccionBean> lstSecciones ) {
        m_lstSecciones = lstSecciones;
    }

    public List<AcAlumno> getLstAlumnosMatriculados() {
        return m_lstAlumnosMatriculados;
    }

    public void setLstAlumnosMatriculados( List<AcAlumno> lstAlumnosMatriculados ) {
        m_lstAlumnosMatriculados = lstAlumnosMatriculados;
    }

    public List<CursoAMatricularBean> getLstCursosMatriculados() {
        return m_lstCursosMatriculados;
    }

    public void setLstCursosMatriculados( List<CursoAMatricularBean> lstCursosMatriculados ) {
        m_lstCursosMatriculados = lstCursosMatriculados;
    }

    public List<MatriculasDetalleBean> getLstMatDetalle() {
        return m_lstMatDetalle;
    }

    public void setLstMatDetalle( List<MatriculasDetalleBean> lstMatDetalle ) {
        m_lstMatDetalle = lstMatDetalle;
    }

    //FIN SETTERS Y GETTERS
    public void verSecciones( ActionEvent event ) {
        int iCursoapeId;
        AcSeccion acSeccion;
        SeccionBean seccion;
        HSSeccionDAO seccionDAO;
        Set<AcSeccion> lstAcSecciones;

        try {
            iCursoapeId = Integer.parseInt( CommonWeb.getParamFromUI( event, "curId" ) );
            seccionDAO = (HSSeccionDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_SECCION );
            lstAcSecciones = seccionDAO.seleccionarSeccionesPorCurApe( iCursoapeId );

            m_lstSecciones.clear();
            if ( lstAcSecciones != null && !lstAcSecciones.isEmpty() ) {

                Iterator<AcSeccion> it = lstAcSecciones.iterator();
                while ( it.hasNext() ) {
                    acSeccion = it.next();

                    seccion = new SeccionBean();
                    seccion.setSecId( acSeccion.getSecId() );
                    seccion.setCurapeId( iCursoapeId );
                    seccion.setNomSeccion( acSeccion.getSecNombre() );
                    seccion.setVacantes( acSeccion.getSecVacantes() );
                    seccion.setMatriculados( acSeccion.getAcMatriculaCursos().size() );


                    seccion.generarHorarios();

                    m_lstSecciones.add( seccion );

                }
            }

        } catch ( Exception ex ) {
            m_lstSecciones = new ArrayList<SeccionBean>();
            ex.printStackTrace();
        }
    }

    public void verMatriculados( ActionEvent event ) {
        int iSecId;
        int iSizeMatCur;
        HSSeccionDAO seccionDAO;
        AcAlumno alumno;
        AcMatricula matricula;
        AcSeccion seccion;
        List<AcMatriculaCurso> lstMatriculaCursos;
        TreeMap<String, AcAlumno> tmAlumnos = new TreeMap<String, AcAlumno>();
        try {
            iSecId = Integer.parseInt( CommonWeb.getParamFromUI( event, "secId" ) );
            seccionDAO = (HSSeccionDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_SECCION );
            seccion = (AcSeccion) seccionDAO.seleccionarSeccion( iSecId ).get( 0 );
            lstMatriculaCursos = new ArrayList<AcMatriculaCurso>( seccion.getAcMatriculaCursos() );
            m_lstAlumnosMatriculados.clear();
            if ( lstMatriculaCursos != null && !lstMatriculaCursos.isEmpty() ) {
                iSizeMatCur = lstMatriculaCursos.size();
                for ( int i = 0; i < iSizeMatCur; i++ ) {
                    matricula = lstMatriculaCursos.get( i ).getAcMatricula();
                    if ( matricula != null ) {
                        alumno = matricula.getAcAlumno();
                        if ( alumno != null ) {
//                            m_lstAlumnosMatriculados.add( alumno );
                            tmAlumnos.put( alumno.getAluAppaterno() + " " + alumno.getAluApmaterno() + ", " + alumno.getAluNombres(), alumno );
                        }
                    }
                }
                m_lstAlumnosMatriculados.addAll( tmAlumnos.values() );
            }
        } catch ( Exception ex ) {
            m_lstAlumnosMatriculados = new ArrayList<AcAlumno>();
            ex.printStackTrace();
        }
    }

    public void agregarCurso( ActionEvent event ) {
        int iSecId;
        int iCurApeId;
        AcSeccion seccion;
        AcCursoAperturado cursoApe;
        CursoAMatricularBean cursoMat;
        HSCursoAperturadoDAO curApeDAO;
        HSSeccionDAO seccionDAO;
        try {
            seccionDAO = (HSSeccionDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_SECCION );
            curApeDAO = (HSCursoAperturadoDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_CURSOAPERTURADO );

            iSecId = Integer.parseInt( CommonWeb.getParamFromUI( event, "secId" ) );
            iCurApeId = Integer.parseInt( CommonWeb.getParamFromUI( event, "curApeId" ) );

            seccion = (AcSeccion) seccionDAO.seleccionarSeccion( iSecId ).get( 0 );
            cursoApe = (AcCursoAperturado) curApeDAO.seleccionarUnCursosAperturado( iCurApeId ).get( 0 );

            if ( !contieneCurso( cursoApe, m_lstCursosMatriculados ) ) {
                cursoMat = new CursoAMatricularBean();
                cursoMat.setCurApeId( iCurApeId );
                cursoMat.setSecId( iSecId );
                cursoMat.setCurApeCodigo( cursoApe.getAcPlanCurso().getPlancurCodigo() );
                cursoMat.setCurApeNombre( cursoApe.getAcPlanCurso().getAcCurso().getCurNombre() );
                cursoMat.setSecCodigo( seccion.getSecCodigo() );
                cursoMat.setCiclo( CommonWeb.traerDescripcionCatalogo( cursoApe.getAcPlanCurso().getPlancurCiclo() ) );
                cursoMat.setCreditos( cursoApe.getAcPlanCurso().getPlancurCredito() );
                cursoMat.setTipoCurso( CommonWeb.traerDescripcionCatalogo( cursoApe.getAcPlanCurso().getPlancurTipo() ) );
                m_lstCursosMatriculados.add( cursoMat );

                //MUESTRA EL CURSO EN EL HORARIO
//                mostrarCursoEnHorario( iCurApeId, iSecId );

                //Ingrementa el total de créditos según el alumno va eligiendo cursos.
                m_lstMatDetalle.get( 0 ).setTotalCredMatr( m_lstMatDetalle.get( 0 ).getTotalCredMatr() + Integer.parseInt( cursoMat.getCreditos() ) );

                //Incrementa en 1 la cantidad de cursos que va eligiendo el alumno.
                m_lstMatDetalle.get( 0 ).setNumCurMat( m_lstMatDetalle.get( 0 ).getNumCurMat() + 1 );
            }

        } catch ( Exception ex ) {
            ex.printStackTrace();
        }

    }

    public void quitarCurso( ActionEvent event ) {
        int iCurApeId;
        try {

            iCurApeId = Integer.parseInt( CommonWeb.getParamFromUI( event, "curApeId" ) );

            for ( CursoAMatricularBean curMat : m_lstCursosMatriculados ) {
                if ( curMat.getCurApeId() == iCurApeId ) {
                    m_lstCursosMatriculados.remove( curMat );
                    m_lstMatDetalle.get( 0 ).setTotalCredMatr( m_lstMatDetalle.get( 0 ).getTotalCredMatr() - Integer.parseInt( curMat.getCreditos() ) );
                    m_lstMatDetalle.get( 0 ).setNumCurMat( m_lstMatDetalle.get( 0 ).getNumCurMat() - 1 );
                    break;
                }
            }
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }

    private void mostrarCursoEnHorario( int iCurApeId, int iSecId ) {
        int iSizeHors;
        String sCurso = "";
        String[] sHoras;
        String[] asDias = { "lunes", "martes", "miercoles", "jueves", "viernes", "domingo" };
        HorarioBean horBean;
        SPHorariosPorCursoYSeccion horCS;
        List<SPHorariosPorCursoYSeccion> lstHorariosXCyS;
        TreeMap<String, String> tmHorDia;
        TreeMap<String, String> tmHorario;
        try {
            lstHorariosXCyS = SeccionBean.traerHorarioPorCurApeYSec( iCurApeId, iSecId );
            iSizeHors = lstHorariosXCyS.size();
            for ( int i = 0; i < iSizeHors; i++ ) {
                horCS = lstHorariosXCyS.get( i );
                tmHorDia = m_tmHorariosEstruc.get( horCS.getHora() );
                if ( tmHorDia != null ) {
                    for ( String sDia : asDias ) {
                        if ( !horCS.getNomDia( sDia ).isEmpty() ) {
                            if ( tmHorDia.get( sDia ) != null ) {
                                return;
                            }
                        }
                    }
                }
            }

            tmHorario = SeccionBean.armarHorarios( iCurApeId, iSecId );
            if ( !tmHorario.isEmpty() ) {
                for ( String sKeyDia : tmHorario.keySet() ) {
                    sHoras = tmHorario.get( sKeyDia ).split( "<br />" );
                    for ( String sHora : sHoras ) {
                        if ( m_tmHorariosEstruc.get( sHora ) == null ) {
                            m_tmHorariosEstruc.put( sHora, new TreeMap<String, String>() );
                        }
                        horBean = new HorarioBean();
                        if ( sKeyDia.equals( "lunes" ) ) {
                            sCurso = "curLunes";
                        } else if ( sKeyDia.equals( "martes" ) ) {
                            sCurso = "curMartes";
                        } else if ( sKeyDia.equals( "miercoles" ) ) {
                            horBean.setCurMie( "XXX" );
                            sCurso = "curMiercoles";
                        } else if ( sKeyDia.equals( "jueves" ) ) {
                            horBean.setCurJue( "XXX" );
                            sCurso = "curJueves";
                        } else if ( sKeyDia.equals( "viernes" ) ) {
                            horBean.setCurVie( "XXX" );
                            sCurso = "curViernes";
                        } else if ( sKeyDia.equals( "sabado" ) ) {
                            sCurso = "curSabado";
                        }
                        m_tmHorariosEstruc.get( sHora ).put( sKeyDia, sCurso );

                    }
                }

                m_lstHorarios = new ArrayList<HorarioBean>();
                for ( String sKeyHora : m_tmHorariosEstruc.keySet() ) {
                    for ( String sKeyDia : m_tmHorariosEstruc.get( sKeyHora ).keySet() ) {
                        horBean = new HorarioBean();
                        horBean.setHoraIni( sKeyHora.split( "-" )[0].trim() );
                        horBean.setHoraFin( sKeyHora.split( "-" )[1].trim() );
                        if ( sKeyDia.equals( "lunes" ) ) {
                            horBean.setCurLun( m_tmHorariosEstruc.get( sKeyHora ).get( sKeyDia ) );
                        } else if ( sKeyDia.equals( "martes" ) ) {
                            horBean.setCurMar( m_tmHorariosEstruc.get( sKeyHora ).get( sKeyDia ) );
                        } else if ( sKeyDia.equals( "miercoles" ) ) {
                            horBean.setCurMie( m_tmHorariosEstruc.get( sKeyHora ).get( sKeyDia ) );
                        } else if ( sKeyDia.equals( "jueves" ) ) {
                            horBean.setCurJue( m_tmHorariosEstruc.get( sKeyHora ).get( sKeyDia ) );
                        } else if ( sKeyDia.equals( "viernes" ) ) {
                            horBean.setCurVie( m_tmHorariosEstruc.get( sKeyHora ).get( sKeyDia ) );
                        } else if ( sKeyDia.equals( "sabado" ) ) {
                            horBean.setCurSab( m_tmHorariosEstruc.get( sKeyHora ).get( sKeyDia ) );
                        }
                        m_lstHorarios.add( horBean );
                    }
                }

            }

        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }

    private boolean contieneCurso( AcCursoAperturado cursoApe, List<CursoAMatricularBean> lstCursosMatriculados ) {
        boolean blContiene = false;
        try {
            for ( CursoAMatricularBean cursoMat : lstCursosMatriculados ) {
                if ( cursoMat.getCurApeCodigo().equals( cursoApe.getAcPlanCurso().getPlancurCodigo() ) ) {
                    blContiene = true;
                    break;
                }
            }
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }

        return blContiene;
    }

    private int traerMaximoCreditosPermitidos() {
        HSMatriculaDAO matriculaDAO;
        try {
            matriculaDAO = (HSMatriculaDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_MATRICULA );
            int iEspId = m_alumno.getAcEspecialidad().getEspId();
            List lstCiclos = new ArrayList( m_hmCiclosConCurPend.keySet() );
            m_iMaxCred = matriculaDAO.traerMaximoCreditosPermitidos( iEspId, lstCiclos );
        } catch ( Exception ex ) {
            m_iMaxCred = 0;
            ex.printStackTrace();
        }
        return m_iMaxCred;
    }
}
