/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.filter;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author USUARIO
 */
public class SecurityFilter implements Filter {

    FilterConfig fc;

    @Override
    public void init( FilterConfig filterConfig ) throws ServletException {
        fc = filterConfig;
    }

    @Override
    public void doFilter( ServletRequest request, ServletResponse response, FilterChain chain ) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession( true );
        String pageRequested = req.getRequestURL().toString();

        if ( session.getAttribute( "usuario" ) == null
                && !pageRequested.contains( "Login.jsf" ) ) {
            resp.sendRedirect( "../Autenticacion/Login.jsf" );
        } else {
            chain.doFilter( request, response );
        }
//        chain.doFilter( request, response );
    }

    @Override
    public void destroy() {
    }
}
