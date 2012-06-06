/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.hibernateSpringDao;

import java.util.List;
import net.uch.matriculaonline.mapping.AdAlumnoTarifa;

/**
 *
 * @author USUARIO
 */
public interface HSAlumnoTarifaDAO {

    public List<AdAlumnoTarifa> seleccionarAlumnoTarifa( Integer iAluId );
    
}
