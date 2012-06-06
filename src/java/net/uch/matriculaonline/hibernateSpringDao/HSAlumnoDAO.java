package net.uch.matriculaonline.hibernateSpringDao;

import java.io.InputStream;
import java.util.List;
import net.uch.matriculaonline.mapping.AcAlumno;
import net.uch.matriculaonline.mapping.AdAlumnoTarifa;
import org.springframework.dao.DataAccessException;

public interface HSAlumnoDAO {

    public void insertarAlumno( AcAlumno alu ) throws DataAccessException;

    public List seleccionarAlumno( String codigo, String paterno, String materno, String nombre, int facu, int espe ) throws DataAccessException, java.sql.SQLException;

    public void eliminarAlumno( String id ) throws DataAccessException;

    public void actualizarAlumno( AcAlumno alu ) throws DataAccessException;

    public List seleccionarAlumnoEstPago( int id_esp, String tipo, int sem_id ) throws DataAccessException;

    public List seleccionarAlumnoCliente( String buscar ) throws DataAccessException;

    public AcAlumno seleccionarAlumno( int id ) throws Exception;

    public AcAlumno seleccionarAlumnoCodigo( String sCodigo ) throws DataAccessException;

    public List seleccionarUnAlumno( int id ) throws DataAccessException;

    public List seleccionarEstPagx() throws DataAccessException, java.sql.SQLException;

    public List seleccionarAlumnoEstPagoUnico( int id ) throws DataAccessException;

    public String MaximoCodigo() throws DataAccessException;

    public InputStream imprimirAsistencia();

    public List seleccionarAlumnoSeccion( int sec_id );

    public List listarAlumnoxSeccion( int sec_id );

    public AcAlumno buscarAlumnoCodigo( String codigo );

    public List<AcAlumno> listaCoincidencias( String codigo, String paterno, String materno, String nombre );

    public List<AcAlumno> listarAlumnosporDato( String dato );

    public int buscarAlumnoFicha( int alu_id );

    /**
     * Verifica si el alumno tiene deudas
     *
     * @param acAlumno
     * @return
     */
    public List<AdAlumnoTarifa> traerDeudasPagosPorAlumno( AcAlumno acAlumno );

    public List<AdAlumnoTarifa> traerDeudasDocumentosPorAlumno( AcAlumno acAlumno );
}
