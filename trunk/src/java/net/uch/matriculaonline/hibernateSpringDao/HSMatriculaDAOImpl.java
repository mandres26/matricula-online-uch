package net.uch.matriculaonline.hibernateSpringDao;

import java.util.List;
import java.util.logging.Logger;
import net.uch.matriculaonline.mapping.storedprocedures.SPCursosPorMatricular;
import net.uch.matriculaonline.mapping.storedprocedures.SPHorariosPorCursoYSeccion;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HSMatriculaDAOImpl extends HibernateDaoSupport implements HSMatriculaDAO {

    private Logger m_log = Logger.getLogger( HSMatriculaDAOImpl.class.getName() );

    @Override
    public List<SPCursosPorMatricular> seleccionarCursosPorMatricular( int iAluId ) {
        Query query = this.getSession().getNamedQuery( "getCursosPorMatricular" );
        query.setInteger( "aluId", iAluId );
        return query.list();
    }

    @Override
    public List<SPHorariosPorCursoYSeccion> seleccionarHorariosPorCurapeIdYSecId( int iCurapeId, int iSecId ) {
        Query query = this.getSession().getNamedQuery( "getHorariosPorCursoapeIdYSecId" );
        query.setInteger( "curape_id", iCurapeId );
        query.setInteger( "sec_id", iSecId );
        return query.list();
    }
}
