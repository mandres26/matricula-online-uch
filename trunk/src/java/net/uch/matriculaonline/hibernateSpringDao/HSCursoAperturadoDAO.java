package net.uch.matriculaonline.hibernateSpringDao;

import java.util.List;
import net.uch.matriculaonline.mapping.AcCursoAperturado;
import org.springframework.dao.DataAccessException;

public interface HSCursoAperturadoDAO {

    public void aperturarCurso( AcCursoAperturado cursoAperturado ) throws DataAccessException;

    public List seleccionarCursosAperturados() throws DataAccessException, java.sql.SQLException;

    public void eliminarCursoAperturado( String id ) throws DataAccessException;

    public void actualizarCursoAperturado( AcCursoAperturado cursoAperturado ) throws DataAccessException;

    public List verificarCursoAperturado( int plancur_id, int iSemId );

    public List seleccionarUnCursosAperturado( int iCurapeId ) throws DataAccessException;

    public List seleccionarAperturaporPlanCurso( int plancurid ) throws DataAccessException;

    public List seleccionarAperturaporEspecialidad( int esp_id, int sem_id ) throws DataAccessException;
}
