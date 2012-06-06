/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.managedBeans;

import java.util.ArrayList;
import java.util.List;
import net.uch.matriculaonline.beans.AlumnoDeudaBean;
import net.uch.matriculaonline.commonService.ServiceFinder;
import net.uch.matriculaonline.hibernateSpringDao.HSAlumnoDAO;
import net.uch.matriculaonline.mapping.AcAlumno;
import net.uch.matriculaonline.mapping.AdAlumnoTarifa;
import net.uch.matriculaonline.util.CommonWeb;
import net.uch.matriculaonline.util.ConstantesWeb;

/**
 *
 * @author USUARIO
 */
public class AluDeudasMB {
    private AcAlumno m_acAlumno;
    private List<AlumnoDeudaBean> m_lstAlumnoPagoDeudas;
    private List<AlumnoDeudaBean> m_lstAlumnoDocumentosDeudas;

    /**
     * Creates a new instance of AluDeudasMB
     */
    public AluDeudasMB() {
        m_lstAlumnoPagoDeudas = new ArrayList<AlumnoDeudaBean>();
        m_lstAlumnoDocumentosDeudas = new ArrayList<AlumnoDeudaBean>();
    }

    public List<AlumnoDeudaBean> getLstAlumnoPagoDeudas() {
        int iSizeAluDeuda;
        AcAlumno acAlumno;
        AdAlumnoTarifa aluTar;
        AlumnoDeudaBean aluDeuda;
        HSAlumnoDAO alumnoDAO;
        List<AdAlumnoTarifa> lstAluTarDeudPag;
        try {
            m_lstAlumnoPagoDeudas.clear();
            //Se trae alumno logeado
            acAlumno = CommonWeb.traerAlumnoLogeado();

            alumnoDAO = (HSAlumnoDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_ALUMNO );

            //Trae lista de deudas del alumno
            lstAluTarDeudPag = alumnoDAO.traerDeudasPagosPorAlumno( acAlumno );
            if ( !lstAluTarDeudPag.isEmpty() ) {
                iSizeAluDeuda = lstAluTarDeudPag.size();
                for ( int i = 0; i < iSizeAluDeuda; i++ ) {
                    aluTar = lstAluTarDeudPag.get( i );
                    aluDeuda = new AlumnoDeudaBean();
                    aluDeuda.setNumOrden( i + 1 );
                    aluDeuda.setDescripcion(
                            aluTar.getAdEstructuraPagosDetalle().getAdEstructuraPagos().getEstpagoNombre()
                            + " - "
                            + aluTar.getAdEstructuraPagosDetalle().getEstpagdetNombre() );
                    aluDeuda.setTipo( "PAGO" );
                    aluDeuda.setObservacion( "Requisito indispensable para matricularse" );
                    m_lstAlumnoPagoDeudas.add( aluDeuda );
                }

            }
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }

        return m_lstAlumnoPagoDeudas;
    }

    public void setLstAlumnoPagoDeudas( List<AlumnoDeudaBean> lstAlumnoDeudas ) {
        this.m_lstAlumnoPagoDeudas = lstAlumnoDeudas;
    }

    public List<AlumnoDeudaBean> getLstAlumnoDocumentoDeudas() {
        int iSizeAluDeuda;
        AcAlumno acAlumno;
        List lstAluTarDeudDoc;
        HSAlumnoDAO alumnoDAO;
        try {
            acAlumno = CommonWeb.traerAlumnoLogeado();

            alumnoDAO = (HSAlumnoDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_ALUMNO );
            m_lstAlumnoDocumentosDeudas.clear();
            lstAluTarDeudDoc = alumnoDAO.traerDeudasDocumentosPorAlumno( acAlumno );
            if ( !lstAluTarDeudDoc.isEmpty() ) {
                iSizeAluDeuda = lstAluTarDeudDoc.size();
                for ( int i = 0; i < iSizeAluDeuda; i++ ) {
                    m_lstAlumnoDocumentosDeudas.add( new AlumnoDeudaBean( m_lstAlumnoDocumentosDeudas.size() + 1, String.valueOf( lstAluTarDeudDoc.get( 0 ) ),
                            "DOCUMENTO", "Documento indispensable para realizar la matricula." ) );
                }

            }
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
        return m_lstAlumnoDocumentosDeudas;
    }

    public void setLstAlumnoDocumentoDeudas( List<AlumnoDeudaBean> lstAlumnoDocumentosDeudas ) {
        m_lstAlumnoDocumentosDeudas = lstAlumnoDocumentosDeudas;
    }

    public AcAlumno getAlumno() {
        m_acAlumno = CommonWeb.traerAlumnoLogeado();
        return m_acAlumno;
    }

    public void setAlumno( AcAlumno acAlumno ) {
        m_acAlumno = acAlumno;
    }

}
