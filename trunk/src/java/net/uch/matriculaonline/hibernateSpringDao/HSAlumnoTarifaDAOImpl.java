/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.hibernateSpringDao;

import java.util.List;
import net.uch.matriculaonline.mapping.AdAlumnoTarifa;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author USUARIO
 */
public class HSAlumnoTarifaDAOImpl extends HibernateDaoSupport implements HSAlumnoTarifaDAO {

    @Override
    public List<AdAlumnoTarifa> seleccionarAlumnoTarifa( Integer iAluId ) {
        List<AdAlumnoTarifa> lista = this.getSession().createCriteria( AdAlumnoTarifa.class, "AdAlumnoTarifa" ).
                createCriteria( "AdAlumnoTarifa.adEstructuraPagosDetalle", "AdEstructuraPagosDetalle" ).
                createCriteria( "AdEstructuraPagosDetalle.adEstructuraPagos", "AdEstructuraPagos" ).
                add( Expression.eq( "AdAlumnoTarifa.acAlumno.aluId", iAluId ) ).
                add( Restrictions.eq( "AdEstructuraPagosDetalle.estpagdetActivo", "1" ) ).
                add( Restrictions.eq( "AdEstructuraPagos.estpagActivo", "1" ) ).
                add( Restrictions.eq( "AdAlumnoTarifa.alutarActivo", "1" ) ).
                addOrder( Order.asc( "AdAlumnoTarifa.alutarId" ) ).list();
        this.getSession().close();
        return lista;
    }
//    @Override
//    public List<AdAlumnoTarifa> seleccionarAlumnoTarifa( Integer iAluId ) {
//        Session session = getHibernateTemplate().getSessionFactory().openSession();
//        List<AdAlumnoTarifa> lista = session.createCriteria(AdAlumnoTarifa.class, "AdAlumnoTarifa").
//                createCriteria("AdAlumnoTarifa.Estpagdet", "AdEstructuraPagosDetalle").
//                createCriteria("AdEstructuraPagosDetalle.Estpag", "AdEstructuraPagos").
//                add(Expression.eq("AdAlumnoTarifa.Alu.Id", iAluId)).
//                add(Restrictions.eq("AdEstructuraPagosDetalle.EstpagdetActivo", "1")).
//                add(Restrictions.eq("AdEstructuraPagos.EstpagActivo", "1")).
//                add(Restrictions.eq("AdAlumnoTarifa.AlutarActivo", "1")).
//                addOrder(Order.asc("Id")).list();
//        session.close();
//        return lista;
//    }
}
