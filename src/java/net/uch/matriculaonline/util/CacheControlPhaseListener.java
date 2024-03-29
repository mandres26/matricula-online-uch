/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.util;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO
 */
public class CacheControlPhaseListener implements PhaseListener {

    public PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }

    public void afterPhase( PhaseEvent event ) {
    }

    public void beforePhase( PhaseEvent event ) {
        FacesContext facesContext = event.getFacesContext();
        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
        response.addHeader( "Pragma", "no-cache" );
        response.addHeader( "Cache-Control", "no-cache" );
        // Stronger according to blog comment below that references HTTP spec
        response.addHeader( "Cache-Control", "no-store" );
        response.addHeader( "Cache-Control", "must-revalidate" );
        // some date in the past
        response.addHeader( "Expires", "Mon, 8 Aug 2006 10:00:00 GMT" );
    }
}
