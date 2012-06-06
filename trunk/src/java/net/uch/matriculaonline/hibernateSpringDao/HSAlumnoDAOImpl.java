package net.uch.matriculaonline.hibernateSpringDao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import net.uch.matriculaonline.commonService.ServiceFinder;
import net.uch.matriculaonline.mapping.AcAlumno;
import net.uch.matriculaonline.mapping.AdAlumnoTarifa;
import net.uch.matriculaonline.mapping.AdEstructuraPagos;
import net.uch.matriculaonline.util.ConstantesWeb;
//import net.uch.matriculaonline.mapping.TbAlumnoFicha;
//import net.uch.util.Print;
import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HSAlumnoDAOImpl extends HibernateDaoSupport implements HSAlumnoDAO {

    private Logger m_log = Logger.getLogger( HSAlumnoDAOImpl.class.getName() );

    @Override
    public void insertarAlumno( AcAlumno alu ) throws DataAccessException {
        this.getHibernateTemplate().save( alu );
    }

    @Override
    public List seleccionarAlumno( String codigo, String paterno, String materno, String nombre, int facu, int espe ) throws DataAccessException, java.sql.SQLException {
        Criteria criteria = this.getSession().createCriteria( AcAlumno.class ).add( Restrictions.like( "AluCodigo", "%" + codigo + "%" ) ).add( Restrictions.like( "AluAppaterno", "%" + paterno + "%" ) ).add( Restrictions.like( "AluApmaterno", "%" + materno + "%" ) ).add( Restrictions.like( "AluNombres", "%" + nombre + "%" ) ).add( Restrictions.eq( "AluActivo", "1" ) );
        if ( espe != 0 ) {
            criteria.add( Restrictions.eq( "Esp.Id", espe ) );
        }
        return criteria.list();
    }

    @Override
    public void eliminarAlumno( String id ) throws DataAccessException {
        String hqlUpdate = "update AcAlumno set AluActivo = :v_activo where Id = :v_id";
        this.getSession().createQuery( hqlUpdate ).setString( "v_activo", "0" ).setString( "v_id", id ).executeUpdate();
    }

    @Override
    public void actualizarAlumno( AcAlumno alu ) throws DataAccessException {
        this.getHibernateTemplate().update( alu );
    }

    @Override
    public List seleccionarAlumnoEstPago( int id_esp, String tipo, int sem_id ) throws DataAccessException {
        return this.getSession().createCriteria( AcAlumno.class ).add( Expression.eq( "Esp.Id", id_esp ) ).add( Expression.eq( "AluTipo", tipo ) ).add( Expression.eq( "AluActivo", "1" ) ).add( Restrictions.eq( "SemId", sem_id ) ).list();
    }

    @Override
    public List seleccionarAlumnoCliente( String buscar ) throws DataAccessException {
        return this.getSession().createCriteria( AcAlumno.class ).add( Restrictions.eq( "AluActivo", "1" ) ).add( Restrictions.like( "AluAppaterno", "%" + buscar + "%" ) ).addOrder( Order.asc( "Id" ) ).list();
    }

    @Override
    public AcAlumno seleccionarAlumno( int id ) throws Exception {
        return (AcAlumno) this.getSession().createCriteria( AcAlumno.class ).
                add( Restrictions.eq( "Id", id ) ).uniqueResult();
    }

    @Override
    public AcAlumno seleccionarAlumnoCodigo( String sCodigo ) throws DataAccessException {
        return (AcAlumno) this.getSession().createCriteria( AcAlumno.class ).
                add( Restrictions.eq( "aluCodigo", sCodigo ) ).uniqueResult();
    }

    @Override
    public List seleccionarUnAlumno( int id ) throws DataAccessException {
        return this.getSession().createCriteria( AcAlumno.class ).
                add( Restrictions.eq( "AluActivo", "1" ) ).
                add( Restrictions.eq( "Id", id ) ).list();
    }

    @Override
    public List seleccionarEstPagx() throws DataAccessException, java.sql.SQLException {
        return this.getSession().createCriteria( AdEstructuraPagos.class ).add( Expression.eq( "EstpagActivo", "1" ) ).list();
    }

    @Override
    public List seleccionarAlumnoEstPagoUnico( int id ) throws DataAccessException {
        return this.getSession().createCriteria( AcAlumno.class ).add( Expression.eq( "Id", id ) ).add( Expression.eq( "AluActivo", "1" ) ).list();
    }

    @Override
    public String MaximoCodigo() throws DataAccessException {
        List lista;
        String codMax;
        String hqlUpdate = " select max(substring(AluCodigo,5 ,8)) from AcAlumno ";
        lista = this.getSession().createQuery( hqlUpdate ).list();
        if ( lista.size() != 0 ) {
            Object[] O;
            codMax = lista.get( 0 ).toString();
            System.out.println( "valorr " + codMax );
        } else {
            codMax = "0000";
        }
        return codMax;
    }

    @Override
    public InputStream imprimirAsistencia() {
        HashMap parameters = new HashMap();
        parameters.put( "especialidad", new String( "123" ) );
//        Print print = new Print();
//        byte[] bytes = print.cargar_reporte("/WEB-INF/Reportes/comprobante.jasper", parameters).toByteArray();
//        InputStream in = new ByteArrayInputStream(bytes);
//        return in;
        return null;
    }

    @Override
    public List seleccionarAlumnoSeccion( int sec_id ) {
        return this.getSession().createCriteria( AcAlumno.class ).add( Restrictions.eq( "AluActivo", "1" ) ).addOrder( Order.asc( "AluAppaterno" ) ).addOrder( Order.asc( "AluApmaterno" ) ).addOrder( Order.asc( "AluNombres" ) ).createCriteria( "AcNotas" ).add( Restrictions.eq( "SecId", sec_id ) ).list();
    }

    @Override
    public List listarAlumnoxSeccion( int sec_id ) {
        List listas = this.getSession().createCriteria( AcAlumno.class, "alu" ).add( Restrictions.eq( "alu.AluActivo", "1" ) ).createCriteria( "alu.AcMatriculas", "mat" ).add( Restrictions.eq( "mat.MatTipo", "022001" ) ).add( Restrictions.eq( "mat.MatActivo", "1" ) ).createCriteria( "mat.AcMatriculaCursos", "matriCur" ).add( Restrictions.eq( "matriCur.Sec.Id", sec_id ) ).addOrder( Order.asc( "alu.AluAppaterno" ) ).list();
        return listas;
    }

    @Override
    public AcAlumno buscarAlumnoCodigo( String codigo ) {
        return (AcAlumno) this.getSession().createCriteria( AcAlumno.class ).
                add( Restrictions.and(
                Restrictions.eq( "AluActivo", "1" ),
                Restrictions.eq( "AluCodigo", codigo ) ) ).uniqueResult();
    }

    @Override
    public List<AcAlumno> listaCoincidencias( String codigo, String paterno, String materno, String nombre ) {
        Criteria c = this.getSession().createCriteria( AcAlumno.class ).
                add( Restrictions.eq( "AluActivo", "1" ) );

        if ( paterno.trim().length() != 0 ) {
            c.add( Restrictions.like( "AluAppaterno", paterno.trim() + "%" ) );
        }
        if ( materno.trim().length() != 0 ) {
            c.add( Restrictions.like( "AluApmaterno", materno.trim() + "%" ) );
        }
        if ( nombre.trim().length() != 0 ) {
            c.add( Restrictions.like( "AluNombres", "%" + nombre.trim() + "%" ) );
        }
        if ( codigo.trim().length() != 0 ) {
            c.add( Restrictions.eq( "AluCodigo", codigo ) );
        }

        c.addOrder( Order.asc( "AluAppaterno" ) ).
                addOrder( Order.asc( "AluApmaterno" ) );

        return c.list();
    }

    @Override
    public List<AcAlumno> listarAlumnosporDato( String dato ) {
        List lista;
        String hqlSelect = "select Id, AluCodigo, AluAppaterno, AluApmaterno, AluNombres from AcAlumno where concat(AluAppaterno,' ',AluApmaterno) like concat('%',:v_dato,'%') and AluActivo= :v_activo";
        lista = this.getSession().createQuery( hqlSelect ).setString( "v_dato", dato ).setString( "v_activo", "1" ).list();
        return lista;
    }

    @Override
    public int buscarAlumnoFicha( int alu_id ) {
        int v_econtrado = 0;
//         List lista=this.getSession().createCriteria(TbAlumnoFicha.class).add(Restrictions.eq("aluId", alu_id))
//                 .add(Restrictions.eq("ficActivo", "1")).list();
//         v_econtrado=lista.size();
        return v_econtrado;
    }

    @Override
    public List<AdAlumnoTarifa> traerDeudasPagosPorAlumno( AcAlumno acAlumno ) {
        int iSizeAluTar;
        AdAlumnoTarifa aluTar;
        Calendar fecActual = Calendar.getInstance();
        Calendar fecProrroga = Calendar.getInstance();
        HSAlumnoTarifaDAO tarifaDAO;
        List<AdAlumnoTarifa> lstDeudasPagos = new ArrayList<AdAlumnoTarifa>();
        List<AdAlumnoTarifa> lstAluTar;

        try {
            tarifaDAO = (HSAlumnoTarifaDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_ALUMNO_TARIFA );

            lstAluTar = tarifaDAO.seleccionarAlumnoTarifa( acAlumno.getAluId() );
            if ( !lstAluTar.isEmpty() ) {
                iSizeAluTar = lstAluTar.size();
                for ( int i = 0; i < iSizeAluTar; i++ ) {
                    aluTar = lstAluTar.get( i );
                    fecProrroga.setTime( aluTar.getAlutarFechaProrroga() );

                    if ( !aluTar.getAlutarEstado().equals( "2" )
                            && fecActual.getTimeInMillis() > fecProrroga.getTimeInMillis() ) {
                        lstDeudasPagos.add( aluTar );
                    }
                }
            }
        } catch ( Exception ex ) {
            lstDeudasPagos = new ArrayList<AdAlumnoTarifa>();
            ex.printStackTrace();
        }
        return lstDeudasPagos;
    }

    @Override
    public List traerDeudasDocumentosPorAlumno( AcAlumno acAlumno ) {
        HSAlumnoDocumentoDAO aluDocsDAO;
        List lstAluDeudaDocs = new ArrayList();

        try {
            aluDocsDAO = (HSAlumnoDocumentoDAO) ServiceFinder.findBean( ConstantesWeb.SHDAO_ALUMNO_DOCUMENTO );
            lstAluDeudaDocs = aluDocsDAO.seleccionarDeudaDocumentosPorAlumno( acAlumno.getAluId() );
        } catch ( Exception ex ) {
            lstAluDeudaDocs = new ArrayList();
            ex.printStackTrace();
        }
        return lstAluDeudaDocs;
    }
}
