package net.uch.matriculaonline.hibernateSpringDao;

import java.util.List;
import net.uch.matriculaonline.mapping.AcCursoAperturado;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HSCursoAperturadoDAOImpl extends HibernateDaoSupport implements HSCursoAperturadoDAO {

    @Override
    public void aperturarCurso( AcCursoAperturado cur ) throws DataAccessException {
        getHibernateTemplate().saveOrUpdate( cur );
    }

    @Override
    public List seleccionarCursosAperturados() throws DataAccessException {
        List lista = null;
        return lista;
    }

    @Override
    public List verificarCursoAperturado( int plancur_id, int sem_id ) throws DataAccessException {
        return this.getSession().createCriteria( AcCursoAperturado.class ).add( Expression.eq( "Plancur.Id", plancur_id ) ).add( Expression.eq( "Sem.Id", sem_id ) ).add( Expression.eq( "CurapeActivo", "1" ) ).add( Expression.eq( "CurapeAperturado", "1" ) ).list();
    }

    @Override
    public void eliminarCursoAperturado( String id ) throws DataAccessException {
        String hqlUpdate = "update AcCursoAperturado set CurapeActivo = :activo where Id = :id";
        this.getSession().createQuery( hqlUpdate ).setString( "activo", "0" ).setString( "id", id ).executeUpdate();
    }

    @Override
    public void actualizarCursoAperturado( AcCursoAperturado cur ) throws DataAccessException {
        getHibernateTemplate().update( cur );
    }

    @Override
    public List seleccionarUnCursosAperturado( int iCurapeId ) throws DataAccessException {
        return this.getSession().createCriteria( AcCursoAperturado.class ).
                add( Expression.eq( "curapeId", iCurapeId ) ).
                add( Expression.eq( "curapeActivo", "1" ) ).
                createCriteria( "acSisEvaPersonalizados" ).
                add( Expression.eq( "sisevaPerActivo", "1" ) ).
                addOrder( Order.asc( "sisevaPerOrden" ) ).list();
    }

    @Override
    public List seleccionarAperturaporPlanCurso( int plancurid ) throws DataAccessException {
        return this.getSession().createCriteria( AcCursoAperturado.class ).add( Expression.eq( "PlancurId", plancurid ) ).add( Expression.eq( "CurapeActivo", "1" ) ).list();
    }

    @Override
    public List seleccionarAperturaporEspecialidad( int esp_id, int sem_id ) throws DataAccessException {
        return this.getSession().createCriteria( AcCursoAperturado.class ).
                add( Restrictions.eq( "CurapeActivo", "1" ) ).
                add( Restrictions.eq( "CurapeAperturado", "1" ) ).
                add( Restrictions.eq( "Sem.Id", sem_id ) ).
                createCriteria( "Plancur" ).
                addOrder( Order.asc( "PlancurCiclo" ) ).
                createCriteria( "Cur" ).
                createCriteria( "Esp" ).
                add( Restrictions.eq( "Id", esp_id ) ).list();
    }
}
