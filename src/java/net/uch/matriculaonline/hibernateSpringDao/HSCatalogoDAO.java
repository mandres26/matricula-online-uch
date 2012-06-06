package net.uch.matriculaonline.hibernateSpringDao;

import java.util.List;
import net.uch.matriculaonline.mapping.TbCatalogo;
import org.springframework.dao.DataAccessException;

public interface HSCatalogoDAO {

    public List seleccionarCatalogo( String codigo );

    public String seleccionarDescripcion( String codigo );

    public String seleccionarValor( String codigo ) throws DataAccessException;

    public List<TbCatalogo> seleccionarGrupo( String codigo );

    public List<TbCatalogo> seleccionarGrupoxValor( String codigo );

    public List<TbCatalogo> selecionarFilaCatalogo( String codigo );
}
