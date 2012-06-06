/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.util;

import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;
import net.uch.matriculaonline.commonService.ServiceFinder;
import net.uch.matriculaonline.hibernateSpringDao.HSCatalogoDAO;
import net.uch.matriculaonline.mapping.AcAlumno;

/**
 *
 * @author USUARIO
 */
public class CommonWeb {

    public static String traerDescripcionCatalogo( String sCodCatalogo ) {
        String sDescCat;
        HSCatalogoDAO catalogoDAO;
        try {
            catalogoDAO = (HSCatalogoDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_CATALOGO );
            sDescCat = catalogoDAO.seleccionarDescripcion( sCodCatalogo );
        } catch ( Exception ex ) {
            sDescCat = "";
            ex.printStackTrace();
        }
        return sDescCat;
    }

    public static AcAlumno traerAlumnoLogeado() {
        AcAlumno acAlumno;
        try {
            ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            HttpSession session = (HttpSession) context.getSession( false );
            acAlumno = (AcAlumno) session.getAttribute( "usuario" );
        } catch ( Exception ex ) {
            acAlumno = null;
            ex.printStackTrace();
        }

        return acAlumno;
    }

    public static String getParamFromUI( ActionEvent event, String sNomParam ) {
        String sParam;
        try {
//            sParam = ((UIParameter) event.getComponent().findComponent( sNomParam )).getValue().toString();
            FacesContext context = FacesContext.getCurrentInstance();
            sParam = context.getExternalContext().getRequestParameterMap().get( sNomParam );

        } catch ( Exception ex ) {
            sParam = "";
            ex.printStackTrace();
        }

        return sParam;
    }
}
