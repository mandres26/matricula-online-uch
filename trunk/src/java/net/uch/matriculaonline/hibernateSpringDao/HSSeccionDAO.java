/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.hibernateSpringDao;

import java.util.List;
import java.util.Set;
import net.uch.matriculaonline.mapping.AcSeccion;

/**
 *
 * @author USUARIO
 */
public interface HSSeccionDAO {
    public Set<AcSeccion> seleccionarSeccionesPorCurApe( int iCurApeId );
    public List seleccionarSeccion(int iSecId);
}
