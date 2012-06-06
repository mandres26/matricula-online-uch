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
    private AcAlumno m_alumno;
    private HSMatriculaDAO m_matriculaDAO;
    private List<SPCursosPorMatricular> m_lstCursosSugeridos;
    private List<CursoAMatricularBean> m_lstCursosMatriculados;
    private List<HorarioBean> m_lstHorarios;
    private List<AcAlumno> m_lstAlumnosMatriculados;
    private List<SeccionBean> m_lstSecciones;
    private List<MatriculasDetalleBean> m_lstMatDetalle;
    private TreeMap<String, HorarioBean> m_tmHorarios;
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

        //--Plantilla de Horario
        m_lstHorarios = new ArrayList<HorarioBean>();
        m_tmHorarios = new TreeMap<String, HorarioBean>();
        
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
                mostrarCursoEnHorario( iCurApeId, iSecId );

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
        int iSizeHorCurSec;
        String[] asHora;
        SPHorariosPorCursoYSeccion spHorCurSec;
        HorarioBean horario;
        HSMatriculaDAO matriculaDAO;
        List<SPHorariosPorCursoYSeccion> lstHorCurSec;
        try {
            matriculaDAO = (HSMatriculaDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_MATRICULA );
            lstHorCurSec = matriculaDAO.seleccionarHorariosPorCurapeIdYSecId( iCurApeId, iSecId );
            if ( lstHorCurSec != null && !lstHorCurSec.isEmpty() ) {
                iSizeHorCurSec = lstHorCurSec.size();

                for ( int i = 0; i < iSizeHorCurSec; i++ ) {
                    spHorCurSec = lstHorCurSec.get( i );
                    asHora = spHorCurSec.getHora().split( "-" );
                    if( m_tmHorarios.containsKey( spHorCurSec.getHora() ) ){
                        horario = m_tmHorarios.get( spHorCurSec.getHora() );
                    } else {
                        horario = new HorarioBean( asHora[0].trim(), asHora[1].trim(), spHorCurSec.getLunes(),
                                spHorCurSec.getMartes(), spHorCurSec.getMiercoles(), spHorCurSec.getJueves(),
                                spHorCurSec.getViernes(), spHorCurSec.getSabado(), "" );
                    }
                    m_tmHorarios.put( spHorCurSec.getHora(), horario );
                }
                m_lstHorarios.addAll( m_tmHorarios.values() );
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
}
