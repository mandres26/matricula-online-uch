/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.hibernateSpringDao;

import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import net.uch.matriculaonline.mapping.AcCursoAperturado;
import net.uch.matriculaonline.mapping.AcSeccion;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author USUARIO
 */
public class HSSeccionDAOImpl extends HibernateDaoSupport implements HSSeccionDAO {

    private Logger m_log = Logger.getLogger( HSSeccionDAOImpl.class.getName() );

    @Override
    public Set<AcSeccion> seleccionarSeccionesPorCurApe( int iCurApeId ) {
        AcCursoAperturado curApe = (AcCursoAperturado) this.getSession().
                createCriteria( AcCursoAperturado.class ).
                add( Expression.eq( "curapeActivo", "1" ) ).
                add( Expression.eq( "curapeId", iCurApeId ) ).list().get( 0 );
        return curApe.getAcSeccions();
    }

    @Override
    public List seleccionarSeccion( int iSecId ) {
        return this.getSession().createCriteria( AcSeccion.class ).add( Restrictions.eq( "secId", iSecId ) ).add( Restrictions.eq( "secActivo", "1" ) ).list();
    }
}
