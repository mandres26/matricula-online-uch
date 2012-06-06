package net.uch.matriculaonline.hibernateSpringDao;

import java.util.List;
import net.uch.matriculaonline.mapping.TbCatalogo;
import org.hibernate.criterion.Expression;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HSCatalogoDAOImpl extends HibernateDaoSupport implements HSCatalogoDAO {

    @Override
    public List seleccionarCatalogo(String codigo) {
        return this.getSession().createCriteria(TbCatalogo.class).
                add(Expression.eq("catActivo", "1")).
                add(Expression.not(Expression.eq("catCodigoElemento", "000"))).
                add(Expression.eq("catCodigoGrupo", codigo)).list();
    }

    @Override
    public String seleccionarDescripcion(String codigo) {
        TbCatalogo cat = (TbCatalogo) this.getSession().createCriteria(TbCatalogo.class).
                add(Expression.eq("catActivo", "1")).
                add(Expression.eq("catCodigoGrupo", codigo.substring(0, 3))).
                add(Expression.eq("catCodigoElemento", codigo.substring(3, 6))).
                uniqueResult();

        return cat.getCatDescripcionElemento();
    }

    @Override
    public String seleccionarValor(String codigo) throws DataAccessException {
        List lista = this.getSession().createCriteria(TbCatalogo.class).add(Expression.eq("catCodigoGrupo", codigo.substring(0, 3))).add(Expression.eq("catCodigoElemento", codigo.substring(3, 6))).add(Expression.eq("catActivo", "1")).list();
        return ((TbCatalogo) lista.get(0)).getCatValor();
    }

    @Override
    public List<TbCatalogo> seleccionarGrupo(String codigo) {
        return this.getSession().createCriteria(TbCatalogo.class).
                add(Expression.eq("catCodigoGrupo", codigo)).
                add(Expression.eq("catActivo", "1")).
                add(Expression.not(Expression.eq("catCodigoElemento", "000"))).
                list();
    }

    @Override
    public List<TbCatalogo> seleccionarGrupoxValor(String codigo) {
         return this.getSession().createCriteria(TbCatalogo.class).
                add(Expression.eq("catValor", codigo)).
                add(Expression.eq("catActivo", "1")).
                list();
    }

    @Override
    public List<TbCatalogo> selecionarFilaCatalogo(String codigo) {
        String codigo2=codigo.substring(3, 6);
        String codigo1=codigo.substring(0, 3);

         return this.getSession().createCriteria(TbCatalogo.class).
                add(Expression.eq("catActivo", "1")).
                add(Expression.eq("catCodigoElemento",codigo2 )).
                add(Expression.eq("catCodigoGrupo", codigo1 )).list();
    }
}
