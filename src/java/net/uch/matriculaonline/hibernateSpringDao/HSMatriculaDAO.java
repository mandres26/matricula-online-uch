package net.uch.matriculaonline.hibernateSpringDao;

import java.util.List;
import net.uch.matriculaonline.mapping.storedprocedures.SPCursosPorMatricular;
import net.uch.matriculaonline.mapping.storedprocedures.SPHorariosPorCursoYSeccion;

public interface HSMatriculaDAO {

    public List<SPCursosPorMatricular> seleccionarCursosPorMatricular( int iAluId );

    public List<SPHorariosPorCursoYSeccion> seleccionarHorariosPorCurapeIdYSecId( int iCurapeId, int iSecId );
}
