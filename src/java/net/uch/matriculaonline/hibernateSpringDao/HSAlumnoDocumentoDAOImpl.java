/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.hibernateSpringDao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author USUARIO
 */
public class HSAlumnoDocumentoDAOImpl extends HibernateDaoSupport implements HSAlumnoDocumentoDAO {

    @Override
    public List seleccionarDeudaDocumentosPorAlumno( Integer iAluId ) {
        Query query;
        List lstDeudaDocs = new ArrayList();
        try {
            query = this.getSession().getNamedQuery( "query_deuda_documento" );
            query.setInteger( "alu_id", iAluId );
            lstDeudaDocs = query.list();
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
        return lstDeudaDocs;
    }
}
