package net.uch.matriculaonline.hibernateSpringDao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import net.uch.matriculaonline.mapping.AcPlanCurso;
import net.uch.matriculaonline.mapping.storedprocedures.SPCursosPorMatricular;
import net.uch.matriculaonline.mapping.storedprocedures.SPHorariosPorCursoYSeccion;
import org.hibernate.Query;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
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

    @Override
    public List traerTotalCreditosPorCiclo( int iEspId, List lstCiclos ) {
        List lstCredPorCiclos;
        ProjectionList projectLst;
        try {
            projectLst = Projections.projectionList();
            projectLst.add( Projections.sum( "AcPlanCurso.plancurCredito" ) ).
                    add( Projections.groupProperty( "AcPlanCurso.plancurCiclo" ) );

            lstCredPorCiclos = this.getSession().
                    createCriteria( AcPlanCurso.class, "AcPlanCurso" ).
                    createCriteria( "AcPlanCurso.acCurso", "AcCurso" ).
                    createCriteria( "AcCurso.acEspecialidad", "AcEspecialidad" ).
                    add( Restrictions.in( "AcPlanCurso.plancurCiclo", lstCiclos ) ).
                    add( Restrictions.eq( "AcPlanCurso.plancurActivo", "1" ) ).
                    add( Restrictions.eq( "AcCurso.curActivo", "1" ) ).
                    add( Restrictions.eq( "AcEspecialidad.espActivo", "1" ) ).
                    add( Restrictions.eq( "AcEspecialidad.espId", 1 ) ).
                    setProjection( projectLst ).
                    list();
        } catch ( Exception ex ) {
            ex.printStackTrace();
            lstCredPorCiclos = new ArrayList();
        }

        return lstCredPorCiclos;
    }

    @Override
    public int traerMaximoCreditosPermitidos( int iEspId, List lstCiclos ) {
        int iMaxCred = 0;
        int iAux;
        Object[] asCredXCicloAux;
        List<String[]> lstCredPorCiclos;

        try {
            lstCredPorCiclos = traerTotalCreditosPorCiclo( iEspId, lstCiclos );
            int i = 0;
            if ( !lstCredPorCiclos.isEmpty() ) {
                asCredXCicloAux = lstCredPorCiclos.get( 0 );
                iMaxCred = Integer.parseInt( String.valueOf( asCredXCicloAux[0] ) );
                for ( Object[] asCredXCiclo : lstCredPorCiclos ) {
                    iAux = Integer.parseInt( String.valueOf( asCredXCiclo[0] ) );
                    if ( iAux > iMaxCred ) {
                        iMaxCred = iAux;
                    }
                }
            }

        } catch ( Exception ex ) {
            ex.printStackTrace();
            iMaxCred = 0;
        }

        return iMaxCred;
    }
}
