/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.managedBeans;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import net.uch.matriculaonline.commonService.ServiceFinder;
import net.uch.matriculaonline.hibernateSpringDao.HSAlumnoDAO;
import net.uch.matriculaonline.mapping.AcAlumno;
import net.uch.matriculaonline.mapping.AdAlumnoTarifa;
import net.uch.matriculaonline.util.ConstantesWeb;

/**
 *
 * @author USUARIO
 */
public class AuthUsuarioMB {

    private String m_sUsuario;
    private String m_sPassword;
    private String m_sMensaje;
    private AcAlumno m_alumno;
    private HSAlumnoDAO m_alumnoDAO;

    /**
     * Creates a new instance of AuthUsuarioMB
     */
    public AuthUsuarioMB() {
    }

    public String getPassword() {
        return m_sPassword;
    }

    public void setPassword( String sPassword ) {
        m_sPassword = sPassword;
    }

    public String getUsuario() {
        return m_sUsuario;
    }

    public void setUsuario( String sUsuario ) {
        m_sUsuario = sUsuario;
    }

    public String getMensaje() {
        return m_sMensaje;
    }

    public void setMensaje( String sMensaje ) {
        m_sMensaje = sMensaje;
    }

    public String checkUser() {
        String sRedirectLogin = ConstantesWeb.MSJ_REDIRECT_LOGIN_ERROR;
        List<AdAlumnoTarifa> lstAluTar;
        try {
            m_alumnoDAO = (HSAlumnoDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_ALUMNO );
            m_alumno = m_alumnoDAO.seleccionarAlumnoCodigo( m_sUsuario );

            if ( m_alumno != null ) {
                if ( m_alumno.getAluPassword().equals( m_sPassword ) ) {
                    lstAluTar = m_alumnoDAO.traerDeudasPagosPorAlumno( m_alumno );
                    setSesionAlumno( m_alumno );
                    if ( !lstAluTar.isEmpty() ) {
                        sRedirectLogin = ConstantesWeb.MSJ_REDIRECT_LOGIN_DEUDA;
                    } else {
                        sRedirectLogin = ConstantesWeb.MSJ_REDIRECT_LOGIN_OK;
                    }
                    m_sMensaje = "";
                } else {
                    m_sMensaje = "Usuario o password incorrecto.";
                }
            }
        } catch ( Exception ex ) {
            ex.printStackTrace();
            sRedirectLogin = ConstantesWeb.MSJ_REDIRECT_LOGIN_ERROR;
        }

        return sRedirectLogin;
    }

    public void setSesionAlumno( AcAlumno acAlumno ) {
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        HttpSession session = (HttpSession) context.getSession( false );
        session.setAttribute( "usuario", acAlumno );
    }

    public void cerrarSesion() {
        try {
            ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            HttpSession session = (HttpSession) context.getSession( false );
            session.setAttribute( "usuario", null );
            FacesContext.getCurrentInstance().getExternalContext().redirect( "../Autenticacion/Login.jsf" );
        } catch ( IOException ex ) {
            Logger.getLogger( AuthUsuarioMB.class.getName() ).log( Level.SEVERE, null, ex );
        }
    }
}
